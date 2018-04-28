
package mainframe.chessframe;

//import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Container;

//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Toolkit;
//import javax.swing.BorderFactory;
import javax.swing.JFrame;

import chessgame.Preloader;
import mainframe.chessmenubar.ChessMainMenuBar;
//import mainframe.chessframe.StatusPanel;

/**
 * The Class MainFrame.
 */
public class MainFrame extends JFrame {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The preload. */
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

    /**
     * Start again.
     */
    public void startAgain() {
        myMainPanel.startAgain();

        contentPane.add(myMainPanel);

    }

    /**
     * Start as server.
     */
    public void startAsServer() {
        myMainPanel.startAsServer(preload.getIpAddress(),
                preload.getPortNumber(), myChatPanel);

        contentPane.add(myMainPanel);

        setTitle("JChess! - Server");

    }

    /**
     * Start as client.
     */
    public void startAsClient() {

        myMainPanel.startAsClient(preload.getIpAddress(), 
                preload.getPortNumber(), myChatPanel);
        //myMainPanel.rotateComponent(null);
        contentPane.add(myMainPanel);
        setTitle("JChess! - Client");
    }

    /** The my chess bar. */
    private final ChessMainMenuBar myChessBar;
    
    /** The my tool panel. */
    public final ToolPanel myToolPanel = new ToolPanel();
    //private final StatusPanel myStatusPanel = new StatusPanel();

    /** The my main panel. */
    private final MainPanel myMainPanel = new MainPanel(myToolPanel);//, myStatusPanel);
    
    /** The my chat panel. */
    private final ChatPanel myChatPanel = new ChatPanel();
    
    /** The content pane. */
    private Container contentPane = getContentPane();
    

}
