
package mainframe.chessmenubar.menus.items.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.newgame.NewGameDialoge;

public class NewItem extends JMenu {

    /** Creates a new instance of NewItem */
    public NewItem(MainFrame ff) {
        Ndial = new NewGameDialoge(ff);
        setText("New Game");

        OnePlayer.setEnabled(false);
        TwoPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Ndial.setVisible(true);

            }
        });
        add(OnePlayer);
        add(TwoPlayer);
    }

    public String getIpAddress() {
        return Ndial.GetIpAddress();
    }

    public String getportNumber() {
        return Ndial.GetPortnumber();
    }

    private final NewGameDialoge Ndial;
    private final JMenuItem OnePlayer = new JMenuItem(" One Player");
    private final JMenuItem TwoPlayer = new JMenuItem(" Two Player");

}
