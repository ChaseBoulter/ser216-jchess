
package pieces;

import java.awt.Point;


/**
 * The Class King.
 */
public class King extends Piece {

    /**
     *  Creates a new instance of king.
     *
     * @param nameIcon the name icon
     * @param startX the start X
     * @param startY the start Y
     */

    public King(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    /**
     *  places King can move to. *
     *
     * @param x the x
     * @param y the y
     * @return true, if successful
     */
    public boolean canMove(int x, int y) {
        return y == nextY && x == nextX - 1 || y == nextY - 1 && x == nextX + 1
                || y == nextY - 1 && x == nextX - 1 || y == nextY + 1
                && x == nextX + 1 || y == nextY + 1 && x == nextX - 1
                || y == nextY && x == nextX + 1
                || y == nextY - 1 && x == nextX || y == nextY + 1 && x == nextX;

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
        return "King= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
