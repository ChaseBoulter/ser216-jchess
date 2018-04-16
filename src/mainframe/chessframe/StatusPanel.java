
package mainframe.chessframe;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class StatusPanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** Creates a new instance of StatusPanel. */
    public StatusPanel() {
        setSize(600, 30);
        setLocation(10, 610);
        setLayout(null);

        statusLabel.setSize(589, 25);
        statusLabel.setLocation(5, 5);
        statusLabel.setText(" Start New Game ");
        statusLabel.setBackground(Color.lightGray);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 11));
        statusLabel.setForeground(Color.RED.brighter());
        statusLabel.setBorder(labelBorder);
        add(statusLabel);

    }

    public void start_Again() {
        statusLabel.setText("  Game Started ");
    }

    public void changeStatus(Object str) {
        statusLabel.setText((String) str);
    }

    private JLabel statusLabel = new JLabel();
    private LineBorder labelBorder = new LineBorder(Color.BLACK.brighter(), 2);
}
