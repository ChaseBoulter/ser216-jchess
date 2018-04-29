
package mainframe.chessmenubar.menus;

import javax.swing.JMenu;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.ExitItem;

/**
 * The Class FileMenu.
 */
public class FileMenu extends JMenu {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new instance of FileMenu.
     *
     * @param ff
     *            the ff
     */
    public FileMenu(MainFrame ff) {
        // newItem = new NewItem(ff);
        this.setText("File");

        // add(saveItem);
        // add(loadItem);
        this.add(this.exitItem);

    }

    /** The save item. */
    // private final NewItem newItem;
    // private final SaveItem saveItem = new SaveItem();

    /** The load item. */
    // private final LoadItem loadItem = new LoadItem();

    /** The exit item. */
    private final ExitItem exitItem = new ExitItem();

}
