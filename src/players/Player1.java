
package players;

import java.awt.Image;
import java.awt.Point;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

/**
 * The Class Player1.
 */
public class Player1 {

    /** Creates a new instance of Player1. */
    public Rook whiteRook1;

    /** The white rook 2. */
    public Rook whiteRook2;

    /** The white knight 1. */
    public Knight whiteKnight1;

    /** The white knight 2. */
    public Knight whiteKnight2;

    /** The white queen. */
    public Queen whiteQueen;

    /** The white bishop 1. */
    public Bishop whiteBishop1;

    /** The white bishop 2. */
    public Bishop whiteBishop2;

    /** The white pawns. */
    public Pawn[] whitePawns = new Pawn[8];

    /** The white king. */
    public King whiteKing;

    /** The in hand. */
    private int inHand = -1;

    /** The kingischeck. */
    private boolean kingischeck = false;

    /** The choosen one. */
    private int choosenOne;

    /** The color. */
    String color = "white";

    /** The other. */
    private Point other;

    /** The kill to protect. */
    int killToProtect;

    /** constructs Player1 pieces. **/
    public Player1() {
        String fileSeparator = System.getProperty("file.separator");
        this.whiteRook1 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteRook.png", 8, 8);
        this.whiteRook2 = new Rook("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteRook.png", 1, 8);
        this.whiteKnight1 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 2, 8);
        this.whiteKnight2 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 7, 8);
        this.whiteBishop1 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteBishop.png", 3, 8);
        this.whiteBishop2 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteBishop.png", 6, 8);
        this.whiteQueen = new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteQueen.png", 4, 8);
        this.whiteKing = new King("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteKing.png", 5, 8);
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            this.whitePawns[i] = new Pawn("src" + fileSeparator + "Icons" + fileSeparator
                    + "Player1Icons" + fileSeparator + "WhitePawn.png", j, 7);
        }
    }

    /**
     * returns position of each piece wrapped all in a switch case. *
     *
     * @param i
     *            the i
     * @return the point
     */
    public Point returnPostion(int i) {

        switch (i) {

            case 17:
                return this.whiteRook1.returnPostion();
            case 18:
                return this.whiteRook2.returnPostion();
            case 19:
                return this.whiteKnight1.returnPostion();
            case 20:
                return this.whiteKnight2.returnPostion();
            case 21:
                return this.whiteBishop1.returnPostion();
            case 22:
                return this.whiteBishop2.returnPostion();
            case 23:
                return this.whiteQueen.returnPostion();
            case 24:
                return this.whiteKing.returnPostion();
            case 25:
                return this.whitePawns[0].returnPostion();
            case 26:
                return this.whitePawns[1].returnPostion();
            case 27:
                return this.whitePawns[2].returnPostion();
            case 28:
                return this.whitePawns[3].returnPostion();
            case 29:
                return this.whitePawns[4].returnPostion();
            case 30:
                return this.whitePawns[5].returnPostion();
            case 31:
                return this.whitePawns[6].returnPostion();
            case 32:
                return this.whitePawns[7].returnPostion();
            default:
                break;
        }
        return new Point(-1, -1);
    }

    /**
     * returns position of each old piece wrapped all in a switch case. *
     *
     * @param i
     *            the i
     * @return the point
     */
    public Point returnOldPostion(int i) {

        switch (i) {

            case 17:
                return this.whiteRook1.returnOld();
            case 18:
                return this.whiteRook2.returnOld();
            case 19:
                return this.whiteKnight1.returnOld();
            case 20:
                return this.whiteKnight2.returnOld();
            case 21:
                return this.whiteBishop1.returnOld();
            case 22:
                return this.whiteBishop2.returnOld();
            case 23:
                return this.whiteQueen.returnOld();
            case 24:
                return this.whiteKing.returnOld();
            case 25:
                return this.whitePawns[0].returnOld();
            case 26:
                return this.whitePawns[1].returnOld();
            case 27:
                return this.whitePawns[2].returnOld();
            case 28:
                return this.whitePawns[3].returnOld();
            case 29:
                return this.whitePawns[4].returnOld();
            case 30:
                return this.whitePawns[5].returnOld();
            case 31:
                return this.whitePawns[6].returnOld();
            case 32:
                return this.whitePawns[7].returnOld();
            default:
                break;
        }
        return new Point(-1, -1);
    }

    /**
     * returns position of each image wrapped all in a switch case. *
     *
     * @param i
     *            the i
     * @return the image
     */
    public Image returnIconImage(int i) {

        switch (i) {

            case 17:
                return this.whiteRook1.returnPieceImage();
            case 18:
                return this.whiteRook2.returnPieceImage();
            case 19:
                return this.whiteKnight1.returnPieceImage();
            case 20:
                return this.whiteKnight2.returnPieceImage();
            case 21:
                return this.whiteBishop1.returnPieceImage();
            case 22:
                return this.whiteBishop2.returnPieceImage();
            case 23:
                return this.whiteQueen.returnPieceImage();
            case 24:
                return this.whiteKing.returnPieceImage();
            case 25:
                return this.whitePawns[0].returnPieceImage();
            case 26:
                return this.whitePawns[1].returnPieceImage();
            case 27:
                return this.whitePawns[2].returnPieceImage();
            case 28:
                return this.whitePawns[3].returnPieceImage();
            case 29:
                return this.whitePawns[4].returnPieceImage();
            case 30:
                return this.whitePawns[5].returnPieceImage();
            case 31:
                return this.whitePawns[6].returnPieceImage();
            case 32:
                return this.whitePawns[7].returnPieceImage();
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

            case 17:
                this.whiteRook1.setPoint(newPoint);
                break;
            case 18:
                this.whiteRook2.setPoint(newPoint);
                break;
            case 19:
                this.whiteKnight1.setPoint(newPoint);
                break;
            case 20:
                this.whiteKnight2.setPoint(newPoint);
                break;
            case 21:
                this.whiteBishop1.setPoint(newPoint);
                break;
            case 22:
                this.whiteBishop2.setPoint(newPoint);
                break;
            case 23:
                this.whiteQueen.setPoint(newPoint);
                break;
            case 24:
                this.whiteKing.setPoint(newPoint);
                break;
            case 25:
                this.whitePawns[0].setPoint(newPoint);
                break;
            case 26:
                this.whitePawns[1].setPoint(newPoint);
                break;
            case 27:
                this.whitePawns[2].setPoint(newPoint);
                break;
            case 28:
                this.whitePawns[3].setPoint(newPoint);
                break;
            case 29:
                this.whitePawns[4].setPoint(newPoint);
                break;
            case 30:
                this.whitePawns[5].setPoint(newPoint);
                break;
            case 31:
                this.whitePawns[6].setPoint(newPoint);
                break;
            case 32:
                this.whitePawns[7].setPoint(newPoint);
                break;
            default:
                break;
        }

    }

    /**
     * Change position to old.
     *
     * @param newPoint
     *            the new point
     * @param i
     *            the i
     */
    public void changePostionToOld(Point newPoint, int i) {
        switch (i) {

            case 17:
                this.whiteRook1.toOld(newPoint);
                break;
            case 18:
                this.whiteRook2.toOld(newPoint);
                break;
            case 19:
                this.whiteKnight1.toOld(newPoint);
                break;
            case 20:
                this.whiteKnight2.toOld(newPoint);
                break;
            case 21:
                this.whiteBishop1.toOld(newPoint);
                break;
            case 22:
                this.whiteBishop2.toOld(newPoint);
                break;
            case 23:
                this.whiteQueen.toOld(newPoint);
                break;
            case 24:
                this.whiteKing.toOld(newPoint);
                break;
            case 25:
                this.whitePawns[0].toOld(newPoint);
                break;
            case 26:
                this.whitePawns[1].toOld(newPoint);
                break;
            case 27:
                this.whitePawns[2].toOld(newPoint);
                break;
            case 28:
                this.whitePawns[3].toOld(newPoint);
                break;
            case 29:
                this.whitePawns[4].toOld(newPoint);
                break;
            case 30:
                this.whitePawns[5].toOld(newPoint);
                break;
            case 31:
                this.whitePawns[6].toOld(newPoint);
                break;
            case 32:
                this.whitePawns[7].toOld(newPoint);
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

            case 17:
                this.whiteRook1.setPixels(newPixelX, newPixelY);
                break;
            case 18:
                this.whiteRook2.setPixels(newPixelX, newPixelY);
                break;
            case 19:
                this.whiteKnight1.setPixels(newPixelX, newPixelY);
                break;
            case 20:
                this.whiteKnight2.setPixels(newPixelX, newPixelY);
                break;
            case 21:
                this.whiteBishop1.setPixels(newPixelX, newPixelY);
                break;
            case 22:
                this.whiteBishop2.setPixels(newPixelX, newPixelY);
                break;
            case 23:
                this.whiteQueen.setPixels(newPixelX, newPixelY);
                break;
            case 24:
                this.whiteKing.setPixels(newPixelX, newPixelY);
                break;
            case 25:
                this.whitePawns[0].setPixels(newPixelX, newPixelY);
                break;
            case 26:
                this.whitePawns[1].setPixels(newPixelX, newPixelY);
                break;
            case 27:
                this.whitePawns[2].setPixels(newPixelX, newPixelY);
                break;
            case 28:
                this.whitePawns[3].setPixels(newPixelX, newPixelY);
                break;
            case 29:
                this.whitePawns[4].setPixels(newPixelX, newPixelY);
                break;
            case 30:
                this.whitePawns[5].setPixels(newPixelX, newPixelY);
                break;
            case 31:
                this.whitePawns[6].setPixels(newPixelX, newPixelY);
                break;
            case 32:
                this.whitePawns[7].setPixels(newPixelX, newPixelY);
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

            case 17:
                return this.whiteRook1.getpixelPoint();
            case 18:
                return this.whiteRook2.getpixelPoint();
            case 19:
                return this.whiteKnight1.getpixelPoint();
            case 20:
                return this.whiteKnight2.getpixelPoint();
            case 21:
                return this.whiteBishop1.getpixelPoint();
            case 22:
                return this.whiteBishop2.getpixelPoint();
            case 23:
                return this.whiteQueen.getpixelPoint();
            case 24:
                return this.whiteKing.getpixelPoint();
            case 25:
                return this.whitePawns[0].getpixelPoint();
            case 26:
                return this.whitePawns[1].getpixelPoint();
            case 27:
                return this.whitePawns[2].getpixelPoint();
            case 28:
                return this.whitePawns[3].getpixelPoint();
            case 29:
                return this.whitePawns[4].getpixelPoint();
            case 30:
                return this.whitePawns[5].getpixelPoint();
            case 31:
                return this.whitePawns[6].getpixelPoint();
            case 32:
                return this.whitePawns[7].getpixelPoint();
            default:
                break;
        }
        return null;
    }

    /**
     * Check move.
     *
     * @param newP
     *            the new P
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean checkMove(Point newP, int i) {
        this.choosenOne = i;
        switch (this.choosenOne) {

            case 17:
                return this.whiteRook1.canMove(newP.x, newP.y);
            case 18:
                return this.whiteRook2.canMove(newP.x, newP.y);
            case 19:
                return this.whiteKnight1.canMove(newP.x, newP.y);
            case 20:
                return this.whiteKnight2.canMove(newP.x, newP.y);
            case 21:
                return this.whiteBishop1.canMove(newP.x, newP.y);
            case 22:
                return this.whiteBishop2.canMove(newP.x, newP.y);
            case 23:
                return this.whiteQueen.canMove(newP.x, newP.y);
            case 24:
                return this.whiteKing.canMove(newP.x, newP.y);
            case 25:
                return this.whitePawns[0].canMove(newP.x, newP.y, this.color);
            case 26:
                return this.whitePawns[1].canMove(newP.x, newP.y, this.color);
            case 27:
                return this.whitePawns[2].canMove(newP.x, newP.y, this.color);
            case 28:
                return this.whitePawns[3].canMove(newP.x, newP.y, this.color);
            case 29:
                return this.whitePawns[4].canMove(newP.x, newP.y, this.color);
            case 30:
                return this.whitePawns[5].canMove(newP.x, newP.y, this.color);
            case 31:
                return this.whitePawns[6].canMove(newP.x, newP.y, this.color);
            case 32:
                return this.whitePawns[7].canMove(newP.x, newP.y, this.color);
            default:
                break;
        }
        return false;
    }

    /**
     * originally named setSeenToSiliders, so I have no idea what this does. *
     *
     * @param i
     *            the i
     * @param myPoint
     *            the my point
     * @return true, if successful
     */
    public boolean pawnSeen(int i, Point myPoint) {
        switch (i) {
            case 25:
                return this.whitePawns[0].setSeenByChecking(myPoint, "white");
            case 26:
                return this.whitePawns[1].setSeenByChecking(myPoint, "white");
            case 27:
                return this.whitePawns[2].setSeenByChecking(myPoint, "white");
            case 28:
                return this.whitePawns[3].setSeenByChecking(myPoint, "white");
            case 29:
                return this.whitePawns[4].setSeenByChecking(myPoint, "white");
            case 30:
                return this.whitePawns[5].setSeenByChecking(myPoint, "white");
            case 31:
                return this.whitePawns[6].setSeenByChecking(myPoint, "white");
            case 32:
                return this.whitePawns[7].setSeenByChecking(myPoint, "white");
            default:
                break;
        }
        return false;
    }

    /**
     * Return pawn position.
     *
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean returnPawnPosition(int i) {
        switch (i) {
            case 25:
                return this.whitePawns[0].returnMyseen();
            case 26:
                return this.whitePawns[1].returnMyseen();
            case 27:
                return this.whitePawns[2].returnMyseen();
            case 28:
                return this.whitePawns[3].returnMyseen();
            case 29:
                return this.whitePawns[4].returnMyseen();
            case 30:
                return this.whitePawns[5].returnMyseen();
            case 31:
                return this.whitePawns[6].returnMyseen();
            case 32:
                return this.whitePawns[7].returnMyseen();
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
    public boolean checkTheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {

            case 17:
                return this.whiteRook1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 18:
                return this.whiteRook2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 21:
                return this.whiteBishop1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 22:
                return this.whiteBishop2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 23:
                return this.whiteQueen.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 25:
                return this.whitePawns[0].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 26:
                return this.whitePawns[1].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 27:
                return this.whitePawns[2].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 28:
                return this.whitePawns[3].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 29:
                return this.whitePawns[4].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 30:
                return this.whitePawns[5].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 31:
                return this.whitePawns[6].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            case 32:
                return this.whitePawns[7].pieceInMyWay(newP.x, newP.y, postionFromOthers,
                        this.color);
            default:
                break;

        }
        return false;
    }

    /**
     * Killed piece.
     *
     * @param i
     *            the i
     * @return true, if successful
     */
    public boolean killedPiece(int i) {
        Point out = new Point(13, 13);
        switch (i) {

            case 17:
                this.whiteRook1.setPoint(out);
                return true;
            case 18:
                this.whiteRook2.setPoint(out);
                return true;
            case 19:
                this.whiteKnight1.setPoint(out);
                return true;
            case 20:
                this.whiteKnight2.setPoint(out);
                return true;
            case 21:
                this.whiteBishop1.setPoint(out);
                return true;
            case 22:
                this.whiteBishop2.setPoint(out);
                return true;
            case 23:
                this.whiteQueen.setPoint(out);
                return true;
            case 24:
                return false;
            case 25:
                this.whitePawns[0].setPoint(out);
                return true;
            case 26:
                this.whitePawns[1].setPoint(out);
                return true;
            case 27:
                this.whitePawns[2].setPoint(out);
                return true;
            case 28:
                this.whitePawns[3].setPoint(out);
                return true;
            case 29:
                this.whitePawns[4].setPoint(out);
                return true;
            case 30:
                this.whitePawns[5].setPoint(out);
                return true;
            case 31:
                this.whitePawns[6].setPoint(out);
                return true;
            case 32:
                this.whitePawns[7].setPoint(out);
                return true;
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

            case 17:
                return this.whiteRook1.checkKing(p1.x, p1.y, p2);
            case 18:
                return this.whiteRook2.checkKing(p1.x, p1.y, p2);
            case 19:
                return this.whiteKnight1.canMove(p1.x, p1.y);
            case 20:
                return this.whiteKnight2.canMove(p1.x, p1.y);
            case 21:
                return this.whiteBishop1.checkKing(p1.x, p1.y, p2);
            case 22:
                return this.whiteBishop2.checkKing(p1.x, p1.y, p2);
            case 23:
                return this.whiteQueen.checkKing(p1.x, p1.y, p2);

            case 25:
                return this.whitePawns[0].canMove(p1.x, p1.y, this.color);
            case 26:
                return this.whitePawns[1].canMove(p1.x, p1.y, this.color);
            case 27:
                return this.whitePawns[2].canMove(p1.x, p1.y, this.color);
            case 28:
                return this.whitePawns[3].canMove(p1.x, p1.y, this.color);
            case 29:
                return this.whitePawns[4].canMove(p1.x, p1.y, this.color);
            case 30:
                return this.whitePawns[5].canMove(p1.x, p1.y, this.color);
            case 31:
                return this.whitePawns[6].canMove(p1.x, p1.y, this.color);
            case 32:
                return this.whitePawns[7].canMove(p1.x, p1.y, this.color);
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
     * King in check.
     *
     * @param black
     *            the black
     * @return true, if successful
     */
    public boolean kingInCheck(Player2 black) {
        // boolean isCheckmate = false;
        // boolean flag = false;

        return false;
    }

    /**
     * Check mate.
     *
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean checkMate(Player2 enemy) {

        if (!this.generateKingMoves(enemy)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateCastleMoves(enemy, this.whiteRook1)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateCastleMoves(enemy, this.whiteRook2)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateBishopMoves(enemy, this.whiteBishop1)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateBishopMoves(enemy, this.whiteBishop2)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateHorseMoves(enemy, this.whiteKnight1)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateHorseMoves(enemy, this.whiteKnight2)) {

            this.inHand = -1;
            return false;
        } else if (!this.generateMoves(enemy)) {

            this.inHand = -1;
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            this.inHand = 25 + i;
            if (!this.generatePawnMoves(enemy, this.whitePawns[i])) {

                this.inHand = -1;
                System.out.println("I Killed Solider 1");
                return false;
            }
        }

        this.inHand = -1;
        return true;

    }

    /**
     * Checks if is king checked.
     *
     * @param black
     *            the black
     * @return true, if is king checked
     */
    public boolean isKingChecked(Player2 black) {

        Point myKingPosition = this.whiteKing.returnPostion();
        boolean flag = false;

        ////////// Start Checking the King ////////////
        for (int i = 1; i < 17; i++) {
            if (i < 9) {
                if (black.checkTheMove(myKingPosition, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (black.checkTheWay(myKingPosition, black.returnPostion(j), i)) {
                                // Means there is something in the Way so can't move
                                flag = false;
                            }
                        } else {
                            if (j != 24) {
                                if (black.checkTheWay(myKingPosition, this.returnPostion(j), i)) {

                                    flag = false;
                                    // Means there is something in the Way so can't move'

                                }
                            }

                        }

                    }

                    if (flag) {

                        break;
                    }

                }
            } else {
                // For pawns
                if (black.pawnSeen(i, myKingPosition)) {

                    break;

                }
            }
            // if(stillIn_Check){ return true;}//Here Means White king is in check !!!
            if (i == 16) {

                return false;
            }
        }

        return true;
    }

    /**
     * Friendly piece already there.
     *
     * @param newP
     *            the new P
     * @return true, if successful
     */
    // TODO: combine friendlyPiece and enemyPiece together?
    public boolean friendlyPieceAlreadyThere(Point newP) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
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
    public boolean enemyPieceAlreadyThere(Point newP, Player2 enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            samePostion = enemy.returnPostion(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return false;

            }
        }

        return true;
    }

    /**
     * Gets the enemy piece location int.
     *
     * @param newP
     *            the new P
     * @param enemy
     *            the enemy
     * @return the enemy piece location int
     */
    // TODO: why does this return int?
    public int getEnemyPieceLocationInt(Point newP, Player2 enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
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
    public boolean generateKingMoves(Player2 enemy) {
        boolean killedSomething = false;
        Point oldP = new Point();

        Point checkPlace = new Point();
        this.inHand = 24;

        int x = this.whiteKing.returnX();
        int y = this.whiteKing.returnY();
        oldP.x = x;
        oldP.y = y;

        if (x + 1 <= 8) {

            this.whiteKing.setX(x + 1);
            this.whiteKing.setY(y);
            checkPlace.x = x + 1;
            checkPlace.y = y;

            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.whiteKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8) {

            this.whiteKing.setX(x);
            this.whiteKing.setY(y + 1);
            checkPlace.x = x;
            checkPlace.y = y + 1;
            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }
            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.whiteKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }
                    return false;

                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        if (y - 1 > 0) {

            this.whiteKing.setX(x);
            this.whiteKing.setY(y - 1);

            checkPlace.x = x;
            checkPlace.y = y - 1;

            if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                killedSomething = true;
            }

            if (this.friendlyPieceAlreadyThere(checkPlace)) {
                if (!this.isKingChecked(enemy)) {

                    this.whiteKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(this.other, this.killToProtect);
                        killedSomething = false;
                    }

                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (x - 1 > 0) {

            this.whiteKing.setX(x - 1);
            this.whiteKing.setY(y);

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
                    this.whiteKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            this.whiteKing.setX(x - 1);
            this.whiteKing.setY(y - 1);

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
                    this.whiteKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            this.whiteKing.setX(x + 1);
            this.whiteKing.setY(y + 1);

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
                    this.whiteKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            this.whiteKing.setX(x + 1);
            this.whiteKing.setY(y - 1);

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
                    this.whiteKing.setPoint(oldP);
                    return false;
                }
            }

        }
        this.whiteKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            this.whiteKing.setX(x - 1);
            this.whiteKing.setY(y + 1);

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
                    this.whiteKing.setPoint(oldP);
                    return false;
                }
            }

        }

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        this.whiteKing.setPoint(oldP);
        return true;

    }

    /**
     * Generate castle moves.
     *
     * @param enemy
     *            the enemy
     * @param whiteRook
     *            the white rook
     * @return true, if successful
     */
    public boolean generateCastleMoves(Player2 enemy, Rook whiteRook) {
        boolean killedSomething = false;
        Point oldp1 = new Point();

        Point checkPlace = new Point();
        int x1 = whiteRook.returnX();
        int y1 = whiteRook.returnY();

        if (whiteRook == this.whiteRook1) {
            this.inHand = 17;
        } else {
            this.inHand = 18;
        }
        /////////////////////

        oldp1.x = x1;
        oldp1.y = y1;

        checkPlace.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {
                whiteRook.setX(i);
                checkPlace.x = i;

                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            whiteRook.setX(oldp1.x);
                            whiteRook.setY(oldp1.y);

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
            whiteRook.setX(oldp1.x);
            checkPlace.x = oldp1.x;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            for (int i = 1; i <= 8; i++) {
                whiteRook.setY(i);
                checkPlace.y = i;
                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            whiteRook.setX(oldp1.x);
                            whiteRook.setY(oldp1.y);

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
            whiteRook.setY(oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }
        whiteRook.setX(oldp1.x);
        whiteRook.setY(oldp1.y);
        return true;
    }

    /**
     * Generate bishop moves.
     *
     * @param enemy
     *            the enemy
     * @param whiteBishop
     *            the white bishop
     * @return true, if successful
     */
    public boolean generateBishopMoves(Player2 enemy, Bishop whiteBishop) {
        boolean killedSomething = false;
        Point oldP1 = new Point();
        Point checkPlace = new Point();

        oldP1 = whiteBishop.returnPostion();

        if (whiteBishop == this.whiteBishop1) {
            this.inHand = 21;
        } else {
            this.inHand = 22;
        }

        if (oldP1.x != 20) {
            for (int x = oldP1.x, y = oldP1.y; x >= 1 && y <= 8; x--, y++) {

                whiteBishop.setX(x);
                whiteBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldP1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {

                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            whiteBishop.setPoint(oldP1);
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
            for (int x = oldP1.x, y = oldP1.y; y >= 1 && x <= 8; x++, y--) {

                whiteBishop.setX(x);
                whiteBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldP1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            if (killedSomething) {
                                enemy.changePostion(this.other, this.killToProtect);
                                killedSomething = false;
                            }
                            whiteBishop.setPoint(oldP1);
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(this.other, this.killToProtect);
                    killedSomething = false;
                }

            }
            whiteBishop.setPoint(oldP1);

        }

        whiteBishop.setPoint(oldP1);

        if (killedSomething) {
            enemy.changePostion(this.other, this.killToProtect);
            killedSomething = false;
        }

        return true;
    }

    /**
     * Generate horse moves.
     *
     * @param enemy
     *            the enemy
     * @param whiteKnight
     *            the white knight
     * @return true, if successful
     */
    public boolean generateHorseMoves(Player2 enemy, Knight whiteKnight) {
        Point oldp1 = new Point();
        boolean killedSomething = false;
        oldp1 = whiteKnight.returnPostion();

        Point checkPlace = new Point();

        if (whiteKnight == this.whiteKnight1) {
            this.inHand = 19;
        } else {
            this.inHand = 20;
        }

        int x = oldp1.x;
        int y = oldp1.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                whiteKnight.setX(x + 1);
                whiteKnight.setY(y + 2);
                checkPlace.x = x + 1;
                checkPlace.y = y + 2;

                if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                    killedSomething = true;
                }

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (!this.isKingChecked(enemy)) {
                        whiteKnight.setPoint(oldp1);

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
                whiteKnight.setX(x + 1);
                whiteKnight.setY(y - 2);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                whiteKnight.setX(x + 2);
                whiteKnight.setY(y + 1);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                whiteKnight.setX(x + 2);
                whiteKnight.setY(y - 1);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                whiteKnight.setX(x - 1);
                whiteKnight.setY(y + 2);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                whiteKnight.setX(x - 1);
                whiteKnight.setY(y - 2);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                whiteKnight.setX(x - 2);
                whiteKnight.setY(y + 1);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                whiteKnight.setX(x - 2);
                whiteKnight.setY(y - 1);
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
                        whiteKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

        }
        whiteKnight.setPoint(oldp1);

        return true;
    }

    /**
     * Generate moves.
     *
     * @param enemy
     *            the enemy
     * @return true, if successful
     */
    public boolean generateMoves(Player2 enemy) {
        boolean killedSomething = false;

        Point oldp1 = new Point();

        oldp1 = this.whiteQueen.returnPostion();

        Point checkPlace = new Point();

        this.inHand = 23;

        if (oldp1.x != 20) {
            for (int x = oldp1.x, y = oldp1.y; x >= 1 && y <= 8; x--, y++) {

                this.whiteQueen.setX(x);
                this.whiteQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }

                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.whiteQueen.setPoint(oldp1);

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
            for (int x = oldp1.x, y = oldp1.y; y >= 1 && x <= 8; x++, y--) {

                this.whiteQueen.setX(x);
                this.whiteQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.whiteQueen.setPoint(oldp1);
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
            this.whiteQueen.setPoint(oldp1);
            checkPlace.x = oldp1.x;
            checkPlace.y = oldp1.y;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                this.whiteQueen.setX(i);

                checkPlace.x = i;
                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.whiteQueen.setX(oldp1.x);
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
            this.whiteQueen.setX(oldp1.x);
            checkPlace.x = oldp1.x;

            if (killedSomething) {
                enemy.changePostion(this.other, this.killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                this.whiteQueen.setY(i);
                checkPlace.y = i;
                if (this.checkWayToPosition(enemy, oldp1)) {
                    if (this.killToProtectKing(enemy, this.returnPostion(this.inHand))) {
                        killedSomething = true;
                    }
                    if (this.friendlyPieceAlreadyThere(checkPlace)) {
                        if (!this.isKingChecked(enemy)) {
                            this.whiteQueen.setY(oldp1.y);
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
            this.whiteQueen.setY(oldp1.y);
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
    public boolean generatePawnMoves(Player2 enemy, Pawn myPawn) {
        Point oldp1 = new Point();
        oldp1 = myPawn.returnPostion();
        Point checkPlace = new Point();
        checkPlace.x = oldp1.x;
        checkPlace.y = oldp1.y;

        if (oldp1.x != 20) {
            if (myPawn.canMove(oldp1.x, oldp1.y - 2, this.color) && oldp1.y - 2 >= 1) {
                myPawn.setY(oldp1.y - 2);

                checkPlace.y = oldp1.y - 1;

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (this.enemyPieceAlreadyThere(checkPlace, enemy)) {
                        if (!this.isKingChecked(enemy)) {

                            myPawn.setPoint(oldp1);
                            return false;
                        }
                    }
                }

            }
            if (myPawn.canMove(oldp1.x, oldp1.y - 1, this.color) && oldp1.y - 1 >= 1) {
                myPawn.setY(oldp1.y - 1);
                checkPlace.y = oldp1.y - 1;

                if (this.friendlyPieceAlreadyThere(checkPlace)) {
                    if (this.enemyPieceAlreadyThere(checkPlace, enemy)) {

                        if (!this.isKingChecked(enemy)) {
                            myPawn.setPoint(oldp1);
                            System.out.println("dff");
                            System.out.println("dff");
                            System.out.println("dff");
                            return false;
                        }
                    }
                }
            }

            if (!this.enemyPieceAlreadyThere(new Point(oldp1.x - 1, oldp1.y - 1), enemy)) {
                if (this.killToProtectKing(enemy, new Point(oldp1.x - 1, oldp1.y - 1))) {

                    if (!this.isKingChecked(enemy)) {
                        enemy.changePostion(this.other, this.killToProtect);
                        myPawn.setPoint(oldp1);

                        return false;
                    }
                    enemy.changePostion(this.other, this.killToProtect);
                }
            }

            if (!this.enemyPieceAlreadyThere(new Point(oldp1.x + 1, oldp1.y - 1), enemy)) {
                if (this.killToProtectKing(enemy, new Point(oldp1.x + 1, oldp1.y - 1))) {
                    if (!this.isKingChecked(enemy)) {
                        enemy.changePostion(this.other, this.killToProtect);
                        myPawn.setPoint(oldp1);

                        return false;
                    }
                    enemy.changePostion(this.other, this.killToProtect);

                }
            }

        }

        myPawn.setPoint(oldp1);
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
    public boolean checkWayToPosition(Player2 enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            // check if there is peices in the WAY
            if (this.inHand != i) {
                if (i < 17) {
                    // Means there is something in the way
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
    public boolean killToProtectKing(Player2 enemy, Point newP) {

        for (int i = 1; i < 17; i++) {

            this.other = enemy.returnPostion(i);
            if (this.other.x == newP.x && this.other.y == newP.y) {
                this.killToProtect = i;

                enemy.killedPiece(i);
                return true;
            }
        }

        return false;
    }

    /**
     * tells user about last move. Previously named "Tell_Me_About_Last_Move"*
     *
     * @return the string
     */
    public String lastMove() {
        switch (this.inHand) {

            case 17:
                return this.whiteRook1.tellMe();
            case 18:
                return this.whiteRook2.tellMe();
            case 19:
                return this.whiteKnight1.tellMe();
            case 20:
                return this.whiteKnight2.tellMe();
            case 21:
                return this.whiteBishop1.tellMe();
            case 22:
                return this.whiteBishop2.tellMe();
            case 23:
                return this.whiteQueen.tellMe();
            case 24:
                return this.whiteKing.tellMe();
            case 25:
                return this.whitePawns[0].tellMe();
            case 26:
                return this.whitePawns[1].tellMe();
            case 27:
                return this.whitePawns[2].tellMe();
            case 28:
                return this.whitePawns[3].tellMe();
            case 29:
                return this.whitePawns[4].tellMe();
            case 30:
                return this.whitePawns[5].tellMe();
            case 31:
                return this.whitePawns[6].tellMe();
            case 32:
                return this.whitePawns[7].tellMe();
            default:
                break;
        }
        return null;
    }
}
