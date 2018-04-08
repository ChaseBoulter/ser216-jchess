
package mainframe.chessframe.players.pieces;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;

public class King extends Piece {

    /** Creates a new instance of king */

    public King(String NameIcon, int startX, int startY) {

        pieceIcon = new PieceIcon(NameIcon);

        X = startX;
        Y = startY;
        p.x = X;
        p.y = Y;
    }


    public boolean Canmove(int x, int y) {

        if (((y == Y) && (x == (X - 1))) || ((y == Y - 1) && (x == (X + 1))) || ((y == Y - 1) && (x == (X - 1)))
                || ((y == Y + 1) && (x == (X + 1))) || (((y == Y + 1) && x == (X - 1))) || ((y == Y) && (x == (X + 1)))
                || ((y == Y - 1) && x == ((X))) || ((y == Y + 1) && (x == (X)))) {

            return true;
        }

        return false;

    }

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public String Tell_me() {
        return "King= (" + p.x + ',' + p.y + ")";
    }

}
