package mainframe.chessmenubar.menus.items.file;

import javax.swing.JMenuItem;

/**
 * The Class ExitItem.
 */
public class ExitItem extends JMenuItem {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of ExitItem. */
    public ExitItem() {
        setText("Exit");
        addActionListener(e -> System.exit(0));

    }

}
