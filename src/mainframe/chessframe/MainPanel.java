
package mainframe.chessframe;

import players.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import javax.swing.ImageIcon;
//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pieces.Rook;

import java.lang.String;
//import javax.swing.JScrollPane;
//import javax.swing.border.BevelBorder;
//import javax.swing.border.TitledBorder;
//import javax.net.*;

public class MainPanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Player1 player1 = new Player1();
    private Player2 player2 = new Player2();
    private final int divide = 600 / 8;
    private int move = 0;
    private Rectangle2D rec;
    private short playersTurn = 1;
    public final ToolPanel myTool;
    //private final StatusPanel myStatus;
    private boolean gameOver = false;
    private boolean isServer = false;
    private boolean isClient = false;
    private ServerSocket serverSock;
    private Socket sock;
    private BufferedReader in;
    private PrintWriter out;
    private String box;
    private boolean local = true;
    private JButton startServer;
    private JButton startClient;
    private String myIPAddress;
    private String myPortNumber;
    private boolean gameStarted = true;
    private ReceiveThread receivedFrom;
    private ChatPanel receiveChat;

    public void startAsServer(String myIp, String myPort, ChatPanel newChat) {

        receivedFrom = new ReceiveThread();
        receiveChat = newChat;
        gameStarted = false;

        myIPAddress = myIp;
        myPortNumber = myPort;

        startAgain();
        startServer = new JButton(" Start server");
        startServer.setSize(150, 25);
        startServer.setLocation(200, 300);
        startServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    serverSock = new ServerSocket(Integer.parseInt(myPortNumber));

                    Thread server = new Thread(new Runnable() {
                        public synchronized void run() {

                            try {

                                sock = serverSock.accept();

                                receiveChat.listenToChat();
                                
                                in = new BufferedReader(new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8));
                                out = new PrintWriter(new OutputStreamWriter(
                                        sock.getOutputStream(), StandardCharsets.UTF_8), true);
                                
                                startServer.setVisible(false);
                                startServer = null;
                                receivedFrom.start();

                                gameStarted = true;

                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    });

                    server.start();

                    /*
                     * in=new BufferedReader(new InputStreamReader(sock.getInputStream())); out=new
                     * PrintWriter(sock.getOutputStream());
                     */
                    // sock.setSoTimeout(999999);
                    // receiveChat.listen_chat();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Server Error",
                            "Error", JOptionPane.ERROR_MESSAGE, null);
                }
                startServer.setText("Waiting...");

            }

        });
        local = false;
        add(startServer);

        isServer = true;
        repaint();
    }

    public void startAsClient(String myIp, String myPort, ChatPanel newChat) {

        receivedFrom = new ReceiveThread();

        receiveChat = newChat;

        gameStarted = false;

        startAgain();
        myIPAddress = myIp;
        myPortNumber = myPort;
        local = false;
        startClient = new JButton("Start Client");
        startClient.setSize(150, 25);
        startClient.setLocation(200, 300);

        startClient.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {

                    sock = new Socket(myIPAddress, Integer.parseInt(myPortNumber));
                    
                    in = new BufferedReader(new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8));
                    out = new PrintWriter(new OutputStreamWriter(
                            sock.getOutputStream(), StandardCharsets.UTF_8), true);

                    receivedFrom.start();
                    gameStarted = true;
                    receiveChat.startChat();

                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Client Error occurred",
                            "Error", JOptionPane.ERROR_MESSAGE, null);
                }

                startClient.setVisible(false);
                startClient = null;
            }
        });

        isClient = true;
        add(startClient);

    }

    public void startAgain() {
        player1 = new Player1();
        player2 = new Player2();
        move = 0;
        playersTurn = 1;
        gameOver = false;
        local = true;
        myTool.startAgain();
        //myStatus.start_Again();
        isServer = false;
        isClient = false;
        repaint();

    }

    /** main panel constructor for board. **/
    public MainPanel(ToolPanel myToolPanel) {//, StatusPanel myStatusPanel) {
        
        setBackground(Color.WHITE);

        setSize(600, 600);
        setLocation(3, 10);

        MousewhenMove mouseDragAndDrop = new MousewhenMove();
        Mousehere mouseHereEvent = new Mousehere();
        addMouseMotionListener(mouseDragAndDrop);
        addMouseListener(mouseHereEvent);

        myTool = myToolPanel;
        //myStatus = myStatusPanel;
        setLayout(null);

    }

    /** adds images and pieces. **/
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int paintWidth = 600;
        //int iHeight = 600;

        // Drawing the board
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                g2.setColor(Color.BLACK);
                rec = new Rectangle2D.Double(j * paintWidth / 8, (1 + i) * paintWidth / 8, divide, divide);
                g2.fill(rec);
                rec = new Rectangle2D.Double((1 + j) * paintWidth / 8, i * paintWidth / 8, divide, divide);
                g2.fill(rec);

            }
        }

        /// Puting the pieces
        Point postionPoint;
        int postX;
        int postY;
        Image img;
        for (int i = 1; i <= 32; i++) {
            if (i < 17) {
                if (i == player2.getInHand()) {
                    postionPoint = player2.getPixelPoint(i);

                } else {
                    postionPoint = player2.returnPostion(i);
                }
                img = player2.returnIconImage(i);

            } else {

                if (i == player1.getInHand()) {

                    postionPoint = player1.getPixelPoint(i);

                } else {
                    postionPoint = player1.returnPostion(i);
                }
                img = player1.returnIconImage(i);
            }

            if (i == player1.getInHand()) {
                g2.drawImage(img, postionPoint.x - 25, postionPoint.y - 25,
                        divide - 40, divide - 12, this);
            } else if (i == player2.getInHand()) {
                g2.drawImage(img, postionPoint.x - 25, postionPoint.y - 25,
                        divide - 40, divide - 12, this);
            } else {
                postX = rowToX(postionPoint.x);
                postY = colToY(postionPoint.y);
                g2.drawImage(img, postX + 20, postY + 4, divide - 40, divide - 12, this);
            }

        }

    }

    /// You can inherit from Adapter and avoid meaningless
    private class Mousehere implements MouseListener {

        public void mouseClicked(MouseEvent e) {

        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {
            boolean canSend = false;

            if (!gameOver) {

                Point newP;
                Point samePostion;
                if (player1.getInHand() != -1) {

                    newP = player1.getPixelPoint(player1.getInHand());
                    newP.x /= divide;
                    newP.y /= divide;
                    newP.x++;
                    newP.y++;
                    int otherindex;

                    Point old = player1.returnOldPostion(player1.getInHand());
                    int x = old.x;
                    int y = old.y;
                    Point present = player1.returnPostion(player1.getInHand());

                    ///////////////////////////////////////////////////////////////////////////
                    ///////////////////////////////////////////////////////////////////////////

                    if (isServer || local) {

                        // set the seen of the solider -white
                        if (player1.getInHand() < 33 && player1.getInHand() > 24) {
                            for (int i = 1; i < 17; i++) {
                                samePostion = player2.returnPostion(i);
                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (player1.pawnSeen(player1.getInHand(), samePostion)) {
                                        break;
                                    }
                                }
                            }
                        }
                        /////////////////////////////////////////////////////////////////////////
                        if (!(newP.x == present.x && newP.y == present.y)/* &&!player1.returncheckKing() */)
                            // if the move is illegal
                            if (player1.checkMove(newP, player1.getInHand())) {

                                boolean flag = false;

                                for (int i = 1; i <= 32; i++) {
                                    // check if there are pieces in the way
                                    if (player1.getInHand() != i) {
                                        if (i < 17) {
                                            flag = player1.checkTheWay(newP, player2.returnPostion(i), player1.getInHand());
                                        } else {
                                            //means there's something in the way, so we can't move.
                                            flag = player1.checkTheWay(newP, player1.returnPostion(i), player1.getInHand());
                                        }

                                        if (flag == true) {
                                            break;// Means there is a Piece in the Way
                                        }
                                    }

                                    //

                                }

                                if (!flag && player1.friendlyPieceAlreadyThere(newP)) {
                                    // (if flag =false this means "The piece able to MOVE as logic""
                                    // So We Check If the New Place Make a Check To Black King !!!
                                    //boolean kin2 = true;
                                    Point myold = new Point();
                                    Point o = player1.returnPostion(player1.getInHand());
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

                                        other = player2.returnPostion(k);

                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = player1.getInHand();

                                            if (inHand > 24 && player1.returnPawnPosition(inHand)) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                player2.killedPiece(k);
                                            } else if (inHand <= 24) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                player2.killedPiece(k);
                                            } else {
                                                player1.changePostion(myold, inHand);
                                                endMove = false;

                                                break;
                                            }

                                            killed = k;// !!!

                                            break;

                                        }

                                    }

                                    if (endMove) {
                                        player1.changePostion(newP, player1.getInHand());// Here is the mOve ended
                                    }

                                    player1.checkKing(false);
                                    if (player1.isKingChecked(player2)) {
                                        // if my king will be in check if i move
                                        // so i can't move and i will return back to old postion'                           
                                        player1.changePostion(myold, player1.getInHand());
                                        player1.checkKing(true);
                                        endMove = false;
                                    }
                                    if (kill && player1.returncheckKing()) {
                                        player2.changePostion(f, killed);

                                    }

                                    if (!player1.returncheckKing()) {

                                        if (player2.isKingChecked(player1)) {
                                            // if my king will be in check if i move
                                            // so i can't move and i will return back to old postion

                                            player2.checkKing(true);
                                            endMove = false;
                                            if (player2.checkMateGameOver(player1)) {
                                                gameOver();
                                                box = Integer.toString(player2.getInHand()) + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                canSend = true;
                                            } else {
                                                box = Integer.toString(player1.getInHand()) + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);

                                                checkStatus();
                                                canSend = true;

                                            }

                                        }

                                        if (endMove) {
                                            box = Integer.toString(player1.getInHand()) + Integer.toString(newP.x)
                                                    + Integer.toString(newP.y);

                                            changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }

                            }

                        player1.setInHand(-1);

                        repaint();

                        if (canSend && ((isServer || isClient))) {

                            sendMove();
                            // Send_to.resume();

                            // receivedFrom.resume();

                        }

                        if (gameOver) {
                            JOptionPane.showMessageDialog(null, "Check Mate\n White won the game",
                                    "Game Over", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                    ////////////////////////////// Black//////////////////////////////////////////////
                } else if (player2.getInHand() != -1) {

                    if (isClient || local) {
                        newP = player2.getPixelPoint(player2.getInHand());
                        newP.x /= divide;
                        newP.y /= divide;
                        newP.x++;
                        newP.y++;
                        //boolean kingChecked = false;
                        Point old = player2.returnOldPostion(player2.getInHand());
                        Point present = player2.returnPostion(player2.getInHand());

                        // set the seen of the solider -black
                        if (player2.getInHand() < 17 && player2.getInHand() > 8) {
                            for (int i = 17; i < 33; i++) {
                                samePostion = player1.returnPostion(i);

                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (player2.pawnSeen(player2.getInHand(), samePostion)) {

                                        break;
                                    }
                                }
                            }
                        }

                        if (!(newP.x == present.x && newP.y == present.y) /* &&!player2.returncheckKing() */)
                            if (player2.checkTheMove(newP, player2.getInHand())) {
                                boolean flag = false;
                                for (int i = 1; i <= 32; i++) {
                                    if (player2.getInHand() != i) {
                                        if (i < 17) {
                                            flag = player2.checkTheWay(newP, 
                                                    player2.returnPostion(i), player2.getInHand());
                                        } else {
                                            flag = player2.checkTheWay(newP, 
                                                    player1.returnPostion(i), player2.getInHand());
                                        }

                                        if (flag) {
                                            break;
                                        }
                                    }
                                }

                                for (int i = 1; i <= 16 && !flag; i++) {
                                    if (player2.getInHand() != i) {
                                        if (flag == false) {
                                            samePostion = player2.returnPostion(i);
                                            if (newP.x == samePostion.x 
                                                    && newP.y == samePostion.y) {
                                                flag = true;
                                                break;

                                            }
                                        }

                                    }

//                                    if (flag) {
//                                        break;
//                                    }
                                }

                                if (!flag) {
                                    //Point kingPostion2 = player2.returnPostion(8);
                                    Point myold = new Point();
                                    Point o = player2.returnPostion(player2.getInHand());
                                    myold.x = o.x;
                                    myold.y = o.y;
                                    Point other = new Point();
                                    Point f = new Point();
                                    boolean kill = false;
                                    boolean endMove = true;
                                    int killed = -1;

                                    for (int k = 17; k < 33; k++) {
                                        other = player1.returnPostion(k);
                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = player2.getInHand();

                                            if (inHand > 8 && player2.returnPawnSeen(inHand)) {
                                                kill = true;

                                                other = player1.returnPostion(k);

                                                f.x = other.x;
                                                f.y = other.y;

                                                player1.killedPiece(k);
                                            } else if (inHand <= 8) {
                                                kill = true;

                                                other = player1.returnPostion(k);

                                                f.x = other.x;
                                                f.y = other.y;
                                                player1.killedPiece(k);
                                            } else {
                                                endMove = false;
                                                player2.changePostion(myold, inHand);
                                            }

                                            killed = k;
                                            break;

                                        }

                                    }
                                    // boolean kin2=true;
                                    if (endMove) {
                                        player2.changePostion(newP, player2.getInHand());
                                    }

                                    player2.checkKing(false);
                                    if (player2.isKingChecked(player1)) {
                                        // if my king will be in check if i move
                                        // so i can't move and i will return back to old position'
                                        player2.changePostion(myold, player2.getInHand());
                                        player2.checkKing(true);

                                        endMove = false;

                                    }
                                    if (kill && player2.returncheckKing()) {

                                        player1.changePostion(f, killed);
                                    }

                                    if (player2.returncheckKing()) {
                                        player2.changePostion(myold, player2.getInHand());
                                    }

                                    if (!player2.returncheckKing()) {
                                        if (player1.isKingChecked(player2)) {
                                            // if my king will be in check if i move
                                            // so i can't move and i will return back to old postion'

                                            player1.checkKing(true);
                                            endMove = false;

                                            if (player1.checkMate(player2)) {
                                                box = Integer.toString(player2.getInHand()) + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                gameOver();

                                                canSend = true;
                                            } else {
                                                box = Integer.toString(player2.getInHand()) + Integer.toString(newP.x)
                                                        + Integer.toString(newP.y);
                                                checkStatus();
                                                canSend = true;
                                            }
                                        }

                                        if (endMove) {
                                            box = Integer.toString(player2.getInHand()) + Integer.toString(newP.x)
                                                    + Integer.toString(newP.y);
                                            changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }
                            }
                        player2.setInHand(-1);

                        repaint();

                        if (canSend && ((isServer || isClient))) {

                            // Send_to.resume();
                            sendMove();
                            /// receivedFrom.resume();

                        }
                        if (gameOver) {
                            JOptionPane.showConfirmDialog(null, "Check Mate\n Black won the game", "Game Over",
                                    JOptionPane.DEFAULT_OPTION);
                        }

                    }
                }
            }

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }

    //////// *---------------Mohamed Sami ------------------*//////////////////
    /** TODO: enter stuff.**/
    public boolean getBoardPosition(int x, int y) {
        if (!gameOver && gameStarted) {
            if ((isServer && playersTurn == 1) || (local) || (isClient && playersTurn == 2)) {

                int newX = x / divide;
                int newY = y / divide;
                newX++;
                newY++;

                if (newX > 8 || newY > 8 || newX < 1 || newY < 1) {
                    repaint();
                    return false;

                }
                
                // Player 1
                if (playersTurn == 1 && player1.getInHand() == -1) {
                    for (int i = 17; i <= 32; i++) {
                        Point p = player1.returnPostion(i);
                        if (p.x == newX && p.y == newY) {
                            player1.setInHand(i);
                            whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                // Player 2
                } else if (playersTurn == 2 && player2.getInHand() == -1) {
                    for (int i = 1; i <= 16; i++) {
                        Point p = player2.returnPostion(i);
                        if (p.x == newX && p.y == newY) {
                            player2.setInHand(i);
                            whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                // Player 1
                } else if (playersTurn == 1 && player1.getInHand() != -1) {
                    whenHandleAndPiece(x, y);
                    return true;
                // Player 2
                } else if (playersTurn == 2 && player2.getInHand() != -1) {
                    whenHandleAndPiece(x, y);
                    return true;
                }
                player1.setInHand(-1);
                move = 0;

                return false;

            }
        }
        return false;
    }

    public boolean whenHandleAndPiece(int x, int y) {
        if (playersTurn == 1 && player1.getInHand() != -1) {
            player1.changePixel(x, y, player1.getInHand());
            return true;
        } else if (playersTurn == 2 && player2.getInHand() != -1) {
            player2.changePixel(x, y, player2.getInHand());
            return true;
        }
        return false;
    }

    private int rowToX(int r) {
        int myx;
        int height = this.getHeight();
        myx = (r * height / 8) - divide;
        return myx;
    }

    private int colToY(int c) {
        int myy;
        int width = getWidth();
        myy = (c * width / 8) - divide;
        return myy;
    }

    private class MousewhenMove implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {

            int x = e.getX();
            int y = e.getY();
            if (controlGameType(x, y)) {

                repaint();
            }

        }

        public void mouseMoved(MouseEvent e) {

        }

    }

    public boolean controlGameType(int x, int y) {
        if (isServer == true || isClient == true && gameStarted) {
            if (isServer && playersTurn == 1) {
                return getBoardPosition(x, y);
            } else if (isClient && playersTurn == 2) {
                return getBoardPosition(x, y);
            } else {
                return false;
            }
        } else {
            return getBoardPosition(x, y);
        }

        // return false;
    }

    private void changeTurn() {
        if (playersTurn == 1) {
            playersTurn = 2;
            myTool.add_to_History("White: " + player1.lastMove());
            //myStatus.changeStatus(" Black player turn");
            //myTool.change_to_Timer2();
        } else if (playersTurn == 2) {
            playersTurn = 1;
            myTool.add_to_History("Black: " + player2.lastMove());
            //myTool.change_to_Timer1();
            //myStatus.changeStatus(" White player turn");
        }
        
        myTool.switchImageLocation(playersTurn);

    }

    private void netChangeTurn() {
        if (playersTurn == 2) {

            myTool.add_to_History("White: " + player1.lastMove());
            //myStatus.changeStatus(" Black player turn");
            //myTool.change_to_Timer2();
        } else if (playersTurn == 1) {

            myTool.add_to_History("Black: " + player2.lastMove());
            //myTool.change_to_Timer1();
            //myStatus.changeStatus(" White player turn");
        }
        myTool.switchImageLocation(playersTurn);

    }

    private void netGameCheckStatus() {
        if (playersTurn == 1) {

            myTool.add_to_History("White: " + player1.lastMove());
            //myTool.change_to_Timer2();
        } else if (playersTurn == 2) {

            myTool.add_to_History("Black: " + player2.lastMove());
            //myTool.change_to_Timer1();
        }
        myTool.inCheck(playersTurn);
       // myStatus.changeStatus(" Check! ");
        //TODO: add check image
    }

    private void checkStatus() {
        if (playersTurn == 1) {

            playersTurn = 2;
            myTool.add_to_History("White: " + player1.lastMove());
            
            //myTool.change_to_Timer2();
        } else if (playersTurn == 2) {

            playersTurn = 1;
            myTool.add_to_History("Black: " + player2.lastMove());
            //myTool.change_to_Timer1();
        }
        //TODO: add check image
        myTool.inCheck(playersTurn);
        
        //myStatus.changeStatus(" Check! ");
    }

    private void gameOver() {

        //myStatus.changeStatus(" Check Mate! ");

        gameOver = true;
    }

    public void sendMove() {
        out.print(box);
        out.print("\r\n");
        out.flush();

    }

    class ReceiveThread extends Thread {
        public synchronized void run() {

            while (true) {

                try {

                    box = in.readLine();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("ERROR");
                }

                if (box != null) {

                    int newInHand = Integer.parseInt(box);
                    int newX = Integer.parseInt(box);
                    int newY = Integer.parseInt(box);

                    /***
                     * Operation to Get 1- The # of Pice 2- The Location nextX 3- The Location nextY
                     *
                     **/

                    newInHand /= 100;
                    newX -= (newInHand * 100);
                    newX /= 10;
                    newY -= (newInHand * 100) + (newX * 10);

                    if (playersTurn == 1) {

                        player1.setInHand(newInHand);
                        playersTurn = 2;

                        player1.changePostion(new Point(newX, newY), newInHand);

                        player2.killedPiece(player1.getEnemyPieceLocationInt(new Point(newX, newY), player2));
                        player2.checkKing(false);

                        // if my king will be in check if i move
                        // so i can't move and i will return back to old postion'
                        if (player2.isKingChecked(player1)) {

                            player2.checkKing(true);

                            if (player2.checkMateGameOver(player1)) {
                                System.out.println("mate");
                                gameOver();

                            } else {
                                netGameCheckStatus();
                            }
                        } else {
                            netChangeTurn();
                        }
                        player1.setInHand(-1);
                    } else {
                        player2.setInHand(newInHand);
                        player2.changePostion(new Point(newX, newY), newInHand);

                        player1.killedPiece(player2.getEnemyPieceThereInt(new Point(newX, newY), player1));
                        playersTurn = 1;

                        player1.checkKing(false);
                        // if my king will be in check if i move
                        // so i can't move and i will return back to old postion'
                        if (player1.isKingChecked(player2)) {

                            player1.checkKing(true);

                            if (player1.checkMate(player2)) {

                                System.out.println("mate");
                                gameOver();

                            } else {
                                netGameCheckStatus();
                            }
                        } else {
                            netChangeTurn();
                        }

                        player2.setInHand(-1);
                    }
                    // CheckStatus();

                    repaint();
                }

            }
        }
    }

}
