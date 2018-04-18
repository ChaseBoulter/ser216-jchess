package chessgame;

/**
 * entry point for Chess.
 */
public class Chess {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Preloader preload = Preloader.getInstance();
        if (preload == null) {
            return;
        }
        
        while(!preload.endLoading()) {
          //intentionally left empty
        }
    }
}