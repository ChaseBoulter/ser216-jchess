
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
    Preloader preload = Preloader.getInstance(); // singleton

    /** creates Chess Game. **/

    public MainFrame() {
        this.setTitle("JChess!");
        this.setSize(900, 665);
        this.setResizable(false);

        // where window should appear
        this.setLocationRelativeTo(null);

        this.contentPane.setLayout(null);
        this.contentPane.add(this.myChatPanel);
        // contentPane.add(myStatusPanel);
        this.contentPane.add(this.myToolPanel);

        this.myChessBar = new ChessMainMenuBar(this);

        this.setJMenuBar(this.myChessBar);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Start again.
     */
    public void startAgain() {
        this.myMainPanel.startAgain();

        this.contentPane.add(this.myMainPanel);

    }

    /**
     * Start as server.
     */
    public void startAsServer() {
        this.myMainPanel.startAsServer(this.preload.getIpAddress(), this.preload.getPortNumber(),
                this.myChatPanel);

        this.contentPane.add(this.myMainPanel);

        this.setTitle("JChess! - Server");

    }

    /**
     * Start as client.
     */
    public void startAsClient() {

        this.myMainPanel.startAsClient(this.preload.getIpAddress(), this.preload.getPortNumber(),
                this.myChatPanel);
        // myMainPanel.rotateComponent(null);
        this.contentPane.add(this.myMainPanel);
        this.setTitle("JChess! - Client");
    }

    /** The my chess bar. */
    private final ChessMainMenuBar myChessBar;

    /** The my tool panel. */
    public final ToolPanel myToolPanel = new ToolPanel();
    // private final StatusPanel myStatusPanel = new StatusPanel();

    /** The my main panel. */
    private final MainPanel myMainPanel = new MainPanel(this.myToolPanel);// , myStatusPanel);

    /** The my chat panel. */
    private final ChatPanel myChatPanel = new ChatPanel();

    /** The content pane. */
    private Container contentPane = this.getContentPane();

}
