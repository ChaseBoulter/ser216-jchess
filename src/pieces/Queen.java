
package pieces;

import java.awt.Point;
public class Queen extends Piece {

    /** Constructor for Queen. Created from Piece.**/
    public Queen(String NameIcon, int startX, int startY) {
        
        super(NameIcon, startX, startY);
    }

    public boolean Canmove(int x, int y) {

        if (((y == nextY) && (x > (nextX) || (x < nextX)))) {
            return true;

        } else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
            return true;
        } else if ((x - y) == (nextX - nextY)) {
            return true;

        } else if ((x + y) == (nextX + nextY)) {
            return true;

        } else {

            return false;
        }

    }

    public boolean PieceInMYway(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (((y == nextY) && (x > (nextX) || (x < (nextX))))) {
            if ((nextX < i)) {
                while ((i != nextX + 1)) {
                    i--;
                    // they're Same Color piece
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((nextX > i)) {
                while ((i != nextX - 1)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        }

        else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
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
        } else if ((x - y) == (nextX - nextY)) {
            if (x > nextX && y > nextY) {
                while ((j != nextY + 1) && (i != nextX + 1)) {
                    j--;
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }

            else if (x < nextX && y < nextY) {
                while ((j != nextY - 1) && (i != nextX - 1)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        else if ((x + y) == (nextX + nextY)) {

            if ((nextX < i) && (nextY > j)) {
                while ((j != nextY - 1) && (i != nextX + 1)) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }

            }

            else if ((nextX > i) && (nextY < j)) {
                while ((j != nextY + 1) && (i != nextX - 1)) {
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
        if (((y == nextY) && (x > (nextX) || (x < (nextX))))) {
            if ((nextX < i)) {
                while ((i != nextX)) {
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) //same color
                    {
                        return true;
                    }
                }
            } else if ((nextX > i)) {
                while ((i != nextX)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        }

        else if ((((y > nextY) || (y < nextY)) && (x == (nextX)))) {
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
        } else if ((x - y) == (nextX - nextY)) {
            if (x > nextX && y > nextY) {
                while ((j != nextY) && (i != nextX)) {
                    j--;
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }

            else if (x < nextX && y < nextY) {
                while ((j != nextY) && (i != nextX)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        }

        else if ((x + y) == (nextX + nextY)) {

            if ((nextX < i) && (nextY > j)) {
                while ((j != nextY) && (i != nextX)) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }

            }

            else if ((nextX > i) && (nextY < j)) {
                while ((j != nextY) && (i != nextX)) {
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
        return "Queen= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
