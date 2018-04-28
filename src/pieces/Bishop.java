
package pieces;

import java.awt.Point;

/**
 * The Class Bishop.
 */
public class Bishop extends Piece {

    /**
     *  Creates a new instance of Bishop.
     *
     * @param nameIcon the name icon
     * @param startX the start X
     * @param startY the start Y
     */
    public Bishop(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    /**
     *  places Bishop can move to. *
     *
     * @param x the x
     * @param y the y
     * @return true, if successful
     */
    public boolean canMove(int x, int y) {
        boolean retMove = false;
        if (x - y == nextX - nextY || x + y == nextX + nextY)  {
            retMove = true;
        }
        
        return retMove;
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

        if (x - y == nextX - nextY) {
            
            if (x > nextX && y > nextY) {
                while (j != nextY + 1 && i != nextX + 1) {
                    j--;
                    i--;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            } else if (x < nextX && y < nextY) {
                while (j != nextY - 1 && i != nextX - 1) {
                    j++;
                    i++;
                    if (othersPostion.y == j && othersPostion.x == i) {
                        return true;
                    }
                }
            }
        } else if (x + y == nextX + nextY) {

            if (nextX < i && nextY > j) {

                while (j != nextY - 1 && i != nextX + 1) {
                    j++;
                    i--;

                    if (othersPostion.y == j && othersPostion.x == i) {

                        return true;
                    }

                }

            } else if (nextX > i && nextY < j) {
                while (j != nextX + 1 && i != nextX - 1) {
                    j--;
                    i++;

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
     * @param othersPosition the others position
     * @return true, if successful
     */
    public boolean checkKing(int x, int y, Point othersPosition) {

        int j = y;
        int i = x;

        if (x - y == nextX - nextY) {
            if (x > nextX && y > nextY) {
                while (j != nextY && i != nextX) {
                    j--;
                    i--;

                    if (othersPosition.y == j && othersPosition.x == i) {
                        return true;
                    }
                }
            } else if (x < nextX && y < nextY) {

                while (j != nextY && i != nextX) {
                    j++;
                    i++;

                    if (othersPosition.y == j && othersPosition.x == i) {
                        return true;
                    }

                }
            }
        } else if (x + y == nextX + nextY) {

            if (nextX < i && nextY > j) {

                while (j != nextY && i != nextX) {
                    j++;
                    i--;

                    if (othersPosition.y == j && othersPosition.x == i) {

                        return true;
                    }

                }

            } else if (nextX > i && nextY < j) {
                while (j != nextX && i != nextX) {
                    j--;
                    i++;

                    if (othersPosition.y == j && othersPosition.x == i) {
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
        return "Bishop= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
