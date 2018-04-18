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
        add(helpMenu);

    }
    private final FileMenu fileMenu;
    private final HelpMenu helpMenu = new HelpMenu();

}
