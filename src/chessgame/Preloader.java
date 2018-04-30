package chessgame;

import static java.awt.Color.BLACK;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import mainframe.chessframe.MainFrame;

/**
 * Initial Version: 11/7/2016 Updated Version: 4/29/2018.
 *
 * @author jeremypowell
 * @author Joshua Goralczyk
 * @author chaseboulter
 */
public class Preloader extends JFrame {

    private static final long serialVersionUID = 1L;

    /** The valid ip. */
    // Initalize Values
    private boolean validIp = true;

    /** The valid port. */
    private boolean validPort = true;

    /** The exit window. */
    private volatile boolean exitWindow = false; // Tests "ready" button to close window

    /** The name given. */
    private boolean nameGiven = false; // Tests if name field has input

    /** The first name. */
    private String firstName = ""; // Store user (name) input

    /** The name field. */
    private JTextField nameField;

    /** The name label. */
    private JLabel nameLabel;

    /** The play button. */
    private JButton playButton;

    /** The title label. */
    private JLabel titleLabel;

    /** The txt ip. */
    private JTextField txtIp;

    /** The text port. */
    private JTextField textPort;

    /** The local or online. */
    private ButtonGroup localOrOnline;

    /** The sbg. */
    private ButtonGroup sbg;

    /** The rdbtn local. */
    private JRadioButton rdbtnLocal;

    /** The rdbtn online. */
    private JRadioButton rdbtnOnline;

    /** The rdbtn client. */
    private JRadioButton rdbtnClient;

    /** The rdbtn server. */
    private JRadioButton rdbtnServer;

    /** The lbl ip address. */
    private JLabel lblIpAddress;

    /** The lbl port. */
    private JLabel lblPort;

    /** The my new frame. */
    private MainFrame myNewFrame; // for online and local

    /** The Constant PATTERN. */
    private static final Pattern PATTERN = Pattern
            .compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    /** The lbl hit enter to. */
    private JLabel lblHitEnterTo;

    /** The lbl port info. */
    private JLabel lblPortInfo;

    /**
     * Instantiates a new preloader.
     */
    public Preloader() {
        this.setMinimumSize(new Dimension(600, 400));
        this.setPreferredSize(new Dimension(600, 400));
        this.setMaximumSize(new Dimension(600, 400));
        this.initComponents(); // Initalize alignements and fields
        this.playButton.setEnabled(false); // Disable "ready" button
        this.setLocationRelativeTo(null); // Center Setup Frame on Screen
        this.setResizable(false);
        this.setVisible(true);

    }

    /**
     * Inits the components.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        this.titleLabel = new JLabel();
        this.nameLabel = new JLabel();
        this.nameField = new JTextField();
        this.playButton = new JButton();

        // init local online radio buttons
        this.localOrOnline = new ButtonGroup();

        // init server client
        this.sbg = new ButtonGroup();
        // sbg.add(asServer);
        // sbg.add(asClient);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Setup");
        this.setAlwaysOnTop(true);
        this.setBackground(new Color(0, 0, 0));
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        this.setIconImages(null);
        this.setLocation(new Point(100, 100));
        this.setName("setupFrame"); // NOI18N
        this.setPreferredSize(new Dimension(450, 275));
        this.setResizable(false);

        this.titleLabel.setFont(new Font("Matura MT Script Capitals", 1, 48)); // NOI18N
        this.titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.titleLabel.setText("JChess!");

        this.nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.nameLabel.setText("Your Name:");
        this.nameLabel.setFocusable(false);
        this.nameLabel.setInheritsPopupMenu(false);
        this.nameLabel.setMaximumSize(new Dimension(300, 16));
        this.nameLabel.setRequestFocusEnabled(false);
        this.nameLabel.setVerifyInputWhenFocusTarget(false);
        this.nameLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent evt) {
                Preloader.this.nameLabelMouseClicked(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                Preloader.this.nameLabelMouseExited(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                Preloader.this.nameLabelMouseEntered(evt);
            }
        });

        this.nameField.setForeground(new Color(204, 204, 204));
        this.nameField.setText("Player Name");
        this.nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        this.nameField.setMaximumSize(new Dimension(125, 26));
        this.nameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                Preloader.this.nameFieldFocusGained(evt);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                if (Preloader.this.validName(Preloader.this.nameField.getText())) {
                    Preloader.this.lblHitEnterTo.setEnabled(false);
                } else {
                    Preloader.this.lblHitEnterTo.setEnabled(true);
                }
            }
        });
        this.nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Preloader.this.nameFieldMouseClicked(evt);
            }
        });
        this.nameField.addActionListener(evt -> this.nameFieldActionPerformed(evt));

        this.playButton.setBackground(new Color(255, 255, 255));
        this.playButton.setText("Ready!");
        this.playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        this.playButton.addActionListener(evt -> this.playButtonActionPerformed(evt));

        // local or online?
        this.rdbtnLocal = new JRadioButton("local");
        this.localOrOnline.add(this.rdbtnLocal);

        this.rdbtnOnline = new JRadioButton("online");
        this.localOrOnline.add(this.rdbtnOnline);

        // client or server
        this.rdbtnClient = new JRadioButton("client");
        this.sbg.add(this.rdbtnClient);

        this.rdbtnServer = new JRadioButton("server");
        this.sbg.add(this.rdbtnServer);

        this.txtIp = new JTextField();
        this.txtIp.setText("127.0.0.1");
        this.txtIp.setColumns(10);

        this.lblIpAddress = new JLabel("IP Address");

        this.lblPort = new JLabel("Port");

        this.textPort = new JTextField();
        this.textPort.setText("9000");
        this.textPort.setColumns(10);

        this.lblHitEnterTo = new JLabel("Hit enter to confirm name.");

        this.lblPortInfo = new JLabel("port must be between 1025 and 65533");

        GroupLayout layout = new GroupLayout(this.getContentPane());
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup().addGap(212)
                        .addComponent(this.lblHitEnterTo).addContainerGap(221, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(this.titleLabel, GroupLayout.PREFERRED_SIZE, 601,
                                GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout
                                .createSequentialGroup().addGap(189)
                                .addComponent(this.nameLabel, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(this.nameField, GroupLayout.PREFERRED_SIZE, 125,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(6))
                                .addGroup(layout.createSequentialGroup().addGap(99)
                                        .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(this.rdbtnLocal).addGap(244))
                                                .addComponent(this.rdbtnClient)
                                                .addComponent(this.lblIpAddress))))
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(this.lblPort)))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.rdbtnOnline)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(this.textPort, Alignment.TRAILING,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                .addComponent(this.txtIp,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(this.rdbtnServer))))
                        .addGap(121))
                .addGroup(layout.createSequentialGroup().addContainerGap(287, Short.MAX_VALUE)
                        .addComponent(this.lblPortInfo).addGap(123))
                .addGroup(Alignment.LEADING, layout.createSequentialGroup().addGap(251)
                        .addComponent(this.playButton).addContainerGap(265, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap().addComponent(this.titleLabel)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(18)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.nameLabel, GroupLayout.PREFERRED_SIZE,
                                                26, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(this.nameField, GroupLayout.PREFERRED_SIZE,
                                                26, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(this.lblHitEnterTo).addGap(29)
                                .addComponent(this.rdbtnClient))
                        .addGroup(layout.createSequentialGroup().addGap(66)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.rdbtnLocal)
                                        .addComponent(this.rdbtnOnline))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(this.rdbtnServer))
                        .addGroup(layout.createSequentialGroup().addGap(136).addGroup(layout
                                .createParallelGroup(Alignment.BASELINE)
                                .addComponent(this.txtIp, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(this.lblIpAddress))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.textPort, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(this.lblPort))))
                .addPreferredGap(ComponentPlacement.RELATED).addComponent(this.lblPortInfo)
                .addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(this.playButton).addGap(22)));
        this.getContentPane().setLayout(layout);
        this.pack();

        this.txtIp.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // intentionally left empty
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // intentionally left empty
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = Preloader.this.txtIp.getText();
                if (!validateIpAddress(text)) {
                    Preloader.this.lblIpAddress.setForeground(Color.RED);
                    Preloader.this.playButton.setEnabled(false);
                    Preloader.this.validIp = false;
                } else {
                    Preloader.this.lblIpAddress.setForeground(Color.BLACK);
                    Preloader.this.validIp = true;

                    // initiates whether user input is correct
                    Preloader.this.readyToPlay();
                }

            }

        });

        this.textPort.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // intentionally left empty
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // intentionally left empty
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = Preloader.this.textPort.getText();
                if (!Preloader.this.validatePortNumber(text)) {
                    Preloader.this.lblPort.setForeground(Color.RED);
                    Preloader.this.playButton.setEnabled(false);
                    Preloader.this.lblPortInfo.setEnabled(true);
                    Preloader.this.lblPortInfo.setForeground(Color.RED);

                    Preloader.this.validPort = false;
                } else {
                    Preloader.this.lblPort.setForeground(Color.BLACK);
                    Preloader.this.lblPortInfo.setEnabled(false);
                    Preloader.this.lblPortInfo.setForeground(Color.BLACK);
                    Preloader.this.validPort = true;

                    // initiates whether user input is correct.
                    Preloader.this.readyToPlay();
                }

            }

        });

        // RADIO BUTTON LOGIC
        this.rdbtnLocal.setSelected(true);
        // sets default as selected
        this.txtIp.setEnabled(false);
        this.textPort.setEnabled(false);
        this.rdbtnServer.setEnabled(false);
        this.rdbtnClient.setEnabled(false);
        this.lblIpAddress.setEnabled(false);
        this.lblPort.setEnabled(false);
        this.lblPortInfo.setEnabled(false);

        this.rdbtnLocal.addChangeListener(e -> {
            this.rdbtnClient.setEnabled(false);
            this.rdbtnServer.setSelected(false);
            this.rdbtnServer.setEnabled(false);
            this.txtIp.setEditable(false);
            this.textPort.setEditable(false);
            this.txtIp.setEnabled(false);
            this.textPort.setEnabled(false);
            this.lblIpAddress.setEnabled(false);
            this.lblPort.setEnabled(false);

        });

        this.rdbtnOnline.addChangeListener(e -> {
            this.rdbtnClient.setEnabled(true);
            this.rdbtnServer.setEnabled(true);
            this.rdbtnServer.setSelected(true);
            this.txtIp.setEditable(true);
            this.textPort.setEditable(true);
            this.txtIp.setEnabled(true);
            this.textPort.setEnabled(true);
            this.lblIpAddress.setEnabled(true);
            this.lblPort.setEnabled(true);

        });
    }

    /**
     * enter button clicked on JTextField for name.
     *
     * @param evt
     *            the evt
     */
    private void nameFieldActionPerformed(ActionEvent evt) {
        this.firstName = this.nameField.getText();
        if (this.validName(this.firstName)) {
            this.lblHitEnterTo.setEnabled(false);
        } else {
            this.lblHitEnterTo.setEnabled(true);
        }
    }

    /**
     * mouse clicked on JTextField for name.
     *
     * @param evt
     *            the evt
     */
    private void nameFieldMouseClicked(MouseEvent evt) {
        this.nameField.setFocusable(true); // Focus on "name" input field

        if (this.nameField.getText().equals("Player Name")) { // Clear only if initial text
            this.nameField.setText(""); // Erase inital text
        }
    }

    /**
     * The "Ready!" button was clicked. Checks for local or online gameplay depending on radio
     * buttons.
     *
     * @param evt
     *            the evt
     */
    private void playButtonActionPerformed(ActionEvent evt) {
        this.exitWindow = true; // Exit preloader loop
        this.dispose(); // Exit preloader window

        // initialize new frame
        // if local then initialize local play
        if (this.rdbtnLocal.isSelected()) {
            this.myNewFrame = new MainFrame();
            this.myNewFrame.startAgain();
        } else { // else it's online play
            if (this.rdbtnServer.isSelected()) {
                this.myNewFrame = new MainFrame();
                this.myNewFrame.startAsServer();
            } else {
                this.myNewFrame = new MainFrame();
                this.myNewFrame.startAsClient();
            }
        }

    }

    /**
     * Ready to play.
     *
     * @return true, if successful
     */
    public boolean readyToPlay() {
        if (this.validPort && this.validIp
                || this.rdbtnLocal.isSelected() && this.validName(this.nameField.getText())) {
            this.playButton.setEnabled(true); // Make "ready" button click-able
            return true;
        }
        return false;
    }

    /**
     * Name field focus gained.
     *
     * @param evt
     *            the evt
     */
    // Method:
    private void nameFieldFocusGained(FocusEvent evt) {
        this.nameField.setForeground(BLACK); // Set text color to black while typing name
    }

    /**
     * Name label mouse entered.
     *
     * @param evt
     *            the evt
     */
    // Method: Mouse is Hoverirng over Text Label
    private void nameLabelMouseEntered(MouseEvent evt) {
        // Text color changes to gray with mouse hovering over
        if (this.nameGiven) {
            this.nameLabel.setForeground(new Color(102, 102, 102));
        }
    }

    /**
     * Name label mouse exited.
     *
     * @param evt
     *            the evt
     */
    // Method: Mouse is Not Hovering Over Text Label
    private void nameLabelMouseExited(MouseEvent evt) {
        this.nameLabel.setForeground(BLACK); // Text reverts to color black without mouse hovering
    }

    /**
     * Name label mouse clicked.
     *
     * @param evt
     *            the evt
     */
    // Method:
    private void nameLabelMouseClicked(MouseEvent evt) {
        this.playButton.setEnabled(false); // Disable "ready!" button

        this.nameField.setVisible(true); // Make visible the "name input field"
        this.nameField.requestFocus(true); // Focus input on input text field

        this.nameLabel.setText("Your Name:"); // Set input text field
        this.nameLabel.setHorizontalAlignment(SwingConstants.RIGHT); // right justification
        this.nameLabel.setFont(new Font("Lucida Grande", 0, 13)); // Set "text labels" font and size

        this.nameGiven = false;
    }

    // End of variables declaration

    /**
     * End loading.
     *
     * @return true, if successful
     */
    // Method: Exit Pre-loader
    public boolean endLoading() {
        return this.exitWindow; // Allows the main looping file to close the pre-loader
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.Component#getName()
     */
    // Method: Set Player Full Name
    @Override
    public String getName() { // Gives full name of user
        return this.firstName;
    }

    /**
     * gets IpAddress from txtIp JTextField.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return this.txtIp.getText();
    }

    /**
     * gets port number from textPort JTextField.
     *
     * @return the port number
     */
    public String getPortNumber() {
        return this.textPort.getText();
    }

    /**
     * assumes validateIpAddress has been used already.
     *
     * @param address
     *            the new ip address
     */
    public void setIpAddress(String address) {
        this.txtIp.setText(address);
    }

    /**
     * used from https://stackoverflow.com/questions/5667371/validate-ipv4-address-in-java to
     * validate an IP address.
     *
     * @param ip
     *            the ip
     * @return true, if successful
     */
    public static boolean validateIpAddress(final String ip) {
        return PATTERN.matcher(ip).matches();
    }

    /**
     * assumed that validatePortNumber is used with it.
     *
     * @param port
     *            valid port number.
     */
    public void setPortNumber(String port) {
        this.textPort.setText(port);

    }

    /**
     * validates port number from text field.
     *
     * @param port
     *            to test against
     * @return true, if successful
     */
    public boolean validatePortNumber(String port) {
        int validPort;
        try {
            validPort = Integer.parseInt(port);
            // reserved ports and max ports - 1
            if (validPort > 1024 && validPort < 65533) {
                return true;
            }
        } catch (NumberFormatException ex) {
            // exit out of program, warn user
            return false;
            // JOptionPane.showMessageDialog(null, "Invalid port number. Try again!", "Invalid Port
            // Number", JOptionPane.WARNING_MESSAGE);
        }

        return false;
    }

    /**
     * info for singleton.
     *
     * @author Josh
     */
    private static class SingletonHolder {

        /** The Constant instance. */
        public static final Preloader instance = new Preloader();
    }

    /**
     * info to get singleton instance.
     *
     * @return single instance of Preloader
     */
    public static Preloader getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * decides if the user name is valid. Must be less than 10 characters.
     *
     * @param text
     *            the text
     * @return true, if successful
     */
    public boolean validName(String text) {

        if (text.equals("Chase") || text.equals("Bansal")) {
            this.firstName = text;
            this.titleLabel.setText("You win!");
            this.nameLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center "name label" txt
            this.nameLabel.setFont(new Font("Matura MT Script Capitals", 0, 24));
            this.nameLabel.setText("Sir " + this.firstName);
            this.playButton.setEnabled(false);
            this.nameField.setVisible(false);
            this.nameGiven = true;

            return false;
        } else if (!text.equals("") && !text.equalsIgnoreCase("Player Name")
                && text.length() < 10) {
            this.firstName = text;
            this.nameField.setVisible(false); // Hide the "typing field"
            // lastName = getLastName(lastNames); // Save "last name"
            this.nameLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center "name label"
            this.nameLabel.setFont(new Font("Matura MT Script Capitals", 0, 24));
            this.nameLabel.setText("Sir " + this.firstName);
            this.nameGiven = true;
            // check if ready
            this.readyToPlay();
            return true;
        }

        // else initialize to original state
        this.nameField.setText("Player Name"); // Set input field to default text
        this.nameField.setForeground(new Color(204, 204, 204)); // Set color of default text
        this.nameField.setFocusable(false);
        this.playButton.setEnabled(false);
        return false;
    }
}
