package chessgame;

/**
 * entry point for Chess.
 */
public class Chess {
    public static void main(String[] args) {
        Preloader preload = Preloader.getInstance();
        if(preload == null) {
            return;
        }
        
        while(!preload.endLoading()) {
          //intentionally left empty
        }
    }
}