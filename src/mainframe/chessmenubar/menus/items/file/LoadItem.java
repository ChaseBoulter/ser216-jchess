
package mainframe.chessmenubar.menus.items.file;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

/**
 * The Class LoadItem.
 */
public class LoadItem extends JMenuItem {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of LoadItem. */
    public LoadItem() {
        this.setText("Load Game");
        this.addActionListener(e -> this.loadFile.showOpenDialog(null));
    }

    /** The load file. */
    private final JFileChooser loadFile = new JFileChooser();
}
