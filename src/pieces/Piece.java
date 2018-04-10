package pieces;

import java.awt.Image;
import java.awt.Point;

public class Piece {

    protected int nextX;
    protected int nextY;
    protected Point pixelPoint = new Point();
    protected int pixelX;
    protected int pixelY;
    protected boolean havelife = true;
    protected PieceIcon pieceIcon;
    protected Point updatedPosition = new Point();
    protected Point old = new Point();

    public Piece(String NameIcon, int startX, int startY) {

        pieceIcon = new PieceIcon(NameIcon);

        nextX = startX;
        nextY = startY;
        updatedPosition.x = nextX;
        updatedPosition.y = nextY;
    }

    public Image returnPieceImage() {
        return pieceIcon.returnPieceIcon();
    }

    public Point returnPostion() {
        return (Point) updatedPosition.clone();
    }

    public int returnX() {
        return nextX;
    }

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public int getPixelX() {
        return pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }

    public Point getpixelPoint() {
        return pixelPoint;
    }

    public int returnY() {
        return nextY;
    }

    public void setPoint(Point newPoint) {
        old.x = updatedPosition.x;
        old.y = updatedPosition.y;
        nextX = updatedPosition.x = newPoint.x;
        nextY = updatedPosition.y = newPoint.y;

        // updatedPosition.x = newPoint.x;
        //
        // updatedPosition.y = newPoint.y;
        // nextX = updatedPosition.x;
    }

    public void setX(int newX) {
        nextX = newX;
        updatedPosition.x = nextX;
    }

    public Point returnOld() {
        return old;
    }

    public void setY(int newY) {
        nextY = newY;
        updatedPosition.y = nextY;
    }

    public void toOld(Point Old) {

        updatedPosition.x = Old.x;
        updatedPosition.y = Old.y;

    }

    public boolean returnLife() {
        return havelife;
    }

    public boolean Inthispostion(int x, int y) {
        if (updatedPosition.x == x && updatedPosition.y == y) {
            return true;
        }
        return false;
    }
}
