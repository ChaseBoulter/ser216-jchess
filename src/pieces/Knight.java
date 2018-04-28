
package pieces;

import java.awt.Point;

/**
 * The Class Knight.
 */
public class Knight extends Piece {

    /**
     *  Creates a new instance of Knight.
     *
     * @param nameIcon the name icon
     * @param startX the start X
     * @param startY the start Y
     */
    public Knight(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    /**
     *  moves logic for Knight.*
     *
     * @param x the x
     * @param y the y
     * @return true, if successful
     */
    public boolean canMove(int x, int y) {
        return x + 1 == nextX && y + 2 == nextY 
                || x + 1 == nextX && y - 2 == nextY || x - 1 == nextX && y + 2 == nextY
                || x - 1 == nextX && y - 2 == nextY || x + 2 == nextX && y + 1 == nextY
                || x + 2 == nextX && y - 1 == nextY
                || x - 2 == nextX && y + 1 == nextY || x - 2 == nextX && y - 1 == nextY;
    }

    /**
     * Generate possible moves.
     *
     * @return the point
     */
    public Point generatePossibleMoves() {
        return new Point();
    }

    /**
     * Tell me.
     *
     * @return the string
     */
    public String tellMe() {
        return "Knight= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }
}
