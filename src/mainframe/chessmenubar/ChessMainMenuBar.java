package mainframe.chessmenubar;

import javax.swing.JMenuBar;

import mainframe.chessframe.MainFrame;
//import MainFrame.ChessMenuBar.ChessBar_Menus.Edit_Menu;
import mainframe.chessmenubar.menus.FileMenu;
import mainframe.chessmenubar.menus.HelpMenu;
//import MainFrame.ChessMenuBar.ChessBar_Menus.Tools_Menu;

public class ChessMainMenuBar extends JMenuBar {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** Creates a new instance of Chess_MainMenuBar. */
    public ChessMainMenuBar(MainFrame ff) {
        fileMenu = new FileMenu(ff);
        add(fileMenu);
        // add(Emenu);
        // add(Tmenu);
        add(helpMenu);

    }

    public String getIpAddress() {
        return fileMenu.getIPaddress();
    }

    public String getPortnumber() {
        return fileMenu.getportNumber();
    }

    private final FileMenu fileMenu;
    // private final Edit_Menu Emenu=new Edit_Menu();
    // private final Tools_Menu Tmenu=new Tools_Menu();
    private final HelpMenu helpMenu = new HelpMenu();

}
