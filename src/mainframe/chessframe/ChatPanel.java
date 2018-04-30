
package mainframe.chessframe;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import chessgame.Preloader;

/**
 * The Class ChatPanel.
 */
public class ChatPanel extends JPanel {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** private fields for class. **/
    private final JTextArea textChatArea = new JTextArea(6, 20);

    /** The text border. */
    private final TitledBorder textBorder = new TitledBorder("Chat History");

    /** The text field. */
    private final JTextField textField = new JTextField(10);

    /** The send B. */
    private final JButton sendB = new JButton();

    /** The text area scroll. */
    private final JScrollPane textAreaScroll = new JScrollPane(this.textChatArea,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    /** The chat socket. */
    private Socket chatSocket;
    /** The server chat. */
    private ServerSocket serverChat;
    /** The in 1. */
    private BufferedReader in1;

    /** The out 1. */
    private PrintWriter out1;

    /** receives heartbeat. **/
    private BufferedReader recvHeartBeat;

    /** The in 2. */
    private BufferedReader in2;

    /** The out 2. */
    private PrintWriter out2;

    /** The server thread. */
    private final ServerChat serverThread = new ServerChat();
    // private final ServerHeartBeat shb = new ServerHeartBeat();

    /** The send socket. */
    private Socket sendSocket;
    /** The client thread. */
    private final ClientChat clientThread = new ClientChat();
    // private final ClientHeartBeat chb = new ClientHeartBeat();

    /** The is server. */
    private boolean isServer;

    /** The preload. */
    Preloader preload = Preloader.getInstance(); // singleton

    /** Creates a new instance of ChatPanel. */
    public ChatPanel() {
        this.setPreferredSize(new Dimension(300, 244));
        this.setMinimumSize(new Dimension(300, 300));
        this.setSize(300, 244);
        this.setLocation(600, 350);

        this.textAreaScroll.setSize(284, 188);
        this.textAreaScroll.setLocation(10, 0);
        this.textChatArea.setLineWrap(true);

        this.setLayout(null);

        this.textAreaScroll.setEnabled(false);
        this.textField.setEnabled(false);
        this.sendB.setEnabled(false);

        // set sendButton's info
        this.sendB.setSize(80, 30);
        this.sendB.setLocation(214, 192);
        this.sendB.setText("Send");

        // set TextField info
        this.textField.setSize(180, 20);
        this.textField.setLocation(10, 196);
        // textField.add(textAreaScroll);
        this.textField.setToolTipText("Write Text Here");

        // set textChatArea info
        this.textChatArea.setEditable(false);
        this.textChatArea.setBorder(this.textBorder);

        this.add(this.textAreaScroll);
        this.add(this.textField);
        this.add(this.sendB);

        this.sendB.addActionListener(e -> {

            this.textChatArea
                    .append("\n" + this.preload.getName() + ": " + this.textField.getText());
            if (this.isServer) {
                this.sendTextServer();
                this.textField.setText(null);
            } else {
                this.sendTextChat();
                this.textField.setText(null);
            }

        });

        this.textField.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(final KeyEvent e) {
                // System.out.println("okdddd "+e.KEY_PRESSED+" "+e.VK_PAGE_DOWN);

                if (e.getKeyChar() == '\n') {
                    ChatPanel.this.textChatArea.append("\n" + ChatPanel.this.preload.getName()
                            + ": " + ChatPanel.this.textField.getText());

                    if (ChatPanel.this.isServer) {
                        ChatPanel.this.sendTextServer();
                        ChatPanel.this.textField.setText(null);
                    } else {
                        ChatPanel.this.sendTextChat();
                        ChatPanel.this.textField.setText(null);
                    }

                }
            }

            @Override
            public void keyReleased(final KeyEvent e) {
            }

            @Override
            public void keyTyped(final KeyEvent e) {
            }
        });

    }

    /**
     * Start chat.
     */
    // TODO: fix chat panel with correct sockets and ports
    public void startChat() {
        this.textAreaScroll.setEnabled(true);
        this.textField.setEnabled(true);
        this.sendB.setEnabled(true);

        this.isServer = false;
        try {
            this.sendSocket = new Socket(this.preload.getIpAddress(),
                    Integer.parseInt(this.preload.getPortNumber()) + 1);

            this.in2 = new BufferedReader(new InputStreamReader(this.sendSocket.getInputStream(),
                    StandardCharsets.UTF_8));
            this.out2 = new PrintWriter(new OutputStreamWriter(this.sendSocket.getOutputStream(),
                    StandardCharsets.UTF_8), true);

        } catch (final UnknownHostException ex) {
            ex.printStackTrace();
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        this.clientThread.start();
    }

    /**
     * Send text chat.
     */
    public void sendTextChat() {
        this.out2.print(this.preload.getName() + ": " + this.textField.getText());
        this.out2.print("\r\n");

        this.out2.flush();

    }

    /**
     * Send text server.
     */
    public void sendTextServer() {
        this.out1.print(this.preload.getName() + ": " + this.textField.getText());
        this.out1.print("\r\n");

        this.out1.flush();

    }

    /**
     * Listen to chat.
     */
    public void listenToChat() {
        this.textAreaScroll.setEnabled(true);
        this.textField.setEnabled(true);
        this.sendB.setEnabled(true);

        this.isServer = true;
        try {
            // HACK BECAUSE HOW THEY IMPLEMENTED: ADD 1 SO CHAT DOES NOT HAVE SAME SOCKET (BINDING
            // WILL FAIL)
            this.serverChat = new ServerSocket(Integer.parseInt(this.preload.getPortNumber()) + 1);

            this.chatSocket = this.serverChat.accept();

            this.in1 = new BufferedReader(new InputStreamReader(this.chatSocket.getInputStream(),
                    StandardCharsets.UTF_8));

            this.out1 = new PrintWriter(new OutputStreamWriter(this.chatSocket.getOutputStream(),
                    StandardCharsets.UTF_8), true);

        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        this.serverThread.start();

    }

    /**
     * The Class ClientChat.
     */
    class ClientChat extends Thread {

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = ChatPanel.this.in2.readLine();
                } catch (final IOException ex) {
                    ex.printStackTrace();

                }
                if (receive != null) {
                    ChatPanel.this.textChatArea.append("\n" + receive);
                }
            }
        }
    }

    /** The Class ClientHeartbeat to test is client is still running. */
    class ClientHeartBeat extends Thread {

        @Override
        public void run() {
            String receive = "";
            while (true) {
                try {
                    Thread.sleep(10000);
                    receive = ChatPanel.this.recvHeartBeat.readLine();
                } catch (final IOException ex) {
                    ex.printStackTrace();

                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }

                if (!receive.equals("ping")) {
                    System.out.println("ERROR");
                    System.exit(1);
                }

                System.out.println("received" + receive);
                receive = "";
            }
        }
    }

    /** server heart beat to test if server is still running. **/
    class ServerHeartBeat extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (final InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println("sending heartbeat to client from server");
            }
        }
    }

    /**
     * The Class ServerChat.
     */
    class ServerChat extends Thread {

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = ChatPanel.this.in1.readLine();
                } catch (final IOException ex) {
                    ex.printStackTrace();
                }

                if (receive != null) {
                    ChatPanel.this.textChatArea.append("\n" + receive);

                }
            }
        }
    }

}
