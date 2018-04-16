
package mainframe.chessmenubar.menus;

import javax.swing.JMenu;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.*;

public class FileMenu extends JMenu {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** Creates a new instance of FileMenu. */
    public FileMenu(MainFrame ff) {
        //newItem = new NewItem(ff);
        setText("File");

        //add(newItem);
        //addSeparator();
        add(saveItem);
        add(loadItem);
        add(exitItem);

    }

//    public String getIPaddress() {
//        return newItem.getIpAddress();
//    }
//
//    public String getportNumber() {
//        return newItem.getportNumber();
//    }

    //private final NewItem newItem;
    private final SaveItem saveItem = new SaveItem();
    private final LoadItem loadItem = new LoadItem();
    private final ExitItem exitItem = new ExitItem();

}
