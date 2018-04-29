
package mainframe.chessmenubar.menus;

import javax.swing.JMenu;

import mainframe.chessmenubar.menus.items.help.AboutChessGame;
import mainframe.chessmenubar.menus.items.help.AboutGameProgrammers;

/**
 * The Class HelpMenu.
 */
public class HelpMenu extends JMenu {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Creates a new instance of HelpMenu. */

    public HelpMenu() {
        this.setText("Help");
        this.add(this.aboutGame);
        this.add(this.aboutUs);
        this.setEnabled(false);
    }

    /** The about game. */
    private final AboutChessGame aboutGame = new AboutChessGame();

    /** The about us. */
    private final AboutGameProgrammers aboutUs = new AboutGameProgrammers();

}