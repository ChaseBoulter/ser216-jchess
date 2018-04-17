
package players;

import java.awt.Image;
import java.awt.Point;
import java.util.Enumeration;
import pieces.*;

public class Player2 implements Enumeration {
    public Rook blackRook1;
    public Rook blackRook2;
    public Knight blackKnight1;
    public Knight blackKnight2;
    public Bishop blackBishop1;
    public Bishop blackBishop2;
    public Queen blackQueen;
    private King blackKing;
    public Pawn[] blackPawns = new Pawn[8];
    private int choosenOne;
    private int inHand = -1;
    private boolean kingischeck = false;
    private Point other;
    private int killToProtect;

    private String color = "black";

    /** Creates a new instance of Player2. */
    public Player2() {
        String fileSeparator = System.getProperty("file.separator");
        blackRook1 = new Rook("src" + fileSeparator + "Icons"
                + fileSeparator + "Player2Icons" + fileSeparator + "blackRook.png", 1, 1);
        
        blackRook2 = new Rook("src" + fileSeparator + "Icons"
                + fileSeparator + "Player2Icons" + fileSeparator + "blackRook.png", 8, 1);
        
        blackKnight1 = new Knight("src" + fileSeparator + "Icons" 
                + fileSeparator + "Player2Icons" + fileSeparator + "blackKnight.png", 2, 1);
        
        blackKnight2 = new Knight("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "blackKnight.png", 7, 1);
        
        blackBishop1 = new Bishop("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "blackBishop.png", 3, 1);
        
        blackBishop2 = new Bishop("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "blackBishop.png", 6, 1);
        
        blackQueen = new Queen("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "blackQueen.png", 4, 1);
        
        blackKing = new King("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "blackKing.png", 5, 1);
        
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            blackPawns[i] = new Pawn("src" + fileSeparator + "Icons"
        + fileSeparator + "Player2Icons" + fileSeparator + "BlackPawn.png", j, 2);
        }
    }

    public void setChoosen(int newChoosen) {
        choosenOne = newChoosen;
    }

    public Point returnPostion(int i) {

        switch (i) {
            case 1:
                return blackRook1.returnPostion();
            case 2:
                return blackRook2.returnPostion();
            case 3:
                return blackKnight1.returnPostion();
            case 4:
                return blackKnight2.returnPostion();
            case 5:
                return blackBishop1.returnPostion();
            case 6:
                return blackBishop2.returnPostion();
            case 7:
                return blackQueen.returnPostion();
            case 8:
                return blackKing.returnPostion();
            case 9:
                return blackPawns[0].returnPostion();
            case 10:
                return blackPawns[1].returnPostion();
            case 11:
                return blackPawns[2].returnPostion();
            case 12:
                return blackPawns[3].returnPostion();
            case 13:
                return blackPawns[4].returnPostion();
            case 14:
                return blackPawns[5].returnPostion();
            case 15:
                return blackPawns[6].returnPostion();
            case 16:
                return blackPawns[7].returnPostion();
            default:
                break;

        }
        return new Point(-1, -1);

    }

    public Point returnOldPostion(int i) {

        switch (i) {
            case 1:
                return blackRook1.returnOld();
            case 2:
                return blackRook2.returnOld();
            case 3:
                return blackKnight1.returnOld();
            case 4:
                return blackKnight2.returnOld();
            case 5:
                return blackBishop1.returnOld();
            case 6:
                return blackBishop2.returnOld();
            case 7:
                return blackQueen.returnOld();
            case 8:
                return blackKing.returnOld();
            case 9:
                return blackPawns[0].returnOld();
            case 10:
                return blackPawns[1].returnOld();
            case 11:
                return blackPawns[2].returnOld();
            case 12:
                return blackPawns[3].returnOld();
            case 13:
                return blackPawns[4].returnOld();
            case 14:
                return blackPawns[5].returnOld();
            case 15:
                return blackPawns[6].returnOld();
            case 16:
                return blackPawns[7].returnOld();
            default:
                break;

        }
        return new Point(-1, -1);

    }

    public Image returnIconImage(int i) {
        switch (i) {
            case 1:
                return blackRook1.returnPieceImage();
            case 2:
                return blackRook2.returnPieceImage();
            case 3:
                return blackKnight1.returnPieceImage();
            case 4:
                return blackKnight2.returnPieceImage();
            case 5:
                return blackBishop1.returnPieceImage();
            case 6:
                return blackBishop2.returnPieceImage();
            case 7:
                return blackQueen.returnPieceImage();
            case 8:
                return blackKing.returnPieceImage();
            case 9:
                return blackPawns[0].returnPieceImage();
            case 10:
                return blackPawns[1].returnPieceImage();
            case 11:
                return blackPawns[2].returnPieceImage();
            case 12:
                return blackPawns[3].returnPieceImage();
            case 13:
                return blackPawns[4].returnPieceImage();
            case 14:
                return blackPawns[5].returnPieceImage();
            case 15:
                return blackPawns[6].returnPieceImage();
            case 16:
                return blackPawns[7].returnPieceImage();
            default:
                break;

        }
        return null;

    }

    public void changePostion(Point newPoint, int i) {
        switch (i) {
            case 1:
                blackRook1.setPoint(newPoint);
                break;
            case 2:
                blackRook2.setPoint(newPoint);
                break;
            case 3:
                blackKnight1.setPoint(newPoint);
                break;
            case 4:
                blackKnight2.setPoint(newPoint);
                break;
            case 5:
                blackBishop1.setPoint(newPoint);
                break;
            case 6:
                blackBishop2.setPoint(newPoint);
                break;
            case 7:
                blackQueen.setPoint(newPoint);
                break;
            case 8:
                blackKing.setPoint(newPoint);
                break;
            case 9:
                blackPawns[0].setPoint(newPoint);
                break;
            case 10:
                blackPawns[1].setPoint(newPoint);
                break;
            case 11:
                blackPawns[2].setPoint(newPoint);
                break;
            case 12:
                blackPawns[3].setPoint(newPoint);
                break;
            case 13:
                blackPawns[4].setPoint(newPoint);
                break;
            case 14:
                blackPawns[5].setPoint(newPoint);
                break;
            case 15:
                blackPawns[6].setPoint(newPoint);
                break;
            case 16:
                blackPawns[7].setPoint(newPoint);
                break;
            default:
                break;

        }

    }

    public void changePostionToOld(Point newPoint, int i) {
        switch (i) {
            case 1:
                blackRook1.toOld(newPoint);
                break;
            case 2:
                blackRook2.toOld(newPoint);
                break;
            case 3:
                blackKnight1.toOld(newPoint);
                break;
            case 4:
                blackKnight2.toOld(newPoint);
                break;
            case 5:
                blackBishop1.toOld(newPoint);
                break;
            case 6:
                blackBishop2.toOld(newPoint);
                break;
            case 7:
                blackQueen.toOld(newPoint);
                break;
            case 8:
                blackKing.toOld(newPoint);
                break;
            case 9:
                blackPawns[0].toOld(newPoint);
                break;
            case 10:
                blackPawns[1].toOld(newPoint);
                break;
            case 11:
                blackPawns[2].toOld(newPoint);
                break;
            case 12:
                blackPawns[3].toOld(newPoint);
                break;
            case 13:
                blackPawns[4].toOld(newPoint);
                break;
            case 14:
                blackPawns[5].toOld(newPoint);
                break;
            case 15:
                blackPawns[6].toOld(newPoint);
                break;
            case 16:
                blackPawns[7].toOld(newPoint);
                break;
            default:
                break;

        }

    }
    
    public void changePixel(int newPixelX, int newPixelY, int i) {
        choosenOne = i;
        switch (choosenOne) {
            case 1:
                blackRook1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                blackRook2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                blackKnight1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                blackKnight2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                blackBishop1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                blackBishop2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                blackQueen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                blackKing.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                blackPawns[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                blackPawns[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                blackPawns[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                blackPawns[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                blackPawns[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                blackPawns[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                blackPawns[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                blackPawns[7].setPixels(newPixelX, newPixelY);
                break;
            default:
                break;

        }
    }

    public void changePixel(int newPixelX, int newPixelY) {
        switch (choosenOne) {
            case 1:
                blackRook1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                blackRook2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                blackKnight1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                blackKnight2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                blackBishop1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                blackBishop2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                blackQueen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                blackKing.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                blackPawns[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                blackPawns[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                blackPawns[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                blackPawns[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                blackPawns[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                blackPawns[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                blackPawns[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                blackPawns[7].setPixels(newPixelX, newPixelY);
                break;
            default:
                break;

        }
    }

    public Point getPixelPoint(int i) {
        choosenOne = i;
        switch (choosenOne) {
            case 1:
                return blackRook1.getpixelPoint();
            case 2:
                return blackRook2.getpixelPoint();
            case 3:
                return blackKnight1.getpixelPoint();
            case 4:
                return blackKnight2.getpixelPoint();
            case 5:
                return blackBishop1.getpixelPoint();
            case 6:
                return blackBishop2.getpixelPoint();
            case 7:
                return blackQueen.getpixelPoint();
            case 8:
                return blackKing.getpixelPoint();
            case 9:
                return blackPawns[0].getpixelPoint();
            case 10:
                return blackPawns[1].getpixelPoint();
            case 11:
                return blackPawns[2].getpixelPoint();
            case 12:
                return blackPawns[3].getpixelPoint();
            case 13:
                return blackPawns[4].getpixelPoint();
            case 14:
                return blackPawns[5].getpixelPoint();
            case 15:
                return blackPawns[6].getpixelPoint();
            case 16:
                return blackPawns[7].getpixelPoint();
            default:
                break;

        }
        return null;
    }

    public boolean killedPiece(int i) {
        Point out = new Point(20, 20);
        switch (i) {
            case 1:
                blackRook1.setPoint(out);
                return true;
            case 2:
                blackRook2.setPoint(out);
                return true;
            case 3:
                blackKnight1.setPoint(out);
                return true;
            case 4:
                blackKnight2.setPoint(out);
                return true;
            case 5:
                blackBishop1.setPoint(out);
                return true;
            case 6:
                blackBishop2.setPoint(out);
                return true;
            case 7:
                blackQueen.setPoint(out);
                return true;
            case 8:
                return true;// the King "Can't be moved out"
            case 9:
                blackPawns[0].setPoint(out);
                return true;
            case 10:
                blackPawns[1].setPoint(out);
                return true;
            case 11:
                blackPawns[2].setPoint(out);
                return true;
            case 12:
                blackPawns[3].setPoint(out);
                return true;
            case 13:
                blackPawns[4].setPoint(out);
                return true;
            case 14:
                blackPawns[5].setPoint(out);
                return true;
            case 15:
                blackPawns[6].setPoint(out);
                return true;
            case 16:
                blackPawns[7].setPoint(out);
                return true;
            default:
                break;
        }
        return false;
    }

    public boolean checkTheMove(Point newP, int i) {
        choosenOne = i;
        switch (choosenOne) {

            case 1:
                return blackRook1.canMove(newP.x, newP.y);
            case 2:
                return blackRook2.canMove(newP.x, newP.y);
            case 3:
                return blackKnight1.canMove(newP.x, newP.y);
            case 4:
                return blackKnight2.canMove(newP.x, newP.y);
            case 5:
                return blackBishop1.canMove(newP.x, newP.y);
            case 6:
                return blackBishop2.canMove(newP.x, newP.y);
            case 7:
                return blackQueen.canMove(newP.x, newP.y);
            case 8:
                return blackKing.canMove(newP.x, newP.y);
            case 9:
                return blackPawns[0].canMove(newP.x, newP.y, color);
            case 10:
                return blackPawns[1].canMove(newP.x, newP.y, color);
            case 11:
                return blackPawns[2].canMove(newP.x, newP.y, color);
            case 12:
                return blackPawns[3].canMove(newP.x, newP.y, color);
            case 13:
                return blackPawns[4].canMove(newP.x, newP.y, color);
            case 14:
                return blackPawns[5].canMove(newP.x, newP.y, color);
            case 15:
                return blackPawns[6].canMove(newP.x, newP.y, color);
            case 16:
                return blackPawns[7].canMove(newP.x, newP.y, color);
            default:
                break;
        }
        return false;
    }

    //TODO: find out what this means.
    public boolean pawnSeen(int i, Point myPoint) {

        switch (i) {
            case 9:
                return blackPawns[0].setSeenByChecking(myPoint, "black");
            case 10:
                return blackPawns[1].setSeenByChecking(myPoint, "black");
            case 11:
                return blackPawns[2].setSeenByChecking(myPoint, "black");
            case 12:
                return blackPawns[3].setSeenByChecking(myPoint, "black");
            case 13:
                return blackPawns[4].setSeenByChecking(myPoint, "black");
            case 14:
                return blackPawns[5].setSeenByChecking(myPoint, "black");
            case 15:
                return blackPawns[6].setSeenByChecking(myPoint, "black");
            case 16:
                return blackPawns[7].setSeenByChecking(myPoint, "black");
            default:
                break;
        }
        return false;

    }

    public boolean returnPawnSeen(int i) {
        switch (i) {

            case 9:
                return blackPawns[0].returnMyseen();
            case 10:
                return blackPawns[1].returnMyseen();
            case 11:
                return blackPawns[2].returnMyseen();
            case 12:
                return blackPawns[3].returnMyseen();
            case 13:
                return blackPawns[4].returnMyseen();
            case 14:
                return blackPawns[5].returnMyseen();
            case 15:
                return blackPawns[6].returnMyseen();
            case 16:
                return blackPawns[7].returnMyseen();
            default:
                break;
        }
        return false;
    }

    //do you know da way?
    public boolean checkTheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {
            case 1:
                return blackRook1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 2:
                return blackRook2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 5:
                return blackBishop1.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 6:
                return blackBishop2.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 7:
                return blackQueen.pieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 9:
                return blackPawns[0].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 10:
                return blackPawns[1].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 11:
                return blackPawns[2].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 12:
                return blackPawns[3].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 13:
                return blackPawns[4].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 14:
                return blackPawns[5].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 15:
                return blackPawns[6].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            case 16: {
                return blackPawns[7].pieceInMyWay(newP.x, newP.y, postionFromOthers, color);
            }
            default:
                break;

        }
        return false;
    }

    public void checkKing(boolean newkingcheck) {
        kingischeck = newkingcheck;
    }
    
    public boolean checkKing(Point p1, Point p2, int i) {
        switch (i) {

            case 1:
                return blackRook1.checkKing(p1.x, p1.y, p2);
            case 2:
                return blackRook2.checkKing(p1.x, p1.y, p2);
            case 3:
                return blackKnight1.canMove(p1.x, p1.y);
            case 4:
                return blackKnight2.canMove(p1.x, p1.y);
            case 5:
                return blackBishop1.checkKing(p1.x, p1.y, p2);
            case 6:
                return blackBishop2.checkKing(p1.x, p1.y, p2);
            case 7:
                return blackQueen.checkKing(p1.x, p1.y, p2);
    
            case 9:
                return blackPawns[0].canMove(p1.x, p1.y, color);
            case 10:
                return blackPawns[1].canMove(p1.x, p1.y, color);
            case 11:
                return blackPawns[2].canMove(p1.x, p1.y, color);
            case 12:
                return blackPawns[3].canMove(p1.x, p1.y, color);
            case 13:
                return blackPawns[4].canMove(p1.x, p1.y, color);
            case 14:
                return blackPawns[5].canMove(p1.x, p1.y, color);
            case 15:
                return blackPawns[6].canMove(p1.x, p1.y, color);
            case 16:
                return blackPawns[7].canMove(p1.x, p1.y, color);
            default:
                break;
        }
        return false;
    }

    public int returnChosen() {
        return choosenOne;
    }

    public void setInHand(int i) {
        inHand = i;
    }

    public int getInHand() {
        return inHand;
    }

    public boolean canMove(int x, int y) {
        return true;
    }


    public boolean returncheckKing() {
        return kingischeck;
    }

    public boolean isKingChecked(Player1 white) {

        Point myKingPosition = blackKing.returnPostion();
        boolean flag = false;

        ////////// Start Checking the King ////////////
        for (int i = 17; i < 33; i++) {
            if (i < 25) {
                if (white.checkMove(myKingPosition, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (white.checkTheWay(myKingPosition, returnPostion(j), i)) {
                                // Means there is somting in the Way so can't move'

                                flag = false;

                            }
                        } //else {
//
//                            if (j != 8) {
//                                if (white.checkTheWay(myKingPosition, white.returnPostion(j), i)) {
//
//                                    flag = false;
//                                    // Means there is somting in the Way so can't move'
//
//                                }
//                            }
//
//                        }

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

    public boolean checkMateGameOver(Player1 enemy) {

        if (!generateKingMoves(enemy)) {

            inHand = -1;
            System.out.println("I Killed King  2");

            return false;
        } else if (!generateCastleMoves(enemy, blackRook1)) {

            inHand = -1;
            System.out.println("I Killed Rook 2");

            return false;
        } else if (!generateCastleMoves(enemy, blackRook2)) {

            inHand = -1;
            System.out.println("I Killed Rook 2");
            return false;
        } else if (!generateBishopMoves(enemy, blackBishop1)) {

            inHand = -1;
            System.out.println("I Killed Bishop2");
            return false;
        } else if (!generateBishopMoves(enemy, blackBishop2)) {

            inHand = -1;
            System.out.println("I Killed Bishop2");

            return false;
        } else if (!generateKnightMoves(enemy, blackKnight1)) {

            inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!generateKnightMoves(enemy, blackKnight2)) {

            inHand = -1;
            System.out.println("I Killed Knight 2");
            return false;
        } else if (!generateQueenMoves(enemy)) {

            inHand = -1;
            System.out.println("I Killed Queen 2");
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            inHand = 9 + i;
            if (!generatePawnMoves(enemy, blackPawns[i])) {

                inHand = -1;

                System.out.println("I Killed Solider 2");

                return false;
            }
        }

        inHand = -1;
        return true;

    }

    public boolean friendlyPieceAlreadyThere(Point newP) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            // There is no need to check the inHand pice
            if (getInHand() != i) {

                // Check if there is White Pices in the new Point
                // If so we Can't move (Same color)!!

                samePostion = returnPostion(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {

                    return false;

                }
            }
        }

        return true;
    }

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

    public boolean generateKingMoves(Player1 enemy) {
        boolean killedSomething = false;
        Point oldP = new Point();

        Point checkPlace = new Point();
        inHand = 8;

        int x = blackKing.returnX();
        int y = blackKing.returnY();

        oldP.x = x;
        oldP.y = y;

        if (x + 1 <= 8) {

            blackKing.setX(x + 1);
            blackKing.setY(y);
            checkPlace.x = x + 1;
            checkPlace.y = y;

            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {

                    blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8) {

            blackKing.setX(x);
            blackKing.setY(y + 1);
            checkPlace.x = x;
            checkPlace.y = y + 1;
            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {

                    blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    return false;

                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }

        if (y - 1 > 0) {

            blackKing.setX(x);
            blackKing.setY(y - 1);

            checkPlace.x = x;
            checkPlace.y = y - 1;

            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }

            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {

                    blackKing.setPoint(oldP);
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }

                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (x - 1 > 0) {

            blackKing.setX(x - 1);
            blackKing.setY(y);

            checkPlace.x = x - 1;
            checkPlace.y = y;
            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            blackKing.setX(x - 1);
            blackKing.setY(y - 1);

            checkPlace.x = x - 1;
            checkPlace.y = y - 1;

            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {

                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            blackKing.setX(x + 1);
            blackKing.setY(y + 1);

            checkPlace.x = x + 1;
            checkPlace.y = y + 1;
            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {

                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            blackKing.setX(x + 1);
            blackKing.setY(y - 1);

            checkPlace.x = x + 1;
            checkPlace.y = y - 1;
            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    blackKing.setPoint(oldP);
                    return false;
                }
            }

        }
        blackKing.setPoint(oldP);
        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            blackKing.setX(x - 1);
            blackKing.setY(y + 1);

            checkPlace.x = x - 1;
            checkPlace.y = y + 1;
            if (killToProtectKing(enemy, returnPostion(inHand))) {
                killedSomething = true;
            }
            if (friendlyPieceAlreadyThere(checkPlace)) {
                if (!isKingChecked(enemy)) {
                    if (killedSomething) {
                        enemy.changePostion(other, killToProtect);
                        killedSomething = false;
                    }
                    blackKing.setPoint(oldP);
                    return false;
                }
            }

        }

        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }

        blackKing.setPoint(oldP);
        return true;

    }

    public boolean generateCastleMoves(Player1 enemy, Rook blackRook) {
        boolean killedSomething = false;
        Point oldPoint1 = new Point();

        Point checkPlace = new Point();
        int x1 = blackRook.returnX();
        int y1 = blackRook.returnY();

        if (blackRook == blackRook1) {
            inHand = 1;
        } else {
            inHand = 2;
        }
        /////////////////////

        oldPoint1.x = x1;
        oldPoint1.y = y1;

        checkPlace.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {

                blackRook.setX(i);
                checkPlace.x = i;

                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }

                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackRook.setX(oldPoint1.x);
                            blackRook.setY(oldPoint1.y);

                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackRook.setX(oldPoint1.x);
            checkPlace.x = oldPoint1.x;

            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }
            for (int i = 1; i <= 8; i++) {
                blackRook.setY(i);
                checkPlace.y = i;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackRook.setX(oldPoint1.x);
                            blackRook.setY(oldPoint1.y);

                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackRook.setY(oldPoint1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////

        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }
        blackRook.setX(oldPoint1.x);
        blackRook.setY(oldPoint1.y);
        return true;
    }

    public boolean generateBishopMoves(Player1 enemy, Bishop blackBishop) {
        boolean killedSomething = false;
        Point oldPoint1 = new Point();
        Point checkPlace = new Point();

        oldPoint1 = blackBishop.returnPostion();

        if (blackBishop == blackBishop1) {
            inHand = 5;
        } else {
            inHand = 6;
        }

        if (oldPoint1.x != 20) {
            for (int x = oldPoint1.x, y = oldPoint1.y; x >= 1 && y <= 8; x--, y++) {

                blackBishop.setX(x);
                blackBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {

                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            blackBishop.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }
            for (int x = oldPoint1.x, y = oldPoint1.y; y >= 1 && x <= 8; x++, y--) {

                blackBishop.setX(x);
                blackBishop.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            blackBishop.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackBishop.setPoint(oldPoint1);

        }

        blackBishop.setPoint(oldPoint1);

        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }

        return true;
    }

    public boolean generateKnightMoves(Player1 enemy, Knight blackKnight) {
        Point oldp1 = new Point();
        boolean killedSomething = false;
        oldp1 = blackKnight.returnPostion();

        Point checkPlace = new Point();

        if (blackKnight == blackKnight1) {
            inHand = 3;
        } else {
            inHand = 4;
        }

        int x = oldp1.x;
        int y = oldp1.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                blackKnight.setX(x + 1);
                blackKnight.setY(y + 2);
                checkPlace.x = x + 1;
                checkPlace.y = y + 2;

                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        blackKnight.setPoint(oldp1);

                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }

                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x + 1 <= 8 && y - 2 >= 1) {
                blackKnight.setX(x + 1);
                blackKnight.setY(y - 2);
                checkPlace.x = x + 1;
                checkPlace.y = y - 2;
                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                blackKnight.setX(x + 2);
                blackKnight.setY(y + 1);
                checkPlace.x = x + 2;
                checkPlace.y = y + 1;

                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                blackKnight.setX(x + 2);
                blackKnight.setY(y - 1);
                checkPlace.x = x + 2;
                checkPlace.y = y - 1;
                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                blackKnight.setX(x - 1);
                blackKnight.setY(y + 2);
                checkPlace.x = x - 1;
                checkPlace.y = y + 2;

                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                blackKnight.setX(x - 1);
                blackKnight.setY(y - 2);
                checkPlace.x = x - 1;
                checkPlace.y = y - 2;
                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                blackKnight.setX(x - 2);
                blackKnight.setY(y + 1);
                checkPlace.x = x - 2;
                checkPlace.y = y + 1;

                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }
                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }

            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                blackKnight.setX(x - 2);
                blackKnight.setY(y - 1);
                checkPlace.x = x - 2;
                checkPlace.y = y - 1;

                if (killToProtectKing(enemy, returnPostion(inHand))) {
                    killedSomething = true;
                }

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (!isKingChecked(enemy)) {
                        if (killedSomething) {
                            enemy.changePostion(other, killToProtect);
                            killedSomething = false;
                        }
                        blackKnight.setPoint(oldp1);
                        return false;
                    }
                }
            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

        }
        blackKnight.setPoint(oldp1);

        return true;
    }

    public boolean generateQueenMoves(Player1 enemy) {
        boolean killedSomething = false;

        Point oldPoint1 = new Point();

        oldPoint1 = blackQueen.returnPostion();

        Point checkPlace = new Point();

        inHand = 7;

        if (oldPoint1.x != 20) {
            for (int x = oldPoint1.x, y = oldPoint1.y; x >= 1 && y <= 8; x--, y++) {

                blackQueen.setX(x);
                blackQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }

                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackQueen.setPoint(oldPoint1);

                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }
            for (int x = oldPoint1.x, y = oldPoint1.y; y >= 1 && x <= 8; x++, y--) {

                blackQueen.setX(x);
                blackQueen.setY(y);
                checkPlace.x = x;
                checkPlace.y = y;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackQueen.setPoint(oldPoint1);
                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackQueen.setPoint(oldPoint1);
            checkPlace.x = oldPoint1.x;
            checkPlace.y = oldPoint1.y;

            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                blackQueen.setX(i);

                checkPlace.x = i;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackQueen.setX(oldPoint1.x);
                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackQueen.setX(oldPoint1.x);
            checkPlace.x = oldPoint1.x;

            if (killedSomething) {
                enemy.changePostion(other, killToProtect);
                killedSomething = false;
            }

            for (int i = 1; i <= 8; i++) {
                blackQueen.setY(i);
                checkPlace.y = i;
                if (checkWayToPosition(enemy, oldPoint1)) {
                    if (killToProtectKing(enemy, returnPostion(inHand))) {
                        killedSomething = true;
                    }
                    if (friendlyPieceAlreadyThere(checkPlace)) {
                        if (!isKingChecked(enemy)) {
                            blackQueen.setY(oldPoint1.y);
                            if (killedSomething) {
                                enemy.changePostion(other, killToProtect);
                                killedSomething = false;
                            }
                            return false;
                        }
                    }
                }

                if (killedSomething) {
                    enemy.changePostion(other, killToProtect);
                    killedSomething = false;
                }

            }
            blackQueen.setY(oldPoint1.y);
        }

        if (killedSomething) {
            enemy.changePostion(other, killToProtect);
            killedSomething = false;
        }

        return true;

    }

    public boolean generatePawnMoves(Player1 enemy, Pawn myPawn) {
        Point oldPoint1 = new Point();
        oldPoint1 = myPawn.returnPostion();
        Point checkPlace = new Point();
        checkPlace.x = oldPoint1.x;
        checkPlace.y = oldPoint1.y;

        if (oldPoint1.x != 20) {
            if (myPawn.canMove(oldPoint1.x, oldPoint1.y + 2, color) && oldPoint1.y + 2 >= 1) {
                myPawn.setY(oldPoint1.y + 2);

                checkPlace.y = oldPoint1.y + 2;

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (enemyPieceAlreadyThere(checkPlace, enemy)) {
                        if (!isKingChecked(enemy)) {

                            myPawn.setPoint(oldPoint1);
                            return false;
                        }
                    }
                }

            }
            if (myPawn.canMove(oldPoint1.x, oldPoint1.y + 1, color) && oldPoint1.y + 1 >= 1) {
                myPawn.setY(oldPoint1.y + 1);
                checkPlace.y = oldPoint1.y + 1;

                if (friendlyPieceAlreadyThere(checkPlace)) {
                    if (enemyPieceAlreadyThere(checkPlace, enemy)) {
                        if (!isKingChecked(enemy)) {
                            myPawn.setPoint(oldPoint1);

                            return false;
                        }
                    }
                }
            }

            if (enemyPieceAlreadyThere(new Point(oldPoint1.x - 1, oldPoint1.y + 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldPoint1.x - 1, oldPoint1.y + 1))) {

                    if (!isKingChecked(enemy)) {
                        enemy.changePostion(other, killToProtect);
                        myPawn.setPoint(oldPoint1);

                        return false;
                    }
                    enemy.changePostion(other, killToProtect);
                }
            }

            if (!enemyPieceAlreadyThere(new Point(oldPoint1.x + 1, oldPoint1.y + 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldPoint1.x + 1, oldPoint1.y + 1))) {
                    if (!isKingChecked(enemy)) {
                        enemy.changePostion(other, killToProtect);
                        myPawn.setPoint(oldPoint1);

                        return false;
                    }
                    enemy.changePostion(other, killToProtect);

                }
            }

        }

        myPawn.setPoint(oldPoint1);
        return true;
    }

    public boolean checkWayToPosition(Player1 enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            // check if there are pieces in the way.
            if (inHand != i) {
                if (i < 17) {
                    // Means there is something in the way so it can't move.
                    flag = checkTheWay(newP, enemy.returnPostion(i), inHand);
                } else {
                    flag = checkTheWay(newP, returnPostion(i), inHand);
                }
                if (flag == true) {
                    return false;
                } // Means there is a Pice in the Way
            }
        }
        return true;

    }

    public boolean killToProtectKing(Player1 enemy, Point newP) {

        for (int i = 17; i <= 32; i++) {

            other = enemy.returnPostion(i);
            if (other.x == newP.x && other.y == newP.y) {
                killToProtect = i;

                enemy.killedPiece(i);
                return true;
            }
        }

        return false;
    }

    public boolean hasMoreElements() {
        return false;
    }

    public Object nextElement() {

        return new Object();
    }

    /** tells user about last move. Previously named "Tell_Me_About_Last_Move"**/
    public String lastMove() {
        switch (inHand) {
            case 1:
                return blackRook1.tellMe();
            case 2:
                return blackRook2.tellMe();
            case 3:
                return blackKnight1.tellMe();
            case 4:
                return blackKnight2.tellMe();
            case 5:
                return blackBishop1.tellMe();
            case 6:
                return blackBishop2.tellMe();
            case 7:
                return blackQueen.tellMe();
            case 8:
                return blackKing.tellMe();
            case 9:
                return blackPawns[0].tellMe();
            case 10:
                return blackPawns[1].tellMe();
            case 11:
                return blackPawns[2].tellMe();
            case 12:
                return blackPawns[3].tellMe();
            case 13:
                return blackPawns[4].tellMe();
            case 14:
                return blackPawns[5].tellMe();
            case 15:
                return blackPawns[6].tellMe();
            case 16:
                return blackPawns[7].tellMe();
            default:
                break;
        }
        return null;
    }

}
