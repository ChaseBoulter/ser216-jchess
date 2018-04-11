
package pieces;

import java.awt.Point;

public class Pawn extends Piece {

    private boolean myseen = false;
    private boolean movedbefore = false;

    /** Creates a new instance of Pawn. */
    public Pawn(String nameIcon, int startX, int startY) {
        super(nameIcon, startX, startY);
    }

    /** places pawn can move to. **/
    public boolean canMove(int x, int y, String typeColor) {

        if ((typeColor.equals("black"))) {
            if ((((y - 1 == nextY) && (x == (nextX)))) /* &&!Check_Solider_Sees(x,y) */) {

                return true;

            } else if ((((y - 2 == nextY) && (x == (nextX)))) && !movedbefore) {

                return true;
            } else if ((y - 1 == nextY && x + 1 == (nextX)
                    || (y - 1 == nextY && x - 1 == (nextX))) && myseen) {
                return true;
            } else {
                return false;
            }
        } else if (typeColor == "white") {
            if (((y + 1 == nextY) && (x == (nextX))) /* &&!Check_Solider_Sees(x,y) */) {
                return true;
            } else if ((((y + 2 == nextY) && (x == (nextX)))) && !movedbefore) {
                return true;
            } else if ((y + 1 == nextY && x + 1 == (nextX) || (y + 1 == nextY && x - 1 == (nextX))) && myseen) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public boolean pieceInMyWay(int x, int y, Point othersPostion, String typeColor) {
        if (nextY - y == 2 || nextY - y == -2) {
            if ((typeColor.equals("black"))) {

                if ((((y - 1 == othersPostion.y) && (x == (othersPostion.x)))) && !movedbefore) {
                    return true;
                } else {
                    return false;
                }
            } else if (typeColor.equals("white")) {

                if (((y + 1 == othersPostion.y) && (x == (othersPostion.x)) && !movedbefore)) {

                    return true;

                } else {
                    return false;
                }
            }
        }

        return false;
    }

    public void setMYseen(boolean newBoolean) {
        myseen = newBoolean;
    }

    public boolean returnMyseen() {
        return myseen;
    }

    public boolean setSeenByChecking(Point newP, String color) {
        myseen = false;
        if ((color.equals("black"))) {
            if ((newP.y - 1 == nextY && newP.x + 1 == (nextX) 
                    || (newP.y - 1 == nextY && newP.x - 1 == (nextX)))) {

                myseen = true;
                return true;
            } else {
                return false;
            }
        } else if (color.equals("white")) {
            if ((newP.y + 1 == nextY && newP.x + 1 == (nextX)
                    || (newP.y + 1 == nextY && newP.x - 1 == (nextX)))) {
                myseen = true;

                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Pawn= (" + updatedPosition.x + ',' + updatedPosition.y + ")";
    }

}
