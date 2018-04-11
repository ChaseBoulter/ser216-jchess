
package mainframe.chessmenubar.menus.items.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import mainframe.chessframe.MainFrame;
import mainframe.chessmenubar.menus.items.file.newgame.NewGameDialog;

public class NewItem extends JMenu {

    /** Creates a new instance of NewItem. */
    public NewItem(MainFrame ff) {
        newGameDialog = new NewGameDialog(ff);
        setText("New Game");

        onePlayer.setEnabled(false);
        twoPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                newGameDialog.setVisible(true);

            }
        });
        add(onePlayer);
        add(twoPlayer);
    }

    public String getIpAddress() {
        return newGameDialog.getIpAddress();
    }

    public String getportNumber() {
        return newGameDialog.getPortNumber();
    }

    private final NewGameDialog newGameDialog;
    private final JMenuItem onePlayer = new JMenuItem(" One Player");
    private final JMenuItem twoPlayer = new JMenuItem(" Two Player");

}
