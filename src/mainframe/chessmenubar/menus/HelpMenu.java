

package mainframe.chessmenubar.menus;

import javax.swing.JMenu;
import mainframe.chessmenubar.menus.items.help.*;

public class HelpMenu extends JMenu
{
    
    /** Creates a new instance of HelpMenu */
    public HelpMenu()
    {
        setText("Help");
        add(AboutGame);
        add(AboutUs);
    }
    
    private final AboutChessGame AboutGame=new AboutChessGame();
    private final AboutGameProgrammers AboutUs=new AboutGameProgrammers();
    
}