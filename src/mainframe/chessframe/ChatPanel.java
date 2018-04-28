
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
    /** private fields for class.**/
    private final JTextArea textChatArea = new JTextArea(6, 20);
    
    /** The text border. */
    private final TitledBorder textBorder = new TitledBorder("Chat History");
    
    /** The text field. */
    private final JTextField textField = new JTextField(10);
    
    /** The send B. */
    private final JButton sendB = new JButton();
    
    /** The text area scroll. */
    private final JScrollPane textAreaScroll = new JScrollPane(
            textChatArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    /** The chat socket. */
    private Socket chatSocket;
    
    /** The server chat. */
    private ServerSocket serverChat;
    
    /** The in 1. */
    private BufferedReader in1;
    
    /** The out 1. */
    private PrintWriter out1;
    
    /** The in 2. */
    private BufferedReader in2;
    
    /** The out 2. */
    private PrintWriter out2;
    
    /** The server thread. */
    private ServerChat serverThread = new ServerChat();
    
    /** The send socket. */
    private Socket sendSocket;
    
    /** The client thread. */
    private ClientChat clientThread = new ClientChat();
    
    /** The is server. */
    private boolean isServer;
    
    /** The preload. */
    Preloader preload = Preloader.getInstance(); //singleton
    
    /** Creates a new instance of ChatPanel. */
    public ChatPanel() {
        setPreferredSize(new Dimension(300, 244));
        setMinimumSize(new Dimension(300, 300));
        setSize(300, 244);
        setLocation(600, 350);

        textAreaScroll.setSize(284, 188);
        textAreaScroll.setLocation(10, 0);
        textChatArea.setLineWrap(true);

        setLayout(null);

        textAreaScroll.setEnabled(false);
        textField.setEnabled(false);
        sendB.setEnabled(false);
        
        //set sendButton's info
        sendB.setSize(80, 30);
        sendB.setLocation(214, 192);
        sendB.setText("Send");
        
        
        //set TextField info
        textField.setSize(180, 20);
        textField.setLocation(10, 196);
        //textField.add(textAreaScroll);
        textField.setToolTipText("Write Text Here");

        //set textChatArea info
        textChatArea.setEditable(false);
        textChatArea.setBorder(textBorder);
        
        
        add(textAreaScroll);
        add(textField);
        add(sendB);

        sendB.addActionListener(e -> {

            textChatArea.append("\n" + preload.getName() + ": " + textField.getText());
            if (isServer) {
                sendTextServer();
                textField.setText(null);
            } else {
                sendTextChat();
                textField.setText(null);
            }

        });

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println("okdddd "+e.KEY_PRESSED+" "+e.VK_PAGE_DOWN);

                if (e.getKeyChar() == '\n') {
                    textChatArea.append("\n" + preload.getName() + ": " + textField.getText());

                    if (isServer) {
                        sendTextServer();
                        textField.setText(null);
                    } else {
                        sendTextChat();
                        textField.setText(null);
                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });

        // add(chatPanelScroll); //TODO: add chat panel scroll

    }

    /**
     * Start chat.
     */
    // TODO: fix chat panel with correct sockets and ports
    public void startChat() {
        textAreaScroll.setEnabled(true);
        textField.setEnabled(true);
        sendB.setEnabled(true);

        isServer = false;
        try {
            sendSocket = new Socket(preload.getIpAddress(), Integer.parseInt(preload.getPortNumber())+1);
            
            in2 = new BufferedReader(new InputStreamReader(sendSocket.getInputStream(), StandardCharsets.UTF_8));
            out2 = new PrintWriter(new OutputStreamWriter(
                    sendSocket.getOutputStream(), StandardCharsets.UTF_8), true);
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        clientThread.start();
    }

    /**
     * Send text chat.
     */
    public void sendTextChat() {
        out2.print(preload.getName() + ": " + textField.getText());
        out2.print("\r\n");

        out2.flush();

    }

    /**
     * Send text server.
     */
    public void sendTextServer() {
        out1.print(preload.getName() + ": " + textField.getText());
        out1.print("\r\n");

        out1.flush();

    }

    /**
     * Listen to chat.
     */
    public void listenToChat() {
        textAreaScroll.setEnabled(true);
        textField.setEnabled(true);
        sendB.setEnabled(true);

        isServer = true;
        try {
            //HACK BECAUSE HOW THEY IMPLEMENTED: ADD 1 SO CHAT DOES NOT HAVE SAME SOCKET (BINDING WILL FAIL)
            serverChat = new ServerSocket(Integer.parseInt(preload.getPortNumber())+1); 

            chatSocket = serverChat.accept();

            in1 = new BufferedReader(new InputStreamReader(chatSocket.getInputStream(), StandardCharsets.UTF_8));

            out1 = new PrintWriter(new OutputStreamWriter(
                    chatSocket.getOutputStream(), StandardCharsets.UTF_8), true);

            // chatSocket.setSoTimeout(10000);

            serverThread.start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * The Class ClientChat.
     */
    class ClientChat extends Thread {
        
        /* (non-Javadoc)
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = in2.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (receive != null) {
                    textChatArea.append("\n" + receive);
                }
            }
        }
    }

    /**
     * The Class ServerChat.
     */
    class ServerChat extends Thread {
        
        /* (non-Javadoc)
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = in1.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (receive != null) {

                    //textChatArea.append("\n" + preload.getName() + ": " + receive);
                    textChatArea.append("\n" + receive);

                }
            }
        }
    }

}
