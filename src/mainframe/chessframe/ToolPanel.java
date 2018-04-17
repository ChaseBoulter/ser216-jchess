
package mainframe.chessframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
//import mainframe.chessframe.timer.ThreadTimer;

public class ToolPanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private final JTextField whiteTextField = new JTextField("WHITE");
    private final JTextField blackTextField = new JTextField("BLACK");
    private final myHistoryList historyList = new myHistoryList();
    //private final short numberOfTurns = 1;
    private final JScrollPane historyScroll = new JScrollPane(historyList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//    private final JLabel timeDesc1 = new JLabel(" Timer 1");
//    private final JLabel timeDesc2 = new JLabel(" Timer 2");
    //private ThreadTimer timer1;
    //private ThreadTimer timer2;
    private ImageIcon myTurn;
    private String fs;
    private JLabel imageLabelWhite;
    private JLabel checkLabelWhite;
    private JLabel imageLabelBlack;
    private JLabel checkLabelBlack;

    /** initializes ToolPanel to default values.**/
    public ToolPanel() {
        setPreferredSize(new Dimension(310, 340));
        setMinimumSize(new Dimension(310, 340));
        setLocation(595, 0);
        setLayout(null);
        
        setSize(310, 340);
        fs = System.getProperty("file.separator");
        myTurn = new ImageIcon("src" + fs + "Icons" + fs
                + "turn.png");
        imageLabelWhite = new JLabel(myTurn);
        imageLabelBlack = new JLabel(myTurn);
        checkLabelWhite = new JLabel(myTurn); //TODO: change to check image
        checkLabelBlack = new JLabel(myTurn);
        
        historyList.setBackground(Color.WHITE);
        blackTextField.setHorizontalAlignment(SwingConstants.CENTER);

        blackTextField.setSize(60, 25);
        blackTextField.setLocation(15, 33);

        blackTextField.setEnabled(false);
        blackTextField.setBackground(Color.WHITE);
        blackTextField.setFont(new Font("Arial", Font.BOLD, 12));
        blackTextField.setDisabledTextColor(Color.BLACK);
        whiteTextField.setForeground(Color.WHITE);
        whiteTextField.setHorizontalAlignment(SwingConstants.CENTER);
        whiteTextField.setSize(60, 25);
        whiteTextField.setLocation(15, 284);

        whiteTextField.setEnabled(false);
        whiteTextField.setBackground(Color.BLACK);
        whiteTextField.setFont(new Font("Arial", Font.BOLD, 12));
        whiteTextField.setDisabledTextColor(Color.WHITE);
        add(blackTextField);
        add(whiteTextField);
        
        
        //default
        imageLabelBlack.setPreferredSize(new Dimension(32, 32));
        imageLabelBlack.setBounds(96, 26, 32, 32);
        imageLabelBlack.setEnabled(false);
        add(imageLabelBlack);
        
        checkLabelBlack.setPreferredSize(new Dimension(32, 32));
        checkLabelBlack.setBounds(140, 26, 32, 32);
        checkLabelBlack.setEnabled(false);
        add(checkLabelBlack);
        
        //white goes first
        imageLabelWhite.setPreferredSize(new Dimension(32, 32));
        imageLabelWhite.setBounds(96, 277, 32, 32);
        imageLabelWhite.setEnabled(true);
        add(imageLabelWhite);
        //imageLabelBlack.setBounds
        
        checkLabelWhite.setPreferredSize(new Dimension(32, 32));
        checkLabelWhite.setBounds(140, 277, 32, 32);
        checkLabelWhite.setEnabled(false);
        add(checkLabelWhite);

        historyScroll.setSize(278, 202);
        historyScroll.setLocation(16, 70);
        add(historyScroll);

    }

    public void setturn() {

    }

    public void add_to_History(Object newItem) {
        historyList.addElemen_tolist(newItem);
    }
    
    /**
     * displays whose turn it is.
     * @param player
     */
    public void switchImageLocation(int player) {
        if(player == 1) {
            imageLabelWhite.setEnabled(true);
            imageLabelBlack.setEnabled(false);
        } else {
            imageLabelWhite.setEnabled(false);
            imageLabelBlack.setEnabled(true);
        }
        checkLabelWhite.setEnabled(false);
        checkLabelBlack.setEnabled(false);
        
    }
    
    /**
     * displays who is in check
     * @param player
     */
    public void inCheck(int player) {
        if(player == 1) {
            checkLabelWhite.setEnabled(true);
            checkLabelBlack.setEnabled(false);
            
            imageLabelWhite.setEnabled(true);
            imageLabelBlack.setEnabled(false);
        } else {
            checkLabelWhite.setEnabled(false);
            checkLabelBlack.setEnabled(true);
            
            imageLabelWhite.setEnabled(false);
            imageLabelBlack.setEnabled(true);
        }
    }

//    public void change_to_Timer1() {
//        timer1.resume();
//        timer2.suspend();
//    }
//
//    public void change_to_Timer2() {
//        timer2.resume();
//        timer1.suspend();
//    }
//
//    public void stop_timers() {
//        timer1.stop();
//        timer2.stop();
//    }

    public void startAgain() {
//        if (timer1 != null) {
//            timer1.stop();
//            timer2.stop();
//        }
//
//        timer1 = new ThreadTimer(screen2);
//        timer2 = new ThreadTimer(screen1);
//
//        timer1.start();
//        timer2.start();
//        timer2.suspend();

        historyList.clean_list();
        historyList.addElemen_tolist("Player: New Moves");

    }
}

class myHistoryList extends JList {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    myHistoryList() {

        this.setBackground(Color.ORANGE);
        setModel(listModel);
        listModel.addElement("Player: New Moves");

    }

    public void clean_list() {
        listModel.clear();
    }

    public void addElemen_tolist(Object newItem) {
        listModel.addElement(newItem);
    }

    private DefaultListModel listModel = new DefaultListModel();
}

class myStatusFields extends JTextField {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    myStatusFields() {
        this.setEnabled(false);
    }
}
