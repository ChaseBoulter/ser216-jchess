
package pieces;

import java.awt.Point;


public class King extends Piece {

    /** Creates a new instance of king. */

    public King(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    public boolean canMove(int x, int y) {
        return((y == nextY) && (x == (nextX - 1))) || ((y == nextY - 1) && (x == (nextX + 1)))
                || ((y == nextY - 1) && (x == (nextX - 1))) || ((y == nextY + 1)
                && (x == (nextX + 1))) || (((y == nextY + 1) && x == (nextX - 1)))
                || ((y == nextY) && (x == (nextX + 1)))
                || ((y == nextY - 1) && x == nextX) || ((y == nextY + 1) && (x == (nextX)));

    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "King= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
