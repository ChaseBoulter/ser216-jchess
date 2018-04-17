package chessgame;

import java.util.*;
import java.util.List;
import java.util.regex.Pattern;
//import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import static java.awt.Color.*;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import mainframe.chessframe.MainFrame;

/**
 * Initial Version: 11/7/2016
 * Updated Version: 4/15/2018
 * @author jeremypowell
 * @author Joshua Goralczyk
 */

//TODO: local button, online button set local host and port
public class Preloader extends JFrame {

    // Initalize Values
    private boolean validIp = true;
    private boolean validPort = true;
    private volatile boolean exitWindow = false;                 // Tests "ready" button to close window
    private boolean nameGiven = false;                  // Tests if name field has input 
    private String firstName = "";                      // Store user (name) input      
    private JTextField nameField;
    private JLabel nameLabel;
    private JButton playButton;
    private JLabel titleLabel;
    private JTextField txtIp;
    private JTextField textPort;
    
    private ButtonGroup localOrOnline;
    private ButtonGroup sbg;
    private JRadioButton rdbtnLocal;
    private JRadioButton rdbtnOnline;
    private JRadioButton rdbtnClient;
    private JRadioButton rdbtnServer;
    private JLabel lblIpAddress;
    private JLabel lblPort;
    private MainFrame myNewFrame; //for online and local
    private static final Pattern PATTERN = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    

  
    public Preloader() {
        setMinimumSize(new Dimension(400, 350));
        initComponents();                               // Initalize alignements and fields
        playButton.setEnabled(false);                   // Disable "ready" button
        this.setLocationRelativeTo(null);               // Center Setup Frame on Screen
        setResizable(false);
        setVisible(true);
       
    }

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
            public void mouseClicked(MouseEvent evt) {
                nameLabelMouseClicked(evt);
            }
            public void mouseExited(MouseEvent evt) {
                nameLabelMouseExited(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
        });

        nameField.setForeground(new Color(204, 204, 204));
        nameField.setText("Player Name");
        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        nameField.setMaximumSize(new Dimension(125, 26));
        nameField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(FocusEvent evt)  {
                validName(nameField.getText());
            }
        });
        nameField.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        playButton.setBackground(new Color(255, 255, 255));
        playButton.setText("Ready!");
        playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        
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

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69)
                    .addComponent(rdbtnLocal)
                    .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                    .addGap(134))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdbtnOnline)
                                    .addGap(93))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(88)
                            .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdbtnClient)
                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                    .addComponent(rdbtnServer))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(lblPort)
                                        .addComponent(lblIpAddress))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(textPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGap(54))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(128)
                    .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(164))
                .addGroup(layout.createSequentialGroup()
                    .addGap(169)
                    .addComponent(playButton)
                    .addContainerGap(221, Short.MAX_VALUE))
        );
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
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(rdbtnLocal)
                                .addComponent(rdbtnOnline))
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(rdbtnClient)
                                .addComponent(rdbtnServer))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(txtIp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIpAddress)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblPort)
                                .addComponent(textPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(31)
                    .addComponent(playButton)
                    .addContainerGap(82, Short.MAX_VALUE))
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
                }
                else {
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
                    validPort = false;
                }
                else {
                    lblPort.setForeground(Color.BLACK);
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
        
        rdbtnLocal.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
              rdbtnClient.setEnabled(false);
              rdbtnServer.setSelected(false);
              rdbtnServer.setEnabled(false);
              txtIp.setEditable(false);
              textPort.setEditable(false);
              txtIp.setEnabled(false);
              textPort.setEnabled(false);
                
                
            }
        });
        
        rdbtnOnline.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
              rdbtnClient.setEnabled(true);
              rdbtnServer.setEnabled(true);
              rdbtnServer.setSelected(true);
              txtIp.setEditable(true);
              textPort.setEditable(true);
              txtIp.setEnabled(true);
              textPort.setEnabled(true);
                
                
            }
        });
    }// </editor-fold>                        

    /**
     * enter button clicked on JTextField for name.
     * @param evt
     */
    private void nameFieldActionPerformed(ActionEvent evt) {     
        firstName = nameField.getText();
        validName(nameField.getText());
    }                                         

    
    /**
     * mouse clicked on JTextField for name.
     * @param evt
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
     * @param evt
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
    
    public boolean readyToPlay() {
        if((validPort && validIp) || rdbtnLocal.isSelected() && validName(nameField.getText())) {
            playButton.setEnabled(true);   // Make "ready" button click-able
            return true;
        }
        return false;
    }
    
    // Method: 
    private void nameFieldFocusGained(FocusEvent evt) {                                      
        nameField.setForeground(BLACK); // Set text color to black while typing name
    }                                     

    
     // Method: Mouse is Hoverirng over Text Label
    private void nameLabelMouseEntered(MouseEvent evt) {   
        // Text color changes to gray with mouse hovering over
        if (nameGiven) {
            nameLabel.setForeground(new Color(102, 102, 102));
        } 
    }                                      

    
     // Method: Mouse is Not Hovering Over Text Label
    private void nameLabelMouseExited(MouseEvent evt) {                                      
        nameLabel.setForeground(BLACK);     // Text reverts to color black without mouse hovering over
    }                                     

    
     // Method: 
    private void nameLabelMouseClicked(MouseEvent evt) {                                       
        playButton.setEnabled(false);                                   // Disable "ready!" button

        nameField.setVisible(true);                                     // Make visible the "name input field" 
        nameField.requestFocus(true);                                   // Focus input on input text field
        
        nameLabel.setText("Your Name:");                                // Set input text field
        nameLabel.setHorizontalAlignment(JTextField.RIGHT);             // right justification 
        nameLabel.setFont(new Font("Lucida Grande", 0, 13));            // Set "text labels" font and size 
        
        nameGiven = false;
    }                                      

    // End of variables declaration                   
    
    
    // Method: Exit Pre-loader
    public boolean endLoading() {
        return exitWindow; // Allows the main looping file to close the pre-loader
     } 
    
   
    // Method: Set Player Full Name
    public String getName() { // Gives full name of user
        return firstName;
    }
    
    /**
    * gets IpAddress from txtIp JTextField.
    * @return
    */
   public String getIpAddress() {
       return txtIp.getText();
   }

   /**
    * gets port number from textPort JTextField.
    * @return
    */
   public String getPortNumber() {
       return textPort.getText();
   }
   
   /**
    * assumes validateIpAddress has been used already.
    * @param address, valid ip address
    */
   public void setIpAddress(String address) {
       txtIp.setText(address);  
   }
   
   /**
    * used from https://stackoverflow.com/questions/5667371/validate-ipv4-address-in-java
    * to validate an IP address.
    * @param ip
    * @return
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
    * validates port number from text field
    * @param port to test against
    * @return
    */
   public boolean validatePortNumber(String port) {
       int validPort;
       try {
           validPort = Integer.parseInt(port);
           //reserved ports and max ports - 1
           if(validPort > 1024 && validPort < 65534) {
               return true;
           }
       }
       catch(NumberFormatException ex) {
           //exit out of program, warn user
           return false;
           //JOptionPane.showMessageDialog(null, "Invalid port number. Try again!", "Invalid Port Number", JOptionPane.WARNING_MESSAGE);
       }
       
       return false;
   }
   
   
   /**
    * info for singleton
    * @author Josh
    *
    */
   private static class SingletonHolder { 
       public static final Preloader instance = new Preloader();
   }
   
   /**
    * info to get singleton instance
    * @return
    */
   public static Preloader getInstance() {
       return SingletonHolder.instance;
   }
   
   /**
    * decides if the user name is valid.
    * Must be less than 10 characters.
    * @param text
    * @return
    */
   public boolean validName(String text) {
       
    if(text.equals("Chase") || text.equals("Bansal")) {
           firstName = text;
           titleLabel.setText("You win!");
           nameLabel.setHorizontalAlignment(JTextField.CENTER);    // Center "name label" text
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
           nameLabel.setHorizontalAlignment(JTextField.CENTER);    // Center "name label" text
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
