
package players;

import java.awt.Image;
import java.awt.Point;
import java.util.Enumeration;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

/**
 * The Class Player2.
 */
@SuppressWarnings("rawtypes")
public class Player2 implements Enumeration {

    /** The black rook 1. */
    public Rook blackRook1;

    /** The black rook 2. */
    public Rook blackRook2;

    /** The black knight 1. */
    public Knight blackKnight1;

    /** The black knight 2. */
    public Knight blackKnight2;

    /** The black bishop 1. */
    public Bishop blackBishop1;

    /** The black bishop 2. */
    public Bishop blackBishop2;

    /** The black queen. */
    public Queen blackQueen;

    /** The black king. */
    private King blackKing;

    /** The black pawns. */
    public Pawn[] blackPawns = new Pawn[8];

    /** The choosen one. */
    private int choosenOne;

    /** The in hand. */
    private int inHand = -1;

    /** The kingischeck. */
    private boolean kingischeck = false;

    /** The other. */
    private Point other;

    /** The kill to protect. */
    private int killToProtect;

    /** The color. */
    private String color = "black";

    /** Creates a new instance of Player2. */
    public Player2() {
        String fileSeparator = System.getProperty("file.separator");
        this.blackRook1 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "blackRook.png", 1, 1);

        this.blackRook2 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "blackRook.png", 8, 1);

        this.blackKnight1 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 2, 1);

        this.blackKnight2 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 7, 1);

        this.blackBishop1 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackBishop.png", 3, 1);

        this.blackBishop2 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackBishop.png", 6, 1);

        this.blackQueen = new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "blackQueen.png", 4, 1);

        this.blackKing = new King("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "blackKing.png", 5, 1);

        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            this.blackPawns[i] = new Pawn("src" + fileSeparator + "Icons" + fileSeparator
                    + "Player2Icons" + fileSeparator + "BlackPawn.png", j, 2);
        }
    }

    /**
     * Sets the choosen.
     *
     * @param newChoosen
     *            the new choosen
     */
    public void setChoosen(int newChoosen) {
        this.choosenOne = newChoosen;
    }

    /**
     * Return postion.
     *
     * @param i
     *            the i
     * @return the point
     */
    public Point returnPostion(int i) {

        switch (i) {
            case 1:
                return this.blackRook1.returnPostion();
            case 2:
                return this.blackRook2.returnPostion();
            case 3:
                return this.blackKnight1.returnPostion();
            case 4:
                return this.blackKnight2.returnPostion();
            case 5:
                return this.blackBishop1.returnPostion();
            case 6:
                return this.blackBishop2.returnPostion();
            case 7:
                return this.blackQueen.returnPostion();
            case 8:
                return this.blackKing.returnPostion();
            case 9:
                return this.blackPawns[0].returnPostion();
            case 10:
                return this.blackPawns[1].returnPostion();
            case 11:
                return this.blackPawns[2].returnPostion();
            case 12:
                return this.blackPawns[3].returnPostion();
            case 13:
                return this.blackPawns[4].returnPostion();
            case 14:
                return this.blackPawns[5].returnPostion();
            case 15:
                return this.blackPawns[6].returnPostion();
            case 16:
                return this.blackPawns[7].returnPostion();
            default:
                break;

        }
        return new Point(-1, -1);

    }

    /**
     * Return old postion.
     *
     * @param i
     *            the i
     * @return the point
     */
    public Point returnOldPostion(int i) {

        switch (i) {
            case 1:
                return this.blackRook1.returnOld();
            case 2:
                return this.blackRook2.returnOld();
            case 3:
                return this.blackKnight1.returnOld();
            case 4:
                return this.blackKnight2.returnOld();
            case 5:
                return this.blackBishop1.returnOld();
            case 6:
                return this.blackBishop2.returnOld();
            case 7:
                return this.blackQueen.returnOld();
            case 8:
                return this.blackKing.returnOld();
            case 9:
                return this.blackPawns[0].returnOld();
            case 10:
                return this.blackPawns[1].returnOld();
            case 11:
                return this.blackPawns[2].returnOld();
            case 12:
                return this.blackPawns[3].returnOld();
            case 13:
                return this.blackPawns[4].returnOld();
            case 14:
                return this.blackPawns[5].returnOld();
            case 15:
                return this.blackPawns[6].returnOld();
            case 16:
                return this.blackPawns[7].returnOld();
            default:
                break;

        }
        return new Point(-1, -1);

    }

    /**
     * Return icon image.
     *
     * @param i
     *            the i
     * @return the image
     */
    public Image returnIconImage(int i) {
        switch (i) {
            case 1:
                return this.blackRook1.returnPieceImage();
            case 2:
                return this.blackRook2.returnPieceImage();
            case 3:
                return this.blackKnight1.returnPieceImage();
            case 4:
                return this.blackKnight2.returnPieceImage();
            case 5:
                return this.blackBishop1.returnPieceImage();
            case 6:
                return this.blackBishop2.returnPieceImage();
            case 7:
                return this.blackQueen.returnPieceImage();
            case 8:
                return this.blackKing.returnPieceImage();
            case 9:
                return this.blackPawns[0].returnPieceImage();
            case 10:
                return this.blackPawns[1].returnPieceImage();
            case 11:
                return this.blackPawns[2].returnPieceImage();
            case 12:
                return this.blackPawns[3].returnPieceImage();
            case 13:
                return this.blackPawns[4].returnPieceImage();
            case 14:
                return this.blackPawns[5].returnPieceImage();
            case 15:
                return this.blackPawns[6].returnPieceImage();
            case 16:
                return this.blackPawns[7].returnPieceImage();
            default:
                break;

        }
        return null;

    }

    /**
     * Change postion.
     *
     * @param newPoint
     *            the new point
     * @param i
     *            the i
     */
    public void changePostion(Point newPoint, int i) {
        switch (i) {
            case 1:
                this.blackRook1.setPoint(newPoint);
                break;
            case 2:
                this.blackRook2.setPoint(newPoint);
                break;
            case 3:
                this.blackKnight1.setPoint(newPoint);
                break;
            case 4:
                this.blackKnight2.setPoint(newPoint);
                break;
            case 5:
                this.blackBishop1.setPoint(newPoint);
                break;
            case 6:
                this.blackBishop2.setPoint(newPoint);
                break;
            case 7:
                this.blackQueen.setPoint(newPoint);
                break;
            case 8:
                this.blackKing.setPoint(newPoint);
                break;
            case 9:
                this.blackPawns[0].setPoint(newPoint);
                break;
            case 10:
                this.blackPawns[1].setPoint(newPoint);
                break;
            case 11:
                this.blackPawns[2].setPoint(newPoint);
                break;
            case 12:
                this.blackPawns[3].setPoint(newPoint);
                break;
            case 13:
                this.blackPawns[4].setPoint(newPoint);
                break;
            case 14:
                this.blackPawns[5].setPoint(newPoint);
                break;
            case 15:
                this.blackPawns[6].setPoint(newPoint);
                break;
            case 16:
                this.blackPawns[7].setPoint(newPoint);
                break;
            default:
                break;

        }

    }

    /**
     * Change postion to old.
     *
     * @param newPoint
     *            the new point
     * @param i
     *            the i
     */
    public void changePostionToOld(Point newPoint, int i) {
        switch (i) {
            case 1:
                this.blackRook1.toOld(newPoint);
                break;
            case 2:
                this.blackRook2.toOld(newPoint);
                break;
            case 3:
                this.blackKnight1.toOld(newPoint);
                break;
            case 4:
                this.blackKnight2.toOld(newPoint);
                break;
            case 5:
                this.blackBishop1.toOld(newPoint);
                break;
            case 6:
                this.blackBishop2.toOld(newPoint);
                break;
            case 7:
                this.blackQueen.toOld(newPoint);
                break;
            case 8:
                this.blackKing.toOld(newPoint);
                break;
            case 9:
                this.blackPawns[0].toOld(newPoint);
                break;
            case 10:
                this.blackPawns[1].toOld(newPoint);
                break;
            case 11:
                this.blackPawns[2].toOld(newPoint);
                break;
            case 12:
                this.blackPawns[3].toOld(newPoint);
                break;
            case 13:
                this.blackPawns[4].toOld(newPoint);
                break;
            case 14:
                this.blackPawns[5].toOld(newPoint);
                break;
            case 15:
                this.blackPawns[6].toOld(newPoint);
                break;
            case 16:
                this.blackPawns[7].toOld(newPoint);
                break;
            default:
                break;

        }

    }

    /**
     * Change pixel.
     *
     * @param newPixelX
     *            the new pixel X
     * @param newPixelY
     *            the new pixel Y
     * @param i
     *            the i
     */
    public void changePixel(int newPixelX, int newPixelY, int i) {
        this.choosenOne = i;
        switch (this.choosenOne) {
            case 1:
                this.blackRook1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                this.blackRook2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                this.blackKnight1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                this.blackKnight2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                this.blackBishop1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                this.blackBishop2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                this.blackQueen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                this.blackKing.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                this.blackPawns[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                this.blackPawns[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                this.blackPawns[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                this.blackPawns[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                this.blackPawns[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                this.blackPawns[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                this.blackPawns[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                this.blackPawns[7].setPixels(newPixelX, newPixelY);
                break;
            default:
                break;

        }
    }

    /**
     * Change pixel.
     *
     * @param newPixelX
     *            the new pixel X
     * @param newPixelY
     *            the new pixel Y
     */
    public void changePixel(int newPixelX, int newPixelY) {
        switch (this.choosenOne) {
            case 1:
                this.blackRook1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                this.blackRook2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                this.blackKnight1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                this.blackKnight2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                this.blackBishop1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                this.blackBishop2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                this.blackQueen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                this.blackKing.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                this.blackPawns[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                this.blackPawns[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                this.blackPawns[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                this.blackPawns[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                this.blackPawns[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                this.blackPawns[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                this.blackPawns[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                this.blackPawns[7].setPixels(newPixelX, newPixelY);
                break;
            default:
                break;

        }
    }

    /**
     * Gets the pixel point.
     *
     * @param i
     *            the i
     * @return the pixel point
     */
    public Point getPixelPoint(int i) {
        this.choosenOne = i;
        switch (this.choosenOne) {
            case 1:
                return this.blackRook1.getpixelPoint();
            case 2:
                return this.blackRook2.getpixelPoint();
            case 3:
                return this.blackKnight1.getpixelPoint();
            case 4:
                return this.blackKnight2.getpixelPoint();
            case 5:
                return this.blackBishop1.getpixelPoint();
            case 6:
                return this.blackBishop2.getpixelPoint();
            case 7:
                return this.blackQueen.getpixelPoint();
            case 8:
                return this.blackKing.getpixelPoint();
            case 9:
                return this.blackPawns[0].getpixelPoint();
            case 10:
                return this.blackPawns[1].getpixelPoint();
            case 11:
                return this.blackPawns[2].getpixelPoint();
            case 12:
                return this.blackPawns[3].getpixelPoint();
            case 13:
                return this.blackPawns[4].getpixelPoint();
            case 14:
                return this.blackPawns[5].getpixelPoint();
            case 15:
                return this.blackPawns[6].getpixelPoint();
            case 16:
                return this.blackPawns[7].getpixelPoint();
            default:
                break;

        }
        return null;
    }

    /**
     * Killed piece.
     *
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean killedPiece(int i) {
        Point out = new Point(20, 20);
        switch (i) {
            case 1:
                this.blackRook1.setPoint(out);
                return true;
            case 2:
                this.blackRook2.setPoint(out);
                return true;
            case 3:
                this.blackKnight1.setPoint(out);
                return true;
            case 4:
                this.blackKnight2.setPoint(out);
                return true;
            case 5:
                this.blackBishop1.setPoint(out);
                return true;
            case 6:
                this.blackBishop2.setPoint(out);
                return true;
            case 7:
                this.blackQueen.setPoint(out);
                return true;
            case 8:
                return true;// the King "Can't be moved out"
            case 9:
                this.blackPawns[0].setPoint(out);
                return true;
            case 10:
                this.blackPawns[1].setPoint(out);
                return true;
            case 11:
                this.blackPawns[2].setPoint(out);
                return true;
            case 12:
                this.blackPawns[3].setPoint(out);
                return true;
            case 13:
                this.blackPawns[4].setPoint(out);
                return true;
            case 14:
                this.blackPawns[5].setPoint(out);
                return true;
            case 15:
                this.blackPawns[6].setPoint(out);
                return true;
            case 16:
                this.blackPawns[7].setPoint(out);
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Check the move.
     *
     * @param newP
     *            the new P
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean checkTheMove(Point newP, int i) {
        this.choosenOne = i;
        switch (this.choosenOne) {

            case 1:
                return this.blackRook1.canMove(newP.x, newP.y);
            case 2:
                return this.blackRook2.canMove(newP.x, newP.y);
            case 3:
                return this.blackKnight1.canMove(newP.x, newP.y);
            case 4:
                return this.blackKnight2.canMove(newP.x, newP.y);
            case 5:
                return this.blackBishop1.canMove(newP.x, newP.y);
            case 6:
                return this.blackBishop2.canMove(newP.x, newP.y);
            case 7:
                return this.blackQueen.canMove(newP.x, newP.y);
            case 8:
                return this.blackKing.canMove(newP.x, newP.y);
            case 9:
                return this.blackPawns[0].canMove(newP.x, newP.y, this.color);
            case 10:
                return this.blackPawns[1].canMove(newP.x, newP.y, this.color);
            case 11:
                return this.blackPawns[2].canMove(newP.x, newP.y, this.color);
            case 12:
                return this.blackPawns[3].canMove(newP.x, newP.y, this.color);
            case 13:
                return this.blackPawns[4].canMove(newP.x, newP.y, this.color);
            case 14:
                return this.blackPawns[5].canMove(newP.x, newP.y, this.color);
            case 15:
                return this.blackPawns[6].canMove(newP.x, newP.y, this.color);
            case 16:
                return this.blackPawns[7].canMove(newP.x, newP.y, this.color);
            default:
                break;
        }
        return false;
    }

    /**
     * Pawn seen.
     *
     * @param i
     *            the i
     * @param myPoint
     *            the my point
     * @return true, if successful
     */
    // TODO: find out what this means.
    public boolean pawnSeen(int i, Point myPoint) {

        switch (i) {
            case 9:
                return this.blackPawns[0].setSeenByChecking(myPoint, "black");
            case 10:
                return this.blackPawns[1].setSeenByChecking(myPoint, "black");
            case 11:
                return this.blackPawns[2].setSeenByChecking(myPoint, "black");
            case 12:
                return this.blackPawns[3].setSeenByChecking(myPoint, "black");
            case 13:
                return this.blackPawns[4].setSeenByChecking(myPoint, "black");
            case 14:
                return this.blackPawns[5].setSeenByChecking(myPoint, "black");
            case 15:
                return this.blackPawns[6].setSeenByChecking(myPoint, "black");
            case 16:
                return this.blackPawns[7].setSeenByChecking(myPoint, "black");
            default:
                break;
        }
        return false;

    }

    /**
     * Return pawn seen.
     *
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean returnPawnSeen(int i) {
        switch (i) {

            case 9:
                return this.blackPawns[0].returnMyseen();
            case 10:
                return this.blackPawns[1].returnMyseen();
            case 11:
                return this.blackPawns[2].returnMyseen();
            case 12:
                return this.blackPawns[3].returnMyseen();
            case 13:
                return this.blackPawns[4].returnMyseen();
            case 14:
                return this.blackPawns[5].returnMyseen();
            case 15:
                return this.blackPawns[6].returnMyseen();
            case 16:
                return this.blackPawns[7].returnMyseen();
            default:
                break;
        }
        return false;
    }

    /**
     * Check the way.
     *
     * @param newP
     *            the new P
     * @param postionFromOthers
     *            the postion from others
     * @param i
     *            the i
     * @return true, if successful
     */
    // do you know da way?
    public boolean checkTheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {
            case 1:
                return this.blackRook1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 2:
                return this.blackRook2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 5:
                return this.blackBishop1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 6:
                return this.blackBishop2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 7:
                return this.blackQueen.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 9:
                return this.blackPawns[0].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 10:
                return this.blackPawns[1].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 11:
                return this.blackPawns[2].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 12:
                return this.blackPawns[3].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 13:
                return this.blackPawns[4].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 14:
                return this.blackPawns[5].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 15:
                return this.blackPawns[6].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 16: {
                return this.blackPawns[7].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            }
            default:
                break;

        }
        return false;
    }

    /**
     * Check king.
     *
     * @param newkingcheck
     *            the newkingcheck
     */
    public void checkKing(boolean newkingcheck) {
        this.kingischeck = newkingcheck;
    }

    /**
     * Check king.
     *
     * @param p1
     *            the p 1
     * @param p2
     *            the p 2
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean checkKing(Point p1, Point p2, int i) {
        switch (i) {

            case 1:
                return this.blackRook1.checkKing(p1.x, p1.y, p2);
            case 2:
                return this.blackRook2.checkKing(p1.x, p1.y, p2);
            case 3:
                return this.blackKnight1.canMove(p1.x, p1.y);
            case 4:
                return this.blackKnight2.canMove(p1.x, p1.y);
            case 5:
                return this.blackBishop1.checkKing(p1.x, p1.y, p2);
            case 6:
                return this.blackBishop2.checkKing(p1.x, p1.y, p2);
            case 7:
                return this.blackQueen.checkKing(p1.x, p1.y, p2);

            case 9:
                return this.blackPawns[0].canMove(p1.x, p1.y, this.color);
            case 10:
                return this.blackPawns[1].canMove(p1.x, p1.y, this.color);
            case 11:
                return this.blackPawns[2].canMove(p1.x, p1.y, this.color);
            case 12:
                return this.blackPawns[3].canMove(p1.x, p1.y, this.color);
            case 13:
                return this.blackPawns[4].canMove(p1.x, p1.y, this.color);
            case 14:
                return this.blackPawns[5].canMove(p1.x, p1.y, this.color);
            case 15:
                return this.blackPawns[6].canMove(p1.x, p1.y, this.color);
            case 16:
                return this.blackPawns[7].canMove(p1.x, p1.y, this.color);
            default:
                break;
        }
        return false;
    }

    /**
     * Return chosen.
     *
     * @return the int
     */
    public int returnChosen() {
        return this.choosenOne;
    }

    /**
     * Sets the in hand.
     *
     * @param i
     *            the new in hand
     */
    public void setInHand(int i) {
        this.inHand = i;
    }

    /**
     * Gets the in hand.
     *
     * @return the in hand
     */
    public int getInHand() {
        return this.inHand;
    }

    /**
     * Can move.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public boolean canMove(int x, int y) {
        return true;
    }

    /**
     * Returncheck king.
     *
     * @return true, if successful
     */
    public boolean returncheckKing() {
        return this.kingischeck;
    }

    /**
     * Checks if is king checked.
     *
     * @param white
     *            the white
     * @return true, if is king checked
     */
    public boolean isKingChecked(Player1 white) {

        Point myKingPosition = this.blackKing.returnPostion();
        boolean flag = false;

        ////////// Start Checking the King ////////////
        for (int i = 17; i < 33; i++) {
            if (i < 25) {
                if (white.checkMove(myKingPosition, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (white.checkTheWay(myKingPosition, this.returnPostion(j), i)) {
                                // Means there is somting in the Way so can't move'

                                flag = false;

                            }
                        } // else {
                        //
                        // if (j != 8) {
                        // if (white.checkTheWay(myKingPosition, white.returnPostion(j), i)) {
                        //
                        // flag = false;
                        // // Means there is somting in the Way so can't move'
                        //
                        // }
                        // }
                        //
                        // }

                    }

                    if (flag) {
                        break;
                    }

                }
            } else {
                // For pawns
                if (white.pawnSeen(i, myKingPosition)) {

                    break;

                }
            }
            // if(stillIn_Check){ return true;}//Here Means White king is in check !!!
            if (i == 32) {

                return false;
            }
        }

        return true;
    }

    /**
     * Check mate game over.
     *
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean checkMateGameOver(Player1 enemy) {

        if (!this.generateKingMoves(enemy)) {

            this.inHand = -1;
            System.out.println("I Killed King  2");

            return false;
        } else if (!this.generateCastleMoves(enemy, this.blackRook1)) {

            this.inHand = -1;
            System.out.println("I Killed Rook 2");

            return false;
        } else if (!this.generateCastleMoves(enemy, this.blackRook2)) {

            this.inHand = -1;
            System.out.println("I Killed Rook 2");
            return false;
        } else if (!this.generateBishopMoves(enemy, this.blackBishop1)) {

            this.inHand = -1;
            System.out.println("I Killed Bishop2");
            return false;
        } else if (!this.generateBishopMoves(enemy, this.blackBishop2)) {

            this.inHand = -1;
            System.out.println("I Killed Bishop2");

            return false;
        } else if (!this.generateKnightMoves(enemy, this.blackKnight1)) {

            this.inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!this.generateKnightMoves(enemy, this.blackKnight2)) {

            this.inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!this.generateQueenMoves(enemy)) {

            this.inHand = -1;
            System.out.println("I Killed Queen 2");
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            this.inHand = 9 + i;
            if (!this.generatePawnMoves(enemy, this.blackPawns[i])) {

                this.inHand = -1;

                System.out.println("I Killed Solider 2");

                return false;
            }
        }

        this.inHand = -1;
        return true;

    }

    /**
     * Friendly piece already there.
     *
     * @param newP
     *            the new P
     * @return true, if successful
     */
    public boolean friendlyPieceAlreadyThere(Point newP) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            // There is no need to check the inHand pice
            if (this.getInHand() != i) {

                // Check if there is White Pices in the new Point
                // If so we Can't move (Same color)!!

                samePostion = this.returnPostion(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {

                    return false;

                }
            }
        }

        return true;
    }

    /**
     * Enemy piece already there.
     *
     * @param newP
     *            the new P
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean enemyPieceAlreadyThere(Point newP, Player1 enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {

            // Check if there is White Pices in the new Point
            // If so we Can't move (Same color)!!

            samePostion = enemy.returnPostion(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return false;

            }

        }

        return true;
    }

    /**
     * Gets the enemy piece there int.
     *
     * @param newP
     *            the new P
     * @param enemy
     *            the enemy
     * @return the enemy piece there int
     */
    public int getEnemyPieceThereInt(Point newP, Player1 enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
            samePostion = enemy.returnPostion(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Generate king moves.
     *
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean generateKingMoves(Player1 enemy) {
        boolean killedSomething = false;
        Point oldP = new Point();

        Point checkPlace = new Point();
        this.inHand = 8;

        int x = this.blackKing.returnX();
        int y = this.blackKing.returnY();

        oldP.x = x;
        oldP.y = y;

        if (x + 1 <= 8) {

            this.blackKing.setX(x + 1);
            this.blackKing.setY(y);
            checkPlace.x = x + 1;
            checkPlace.y = y;

            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8) {

            this.blackKing.setX(x);
            this.blackKing.setY(y + 1);
            checkPlace.x = x;
            checkPlace.y = y + 1;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    return false;

                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        if (y - 1 > 0) {

            this.blackKing.setX(x);
            this.blackKing.setY(y - 1);

            checkPlace.x = x;
            checkPlace.y = y - 1;

            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }

            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }

                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (x - 1 > 0) {

            this.blackKing.setX(x - 1);
            this.blackKing.setY(y);

            checkPlace.x = x - 1;
            checkPlace.y = y;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    this.blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            this.blackKing.setX(x - 1);
            this.blackKing.setY(y - 1);

            checkPlace.x = x - 1;
            checkPlace.y = y - 1;

            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    this.blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            this.blackKing.setX(x + 1);
            this.blackKing.setY(y + 1);

            checkPlace.x = x + 1;
            checkPlace.y = y + 1;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    this.blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            this.blackKing.setX(x + 1);
            this.blackKing.setY(y - 1);

            checkPlace.x = x + 1;
            checkPlace.y = y - 1;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    this.blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            this.blackKing.setX(x - 1);
            this.blackKing.setY(y + 1);

            checkPlace.x = x - 1;
            checkPlace.y = y + 1;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    this.blackKing.setPoint(oldP);
                    return false;
                }
            }

        }

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        this.blackKing.setPoint(oldP);
        return true;

    }

    /**
     * Generate castle moves.
     *
     * @param enemy
     *            the enemy
     * @param blackRook
     *            the black rook
     * @return true, if successful
     */
    public boolean generateCastleMoves(Player1 enemy, Rook blackRook) {
        boolean killedSomething = false;
        Point oldPoint1 = new Point();

        Point checkPlace = new Point();
        int x1 = blackRook.returnX();
        int y1 = blackRook.returnY();

        if (blackRook == this.blackRook1) {
            this.inHand = 1;
        } else {
            this.inHand = 2;
        }
        /////////////////////

        oldPoint1.x = x1;
        oldPoint1.y = y1;

        checkPlace.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {

                blackRook.setX(i);
                checkPlace.x = i;

                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }

                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            blackRook.setX(oldPoint1.x);
                            blackRook.setY(oldPoint1.y);

                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            blackRook.setX(oldPoint1.x);
            checkPlace.x = oldPoint1.x;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            for (int i = 1; i <= 8; i++) {
                blackRook.setY(i);
                checkPlace.y = i;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            blackRook.setX(oldPoint1.x);
                            blackRook.setY(oldPoint1.y);

                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            blackRook.setY(oldPoint1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        blackRook.setX(oldPoint1.x);
        blackRook.setY(oldPoint1.y);
        return true;
    }

    /**
     * Generate bishop moves.
     *
     * @param enemy
     *            the enemy
     * @param blackBishop
     *            the black bishop
     * @return true, if successful
     */
    public boolean generateBishopMoves(Player1 enemy, Bishop blackBishop) {
        boolean killedSomething = false;
        Point oldPoint1 = new Point();
        Point checkPlace = new Point();

        oldPoint1 = blackBishop.returnPostion();

        if (blackBishop == this.blackBishop1) {
            this.inHand = 5;
        } else {
            this.inHand = 6;
        }

        if (oldPoint1.x != 20) {
            for (int x = oldPoint1.x, y = oldPoint1.y; x >= 1 && y <= 8; x--, y++) {

                blackBishop.setX(x);
                blackBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {

                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            blackBishop.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            for (int x = oldPoint1.x, y = oldPoint1.y; y >= 1 && x <= 8; x++, y--) {

                blackBishop.setX(x);
                blackBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            blackBishop.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            blackBishop.setPoint(oldPoint1);

        }

        blackBishop.setPoint(oldPoint1);

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        return true;
    }

    /**
     * Generate knight moves.
     *
     * @param enemy
     *            the enemy
     * @param blackKnight
     *            the black knight
     * @return true, if successful
     */
    public boolean generateKnightMoves(Player1 enemy, Knight blackKnight) {
        Point oldp1 = new Point();
        boolean killedSomething = false;
        oldp1 = blackKnight.returnPostion();

        Point checkPlace = new Point();

        if (blackKnight == this.blackKnight1) {
            this.inHand = 3;
        } else {
            this.inHand = 4;
        }

        int x = oldp1.x;
        int y = oldp1.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                blackKnight.setX(x + 1);
                blackKnight.setY(y + 2);
                checkPlace.x = x + 1;
                checkPlace.y = y + 2;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        blackKnight.setPoint(oldp1);

                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }

                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x + 1 <= 8 && y - 2 >= 1) {
                blackKnight.setX(x + 1);
                blackKnight.setY(y - 2);
                checkPlace.x = x + 1;
                checkPlace.y = y - 2;
                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                blackKnight.setX(x + 2);
                blackKnight.setY(y + 1);
                checkPlace.x = x + 2;
                checkPlace.y = y + 1;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                blackKnight.setX(x + 2);
                blackKnight.setY(y - 1);
                checkPlace.x = x + 2;
                checkPlace.y = y - 1;
                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                blackKnight.setX(x - 1);
                blackKnight.setY(y + 2);
                checkPlace.x = x - 1;
                checkPlace.y = y + 2;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                blackKnight.setX(x - 1);
                blackKnight.setY(y - 2);
                checkPlace.x = x - 1;
                checkPlace.y = y - 2;
                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                blackKnight.setX(x - 2);
                blackKnight.setY(y + 1);
                checkPlace.x = x - 2;
                checkPlace.y = y + 1;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }
                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                blackKnight.setX(x - 2);
                blackKnight.setY(y - 1);
                checkPlace.x = x - 2;
                checkPlace.y = y - 1;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(this.other, this.killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

        }
        blackKnight.setPoint(oldp1);

        return true;
    }

    /**
     * Generate queen moves.
     *
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean generateQueenMoves(Player1 enemy) {
        boolean killedSomething = false;

        Point oldPoint1 = new Point();

        oldPoint1 = this.blackQueen.returnPostion();

        Point checkPlace = new Point();

        this.inHand = 7;

        if (oldPoint1.x != 20) {
            for (int x = oldPoint1.x, y = oldPoint1.y; x >= 1 && y <= 8; x--, y++) {

                this.blackQueen.setX(x);
                this.blackQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }

                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.blackQueen.setPoint(oldPoint1);

                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            for (int x = oldPoint1.x, y = oldPoint1.y; y >= 1 && x <= 8; x++, y--) {

                this.blackQueen.setX(x);
                this.blackQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.blackQueen.setPoint(oldPoint1);
                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            this.blackQueen.setPoint(oldPoint1);
            checkPlace.x = oldPoint1.x;
            checkPlace.y = oldPoint1.y;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                this.blackQueen.setX(i);

                checkPlace.x = i;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.blackQueen.setX(oldPoint1.x);
                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            this.blackQueen.setX(oldPoint1.x);
            checkPlace.x = oldPoint1.x;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                this.blackQueen.setY(i);
                checkPlace.y = i;
                if (this.checkWayToPosition(enemy, oldPoint1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.blackQueen.setY(oldPoint1.y);
                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            this.blackQueen.setY(oldPoint1.y);
        }

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        return true;

    }

    /**
     * Generate pawn moves.
     *
     * @param enemy
     *            the enemy
     * @param myPawn
     *            the my pawn
     * @return true, if successful
     */
    public boolean generatePawnMoves(Player1 enemy, Pawn myPawn) {
        Point oldPoint1 = new Point();
        oldPoint1 = myPawn.returnPostion();
        Point checkPlace = new Point();
        checkPlace.x = oldPoint1.x;
        checkPlace.y = oldPoint1.y;

        if (oldPoint1.x != 20) {
            if (myPawn.canMove(oldPoint1.x, oldPoint1.y + 2, this.color) && oldPoint1.y + 2 >= 1) {
                myPawn.setY(oldPoint1.y + 2);

                checkPlace.y = oldPoint1.y + 2;

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (this.enemyPieceAlreadyThere(checkPlace, enemy)) {
                        if (!this.isKingChecked(enemy)) {

                            myPawn.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

            }
            if (myPawn.canMove(oldPoint1.x, oldPoint1.y + 1, this.color) && oldPoint1.y + 1 >= 1) {
                myPawn.setY(oldPoint1.y + 1);
                checkPlace.y = oldPoint1.y + 1;

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (this.enemyPieceAlreadyThere(checkPlace, enemy)) {
                        if (!this.isKingChecked(enemy)) {
                            myPawn.setPoint(oldPoint1);

                            return false;
                        }
                    }
                }
            }

            if (this.enemyPieceAlreadyThere(new Point(oldPoint1.x - 1, oldPoint1.y + 1), enemy)) {
                if (this.killToProtectKing(enemy, new Point(oldPoint1.x - 1, oldPoint1.y + 1))) {

                    if (!this.isKingChecked(enemy)) {
                        enemy.changePostion(this.other, this.killToProtect);
                        myPawn.setPoint(oldPoint1);

                        return false;
                    }
                    enemy.changePostion(this.other, this.killToProtect);
                }
            }

            if (!this.enemyPieceAlreadyThere(new Point(oldPoint1.x + 1, oldPoint1.y + 1), enemy)) {
                if (this.killToProtectKing(enemy, new Point(oldPoint1.x + 1, oldPoint1.y + 1))) {
                    if (!this.isKingChecked(enemy)) {
                        enemy.changePostion(this.other, this.killToProtect);
                        myPawn.setPoint(oldPoint1);

                        return false;
                    }
                    enemy.changePostion(this.other, this.killToProtect);

                }
            }

        }

        myPawn.setPoint(oldPoint1);
        return true;
    }

    /**
     * Check way to position.
     *
     * @param enemy
     *            the enemy
     * @param newP
     *            the new P
     * @return true, if successful
     */
    public boolean checkWayToPosition(Player1 enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            // check if there are pieces in the way.
            if (this.inHand != i) {
                if (i < 17) {
                    // Means there is something in the way so it can't move.
                    flag = this.checkTheWay(newP, enemy.returnPostion(i), this.inHand);
                } else {
                    flag = this.checkTheWay(newP, this.returnPostion(i), this.inHand);
                }
                if (flag == true) {
                    return false;
                } // Means there is a Pice in the Way
            }
        }
        return true;

    }

    /**
     * Kill to protect king.
     *
     * @param enemy
     *            the enemy
     * @param newP
     *            the new P
     * @return true, if successful
     */
    public boolean killToProtectKing(Player1 enemy, Point newP) {

        for (int i = 17; i <= 32; i++) {

            this.other = enemy.returnPostion(i);
            if (this.other.x == newP.x && this.other.y == newP.y) {
                this.killToProtect = i;

                enemy.killedPiece(i);
                return true;
            }
        }

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Enumeration#hasMoreElements()
     */
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Enumeration#nextElement()
     */
    @Override
    public Object nextElement() {

        return new Object();
    }

    /**
     * tells user about last move. Previously named "Tell_Me_About_Last_Move"*
     *
     * @return the string
     */
    public String lastMove() {
        switch (this.inHand) {
            case 1:
                return this.blackRook1.tellMe();
            case 2:
                return this.blackRook2.tellMe();
            case 3:
                return this.blackKnight1.tellMe();
            case 4:
                return this.blackKnight2.tellMe();
            case 5:
                return this.blackBishop1.tellMe();
            case 6:
                return this.blackBishop2.tellMe();
            case 7:
                return this.blackQueen.tellMe();
            case 8:
                return this.blackKing.tellMe();
            case 9:
                return this.blackPawns[0].tellMe();
            case 10:
                return this.blackPawns[1].tellMe();
            case 11:
                return this.blackPawns[2].tellMe();
            case 12:
                return this.blackPawns[3].tellMe();
            case 13:
                return this.blackPawns[4].tellMe();
            case 14:
                return this.blackPawns[5].tellMe();
            case 15:
                return this.blackPawns[6].tellMe();
            case 16:
                return this.blackPawns[7].tellMe();
            default:
                break;
        }
        return null;
    }

}
