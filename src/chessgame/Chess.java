package chessgame;

import mainframe.chessframe.MainFrame;

/**
 * entry point for Chess.
 */
public class Chess {
    public static void main(String[] args) {       
        //preloader loads new game with information
        Preloader preload = new Preloader();
        while(!preload.endLoading()) {
            //intentionally left empty
        }
        
        String name = preload.getName();
        //new MainFrame();
    }
}