
package mainframe.chessframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import mainframe.chessframe.timer.ThreadTimer;

public class ToolPanel extends JPanel {
    
    /** Creates a new instance of ToolPanel. */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Graphics2D g2 = (Graphics2D)g;

        // draw a rectangle

        /*
         * Ellipse2D start= new Ellipse2D.Double(100, 34, 30, 30); Ellipse2D stop= new
         * Ellipse2D.Double(100, 234, 30, 30); g2.setColor(color.RED.darker());
         * g2.fill(start); g2.setColor(color.GREEN.darker()); g2.fill(stop);
         * 
         * Ellipse2D surr1= new Ellipse2D.Double(100, 34, 30, 30); Ellipse2D surr2= new
         * Ellipse2D.Double(100, 234, 30, 30);
         * 
         * g2.setColor(color.BLACK.brighter());
         * 
         * 
         * g2.draw(surr1); g2.draw(surr2);
         */

    }

    /** initializes ToolPanel to default values.**/
    public ToolPanel() {
        setSize(200, 350);
        setLocation(600, 0);
        setLayout(null);

        JLturn1.setSize(60, 25);
        JLturn1.setLocation(20, 10);
        screen1.setSize(100, 25);
        screen1.setLocation(90, 25);

        JLblack.setSize(60, 25);
        JLblack.setLocation(20, 34);

        JLturn1.setEnabled(false);
        JLturn1.setBackground(Color.ORANGE);
        JLturn1.setDisabledTextColor(Color.BLACK);
        JLturn1.setFont(new Font("Arial", Font.BOLD, 12));

        JLblack.setEnabled(false);
        JLblack.setBackground(new Color(230, 12, 0));
        JLblack.setFont(new Font("Arial", Font.BOLD, 12));
        JLblack.setDisabledTextColor(Color.BLACK);

        JLturn2.setSize(60, 25);
        JLturn2.setLocation(20, 254);
        screen2.setSize(100, 25);
        screen2.setLocation(90, 254);
        JLwhite.setSize(60, 25);
        JLwhite.setLocation(20, 230);

        JLturn2.setEnabled(false);
        JLturn2.setBackground(Color.ORANGE);
        JLturn2.setDisabledTextColor(Color.BLACK);
        JLturn2.setFont(new Font("Arial", Font.BOLD, 12));

        JLwhite.setEnabled(false);
        JLwhite.setBackground(new Color(230, 12, 0));
        JLwhite.setFont(new Font("Arial", Font.BOLD, 12));
        JLwhite.setDisabledTextColor(Color.BLACK);

        add(JLturn1);
        add(JLblack);
        add(JLturn2);
        add(JLwhite);
        add(screen1);
        add(screen2);

        historyScroll.setSize(150, 150);
        historyScroll.setLocation(20, 70);
        add(historyScroll);

    }

    public void setturn() {

    }

    public void add_to_History(Object newItem) {
        historyList.addElemen_tolist(newItem);
    }

    public void change_to_Timer1() {
        timer1.resume();
        timer2.suspend();
    }

    public void change_to_Timer2() {
        timer2.resume();
        timer1.suspend();
    }

    public void stop_timers() {
        timer1.stop();
        timer2.stop();
    }

    private final JTextField JLturn1 = new JTextField(" P2  Turn ");
    private final JTextField JLturn2 = new JTextField(" P1  Turn ");
    private final JTextField JLwhite = new JTextField("  White ");
    private final JTextField JLblack = new JTextField("  Black ");
    private final myHistoryList historyList = new myHistoryList();
    private final short numberOfTurns = 1;
    private final JScrollPane historyScroll = new JScrollPane(historyList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private final JLabel screen1 = new JLabel();
    private final JLabel screen2 = new JLabel();
    private final JLabel timeDesc1 = new JLabel(" Timer 1");
    private final JLabel timeDesc2 = new JLabel(" Timer 2");
    private ThreadTimer timer1;
    private ThreadTimer timer2;

    public void startAgain() {
        if (timer1 != null) {
            timer1.stop();
            timer2.stop();
        }

        timer1 = new ThreadTimer(screen2);
        timer2 = new ThreadTimer(screen1);

        timer1.start();
        timer2.start();
        timer2.suspend();

        historyList.clean_list();
        historyList.addElemen_tolist("Player: New Moves");

    }

}

class myHistoryList extends JList {
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

class myStatusFileds extends JTextField {
    myStatusFileds() {
        this.setEnabled(false);
    }
}
