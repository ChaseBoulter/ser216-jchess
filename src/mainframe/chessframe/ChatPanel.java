
package mainframe.chessframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.border.TitledBorder;

public class ChatPanel extends JPanel {

    /** private fields for class.**/
    private final JTextArea textChatArea = new JTextArea(6, 20);
    private final TitledBorder textBorder = new TitledBorder("Chat History");
    private final JTextField textField = new JTextField(10);
    private final JButton sendB = new JButton();
    private final JScrollPane textAreaScroll = new JScrollPane(
            textChatArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private Socket chatSocket;
    private ServerSocket serverChat;
    private BufferedReader in1;
    private PrintWriter out1;
    private BufferedReader in2;
    private PrintWriter out2;
    private ServerChat serverThread = new ServerChat();
    private Socket sendSocket;
    private ClientChat clientThread = new ClientChat();
    private boolean isServer;
    
    /** Creates a new instance of ChatPanel. */
    public ChatPanel() {
        setSize(200, 300);
        setLocation(600, 350);

        textAreaScroll.setSize(180, 190);
        textAreaScroll.setLocation(10, 0);

        setLayout(null);

        textAreaScroll.setEnabled(false);
        textField.setEnabled(false);
        sendB.setEnabled(false);
        
        //set sendButton's info
        sendB.setSize(80, 30);
        sendB.setLocation(50, 230);
        sendB.setText("Send");
        
        
        //set TextField info
        textField.setSize(180, 20);
        textField.setLocation(10, 200);
        textField.add(textAreaScroll);
        textField.setToolTipText("Write Text Here");

        //set textChatArea info
        textChatArea.setEditable(false);
        textChatArea.setBorder(textBorder);
        
        
        add(textAreaScroll);
        add(textField);
        add(sendB);

        sendB.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textChatArea.append("\n" + textField.getText());
                if (isServer) {
                    sendTextServer();
                    textField.setText(null);
                } else {
                    sendTextChat();
                    textField.setText(null);
                }

            }
        });

        textField.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                // System.out.println("okdddd "+e.KEY_PRESSED+" "+e.VK_PAGE_DOWN);

                if (e.getKeyChar() == '\n') {
                    textChatArea.append("\n" + textField.getText());

                    if (isServer) {
                        sendTextServer();
                        textField.setText(null);
                    } else {
                        sendTextChat();
                        textField.setText(null);
                    }

                }
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });

        // add(chatPanelScroll); //TODO: add chat panel scroll

    }

    // TODO: fix chat panel with correct sockets and ports
    public void startChat() {
        textAreaScroll.setEnabled(true);
        textField.setEnabled(true);
        sendB.setEnabled(true);

        isServer = false;
        try {
            sendSocket = new Socket("127.0.0.1", 5002);
            in2 = new BufferedReader(new InputStreamReader(sendSocket.getInputStream()));
            out2 = new PrintWriter(sendSocket.getOutputStream());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        clientThread.start();
    }

    public void sendTextChat() {
        out2.print(textField.getText());
        out2.print("\r\n");

        out2.flush();

    }

    public void sendTextServer() {
        out1.print(textField.getText());
        out1.print("\r\n");

        out1.flush();

    }

    public void listenToChat() {
        textAreaScroll.setEnabled(true);
        textField.setEnabled(true);
        sendB.setEnabled(true);

        isServer = true;
        try {

            serverChat = new ServerSocket(5002);

            chatSocket = serverChat.accept();

            in1 = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));

            out1 = new PrintWriter(chatSocket.getOutputStream());

            // chatSocket.setSoTimeout(10000);

            serverThread.start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    class ClientChat extends Thread {
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = in2.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (receive != null) {
                    textChatArea.append("\n" + "Other: " + receive);
                }
            }
        }
    }

    class ServerChat extends Thread {
        public void run() {
            String receive = null;
            while (true) {
                try {
                    receive = in1.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (receive != null) {

                    textChatArea.append("\n" + "Other: " + receive);

                }
            }
        }
    }

}
