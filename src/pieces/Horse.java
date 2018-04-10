
package pieces;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;

public class Horse extends Piece {

    /** Creates a new instance of Horse */
    public Horse(String NameIcon, int startX, int startY) {

        pieceIcon = new PieceIcon(NameIcon);

        X = startX;
        Y = startY;
        p.x = X;
        p.y = Y;
    }

 
    public boolean Canmove(int x, int y) {

        if ((x + 1 == X) && (y + 2 == Y) || (x + 1 == X) && (y - 2 == Y) || (x - 1 == X) && (y + 2 == Y)
                || (x - 1 == X) && (y - 2 == Y) || (x + 2 == X) && (y + 1 == Y) || (x + 2 == X) && (y - 1 == Y)
                || (x - 2 == X) && (y + 1 == Y) || (x - 2 == X) && (y - 1 == Y)) {

            return true;
        } else {
            return false;
        }

    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public String Tell_me() {
        return "Horse= (" + p.x + ',' + p.y + ")";
    }
}
