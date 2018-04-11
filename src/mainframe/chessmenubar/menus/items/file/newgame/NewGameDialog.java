
package mainframe.chessmenubar.menus.items.file.newgame;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import mainframe.chessframe.MainFrame;

public class NewGameDialog extends JDialog {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of NewGameDialog. */
    public NewGameDialog(final MainFrame ff) {
        super(ff, "New Game", true);

        setSize(300, 350);
        setLocation(100, 100);
        panel.setLayout(null);

        panel.setSize(300, 300);

        button1 = new JButton("Start");
        button2 = new JButton("Cancel");

        button1.setSize(80, 24);
        button2.setSize(80, 24);

        button1.setLocation(50, 250);
        button2.setLocation(130, 250);

        myCom.setSize(80, 20);
        myCom.setLocation(50, 50);

        typeGame.setSize(80, 24);
        typeGame.setLocation(40, 20);

        myIpAddress.setSize(80, 24);
        myIpAddress.setLocation(50, 100);

        ipText.setLocation(130, 100);
        ipText.setSize(150, 24);

        myPortNumber.setSize(80, 24);
        myPortNumber.setLocation(50, 130);

        portText.setLocation(130, 130);
        portText.setSize(150, 24);

        ipText.setEnabled(false);
        portText.setEnabled(false);
        myIpAddress.setEnabled(false);
        myPortNumber.setEnabled(false);

        asServer.setSize(80, 24);
        asServer.setLocation(50, 180);
        asClient.setSize(80, 24);
        asClient.setLocation(150, 180);

        buttonGroup.add(asServer);
        buttonGroup.add(asClient);

        buttonGroup.setSelected(asServer.getModel(), true);

        asServer.setEnabled(false);
        asClient.setEnabled(false);

        mynewFrame = ff;

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selected = (String) myCom.getSelectedItem();

                if (selected == "Local") {
                    mynewFrame.startAgain();
                } else {
                    if (buttonGroup.getSelection() == asServer.getModel()) {
                        mynewFrame.startAsServer();
                    } else {
                        mynewFrame.startAsClient();
                    }
                }

                dispose();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.setLayout(null);

        panel.add(myCom);
        panel.add(button1);
        panel.add(button2);
        panel.add(typeGame);
        panel.add(myIpAddress);
        panel.add(ipText);
        panel.add(myPortNumber);
        panel.add(portText);
        panel.add(asServer);
        panel.add(asClient);

        Container cp = getContentPane();
        cp.add(panel);

        ipText.setText("127.0.0.1");
        portText.setText("5000");

        myCom.addItemListener(new MyItemLestin());
        myCom.addItem("Local");
        myCom.addItem("Via a net");

    }

    class MyItemLestin implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selected = ((JComboBox) e.getSource()).getSelectedItem().toString();

            if (selected.equals("Local")) {

                ipText.setEnabled(false);
                portText.setEnabled(false);

                myIpAddress.setEnabled(false);
                myPortNumber.setEnabled(false);
                asServer.setEnabled(false);
                asClient.setEnabled(false);

            } else if (selected.equals("Via a net")) {
                ipText.setEnabled(true);
                portText.setEnabled(true);
                myIpAddress.setEnabled(true);
                myPortNumber.setEnabled(true);

                asServer.setEnabled(true);
                asClient.setEnabled(true);

            }
        }

    }

    public String getIpAddress() {
        return ipText.getText();
    }

    public String getPortNumber() {
        return portText.getText();
    }

    private final JButton button1;
    private final JButton button2;
    private final JComboBox myCom = new JComboBox();
    private final JPanel panel = new JPanel();

    private final JLabel typeGame = new JLabel(" Game Type: ");
    private final JLabel myIpAddress = new JLabel(" IP Address : ");
    private final JLabel myPortNumber = new JLabel(" Port : ");
    private final JTextField ipText = new JTextField(12);
    private final JTextField portText = new JTextField(5);
    private final JRadioButton asServer = new JRadioButton("Server");
    private final JRadioButton asClient = new JRadioButton("Client");
    private MainFrame mynewFrame;
    private ButtonGroup buttonGroup = new ButtonGroup();

    public void paintComponents(Graphics g) {
        super.paintComponents(g);

    }

}
