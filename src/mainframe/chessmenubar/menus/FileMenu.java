
package mainframe.chessmenubar.menus;

import javax.swing.JMenu;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.*;

public class FileMenu extends JMenu {

    /** Creates a new instance of FileMenu. */
    public FileMenu(MainFrame ff) {
        nItem = new NewItem(ff);
        setText("File");

        add(nItem);
        addSeparator();
        add(saveItem);
        add(loadItem);
        add(exitItem);

    }

    public String getIPaddress() {
        return nItem.getIpAddress();
    }

    public String getportNumber() {
        return nItem.getportNumber();
    }

    private final NewItem nItem;
    private final SaveItem saveItem = new SaveItem();
    private final LoadItem loadItem = new LoadItem();
    private final ExitItem exitItem = new ExitItem();

}
