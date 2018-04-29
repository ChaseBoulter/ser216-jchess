
package pieces;

import java.awt.Point;

/**
 * The Class Pawn.
 */
public class Pawn extends Piece {

    /** The myseen. */
    private boolean myseen = false;

    /** The movedbefore. */
    private boolean movedbefore = false;

    /**
     * Creates a new instance of Pawn.
     *
     * @param nameIcon
     *            the name icon
     * @param startX
     *            the start X
     * @param startY
     *            the start Y
     */
    public Pawn(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    /**
     * places pawn can move to. *
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param typeColor
     *            the type color
     * @return true, if successful
     */
    public boolean canMove(int x, int y, String typeColor) {

        /** Setting movedbefore to true if a pwan is no longer on its starting row **/
        if (typeColor.equals("black") && this.nextY != 2) {
            this.movedbefore = true;
        }
        if (typeColor.equals("white") && this.nextY != 7) {
            this.movedbefore = true;
        }

        if (typeColor.equals("black")) {
            if (y - 1 == this.nextY && x == this.nextX /* &&!Check_Solider_Sees(x,y) */) {

                return true;

            } else if (y - 2 == this.nextY && x == this.nextX && !this.movedbefore) {

                return true;
            } else if ((y - 1 == this.nextY && x + 1 == this.nextX
                    || y - 1 == this.nextY && x - 1 == this.nextX) && this.myseen) {
                return true;
            } else {
                return false;
            }
        } else if (typeColor.equals("white")) {
            if (y + 1 == this.nextY && x == this.nextX /* &&!Check_Solider_Sees(x,y) */) {
                return true;
            } else if (y + 2 == this.nextY && x == this.nextX && !this.movedbefore) {
                return true;
            } else if ((y + 1 == this.nextY && x + 1 == this.nextX
                    || y + 1 == this.nextY && x - 1 == this.nextX) && this.myseen) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    /**
     * Piece in my way.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param othersPostion
     *            the others postion
     * @param typeColor
     *            the type color
     * @return true, if successful
     */
    public boolean pieceInMyWay(int x, int y, Point othersPostion, String typeColor) {
        if (this.nextY - y == 2 || this.nextY - y == -2) {
            if (typeColor.equals("black")) {

                if (y - 1 == othersPostion.y && x == othersPostion.x && !this.movedbefore) {
                    return true;
                } else {
                    return false;
                }
            } else if (typeColor.equals("white")) {

                if (y + 1 == othersPostion.y && x == othersPostion.x && !this.movedbefore) {

                    return true;

                } else {
                    return false;
                }
            }
        }

        return false;
    }

    /**
     * Sets the m yseen.
     *
     * @param newBoolean
     *            the new m yseen
     */
    public void setMYseen(boolean newBoolean) {
        this.myseen = newBoolean;
    }

    /**
     * Return myseen.
     *
     * @return true, if successful
     */
    public boolean returnMyseen() {
        return this.myseen;
    }

    /**
     * Sets the seen by checking.
     *
     * @param newP
     *            the new P
     * @param color
     *            the color
     * @return true, if successful
     */
    public boolean setSeenByChecking(Point newP, String color) {
        this.myseen = false;
        if (color.equals("black")) {
            if (newP.y - 1 == this.nextY && newP.x + 1 == this.nextX
                    || newP.y - 1 == this.nextY && newP.x - 1 == this.nextX) {

                this.myseen = true;
                return true;
            } else {
                return false;
            }
        } else if (color.equals("white")) {
            if (newP.y + 1 == this.nextY && newP.x + 1 == this.nextX
                    || newP.y + 1 == this.nextY && newP.x - 1 == this.nextX) {
                this.myseen = true;

                return true;
            } else {
                return false;
            }

        }
        return false;
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
        return "Pawn= (" + this.updatedPosition.x + ',' + this.updatedPosition.y + ")";
    }

}
