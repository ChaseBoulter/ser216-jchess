package mainframe.chessframe.players.pieces;

import java.awt.Image;
import java.awt.Point;

public abstract class Piece {
    
    protected int X;
    protected int Y;
    protected Point pixelPoint = new Point();
    protected int pixelX;
    protected int pixelY;
    protected boolean havelife = true;
    protected PieceIcon pieceIcon;
    protected Point p = new Point();
    protected Point old = new Point();

//    public Piece(String NameIcon, int startX, int startY) {
//
//        //pieceIcon = new PieceIcon(NameIcon);
//
//        X = startX;
//        Y = startY;
//        p.x = X;
//        p.y = Y;
//    }

    public Image returnPieceImage() {
        return pieceIcon.returnPieceIcon();
    }

    public Point returnPostion() {
        return (Point) p.clone();
    }

    public int returnX() {
        return X;
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
        return Y;
    }

    public void setPoint(Point newPoint) {
        old.x = p.x;
        old.y = p.y;
        X = p.x = newPoint.x;
        Y = p.y = newPoint.y;
        
//        p.x = newPoint.x;
//
//        p.y = newPoint.y;
//        X = p.x;
    }

    public void setX(int newX) {
        X = newX;
        p.x = X;
    }

    public Point returnOld() {
        return old;
    }

    public void setY(int newY) {
        Y = newY;
        p.y = Y;
    }

    public void toOld(Point Old) {

        p.x = Old.x;
        p.y = Old.y;

    }

    public boolean returnLife() {
        return havelife;
    }
    
    public boolean Inthispostion(int x, int y) {
        if (p.x == x && p.y == y) {
            return true;
        }
        return false;
    }
}
