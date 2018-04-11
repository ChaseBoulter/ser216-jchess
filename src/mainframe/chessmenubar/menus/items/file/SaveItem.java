
package mainframe.chessmenubar.menus.items.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class SaveItem extends JMenuItem {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of SaveItem. */
    public SaveItem() {
        setText("Save Game");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveFile.showSaveDialog(null);

            }
        });
    }

    private final JFileChooser saveFile = new JFileChooser();
}
