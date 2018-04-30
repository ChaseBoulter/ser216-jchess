
package mainframe.chessframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import chessgame.Chess;

/**
 * The Class ToolPanel.
 */
public class ToolPanel extends JPanel {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The white text field. */
    private final JTextField whiteTextField = new JTextField("WHITE");

    /** The black text field. */
    private final JTextField blackTextField = new JTextField("BLACK");

    /** The history list. */
    private final MyHistoryList historyList = new MyHistoryList();

    /** The history scroll. */
    // private final short numberOfTurns = 1;
    private final JScrollPane historyScroll = new JScrollPane(this.historyList,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    // private final JLabel timeDesc1 = new JLabel(" Timer 1");
    // private final JLabel timeDesc2 = new JLabel(" Timer 2");
    // private ThreadTimer timer1;
    /** The my turn. */
    // private ThreadTimer timer2;
    private ImageIcon myTurn;

    /** The my check. */
    private ImageIcon myCheck;

    /** The fs. */
    private String fs;

    /** The image label white. */
    private JLabel imageLabelWhite;

    /** The check label white. */
    private JLabel checkLabelWhite;

    /** The image label black. */
    private JLabel imageLabelBlack;

    /** The check label black. */
    private JLabel checkLabelBlack;

    /** initializes ToolPanel to default values. **/
    public ToolPanel() {
        this.setPreferredSize(new Dimension(310, 340));
        this.setMinimumSize(new Dimension(310, 340));
        this.setLocation(595, 0);
        this.setLayout(null);

        this.setSize(310, 340);
        this.fs = System.getProperty("file.separator");
        
        try {
            URL turnImgUrl = Chess.class.getResource(this.fs + "Icons" + this.fs + "other" + this.fs + "Turn.png");
            URL checkMateImgUrl = Chess.class.getResource(this.fs + "Icons" + this.fs + "other" + this.fs + "Checkmate.png");
            this.myTurn = new ImageIcon(turnImgUrl);
            this.myCheck = new ImageIcon(checkMateImgUrl);
        } catch (SecurityException s) {
           System.out.println("Sec error with images.");
        }
        
        

        this.imageLabelWhite = new JLabel(this.myTurn);
        this.imageLabelBlack = new JLabel(this.myTurn);
        this.checkLabelWhite = new JLabel(this.myCheck);
        this.checkLabelBlack = new JLabel(this.myCheck);

        this.historyList.setBackground(Color.WHITE);
        this.blackTextField.setHorizontalAlignment(SwingConstants.CENTER);

        this.blackTextField.setSize(60, 25);
        this.blackTextField.setLocation(15, 33);

        this.blackTextField.setEnabled(false);
        this.blackTextField.setBackground(Color.WHITE);
        this.blackTextField.setFont(new Font("Arial", Font.BOLD, 12));
        this.blackTextField.setDisabledTextColor(Color.BLACK);
        this.whiteTextField.setForeground(Color.WHITE);
        this.whiteTextField.setHorizontalAlignment(SwingConstants.CENTER);
        this.whiteTextField.setSize(60, 25);
        this.whiteTextField.setLocation(15, 284);

        this.whiteTextField.setEnabled(false);
        this.whiteTextField.setBackground(Color.BLACK);
        this.whiteTextField.setFont(new Font("Arial", Font.BOLD, 12));
        this.whiteTextField.setDisabledTextColor(Color.WHITE);
        this.add(this.blackTextField);
        this.add(this.whiteTextField);

        // default
        this.imageLabelBlack.setPreferredSize(new Dimension(32, 32));
        this.imageLabelBlack.setBounds(96, 26, 32, 32);
        this.imageLabelBlack.setEnabled(false);
        this.add(this.imageLabelBlack);

        this.checkLabelBlack.setPreferredSize(new Dimension(32, 32));
        this.checkLabelBlack.setBounds(140, 26, 32, 32);
        this.checkLabelBlack.setEnabled(false);
        this.add(this.checkLabelBlack);

        // white goes first
        this.imageLabelWhite.setPreferredSize(new Dimension(32, 32));
        this.imageLabelWhite.setBounds(96, 277, 32, 32);
        this.imageLabelWhite.setEnabled(true);
        this.add(this.imageLabelWhite);
        // imageLabelBlack.setBounds

        this.checkLabelWhite.setPreferredSize(new Dimension(32, 32));
        this.checkLabelWhite.setBounds(140, 277, 32, 32);
        this.checkLabelWhite.setEnabled(false);
        this.add(this.checkLabelWhite);

        this.historyScroll.setSize(278, 202);
        this.historyScroll.setLocation(16, 70);
        this.add(this.historyScroll);

    }

    /**
     * Setturn.
     */
    public void setturn() {

    }

    /**
     * Adds the to history.
     *
     * @param newItem
     *            the new item
     */
    public void add_to_History(Object newItem) {
        this.historyList.addElemen_tolist(newItem);
    }

    /**
     * displays whose turn it is.
     *
     * @param player
     *            the player
     */
    public void switchImageLocation(int player) {
        if (player == 1) {
            this.imageLabelWhite.setEnabled(true);
            this.imageLabelBlack.setEnabled(false);
        } else {
            this.imageLabelWhite.setEnabled(false);
            this.imageLabelBlack.setEnabled(true);
        }
        this.checkLabelWhite.setEnabled(false);
        this.checkLabelBlack.setEnabled(false);

    }

    /**
     * displays who is in check.
     *
     * @param player
     *            the player
     */
    public void inCheck(int player) {
        if (player == 1) {
            this.checkLabelWhite.setEnabled(true);
            this.checkLabelBlack.setEnabled(false);

            this.imageLabelWhite.setEnabled(true);
            this.imageLabelBlack.setEnabled(false);
        } else {
            this.checkLabelWhite.setEnabled(false);
            this.checkLabelBlack.setEnabled(true);

            this.imageLabelWhite.setEnabled(false);
            this.imageLabelBlack.setEnabled(true);
        }
    }

    // public void change_to_Timer1() {
    // timer1.resume();
    // timer2.suspend();
    // }
    //
    // public void change_to_Timer2() {
    // timer2.resume();
    // timer1.suspend();
    // }
    //
    // public void stop_timers() {
    // timer1.stop();
    // timer2.stop();
    // }

    /**
     * Start again.
     */
    public void startAgain() {
        // if (timer1 != null) {
        // timer1.stop();
        // timer2.stop();
        // }
        //
        // timer1 = new ThreadTimer(screen2);
        // timer2 = new ThreadTimer(screen1);
        //
        // timer1.start();
        // timer2.start();
        // timer2.suspend();

        this.historyList.clean_list();
        this.historyList.addElemen_tolist("Player: New Moves");

    }
}

/**
 * move history list.
 */
@SuppressWarnings("rawtypes")
class MyHistoryList extends JList {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    MyHistoryList() {

        this.setBackground(Color.ORANGE);
        this.setModel(this.data.listModel);
        this.data.listModel.removeElement("Player: New Moves");

    }

    public void clean_list() {
        this.data.listModel.clear();
    }

    public void addElemen_tolist(Object newItem) {
        this.data.listModel.removeElement(newItem);
    }

    private myHistoryListData data = new myHistoryListData(new DefaultListModel<Object>());
}

/**
 * Status Fields.
 */
class myStatusFields extends JTextField {
    private static final long serialVersionUID = 1L;

    myStatusFields() {
        this.setEnabled(false);
    }
}
