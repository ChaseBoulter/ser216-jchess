
package pieces;

import java.awt.Point;

public class Bishop extends Piece {

    /** Creates a new instance of Bishop. */
    public Bishop(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    /** places Bishop can move to. **/
    public boolean canMove(int x, int y) {

//        int j = y;
//        int i = x;

        if ((x - y) == (nextX - nextY)) {
            return true;
        } else if ((x + y) == (nextX + nextY)) {
            return true;

        } else {
            return false;
        }

    }

    public boolean pieceInMyWay(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;

        if ((x - y) == (nextX - nextY)) {
            
            if (x > nextX && y > nextY) {
                while ((j != nextY + 1) && (i != nextX + 1)) {
                    j--;
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < nextX && y < nextY) {
                while ((j != nextY - 1) && (i != nextX - 1)) {
                    j++;
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if (((x + y)) == ((nextX + nextY))) {

            if ((nextX < i) && (nextY > j)) {

                while (((j != nextY - 1)) && ((i != nextX + 1))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            } else if ((nextX > i) && (nextY < j)) {
                while ((j != nextX + 1) && (i != nextX - 1)) {
                    j--;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public boolean checkKing(int x, int y, Point othersPostion) {

        int j = y;
        int i = x;

        if ((x - y) == (nextX - nextY)) {
            if (x > nextX && y > nextY) {
                while ((j != nextY) && (i != nextX)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < nextX && y < nextY) {

                while ((j != nextY) && (i != nextX)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        } else if (((x + y)) == ((nextX + nextY))) {

            if ((nextX < i) && (nextY > j)) {

                while (((j != nextY)) && ((i != nextX))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            } else if ((nextX > i) && (nextY < j)) {
                while ((j != nextX) && (i != nextX)) {
                    j--;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Bishop= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
