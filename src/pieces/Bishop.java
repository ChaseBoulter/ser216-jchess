
package pieces;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;

public class Bishop extends Piece {

    /** Creates a new instance of Bishop. */
    public Bishop(String NameIcon, int startX, int startY) {

        pieceIcon = new PieceIcon(NameIcon);

        X = startX;
        Y = startY;
        p.x = X;
        p.y = Y;
    }

    public boolean Canmove(int x, int y) {

        int j = y;
        int i = x;

        if ((x - y) == (X - Y)) {
            return true;
        } else if ((x + y) == (X + Y)) {
            return true;

        } else {
            return false;
        }

    }

    public boolean PieceInMYway(int x, int y, Point othersPostion) {

        int j = y;
        int i = x;

        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y + 1) && (i != X + 1)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }

            else if (x < X && y < Y)

                while ((j != Y - 1) && (i != X - 1)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
        }

        else if (((x + y)) == ((X + Y))) {

            if ((X < i) && (Y > j)) {

                while (((j != Y - 1)) && ((i != X + 1))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            }

            else if ((X > i) && (Y < j)) {
                while ((j != X + 1) && (i != X - 1)) {
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

        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y) && (i != X)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }

            else if (x < X && y < Y)

                while ((j != Y) && (i != X)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
        }

        else if (((x + y)) == ((X + Y))) {

            if ((X < i) && (Y > j)) {

                while (((j != Y)) && ((i != X))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {

                        return true;
                    }

                }

            }

            else if ((X > i) && (Y < j)) {
                while ((j != X) && (i != X)) {
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

    public Point GeneratePossible_Moves() {
        return new Point();
    }

    public String Tell_me() {
        return "Bishop= (" + p.x + ',' + p.y + ")";
    }

}
