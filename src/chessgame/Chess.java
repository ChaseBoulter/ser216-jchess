package chessgame;

import mainframe.chessframe.MainFrame;

/**
 * entry point for Chess.
 */
public class Chess {
    public static void main(String[] args) {
        Preloader preload = Preloader.getInstance();
        while(!preload.endLoading()) {
          //intentionally left empty
      }
        //new MainFrame();
    }
}