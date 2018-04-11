package mainframe.chessmenubar.menus.items.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class ExitItem extends JMenuItem {

    /** Creates a new instance of ExitItem. */
    public ExitItem() {
        setText("Exit");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
