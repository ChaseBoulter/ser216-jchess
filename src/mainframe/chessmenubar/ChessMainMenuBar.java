package mainframe.chessmenubar;

import javax.swing.JMenuBar;

import mainframe.chessframe.MainFrame;

import mainframe.chessmenubar.menus.FileMenu;
import mainframe.chessmenubar.menus.HelpMenu;


/**
 * The Class ChessMainMenuBar.
 */
public class ChessMainMenuBar extends JMenuBar {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /**
     *  Creates a new instance of Chess_MainMenuBar.
     *
     * @param ff the ff
     */
    public ChessMainMenuBar(MainFrame ff) {
        fileMenu = new FileMenu(ff);
        add(fileMenu);
        add(helpMenu);

    }
    
    /** The file menu. */
    private final FileMenu fileMenu;
    
    /** The help menu. */
    private final HelpMenu helpMenu = new HelpMenu();

}
