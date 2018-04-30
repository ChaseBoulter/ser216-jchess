
package mainframe.chessframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import players.Player1;
import players.Player2;

/**
 * The Class MainPanel.
 */
public class MainPanel extends JPanel {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The player 1. */
    private Player1 player1 = new Player1();

    /** The player 2. */
    private Player2 player2 = new Player2();

    /** The divide. */
    private final int divide = 600 / 8;

    /** The rec. */
    private Rectangle2D rec;

    /** The players turn. */
    private short playersTurn = 1;

    /** The my tool. */
    public final ToolPanel myTool;

    /** The game over. */
    // private final StatusPanel myStatus;
    private boolean gameOver = false;

    /** The is server. */
    private boolean isServer = false;

    /** The is client. */
    private boolean isClient = false;

    /** The server sock. */
    private ServerSocket serverSock;

    /** The sock. */
    private Socket sock;

    /** The in. */
    private BufferedReader in;

    /** The out. */
    private PrintWriter out;

    /** The box. */
    private String box;

    /** The local. */
    private boolean local = true;

    /** The my IP address. */
    private String myIpAddress;

    /** The my port number. */
    private String myPortNumber;

    /** The game started. */
    private boolean gameStarted = true;

    /** The received from. */
    private ReceiveThread receivedFrom;

    /** The receive chat. */
    private ChatPanel receiveChat;

    /** The waiting label. */
    // private final JLabel waitingLabel = new JLabel("Waiting For Worthy Opponent...");
    private JLabel waitingLabel;

    /**
     * Start as server.
     *
     * @param myIp
     *            the my ip
     * @param myPort
     *            the my port
     * @param newChat
     *            the new chat
     */
    public void startAsServer(String myIp, String myPort, ChatPanel newChat) {

        this.receivedFrom = new ReceiveThread();
        this.receiveChat = newChat;
        this.gameStarted = false;

        this.myIpAddress = myIp;
        this.myPortNumber = myPort;

        this.waitingLabel = new JLabel("Waiting for client connection...", SwingConstants.CENTER);
        this.waitingLabel.setForeground(Color.WHITE);
        // waiting label location
        this.waitingLabel.setSize(250, 25);
        this.waitingLabel.setLocation(150, 300);
        this.waitingLabel.setBackground(Color.GRAY);
        this.waitingLabel.setOpaque(true);
        this.waitingLabel.setVisible(true);

        // startServer.addActionListener(e -> {
        this.add(this.waitingLabel);

        // initialize server immediately

        try {

            this.serverSock = new ServerSocket(Integer.parseInt(this.myPortNumber));

            Thread server = new Thread(new Runnable() {
                @Override
                public synchronized void run() {

                    try {

                        MainPanel.this.sock = MainPanel.this.serverSock.accept();

                        MainPanel.this.receiveChat.listenToChat();

                        MainPanel.this.in = new BufferedReader(new InputStreamReader(
                                MainPanel.this.sock.getInputStream(), StandardCharsets.UTF_8));
                        MainPanel.this.out = new PrintWriter(
                                new OutputStreamWriter(MainPanel.this.sock.getOutputStream(),
                                        StandardCharsets.UTF_8),
                                true);

                        MainPanel.this.receivedFrom.start();

                        // receiveChat.serverHeartBeat();

                        MainPanel.this.gameStarted = true;

                        MainPanel.this.local = false;
                        MainPanel.this.isServer = true;
                        MainPanel.this.remove(MainPanel.this.waitingLabel);

                        MainPanel.this.repaint();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            server.start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Start as client.
     *
     * @param myIp
     *            the my ip
     * @param myPort
     *            the my port
     * @param newChat
     *            the new chat
     */
    public void startAsClient(String myIp, String myPort, ChatPanel newChat) {

        this.receivedFrom = new ReceiveThread();

        this.receiveChat = newChat;

        this.gameStarted = false;

        this.startAgain();
        this.myIpAddress = myIp;
        this.myPortNumber = myPort;
        this.local = false;

        this.waitingLabel = new JLabel("Waiting for server connection...", SwingConstants.CENTER);
        this.waitingLabel.setForeground(Color.WHITE);
        // waiting label location
        this.waitingLabel.setSize(250, 25);
        this.waitingLabel.setLocation(150, 300);
        this.waitingLabel.setBackground(Color.GRAY);
        this.waitingLabel.setOpaque(true);
        this.waitingLabel.setVisible(true);

        // wait for server, time out function to attempt to connect every 5 seconds

        // startClient.addActionListener(e -> {

        this.add(this.waitingLabel);
        // waits 4 seconds to attempt reconnection.
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while (!MainPanel.this.gameStarted) {

                    try {

                        MainPanel.this.sock = new Socket(MainPanel.this.myIpAddress,
                                Integer.parseInt(MainPanel.this.myPortNumber));

                        MainPanel.this.in = new BufferedReader(new InputStreamReader(
                                MainPanel.this.sock.getInputStream(), StandardCharsets.UTF_8));
                        MainPanel.this.out = new PrintWriter(
                                new OutputStreamWriter(MainPanel.this.sock.getOutputStream(),
                                        StandardCharsets.UTF_8),
                                true);

                        MainPanel.this.receivedFrom.start();
                        MainPanel.this.gameStarted = true;
                        MainPanel.this.receiveChat.startChat();

                        // heartbeat
                        // receiveChat.startHeartBeat();

                        MainPanel.this.isClient = true;
                        MainPanel.this.remove(MainPanel.this.waitingLabel);

                        MainPanel.this.repaint();

                    } catch (UnknownHostException ex1) {
                        ex1.printStackTrace();
                    } catch (IOException ex2) {
                        System.out.println("Client attempting to connect....");
                        // ex2.printStackTrace();
                    }
                }

            }
        }.start();

    }

    /**
     * Start again.
     */
    public void startAgain() {
        this.player1 = new Player1();
        this.player2 = new Player2();
        this.playersTurn = 1;
        this.gameOver = false;
        this.local = true;
        // myTool.startAgain();
        // myStatus.start_Again();
        this.isServer = false;
        this.isClient = false;
        this.repaint();

    }

    /**
     * main panel constructor for board. *
     *
     * @param myToolPanel
     *            the my tool panel
     */
    public MainPanel(ToolPanel myToolPanel) {

        this.setBackground(Color.WHITE);

        this.setSize(600, 600);
        this.setLocation(3, 10);

        MousewhenMove mouseDragAndDrop = new MousewhenMove();
        Mousehere mouseHereEvent = new Mousehere();
        this.addMouseMotionListener(mouseDragAndDrop);
        this.addMouseListener(mouseHereEvent);

        this.myTool = myToolPanel;
        this.setLayout(null);

    }

    /**
     * adds images and pieces. *
     *
     * @param g
     *            the g
     */
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int paintWidth = 600;

        // Drawing the board
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                g2.setColor(Color.BLACK);
                this.rec = new Rectangle2D.Double(j * paintWidth / 8, (1 + i) * paintWidth / 8,
                        this.divide, this.divide);
                g2.fill(this.rec);
                this.rec = new Rectangle2D.Double((1 + j) * paintWidth / 8, i * paintWidth / 8,
                        this.divide, this.divide);
                g2.fill(this.rec);

            }
        }

        /// Putting the pieces
        Point postionPoint;
        int postX;
        int postY;
        Image img;
        for (int i = 1; i <= 32; i++) {
            if (i < 17) {
                if (i == this.player2.getInHand()) {
                    postionPoint = this.player2.getPixelPoint(i);

                } else {
                    postionPoint = this.player2.returnPostion(i);
                }
                img = this.player2.returnIconImage(i);

            } else {

                if (i == this.player1.getInHand()) {

                    postionPoint = this.player1.getPixelPoint(i);

                } else {
                    postionPoint = this.player1.returnPostion(i);
                }
                img = this.player1.returnIconImage(i);
            }

            if (i == this.player1.getInHand()) {
                g2.drawImage(img, postionPoint.x - 25, postionPoint.y - 25, this.divide - 40,
                        this.divide - 12, this);
            } else if (i == this.player2.getInHand()) {
                g2.drawImage(img, postionPoint.x - 25, postionPoint.y - 25, this.divide - 40,
                        this.divide - 12, this);
            } else {
                postX = this.rowToX(postionPoint.x);
                postY = this.colToY(postionPoint.y);
                g2.drawImage(img, postX + 20, postY + 4, this.divide - 40, this.divide - 12, this);
            }

        }

    }

    /**
     * The Class Mousehere.
     */
    /// You can inherit from Adapter and avoid meaningless
    private class Mousehere implements MouseListener {

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
         */
        @Override
        public void mousePressed(MouseEvent e) {

        }

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseReleased(MouseEvent e) {
            boolean canSend = false;

            if (!MainPanel.this.gameOver) {

                Point newP;
                Point samePostion;
                if (MainPanel.this.player1.getInHand() != -1) {

                    newP = MainPanel.this.player1.getPixelPoint(MainPanel.this.player1.getInHand());
                    newP.x /= MainPanel.this.divide;
                    newP.y /= MainPanel.this.divide;
                    newP.x++;
                    newP.y++;
                    // Point old =
                    // MainPanel.this.player1.returnOldPostion(MainPanel.this.player1.getInHand());
                    Point present = MainPanel.this.player1
                            .returnPostion(MainPanel.this.player1.getInHand());

                    ///////////////////////////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////////////////////////

                    if (MainPanel.this.isServer || MainPanel.this.local) {

                        // set the seen of the solider -white
                        if (MainPanel.this.player1.getInHand() < 33
                                && MainPanel.this.player1.getInHand() > 24) {
                            for (int i = 1; i < 17; i++) {
                                samePostion = MainPanel.this.player2.returnPostion(i);
                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (MainPanel.this.player1.pawnSeen(
                                            MainPanel.this.player1.getInHand(), samePostion)) {
                                        break;
                                    }
                                }
                            }
                        }
                        /////////////////////////////////////////////////////////////////////////
                        if (!(newP.x == present.x
                                && newP.y == present.y)/* &&!player1.returncheckKing() */) {
                            // if the move is illegal
                            if (MainPanel.this.player1.checkMove(newP,
                                    MainPanel.this.player1.getInHand())) {

                                boolean flag = false;

                                for (int i = 1; i <= 32; i++) {
                                    // check if there are pieces in the way
                                    if (MainPanel.this.player1.getInHand() != i) {
                                        if (i < 17) {
                                            flag = MainPanel.this.player1.checkTheWay(newP,
                                                    MainPanel.this.player2.returnPostion(i),
                                                    MainPanel.this.player1.getInHand());
                                        } else {
                                            // means there's something in the way, so we can't move.
                                            flag = MainPanel.this.player1.checkTheWay(newP,
                                                    MainPanel.this.player1.returnPostion(i),
                                                    MainPanel.this.player1.getInHand());
                                        }

                                        if (flag == true) {
                                            break;// Means there is a Piece in the Way
                                        }
                                    }

                                    //

                                }

                                if (!flag
                                        && MainPanel.this.player1.friendlyPieceAlreadyThere(newP)) {
                                    // (if flag =false this means "The piece able to MOVE as logic""
                                    // So We Check If the New Place Make a Check To Black King !!!
                                    // boolean kin2 = true;
                                    Point myold = new Point();
                                    Point o = MainPanel.this.player1
                                            .returnPostion(MainPanel.this.player1.getInHand());
                                    myold.x = o.x;
                                    myold.y = o.y;
                                    Point other = new Point();
                                    Point f = new Point();
                                    boolean kill = false;
                                    int killed = -1;
                                    boolean endMove = true;

                                    //// *** Start Here to Check the King

                                    for (int k = 1; k < 17; k++) {
                                        // I have to Check the Place

                                        other = MainPanel.this.player2.returnPostion(k);

                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = MainPanel.this.player1.getInHand();

                                            if (inHand > 24 && MainPanel.this.player1
                                                    .returnPawnPosition(inHand)) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                MainPanel.this.player2.killedPiece(k);
                                            } else if (inHand <= 24) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                MainPanel.this.player2.killedPiece(k);
                                            } else {
                                                MainPanel.this.player1.changePostion(myold, inHand);
                                                endMove = false;

                                                break;
                                            }

                                            killed = k;// !!!

                                            break;

                                        }

                                    }

                                    if (endMove) {
                                        MainPanel.this.player1.changePostion(newP,
                                                MainPanel.this.player1.getInHand());// Move ended
                                    }

                                    MainPanel.this.player1.checkKing(false);
                                    if (MainPanel.this.player1
                                            .isKingChecked(MainPanel.this.player2)) {
                                        // if my king will be in check if i move
                                        // so i can't move and i will return back to old postion'
                                        MainPanel.this.player1.changePostion(myold,
                                                MainPanel.this.player1.getInHand());
                                        MainPanel.this.player1.checkKing(true);
                                        endMove = false;
                                    }
                                    if (kill && MainPanel.this.player1.returncheckKing()) {
                                        MainPanel.this.player2.changePostion(f, killed);

                                    }

                                    if (!MainPanel.this.player1.returncheckKing()) {

                                        if (MainPanel.this.player2
                                                .isKingChecked(MainPanel.this.player1)) {
                                            // if my king will be in check if i move
                                            // so i can't move and i will return back to old postion

                                            MainPanel.this.player2.checkKing(true);
                                            endMove = false;
                                            if (MainPanel.this.player2
                                                    .checkMateGameOver(MainPanel.this.player1)) {
                                                MainPanel.this.gameOver();
                                                MainPanel.this.box = Integer.toString(
                                                        MainPanel.this.player2.getInHand())
                                                        + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                canSend = true;
                                            } else {
                                                MainPanel.this.box = Integer.toString(
                                                        MainPanel.this.player1.getInHand())
                                                        + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);

                                                MainPanel.this.checkStatus();
                                                canSend = true;

                                            }

                                        }

                                        if (endMove) {
                                            MainPanel.this.box = Integer
                                                    .toString(MainPanel.this.player1.getInHand())
                                                    + Integer.toString(newP.x)
                                                    + Integer.toString(newP.y);

                                            MainPanel.this.changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }

                            }
                        }

                        MainPanel.this.player1.setInHand(-1);

                        MainPanel.this.repaint();

                        if (canSend && (MainPanel.this.isServer || MainPanel.this.isClient)) {

                            MainPanel.this.sendMove();
                            // Send_to.resume();

                            // receivedFrom.resume();

                        }

                        if (MainPanel.this.gameOver) {
                            JOptionPane.showMessageDialog(null, "Check Mate\n White won the game",
                                    "Game Over", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                    ////////////////////////////// Black//////////////////////////////////
                } else if (MainPanel.this.player2.getInHand() != -1) {

                    if (MainPanel.this.isClient || MainPanel.this.local) {
                        newP = MainPanel.this.player2
                                .getPixelPoint(MainPanel.this.player2.getInHand());
                        newP.x /= MainPanel.this.divide;
                        newP.y /= MainPanel.this.divide;
                        newP.x++;
                        newP.y++;
                        MainPanel.this.player2.returnOldPostion(MainPanel.this.player2.getInHand());
                        Point present = MainPanel.this.player2
                                .returnPostion(MainPanel.this.player2.getInHand());

                        // set the seen of the solider -black
                        if (MainPanel.this.player2.getInHand() < 17
                                && MainPanel.this.player2.getInHand() > 8) {
                            for (int i = 17; i < 33; i++) {
                                samePostion = MainPanel.this.player1.returnPostion(i);

                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (MainPanel.this.player2.pawnSeen(
                                            MainPanel.this.player2.getInHand(), samePostion)) {

                                        break;
                                    }
                                }
                            }
                        }

                        if (!(newP.x == present.x
                                && newP.y == present.y) /* &&!player2.returncheckKing() */) {
                            if (MainPanel.this.player2.checkTheMove(newP,
                                    MainPanel.this.player2.getInHand())) {
                                boolean flag = false;
                                for (int i = 1; i <= 32; i++) {
                                    if (MainPanel.this.player2.getInHand() != i) {
                                        if (i < 17) {
                                            flag = MainPanel.this.player2.checkTheWay(newP,
                                                    MainPanel.this.player2.returnPostion(i),
                                                    MainPanel.this.player2.getInHand());
                                        } else {
                                            flag = MainPanel.this.player2.checkTheWay(newP,
                                                    MainPanel.this.player1.returnPostion(i),
                                                    MainPanel.this.player2.getInHand());
                                        }

                                        if (flag) {
                                            break;
                                        }
                                    }
                                }

                                for (int i = 1; i <= 16 && !flag; i++) {
                                    if (MainPanel.this.player2.getInHand() != i) {
                                        if (flag == false) {
                                            samePostion = MainPanel.this.player2.returnPostion(i);
                                            if (newP.x == samePostion.x
                                                    && newP.y == samePostion.y) {
                                                flag = true;
                                                break;

                                            }
                                        }

                                    }

                                    // if (flag) {
                                    // break;
                                    // }
                                }

                                if (!flag) {
                                    // Point kingPostion2 = player2.returnPostion(8);
                                    Point myold = new Point();
                                    Point o = MainPanel.this.player2
                                            .returnPostion(MainPanel.this.player2.getInHand());
                                    myold.x = o.x;
                                    myold.y = o.y;
                                    Point other = new Point();
                                    Point f = new Point();
                                    boolean kill = false;
                                    boolean endMove = true;
                                    int killed = -1;

                                    for (int k = 17; k < 33; k++) {
                                        other = MainPanel.this.player1.returnPostion(k);
                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = MainPanel.this.player2.getInHand();

                                            if (inHand > 8 && MainPanel.this.player2
                                                    .returnPawnSeen(inHand)) {
                                                kill = true;

                                                other = MainPanel.this.player1.returnPostion(k);

                                                f.x = other.x;
                                                f.y = other.y;

                                                MainPanel.this.player1.killedPiece(k);
                                            } else if (inHand <= 8) {
                                                kill = true;

                                                other = MainPanel.this.player1.returnPostion(k);

                                                f.x = other.x;
                                                f.y = other.y;
                                                MainPanel.this.player1.killedPiece(k);
                                            } else {
                                                endMove = false;
                                                MainPanel.this.player2.changePostion(myold, inHand);
                                            }

                                            killed = k;
                                            break;

                                        }

                                    }
                                    // boolean kin2=true;
                                    if (endMove) {
                                        MainPanel.this.player2.changePostion(newP,
                                                MainPanel.this.player2.getInHand());
                                    }

                                    MainPanel.this.player2.checkKing(false);
                                    if (MainPanel.this.player2
                                            .isKingChecked(MainPanel.this.player1)) {
                                        // if my king will be in check if i move
                                        // so i can't move and i will return back to old position'
                                        MainPanel.this.player2.changePostion(myold,
                                                MainPanel.this.player2.getInHand());
                                        MainPanel.this.player2.checkKing(true);

                                        endMove = false;

                                    }
                                    if (kill && MainPanel.this.player2.returncheckKing()) {

                                        MainPanel.this.player1.changePostion(f, killed);
                                    }

                                    if (MainPanel.this.player2.returncheckKing()) {
                                        MainPanel.this.player2.changePostion(myold,
                                                MainPanel.this.player2.getInHand());
                                    }

                                    if (!MainPanel.this.player2.returncheckKing()) {
                                        if (MainPanel.this.player1
                                                .isKingChecked(MainPanel.this.player2)) {
                                            // if my king will be in check if i move
                                            // so i can't move and i will return back to old
                                            // postion'

                                            MainPanel.this.player1.checkKing(true);
                                            endMove = false;

                                            if (MainPanel.this.player1
                                                    .checkMate(MainPanel.this.player2)) {
                                                MainPanel.this.box = Integer.toString(
                                                        MainPanel.this.player2.getInHand())
                                                        + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                MainPanel.this.gameOver();

                                                canSend = true;
                                            } else {
                                                MainPanel.this.box = Integer.toString(
                                                        MainPanel.this.player2.getInHand())
                                                        + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                MainPanel.this.checkStatus();
                                                canSend = true;
                                            }
                                        }

                                        if (endMove) {
                                            MainPanel.this.box = Integer
                                                    .toString(MainPanel.this.player2.getInHand())
                                                    + Integer.toString(newP.x)
                                                    + Integer.toString(newP.y);
                                            MainPanel.this.changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }
                            }
                        }
                        MainPanel.this.player2.setInHand(-1);

                        MainPanel.this.repaint();

                        if (canSend && (MainPanel.this.isServer || MainPanel.this.isClient)) {

                            // Send_to.resume();
                            MainPanel.this.sendMove();
                            /// receivedFrom.resume();

                        }
                        if (MainPanel.this.gameOver) {
                            JOptionPane.showConfirmDialog(null, "Check Mate\n Black won the game",
                                    "Game Over", JOptionPane.DEFAULT_OPTION);
                        }

                    }
                }
            }

        }

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseEntered(MouseEvent e) {

        }

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    /**
     * Gets the board positions for players.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the board position
     */
    public boolean getBoardPosition(int x, int y) {
        if (!this.gameOver && this.gameStarted) {
            if (this.isServer && this.playersTurn == 1 || this.local
                    || this.isClient && this.playersTurn == 2) {

                int newX = x / this.divide;
                int newY = y / this.divide;
                newX++;
                newY++;

                if (newX > 8 || newY > 8 || newX < 1 || newY < 1) {
                    this.repaint();
                    return false;

                }

                // Player 1
                if (this.playersTurn == 1 && this.player1.getInHand() == -1) {
                    for (int i = 17; i <= 32; i++) {
                        Point p = this.player1.returnPostion(i);
                        if (p.x == newX && p.y == newY) {
                            this.player1.setInHand(i);
                            this.whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                    // Player 2
                } else if (this.playersTurn == 2 && this.player2.getInHand() == -1) {
                    for (int i = 1; i <= 16; i++) {
                        Point p = this.player2.returnPostion(i);
                        if (p.x == newX && p.y == newY) {
                            this.player2.setInHand(i);
                            this.whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                    // Player 1
                } else if (this.playersTurn == 1 && this.player1.getInHand() != -1) {
                    this.whenHandleAndPiece(x, y);
                    return true;
                    // Player 2
                } else if (this.playersTurn == 2 && this.player2.getInHand() != -1) {
                    this.whenHandleAndPiece(x, y);
                    return true;
                }
                this.player1.setInHand(-1);
                return false;

            }
        }
        return false;
    }

    /**
     * When handle and piece.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public boolean whenHandleAndPiece(int x, int y) {
        if (this.playersTurn == 1 && this.player1.getInHand() != -1) {
            this.player1.changePixel(x, y, this.player1.getInHand());
            return true;
        } else if (this.playersTurn == 2 && this.player2.getInHand() != -1) {
            this.player2.changePixel(x, y, this.player2.getInHand());
            return true;
        }
        return false;
    }

    /**
     * Row to X.
     *
     * @param r
     *            the r
     * @return the int
     */
    private int rowToX(int r) {
        int myx;
        int height = this.getHeight();
        myx = r * height / 8 - this.divide;
        return myx;
    }

    /**
     * Col to Y.
     *
     * @param c
     *            the c
     * @return the int
     */
    private int colToY(int c) {
        int myy;
        int width = this.getWidth();
        myy = c * width / 8 - this.divide;
        return myy;
    }

    /**
     * The Class MousewhenMove.
     */
    private class MousewhenMove implements MouseMotionListener {

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseDragged(MouseEvent e) {

            int x = e.getX();
            int y = e.getY();
            if (MainPanel.this.controlGameType(x, y)) {

                MainPanel.this.repaint();
            }

        }

        /*
         * (non-Javadoc)
         *
         * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseMoved(MouseEvent e) {

        }

    }

    /**
     * Control game type.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public boolean controlGameType(int x, int y) {
        if (this.isServer == true || this.isClient == true && this.gameStarted) {
            if (this.isServer && this.playersTurn == 1) {
                return this.getBoardPosition(x, y);
            } else if (this.isClient && this.playersTurn == 2) {
                return this.getBoardPosition(x, y);
            } else {
                return false;
            }
        } else {
            return this.getBoardPosition(x, y);
        }

        // return false;
    }

    /**
     * Change turn.
     */
    private void changeTurn() {
        if (this.playersTurn == 1) {
            this.playersTurn = 2;
            this.myTool.add_to_History("White: " + this.player1.lastMove());
            // myStatus.changeStatus(" Black player turn");
            // myTool.change_to_Timer2();
        } else if (this.playersTurn == 2) {
            this.playersTurn = 1;
            this.myTool.add_to_History("Black: " + this.player2.lastMove());
            // myTool.change_to_Timer1();
            // myStatus.changeStatus(" White player turn");
        }

        this.myTool.switchImageLocation(this.playersTurn);

    }

    /**
     * Net change turn.
     */
    private void netChangeTurn() {
        if (this.playersTurn == 2) {

            this.myTool.add_to_History("White: " + this.player1.lastMove());
            // myStatus.changeStatus(" Black player turn");
            // myTool.change_to_Timer2();
        } else if (this.playersTurn == 1) {

            this.myTool.add_to_History("Black: " + this.player2.lastMove());
            // myTool.change_to_Timer1();
            // myStatus.changeStatus(" White player turn");
        }
        this.myTool.switchImageLocation(this.playersTurn);

    }

    /**
     * Net game check status.
     */
    private void netGameCheckStatus() {
        if (this.playersTurn == 1) {

            this.myTool.add_to_History("White: " + this.player1.lastMove());
            // myTool.change_to_Timer2();
        } else if (this.playersTurn == 2) {

            this.myTool.add_to_History("Black: " + this.player2.lastMove());
            // myTool.change_to_Timer1();
        }
        this.myTool.inCheck(this.playersTurn);
        // myStatus.changeStatus(" Check! ");
    }

    /**
     * Check status.
     */
    private void checkStatus() {
        if (this.playersTurn == 1) {

            this.playersTurn = 2;
            this.myTool.add_to_History("White: " + this.player1.lastMove());

            // myTool.change_to_Timer2();
        } else if (this.playersTurn == 2) {

            this.playersTurn = 1;
            this.myTool.add_to_History("Black: " + this.player2.lastMove());
            // myTool.change_to_Timer1();
        }

        this.myTool.inCheck(this.playersTurn);

        // myStatus.changeStatus(" Check! ");
    }

    /**
     * Game over.
     */
    private void gameOver() {

        // myStatus.changeStatus(" Check Mate! ");

        this.gameOver = true;
    }

    /**
     * Send move.
     */
    public void sendMove() {
        this.out.print(this.box);
        this.out.print("\r\n");
        // out.print("heartbeat");
        this.out.flush();

    }

    /**
     * The Class ReceiveThread.
     */
    class ReceiveThread extends Thread {

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Thread#run()
         */
        @Override
        public synchronized void run() {

            while (true) {

                try {

                    MainPanel.this.box = MainPanel.this.in.readLine();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("ERROR");
                }

                if (MainPanel.this.box != null) {

                    int newInHand = Integer.parseInt(MainPanel.this.box);
                    int newX = Integer.parseInt(MainPanel.this.box);
                    int newY = Integer.parseInt(MainPanel.this.box);

                    /***
                     * Operation to Get 1- The # of Pice 2- The Location nextX 3- The Location nextY
                     *
                     **/

                    newInHand /= 100;
                    newX -= newInHand * 100;
                    newX /= 10;
                    newY -= newInHand * 100 + newX * 10;

                    if (MainPanel.this.playersTurn == 1) {

                        MainPanel.this.player1.setInHand(newInHand);
                        MainPanel.this.playersTurn = 2;

                        MainPanel.this.player1.changePostion(new Point(newX, newY), newInHand);

                        MainPanel.this.player2
                                .killedPiece(MainPanel.this.player1.getEnemyPieceLocationInt(
                                        new Point(newX, newY), MainPanel.this.player2));
                        MainPanel.this.player2.checkKing(false);

                        // if my king will be in check if i move
                        // so i can't move and i will return back to old postion'
                        if (MainPanel.this.player2.isKingChecked(MainPanel.this.player1)) {

                            MainPanel.this.player2.checkKing(true);

                            if (MainPanel.this.player2.checkMateGameOver(MainPanel.this.player1)) {
                                System.out.println("mate");
                                MainPanel.this.gameOver();

                            } else {
                                MainPanel.this.netGameCheckStatus();
                            }
                        } else {
                            MainPanel.this.netChangeTurn();
                        }
                        MainPanel.this.player1.setInHand(-1);
                    } else {
                        MainPanel.this.player2.setInHand(newInHand);
                        MainPanel.this.player2.changePostion(new Point(newX, newY), newInHand);

                        MainPanel.this.player1.killedPiece(
                                MainPanel.this.player2.getEnemyPieceThereInt(new Point(newX, newY),
                                        MainPanel.this.player1));
                        MainPanel.this.playersTurn = 1;

                        MainPanel.this.player1.checkKing(false);
                        // if my king will be in check if i move
                        // so i can't move and i will return back to old postion'
                        if (MainPanel.this.player1.isKingChecked(MainPanel.this.player2)) {

                            MainPanel.this.player1.checkKing(true);

                            if (MainPanel.this.player1.checkMate(MainPanel.this.player2)) {

                                System.out.println("mate");
                                MainPanel.this.gameOver();

                            } else {
                                MainPanel.this.netGameCheckStatus();
                            }
                        } else {
                            MainPanel.this.netChangeTurn();
                        }

                        MainPanel.this.player2.setInHand(-1);
                    }
                    // CheckStatus();

                    MainPanel.this.repaint();
                }

            }
        }
    }

}
