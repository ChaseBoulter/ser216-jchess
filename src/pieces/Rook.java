
package pieces;

import java.awt.Point;

public class Rook extends Piece {

    public Rook(String nameIcon, int startX, int startY) {

        super(nameIcon, startX, startY);
    }

    public boolean canMove(int x, int y) {
        if (((y == nextY) && (x > (nextX) || (x < (nextX))))) {
            return true;
        } else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
            return true;
        } else {

            return false;
        }

    }

    public boolean pieceInMyWay(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (((y == nextY) && (x > (nextX) || (x < (nextX))))) {

            if ((nextX < i))

                while ((i != nextX + 1)) {
                    i--;
                    // same color
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }

            else if ((nextX > i)) {
                while ((i != nextX - 1)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
            if ((nextY < j)) {
                while ((j != nextY + 1)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((nextY > j)) {
                while ((j != nextY - 1)) {
                    j++;

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
        if (((y == nextY) && (x > (nextX) || (x < (nextX))))) {

            if ((nextX < i))

                while ((i != nextX)) {
                    i--;
                    // same color
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }

            else if ((nextX > i)) {
                while ((i != nextX)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
            if ((nextY < j)) {
                while ((j != nextY)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((nextY > j)) {
                while ((j != nextY)) {
                    j++;

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
        return "Rook= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }
}
