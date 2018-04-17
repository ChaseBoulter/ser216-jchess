
package mainframe.chessframe;

//import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Toolkit;
//import javax.swing.BorderFactory;
import javax.swing.JFrame;

import chessgame.Preloader;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.border.BevelBorder;
import mainframe.chessframe.ChatPanel;
import mainframe.chessmenubar.ChessMainMenuBar;
//import mainframe.chessframe.StatusPanel;

public class MainFrame extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    Preloader preload = Preloader.getInstance(); //singleton
    /** creates Chess Game. **/
    public MainFrame() {      
        setTitle("JChess!");
        setSize(900, 665);
        setResizable(false);
        
        //where window should appear
        this.setLocationRelativeTo(null);

        contentPane.setLayout(null);
        contentPane.add(myChatPanel);
        //contentPane.add(myStatusPanel);
        contentPane.add(myToolPanel);

        myChessBar = new ChessMainMenuBar(this);

        setJMenuBar(myChessBar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void startAgain() {
        myMainPanel.startAgain();

        contentPane.add(myMainPanel);

    }

    public void startAsServer() {
        myMainPanel.startAsServer(preload.getIpAddress(),
                preload.getPortNumber(), myChatPanel);

        contentPane.add(myMainPanel);

        setTitle("JChess! - Server");

    }

    public void startAsClient() {

        myMainPanel.startAsClient(preload.getIpAddress(), 
                preload.getPortNumber(), myChatPanel);
        //myMainPanel.rotateComponent(null);
        contentPane.add(myMainPanel);
        setTitle("JChess! - Client");
    }

    private final ChessMainMenuBar myChessBar;
    public final ToolPanel myToolPanel = new ToolPanel();
    //private final StatusPanel myStatusPanel = new StatusPanel();

    private final MainPanel myMainPanel = new MainPanel(myToolPanel);//, myStatusPanel);
    private final ChatPanel myChatPanel = new ChatPanel();
    private Container contentPane = getContentPane();
    

}
