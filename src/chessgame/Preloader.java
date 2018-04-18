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
 * Initial Version: 11/7/2016
 * Updated Version: 4/15/2018.
 *
 * @author jeremypowell
 * @author Joshua Goralczyk
 */

//TODO: local button, online button set local host and port
public class Preloader extends JFrame {

    /** The valid ip. */
    // Initalize Values
    private boolean validIp = true;

    /** The valid port. */
    private boolean validPort = true;

    /** The exit window. */
    private volatile boolean exitWindow = false;                 // Tests "ready" button to close window

    /** The name given. */
    private boolean nameGiven = false;                  // Tests if name field has input 

    /** The first name. */
    private String firstName = "";                      // Store user (name) input      

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
    private MainFrame myNewFrame; //for online and local

    /** The Constant PATTERN. */
    private static final Pattern PATTERN = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    /** The lbl hit enter to. */
    private JLabel lblHitEnterTo;

    /** The lbl port info. */
    private JLabel lblPortInfo;



    /**
     * Instantiates a new preloader.
     */
    public Preloader() {
        setMinimumSize(new Dimension(600, 400));
        setPreferredSize(new Dimension(600, 400));
        setMaximumSize(new Dimension(600, 400));
        initComponents();                               // Initalize alignements and fields
        playButton.setEnabled(false);                   // Disable "ready" button
        this.setLocationRelativeTo(null);               // Center Setup Frame on Screen
        setResizable(false);
        setVisible(true);

    }

    /**
     * Inits the components.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        titleLabel = new JLabel();
        nameLabel = new JLabel();
        nameField = new JTextField();
        playButton = new JButton();

        //init local online radio buttons
        localOrOnline = new ButtonGroup();

        //init server client
        sbg = new ButtonGroup();
        //sbg.add(asServer);
        //sbg.add(asClient);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Setup");
        setAlwaysOnTop(true);
        setBackground(new Color(0, 0, 0));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new Point(100, 100));
        setName("setupFrame"); // NOI18N
        setPreferredSize(new Dimension(450, 275));
        setResizable(false);

        titleLabel.setFont(new Font("Matura MT Script Capitals", 1, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setText("JChess!");

        nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nameLabel.setText("Your Name:");
        nameLabel.setFocusable(false);
        nameLabel.setInheritsPopupMenu(false);
        nameLabel.setMaximumSize(new Dimension(300, 16));
        nameLabel.setRequestFocusEnabled(false);
        nameLabel.setVerifyInputWhenFocusTarget(false);
        nameLabel.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent evt) {
                nameLabelMouseClicked(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                nameLabelMouseExited(evt);
            }
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
        });

        nameField.setForeground(new Color(204, 204, 204));
        nameField.setText("Player Name");
        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        nameField.setMaximumSize(new Dimension(125, 26));
        nameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            @Override
            public void focusLost(FocusEvent evt)  {
                if(validName(nameField.getText())) {
                    lblHitEnterTo.setEnabled(false);
                } else {
                    lblHitEnterTo.setEnabled(true);
                }
            }
        });
        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(evt -> nameFieldActionPerformed(evt));

        playButton.setBackground(new Color(255, 255, 255));
        playButton.setText("Ready!");
        playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        playButton.addActionListener(evt -> playButtonActionPerformed(evt));

        //local or online?
        rdbtnLocal = new JRadioButton("local");
        localOrOnline.add(rdbtnLocal);

        rdbtnOnline = new JRadioButton("online");
        localOrOnline.add(rdbtnOnline);


        //client or server
        rdbtnClient = new JRadioButton("client");
        sbg.add(rdbtnClient);

        rdbtnServer = new JRadioButton("server");
        sbg.add(rdbtnServer);

        txtIp = new JTextField();
        txtIp.setText("127.0.0.1");
        txtIp.setColumns(10);

        lblIpAddress = new JLabel("IP Address");

        lblPort = new JLabel("Port");

        textPort = new JTextField();
        textPort.setText("9000");
        textPort.setColumns(10);

        lblHitEnterTo = new JLabel("Hit enter to confirm name.");

        lblPortInfo = new JLabel("port must be between 1025 and 65534");

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(212)
                        .addComponent(lblHitEnterTo)
                        .addContainerGap(221, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 601, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(189)
                                                .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(99)
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rdbtnLocal)
                                                                .addGap(244))
                                                        .addComponent(rdbtnClient)
                                                        .addComponent(lblIpAddress))))
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblPort)))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(rdbtnOnline)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textPort, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                .addComponent(txtIp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rdbtnServer))))
                        .addGap(121))
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap(287, Short.MAX_VALUE)
                        .addComponent(lblPortInfo)
                        .addGap(123))
                .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(251)
                        .addComponent(playButton)
                        .addContainerGap(265, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(18)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(lblHitEnterTo)
                                        .addGap(29)
                                        .addComponent(rdbtnClient))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(66)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(rdbtnLocal)
                                                .addComponent(rdbtnOnline))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(rdbtnServer))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(136)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(txtIp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblIpAddress))
                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(textPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPort))))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(lblPortInfo)
                        .addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(playButton)
                        .addGap(22))
                );
        getContentPane().setLayout(layout);
        pack();

        txtIp.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {  
                //intentionally left empty
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //intentionally left empty
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = txtIp.getText();
                if(!validateIpAddress(text)) {
                    lblIpAddress.setForeground(Color.RED);
                    playButton.setEnabled(false);
                    validIp = false;
                } else {
                    lblIpAddress.setForeground(Color.BLACK);
                    validIp = true;

                    //initiates whether user input is correct
                    readyToPlay();
                }

            }

        });

        textPort.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {  
                //intentionally left empty
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //intentionally left empty
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = textPort.getText();
                if(!validatePortNumber(text)) {
                    lblPort.setForeground(Color.RED);
                    playButton.setEnabled(false);
                    lblPortInfo.setEnabled(true);
                    lblPortInfo.setForeground(Color.RED);

                    validPort = false;
                } else {
                    lblPort.setForeground(Color.BLACK);
                    lblPortInfo.setEnabled(false);
                    lblPortInfo.setForeground(Color.BLACK);
                    validPort = true;

                    //initiates whether user input is correct.
                    readyToPlay();
                }

            }

        });

        //RADIO BUTTON LOGIC
        rdbtnLocal.setSelected(true);
        //sets default as selected
        txtIp.setEnabled(false);
        textPort.setEnabled(false);
        rdbtnServer.setEnabled(false);
        rdbtnClient.setEnabled(false);
        lblIpAddress.setEnabled(false);
        lblPort.setEnabled(false);
        lblPortInfo.setEnabled(false);

        rdbtnLocal.addChangeListener(e -> {
            rdbtnClient.setEnabled(false);
            rdbtnServer.setSelected(false);
            rdbtnServer.setEnabled(false);
            txtIp.setEditable(false);
            textPort.setEditable(false);
            txtIp.setEnabled(false);
            textPort.setEnabled(false);
            lblIpAddress.setEnabled(false);
            lblPort.setEnabled(false);


        });

        rdbtnOnline.addChangeListener(e -> {
            rdbtnClient.setEnabled(true);
            rdbtnServer.setEnabled(true);
            rdbtnServer.setSelected(true);
            txtIp.setEditable(true);
            textPort.setEditable(true);
            txtIp.setEnabled(true);
            textPort.setEnabled(true);
            lblIpAddress.setEnabled(true);
            lblPort.setEnabled(true);


        });
    }// </editor-fold>                        

    /**
     * enter button clicked on JTextField for name.
     *
     * @param evt the evt
     */
    private void nameFieldActionPerformed(ActionEvent evt) {     
        firstName = nameField.getText();
        if(validName(firstName)) {
            lblHitEnterTo.setEnabled(false);
        } else {
            lblHitEnterTo.setEnabled(true);
        }
    }                                         


    /**
     * mouse clicked on JTextField for name.
     *
     * @param evt the evt
     */
    private void nameFieldMouseClicked(MouseEvent evt) {                                       
        nameField.setFocusable(true);                       // Focus on "name" input field

        if (nameField.getText().equals("Player Name")){     // Clear only if initial text
            nameField.setText("");                          // Erase inital text
        }
    }                                      


    /**
     * The "Ready!" button was clicked.
     * Checks for local or online gameplay depending on radio buttons.
     *
     * @param evt the evt
     */
    private void playButtonActionPerformed(ActionEvent evt) {                                           
        exitWindow = true;              // Exit preloader loop
        this.dispose();                      // Exit preloader window

        //initialize new frame
        //if local then initialize local play
        if (rdbtnLocal.isSelected()) {
            myNewFrame = new MainFrame();
            myNewFrame.startAgain();
        } else { //else it's online play
            if (rdbtnServer.isSelected()) {
                myNewFrame = new MainFrame();
                myNewFrame.startAsServer();
            } else {
                myNewFrame = new MainFrame();
                myNewFrame.startAsClient();
            }
        }

        //dispose();

    }                                          

    /**
     * Ready to play.
     *
     * @return true, if successful
     */
    public boolean readyToPlay() {
        if(validPort && validIp || rdbtnLocal.isSelected() && validName(nameField.getText())) {
            playButton.setEnabled(true);   // Make "ready" button click-able
            return true;
        }
        return false;
    }

    /**
     * Name field focus gained.
     *
     * @param evt the evt
     */
    // Method: 
    private void nameFieldFocusGained(FocusEvent evt) {                                      
        nameField.setForeground(BLACK); // Set text color to black while typing name
    }                                     


    /**
     * Name label mouse entered.
     *
     * @param evt the evt
     */
    // Method: Mouse is Hoverirng over Text Label
    private void nameLabelMouseEntered(MouseEvent evt) {   
        // Text color changes to gray with mouse hovering over
        if (nameGiven) {
            nameLabel.setForeground(new Color(102, 102, 102));
        } 
    }                                      


    /**
     * Name label mouse exited.
     *
     * @param evt the evt
     */
    // Method: Mouse is Not Hovering Over Text Label
    private void nameLabelMouseExited(MouseEvent evt) {                                      
        nameLabel.setForeground(BLACK);     // Text reverts to color black without mouse hovering over
    }                                     


    /**
     * Name label mouse clicked.
     *
     * @param evt the evt
     */
    // Method: 
    private void nameLabelMouseClicked(MouseEvent evt) {                                       
        playButton.setEnabled(false);                                   // Disable "ready!" button

        nameField.setVisible(true);                                     // Make visible the "name input field" 
        nameField.requestFocus(true);                                   // Focus input on input text field

        nameLabel.setText("Your Name:");                                // Set input text field
        nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);             // right justification 
        nameLabel.setFont(new Font("Lucida Grande", 0, 13));            // Set "text labels" font and size 

        nameGiven = false;
    }                                      

    // End of variables declaration                   


    /**
     * End loading.
     *
     * @return true, if successful
     */
    // Method: Exit Pre-loader
    public boolean endLoading() {
        return exitWindow; // Allows the main looping file to close the pre-loader
    } 


    /* (non-Javadoc)
     * @see java.awt.Component#getName()
     */
    // Method: Set Player Full Name
    @Override
    public String getName() { // Gives full name of user
        return firstName;
    }

    /**
     * gets IpAddress from txtIp JTextField.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return txtIp.getText();
    }

    /**
     * gets port number from textPort JTextField.
     *
     * @return the port number
     */
    public String getPortNumber() {
        return textPort.getText();
    }

    /**
     * assumes validateIpAddress has been used already.
     *
     * @param address the new ip address
     */
    public void setIpAddress(String address) {
        txtIp.setText(address);  
    }

    /**
     * used from https://stackoverflow.com/questions/5667371/validate-ipv4-address-in-java
     * to validate an IP address.
     *
     * @param ip the ip
     * @return true, if successful
     */
    public static boolean validateIpAddress(final String ip) {
        return PATTERN.matcher(ip).matches();
    }


    /**
     * assumed that validatePortNumber is used with it.
     * @param port valid port number.
     */
    public void setPortNumber(String port) {
        textPort.setText(port);

    }

    /**
     * validates port number from text field.
     *
     * @param port to test against
     * @return true, if successful
     */
    public boolean validatePortNumber(String port) {
        int validPort;
        try {
            validPort = Integer.parseInt(port);
            //reserved ports and max ports - 1
            if(validPort > 1024 && validPort < 65534) {
                return true;
            }
        } catch(NumberFormatException ex) {
            //exit out of program, warn user
            return false;
            //JOptionPane.showMessageDialog(null, "Invalid port number. Try again!", "Invalid Port Number", JOptionPane.WARNING_MESSAGE);
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
     * decides if the user name is valid.
     * Must be less than 10 characters.
     *
     * @param text the text
     * @return true, if successful
     */
    public boolean validName(String text) {

        if(text.equals("Chase") || text.equals("Bansal")) {
            firstName = text;
            titleLabel.setText("You win!");
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);    // Center "name label" text
            nameLabel.setFont(new Font("Matura MT Script Capitals", 0, 24));   // Change "name label" font and size
            nameLabel.setText("Sir " + firstName);
            playButton.setEnabled(false);
            nameField.setVisible(false);
            nameGiven = true;

            return false;
        } else if(!text.equals("") && !text.equalsIgnoreCase("Player Name") && text.length() < 10) {
            firstName = text;
            nameField.setVisible(false);                            // Hide the "typing field"
            //lastName = getLastName(lastNames);                      // Save "last name"
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);    // Center "name label" text
            nameLabel.setFont(new Font("Matura MT Script Capitals", 0, 24));   // Change "name label" font and size
            nameLabel.setText("Sir " + firstName);
            nameGiven = true;
            //check if ready
            readyToPlay();
            return true;
        }

        //else initialize to original state
        nameField.setText("Player Name");                       // Set input field to default text
        nameField.setForeground(new Color(204, 204, 204));      // Set color of default text
        nameField.setFocusable(false);
        playButton.setEnabled(false);
        return false;
    }
}
