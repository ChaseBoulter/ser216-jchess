
package mainframe.chessmenubar.menus.items.file;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

/**
 * The Class SaveItem.
 */
public class SaveItem extends JMenuItem {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of SaveItem. */
    public SaveItem() {
        setText("Save Game");
        addActionListener(e -> saveFile.showSaveDialog(null));
    }

    /** The save file. */
    private final JFileChooser saveFile = new JFileChooser();
}
