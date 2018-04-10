
package pieces;

import java.awt.Point;

public class Knight extends Piece {

    /** Creates a new instance of Knight. */
    public Knight(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    /** moves logic for Knight.**/
    public boolean canMove(int x, int y) {
        return (x + 1 == nextX) && (y + 2 == nextY) 
                || (x + 1 == nextX) && (y - 2 == nextY) || (x - 1 == nextX) && (y + 2 == nextY)
                || (x - 1 == nextX) && (y - 2 == nextY) || (x + 2 == nextX) && (y + 1 == nextY)
                || (x + 2 == nextX) && (y - 1 == nextY)
                || (x - 2 == nextX) && (y + 1 == nextY) || (x - 2 == nextX) && (y - 1 == nextY);
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Knight= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }
}
