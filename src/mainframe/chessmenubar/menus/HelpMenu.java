
package mainframe.chessmenubar.menus;

import javax.swing.JMenu;
import mainframe.chessmenubar.menus.items.help.*;

public class HelpMenu extends JMenu {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** Creates a new instance of HelpMenu. */
    public HelpMenu() {
        setText("Help");
        add(aboutGame);
        add(aboutUs);
    }

    private final AboutChessGame aboutGame = new AboutChessGame();
    private final AboutGameProgrammers aboutUs = new AboutGameProgrammers();

}