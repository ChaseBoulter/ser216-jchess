
package pieces;

import java.awt.Point;

/**
 * The Class Rook.
 */
public class Rook extends Piece {

    /**
     * Instantiates a new rook.
     *
     * @param nameIcon the name icon
     * @param startX the start X
     * @param startY the start Y
     */
    public Rook(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    /**
     * Can move.
     *
     * @param x the x
     * @param y the y
     * @return true, if successful
     */
    public boolean canMove(int x, int y) {
        if (y == nextY && (x > nextX || x < nextX)) {
            return true;
        } else if ((y > nextY || y < nextY) && x == nextX) {
            return true;
        } else {

            return false;
        }

    }

    /**
     * Piece in my way.
     *
     * @param x the x
     * @param y the y
     * @param othersPostion the others postion
     * @return true, if successful
     */
    public boolean pieceInMyWay(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (y == nextY && (x > nextX || x < nextX)) {

            if (nextX < i) {
                while (i != nextX + 1) {
                    i--;
                    // same color
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            } else if (nextX > i) {
                while (i != nextX - 1) {
                    i++;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            }
        } else if ((y > nextY || y < nextY) && x == nextX) {
            if (nextY < j) {
                while (j != nextY + 1) {
                    j--;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            } else if (nextY > j) {
                while (j != nextY - 1) {
                    j++;

                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }

            }
        }
        return false;

    }

    /**
     * Check king.
     *
     * @param x the x
     * @param y the y
     * @param othersPostion the others postion
     * @return true, if successful
     */
    public boolean checkKing(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (y == nextY && (x > nextX || x < nextX)) {

            if (nextX < i) {
                while (i != nextX) {
                    i--;
                    // same color
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            } else if (nextX > i) {
                while (i != nextX) {
                    i++;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            }
        } else if ((y > nextY || y < nextY) && x == nextX) {
            if (nextY < j) {
                while (j != nextY) {
                    j--;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            } else if (nextY > j) {
                while (j != nextY) {
                    j++;

                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }

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
        return "Rook= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }
}
