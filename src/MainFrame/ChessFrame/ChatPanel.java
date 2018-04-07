
package mainframe.chessframe;

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.net.Socket;
import java.net.ServerSocket;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import javax.swing.border.TitledBorder;

public class ChatPanel extends JPanel {

    /** Creates a new instance of ChatPanel. */
    public ChatPanel() {
        setSize(200, 300);
        setLocation(600, 350);

        textAreaScroll.setSize(180, 190);
        textAreaScroll.setLocation(10, 0);

        setLayout(null);

        textAreaScroll.setEnabled(false);
        textfield.setEnabled(false);
        sendB.setEnabled(false);

        add(textAreaScroll);
        add(textfield);
        add(sendB);

        sendB.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.append("\n" + textfield.getText());
                if (I_am_What) {
                    sendTextServer();
                    textfield.setText(null);
                } else {
                    sendTextChat();
                    textfield.setText(null);
                }

            }
        });

        textfield.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                // System.out.println("okdddd "+e.KEY_PRESSED+" "+e.VK_PAGE_DOWN);

                if (e.getKeyChar() == '\n') {
                    textArea.append("\n" + textfield.getText());

                    if (I_am_What) {
                        sendTextServer();
                        textfield.setText(null);
                    } else {
                        sendTextChat();
                        textfield.setText(null);
                    }

                }
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });

        // add(chatPanelScroll);

    }

    //TODO: fix chat panel with correct sockets and ports
    public void startChat() {
        textAreaScroll.setEnabled(true);
        textfield.setEnabled(true);
        sendB.setEnabled(true);

        I_am_What = false;
        try {
            send_socket = new Socket("127.0.0.1", 5002);
            in2 = new BufferedReader(new InputStreamReader(send_socket.getInputStream()));
            out2 = new PrintWriter(send_socket.getOutputStream());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        client_thread.start();
    }

    public void sendTextChat() {
        out2.print(textfield.getText());
        out2.print("\r\n");

        out2.flush();

    }

    public void sendTextServer() {
        out1.print(textfield.getText());
        out1.print("\r\n");

        out1.flush();

    }

    public void ListenToChat() {

        textAreaScroll.setEnabled(true);
        textfield.setEnabled(true);
        sendB.setEnabled(true);

        I_am_What = true;
        try {

            server_chat = new ServerSocket(5002);

            chat_socket = server_chat.accept();

            in1 = new BufferedReader(new InputStreamReader(chat_socket.getInputStream()));

            out1 = new PrintWriter(chat_socket.getOutputStream());

            // chat_socket.setSoTimeout(10000);

            myserv_thread.start();

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
                    textArea.append("\n" + "Other: " + receive);
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

                    textArea.append("\n" + "Other: " + receive);

                }
            }
        }
    }

    private final ChatArea textArea = new ChatArea(6, 20);
    private final MyTextField textfield = new MyTextField(10);
    private final SendButton sendB = new SendButton();
    private final JScrollPane textAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private Socket chat_socket;
    private ServerSocket server_chat;
    private BufferedReader in1;
    private PrintWriter out1;
    private BufferedReader in2;
    private PrintWriter out2;
    private ServerChat myserv_thread = new ServerChat();
    private Socket send_socket;
    private ClientChat client_thread = new ClientChat();
    private boolean I_am_What;

}

class ChatArea extends JTextArea {
    ChatArea(int rowNum, int colNum) {
        super(rowNum, colNum);

        /*
         * setSize(130,150); setLocation(30,0);
         */
        setEditable(false);
        // textAreaScroll =new
        // JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // this.add(textAreaScroll);
        setBorder(TextBorder);

    }

    private final TitledBorder TextBorder = new TitledBorder("Chat History");
}

class SendButton extends JButton {
    SendButton() {

        setSize(80, 30);
        setLocation(50, 230);
        setText("Send");
    }
}

class MyTextField extends JTextField {
    MyTextField(int fieldLength) {
        super(fieldLength);
        setSize(180, 20);
        setLocation(10, 200);

        add(textAreaScroll);
        this.setToolTipText("Write Text Here");

    }

    private final JScrollPane textAreaScroll = new JScrollPane();
}
