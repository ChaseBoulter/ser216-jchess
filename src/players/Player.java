//base template for players to extend from.There is no modularity for all the players.What if they wanted 4 player chess?Etc.
//package players;
//
//import java.awt.Image;
//import java.awt.Point;
//
//import pieces.*;
//
//public class Player {
//    public Rook whiteRook1;
//    public Rook whiteRook2;
//    public Knight whiteKnight1;
//    public Knight whiteKnight2;
//    public Queen whiteQueen;
//    public Bishop whiteBishop1;
//    public Bishop whiteBishop2;
//    public Pawn[] whitePawns = new Pawn[8];
//    public King whiteKing;
//    private int inHand = -1;
//    private boolean kingischeck = false;
//    private int choosenOne;
//    public String color = "white";
//    private Point other;
//    int killToProtect;
//
//    public Point returnposition(int i) {
//
//        switch (i) {
//
//        case 17:
//            return whiteRook1.returnposition();
//        case 18:
//            return whiteRook2.returnposition();
//        case 19:
//            return whiteKnight1.returnposition();
//        case 20:
//            return whiteKnight2.returnposition();
//        case 21:
//            return whiteBishop1.returnposition();
//        case 22:
//            return whiteBishop2.returnposition();
//        case 23:
//            return whiteQueen.returnposition();
//        case 24:
//            return whiteKing.returnposition();
//        case 25:
//            return whitePawns[0].returnposition();
//        case 26:
//            return whitePawns[1].returnposition();
//        case 27:
//            return whitePawns[2].returnposition();
//        case 28:
//            return whitePawns[3].returnposition();
//        case 29:
//            return whitePawns[4].returnposition();
//        case 30:
//            return whitePawns[5].returnposition();
//        case 31:
//            return whitePawns[6].returnposition();
//        case 32:
//            return whitePawns[7].returnposition();
//        default:
//            break;
//        }
//        return new Point(-1, -1);
//    }
//
//    public Point returnOldposition(int i) {
//
//        switch (i) {
//
//        case 17:
//            return whiteRook1.returnOld();
//        case 18:
//            return whiteRook2.returnOld();
//        case 19:
//            return whiteKnight1.returnOld();
//        case 20:
//            return whiteKnight2.returnOld();
//        case 21:
//            return whiteBishop1.returnOld();
//        case 22:
//            return whiteBishop2.returnOld();
//        case 23:
//            return whiteQueen.returnOld();
//        case 24:
//            return whiteKing.returnOld();
//        case 25:
//            return whitePawns[0].returnOld();
//        case 26:
//            return whitePawns[1].returnOld();
//        case 27:
//            return whitePawns[2].returnOld();
//        case 28:
//            return whitePawns[3].returnOld();
//        case 29:
//            return whitePawns[4].returnOld();
//        case 30:
//            return whitePawns[5].returnOld();
//        case 31:
//            return whitePawns[6].returnOld();
//        case 32:
//            return whitePawns[7].returnOld();
//        default:
//            break;
//        }
//        return new Point(-1, -1);
//    }
//
//    public Image returnIconImage(int i) {
//
//        switch (i) {
//        case 1:
//            return whiteRook1.returnPieceImage();
//
//        case 17:
//            return whiteRook1.returnPieceImage();
//        case 18:
//            return whiteRook2.returnPieceImage();
//        case 19:
//            return whiteKnight1.returnPieceImage();
//        case 20:
//            return whiteKnight2.returnPieceImage();
//        case 21:
//            return whiteBishop1.returnPieceImage();
//        case 22:
//            return whiteBishop2.returnPieceImage();
//        case 23:
//            return whiteQueen.returnPieceImage();
//        case 24:
//            return whiteKing.returnPieceImage();
//        case 25:
//            return whitePawns[0].returnPieceImage();
//        case 26:
//            return whitePawns[1].returnPieceImage();
//        case 27:
//            return whitePawns[2].returnPieceImage();
//        case 28:
//            return whitePawns[3].returnPieceImage();
//        case 29:
//            return whitePawns[4].returnPieceImage();
//        case 30:
//            return whitePawns[5].returnPieceImage();
//        case 31:
//            return whitePawns[6].returnPieceImage();
//        case 32:
//            return whitePawns[7].returnPieceImage();
//        default:
//            break;
//        }
//        return null;
//    }
//
//    public void changeposition(Point newPoint, int i) {
//        switch (i) {
//
//        case 17:
//            whiteRook1.setPoint(newPoint);
//            break;
//        case 18:
//            whiteRook2.setPoint(newPoint);
//            break;
//        case 19:
//            whiteKnight1.setPoint(newPoint);
//            break;
//        case 20:
//            whiteKnight2.setPoint(newPoint);
//            break;
//        case 21:
//            whiteBishop1.setPoint(newPoint);
//            break;
//        case 22:
//            whiteBishop2.setPoint(newPoint);
//            break;
//        case 23:
//            whiteQueen.setPoint(newPoint);
//            break;
//        case 24:
//            whiteKing.setPoint(newPoint);
//            break;
//        case 25:
//            whitePawns[0].setPoint(newPoint);
//            break;
//        case 26:
//            whitePawns[1].setPoint(newPoint);
//            break;
//        case 27:
//            whitePawns[2].setPoint(newPoint);
//            break;
//        case 28:
//            whitePawns[3].setPoint(newPoint);
//            break;
//        case 29:
//            whitePawns[4].setPoint(newPoint);
//            break;
//        case 30:
//            whitePawns[5].setPoint(newPoint);
//            break;
//        case 31:
//            whitePawns[6].setPoint(newPoint);
//            break;
//        case 32:
//            whitePawns[7].setPoint(newPoint);
//            break;
//        default:
//            break;
//        }
//
//    }
//
//    public void changepositionToOld(Point newPoint, int i) {
//        switch (i) {
//
//        case 17:
//            whiteRook1.toOld(newPoint);
//            break;
//        case 18:
//            whiteRook2.toOld(newPoint);
//            break;
//        case 19:
//            whiteKnight1.toOld(newPoint);
//            break;
//        case 20:
//            whiteKnight2.toOld(newPoint);
//            break;
//        case 21:
//            whiteBishop1.toOld(newPoint);
//            break;
//        case 22:
//            whiteBishop2.toOld(newPoint);
//            break;
//        case 23:
//            whiteQueen.toOld(newPoint);
//            break;
//        case 24:
//            whiteKing.toOld(newPoint);
//            break;
//        case 25:
//            whitePawns[0].toOld(newPoint);
//            break;
//        case 26:
//            whitePawns[1].toOld(newPoint);
//            break;
//        case 27:
//            whitePawns[2].toOld(newPoint);
//            break;
//        case 28:
//            whitePawns[3].toOld(newPoint);
//            break;
//        case 29:
//            whitePawns[4].toOld(newPoint);
//            break;
//        case 30:
//            whitePawns[5].toOld(newPoint);
//            break;
//        case 31:
//            whitePawns[6].toOld(newPoint);
//            break;
//        case 32:
//            whitePawns[7].toOld(newPoint);
//            break;
//        default:
//            break;
//        }
//    }
//
//    public void changePixel(int newPixelX, int newPixelY, int i) {
//        choosenOne = i;
//        switch (choosenOne) {
//
//        case 17:
//            whiteRook1.setPixels(newPixelX, newPixelY);
//            break;
//        case 18:
//            whiteRook2.setPixels(newPixelX, newPixelY);
//            break;
//        case 19:
//            whiteKnight1.setPixels(newPixelX, newPixelY);
//            break;
//        case 20:
//            whiteKnight2.setPixels(newPixelX, newPixelY);
//            break;
//        case 21:
//            whiteBishop1.setPixels(newPixelX, newPixelY);
//            break;
//        case 22:
//            whiteBishop2.setPixels(newPixelX, newPixelY);
//            break;
//        case 23:
//            whiteQueen.setPixels(newPixelX, newPixelY);
//            break;
//        case 24:
//            whiteKing.setPixels(newPixelX, newPixelY);
//            break;
//        case 25:
//            whitePawns[0].setPixels(newPixelX, newPixelY);
//            break;
//        case 26:
//            whitePawns[1].setPixels(newPixelX, newPixelY);
//            break;
//        case 27:
//            whitePawns[2].setPixels(newPixelX, newPixelY);
//            break;
//        case 28:
//            whitePawns[3].setPixels(newPixelX, newPixelY);
//            break;
//        case 29:
//            whitePawns[4].setPixels(newPixelX, newPixelY);
//            break;
//        case 30:
//            whitePawns[5].setPixels(newPixelX, newPixelY);
//            break;
//        case 31:
//            whitePawns[6].setPixels(newPixelX, newPixelY);
//            break;
//        case 32:
//            whitePawns[7].setPixels(newPixelX, newPixelY);
//            break;
//        default:
//            break;
//        }
//    }
//
//    public Point getPixelPoint(int i) {
//        choosenOne = i;
//        switch (choosenOne) {
//        case 1:
//            return whiteRook1.getpixelPoint();
//
//        case 17:
//            return whiteRook1.getpixelPoint();
//        case 18:
//            return whiteRook2.getpixelPoint();
//        case 19:
//            return whiteKnight1.getpixelPoint();
//        case 20:
//            return whiteKnight2.getpixelPoint();
//        case 21:
//            return whiteBishop1.getpixelPoint();
//        case 22:
//            return whiteBishop2.getpixelPoint();
//        case 23:
//            return whiteQueen.getpixelPoint();
//        case 24:
//            return whiteKing.getpixelPoint();
//        case 25:
//            return whitePawns[0].getpixelPoint();
//        case 26:
//            return whitePawns[1].getpixelPoint();
//        case 27:
//            return whitePawns[2].getpixelPoint();
//        case 28:
//            return whitePawns[3].getpixelPoint();
//        case 29:
//            return whitePawns[4].getpixelPoint();
//        case 30:
//            return whitePawns[5].getpixelPoint();
//        case 31:
//            return whitePawns[6].getpixelPoint();
//        case 32:
//            return whitePawns[7].getpixelPoint();
//        default:
//            break;
//        }
//        return null;
//    }
//
//    public boolean checkthemove(Point newP, int i) {
//        choosenOne = i;
//        switch (choosenOne) {
//
//        case 17:
//            return whiteRook1.Canmove(newP.x, newP.y);
//        case 18:
//            return whiteRook2.Canmove(newP.x, newP.y);
//        case 19:
//            return whiteKnight1.Canmove(newP.x, newP.y);
//        case 20:
//            return whiteKnight2.Canmove(newP.x, newP.y);
//        case 21:
//            return whiteBishop1.Canmove(newP.x, newP.y);
//        case 22:
//            return whiteBishop2.Canmove(newP.x, newP.y);
//        case 23:
//            return whiteQueen.Canmove(newP.x, newP.y);
//        case 24:
//            return whiteKing.Canmove(newP.x, newP.y);
//        case 25:
//            return whitePawns[0].Canmove(newP.x, newP.y, color);
//        case 26:
//            return whitePawns[1].Canmove(newP.x, newP.y, color);
//        case 27:
//            return whitePawns[2].Canmove(newP.x, newP.y, color);
//        case 28:
//            return whitePawns[3].Canmove(newP.x, newP.y, color);
//        case 29:
//            return whitePawns[4].Canmove(newP.x, newP.y, color);
//        case 30:
//            return whitePawns[5].Canmove(newP.x, newP.y, color);
//        case 31:
//            return whitePawns[6].Canmove(newP.x, newP.y, color);
//        case 32:
//            return whitePawns[7].Canmove(newP.x, newP.y, color);
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public boolean pawnSeen(int i, Point P) {
//        switch (i) {
//        case 25:
//            return whitePawns[0].setSeenbychecking(P, color);
//        case 26:
//            return whitePawns[1].setSeenbychecking(P, color);
//        case 27:
//            return whitePawns[2].setSeenbychecking(P, color);
//        case 28:
//            return whitePawns[3].setSeenbychecking(P, color);
//        case 29:
//            return whitePawns[4].setSeenbychecking(P, color);
//        case 30:
//            return whitePawns[5].setSeenbychecking(P, color);
//        case 31:
//            return whitePawns[6].setSeenbychecking(P, color);
//        case 32:
//            return whitePawns[7].setSeenbychecking(P, color);
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public boolean returnsoliderSeen(int i) {
//        switch (i) {
//        case 25:
//            return whitePawns[0].returnMyseen();
//        case 26:
//            return whitePawns[1].returnMyseen();
//        case 27:
//            return whitePawns[2].returnMyseen();
//        case 28:
//            return whitePawns[3].returnMyseen();
//        case 29:
//            return whitePawns[4].returnMyseen();
//        case 30:
//            return whitePawns[5].returnMyseen();
//        case 31:
//            return whitePawns[6].returnMyseen();
//        case 32:
//            return whitePawns[7].returnMyseen();
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public boolean checktheWay(Point newP, Point positionFromOthers, int i) {
//        switch (i) {
//
//        case 17:
//            return whiteRook1.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 18:
//            return whiteRook2.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 21:
//            return whiteBishop1.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 22:
//            return whiteBishop2.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 23:
//            return whiteQueen.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 25:
//            return whitePawns[0].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 26:
//            return whitePawns[1].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 27:
//            return whitePawns[2].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 28:
//            return whitePawns[3].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 29:
//            return whitePawns[4].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 30:
//            return whitePawns[5].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 31:
//            return whitePawns[6].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        case 32:
//            return whitePawns[7].PieceInMYway(newP.x, newP.y, positionFromOthers, color);
//        default:
//            break;
//
//        }
//        return false;
//    }
//
//    public boolean Killedpiec(int i) {
//        Point out = new Point(13, 13);
//        switch (i) {
//
//        case 17:
//            whiteRook1.setPoint(out);
//            return true;
//        case 18:
//            whiteRook2.setPoint(out);
//            return true;
//        case 19:
//            whiteKnight1.setPoint(out);
//            return true;
//        case 20:
//            whiteKnight2.setPoint(out);
//            return true;
//        case 21:
//            whiteBishop1.setPoint(out);
//            return true;
//        case 22:
//            whiteBishop2.setPoint(out);
//            return true;
//        case 23:
//            whiteQueen.setPoint(out);
//            return true;
//        case 24:
//            return false;
//        case 25:
//            whitePawns[0].setPoint(out);
//            return true;
//        case 26:
//            whitePawns[1].setPoint(out);
//            return true;
//        case 27:
//            whitePawns[2].setPoint(out);
//            return true;
//        case 28:
//            whitePawns[3].setPoint(out);
//            return true;
//        case 29:
//            whitePawns[4].setPoint(out);
//            return true;
//        case 30:
//            whitePawns[5].setPoint(out);
//            return true;
//        case 31:
//            whitePawns[6].setPoint(out);
//            return true;
//        case 32:
//            whitePawns[7].setPoint(out);
//            return true;
//        default:
//            break;
//        }
//
//        return false;
//    }
//
//    public boolean checKing(Point p1, Point p2, int i) {
//        switch (i) {
//
//        case 17:
//            return whiteRook1.checkKing(p1.x, p1.y, p2);
//        case 18:
//            return whiteRook2.checkKing(p1.x, p1.y, p2);
//        case 19:
//            return whiteKnight1.Canmove(p1.x, p1.y);
//        case 20:
//            return whiteKnight2.Canmove(p1.x, p1.y);
//        case 21:
//            return whiteBishop1.checkKing(p1.x, p1.y, p2);
//        case 22:
//            return whiteBishop2.checkKing(p1.x, p1.y, p2);
//        case 23:
//            return whiteQueen.checkKing(p1.x, p1.y, p2);
//
//        case 25:
//            return whitePawns[0].Canmove(p1.x, p1.y, color);
//        case 26:
//            return whitePawns[1].Canmove(p1.x, p1.y, color);
//        case 27:
//            return whitePawns[2].Canmove(p1.x, p1.y, color);
//        case 28:
//            return whitePawns[3].Canmove(p1.x, p1.y, color);
//        case 29:
//            return whitePawns[4].Canmove(p1.x, p1.y, color);
//        case 30:
//            return whitePawns[5].Canmove(p1.x, p1.y, color);
//        case 31:
//            return whitePawns[6].Canmove(p1.x, p1.y, color);
//        case 32:
//            return whitePawns[7].Canmove(p1.x, p1.y, color);
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public int returnChosen() {
//        return choosenOne;
//    }
//
//    public void SetInhand(int i) {
//        inHand = i;
//    }
//
//    public int GetInhand() {
//        return inHand;
//    }
//
//    public boolean CanMove(int x, int y) {
//        return true;
//    }
//
//    public void checkKing(boolean newkingcheck) {
//        kingischeck = newkingcheck;
//    }
//
//    public boolean returncheckKing() {
//
//        return kingischeck;
//    }
//
//    public boolean if_MyKing_In_check(Player Black) {
//        boolean isCheckmate = false;
//        boolean flag = false;
//
//        return false;
//    }
//
//    public boolean Check_Mate_GameOver(Player Enemy) {
//
//        if (!KingGenerate_moves(Enemy)) {
//
//            inHand = -1;
//            return false;
//        } else if (!CastleGenerate_moves(Enemy, whiteRook1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!CastleGenerate_moves(Enemy, whiteRook2)) {
//
//            inHand = -1;
//            return false;
//        } else if (!BishopGenerate_moves(Enemy, whiteBishop1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!BishopGenerate_moves(Enemy, whiteBishop2)) {
//
//            inHand = -1;
//            return false;
//        } else if (!HosreGenerate_moves(Enemy, whiteKnight1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!HosreGenerate_moves(Enemy, whiteKnight2)) {
//
//            inHand = -1;
//            return false;
//        }
//
//        else if (!QueenGenerate_moves(Enemy)) {
//
//            inHand = -1;
//            return false;
//        }
//
//        for (int i = 0; i <= 7; i++) {
//            inHand = 25 + i;
//            if (!SoliderGenerate_moves(Enemy, whitePawns[i])) {
//
//                inHand = -1;
//                System.out.println("I Killed Solider 1");
//                return false;
//            }
//        }
//
//        inHand = -1;
//        return true;
//
//    }
//
//    public boolean see_king_Check(Player Black) {
//
//        Point My_King_position = whiteKing.returnposition();
//        boolean flag = false;
//
//        ////////// Start Checking the King ////////////
//        for (int i = 1; i < 17; i++) {
//            if (i < 9) {
//                if (Black.checkthemove(My_King_position, i)) {
//
//                    flag = true;
//                    for (int j = 1; j < 33; j++) {
//
//                        if (j < 17) {
//
//                            if (Black.checktheWay(My_King_position, Black.returnposition(j), i)) {
//                                // Means there is something in the Way so can't move'
//
//                                flag = false;
//
//                            }
//                        }
//
//                        else {
//
//                            if (j != 24) {
//                                if (Black.checktheWay(My_King_position, returnposition(j), i)) {
//
//                                    flag = false;
//                                    // Means there is something in the Way so can't move'
//
//                                }
//                            }
//
//                        }
//
//                    }
//
//                    if (flag) {
//
//                        break;
//                    }
//
//                }
//            } else {
//                // For soliders
//                if (Black.pawnSeen(i, My_King_position)) {
//
//                    break;
//
//                }
//            }
//            // if(stillIn_Check){ return true;}//Here Means White king is in check !!!
//            if (i == 16) {
//
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public boolean Pice_already_there(Point newP) {
//        Point sameposition;
//        for (int i = 17; i <= 32; i++) {
//            if (GetInhand() != i)// There is no need to check the inHand pice
//            {
//
//                // Check if there is White Pices in the new Point
//                // If so we Can't move (Same color)!!
//
//                sameposition = returnposition(i);
//                if (newP.x == sameposition.x && newP.y == sameposition.y) {
//
//                    return false;
//
//                }
//            }
//        }
//
//        return true;
//    }
//
//    public boolean Pice_already_there_from_enemy(Point newP, Player enemy) {
//        Point sameposition;
//        for (int i = 17; i <= 32; i++) {
//            sameposition = enemy.returnposition(i);
//            if (newP.x == sameposition.x && newP.y == sameposition.y) {
//
//                return false;
//
//            }
//        }
//
//        return true;
//    }
//
//    public int Get_Pice_already_there_from_enemy(Point newP, Player enemy) {
//        Point sameposition;
//        for (int i = 17; i <= 32; i++) {
//            sameposition = enemy.returnposition(i);
//            if (newP.x == sameposition.x && newP.y == sameposition.y) {
//
//                return i;
//
//            }
//        }
//
//        return -1;
//    }
//
//    public boolean KingGenerate_moves(Player enemy) {
//        boolean somthing_killed = false;
//        Point Oldp = new Point();
//
//        Point PlaceCheck = new Point();
//        inHand = 24;
//
//        int x = whiteKing.returnX();
//        int y = whiteKing.returnY();
//        Oldp.x = x;
//        Oldp.y = y;
//
//        if (x + 1 <= 8) {
//
//            whiteKing.setX(x + 1);
//            whiteKing.setY(y);
//            PlaceCheck.x = x + 1;
//            PlaceCheck.y = y;
//
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    whiteKing.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8) {
//
//            whiteKing.setX(x);
//            whiteKing.setY(y + 1);
//            PlaceCheck.x = x;
//            PlaceCheck.y = y + 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    whiteKing.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    return false;
//
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//
//        if (y - 1 > 0) {
//
//            whiteKing.setX(x);
//            whiteKing.setY(y - 1);
//
//            PlaceCheck.x = x;
//            PlaceCheck.y = y - 1;
//
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    whiteKing.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (x - 1 > 0) {
//
//            whiteKing.setX(x - 1);
//            whiteKing.setY(y);
//
//            PlaceCheck.x = x - 1;
//            PlaceCheck.y = y;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    whiteKing.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (y - 1 > 0 && x - 1 > 0) {
//
//            whiteKing.setX(x - 1);
//            whiteKing.setY(y - 1);
//
//            PlaceCheck.x = x - 1;
//            PlaceCheck.y = y - 1;
//
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    whiteKing.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8 && x + 1 <= 8) {
//
//            whiteKing.setX(x + 1);
//            whiteKing.setY(y + 1);
//
//            PlaceCheck.x = x + 1;
//            PlaceCheck.y = y + 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    whiteKing.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (y - 1 > 0 && x + 1 <= 8) {
//
//            whiteKing.setX(x + 1);
//            whiteKing.setY(y - 1);
//
//            PlaceCheck.x = x + 1;
//            PlaceCheck.y = y - 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    whiteKing.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        whiteKing.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8 && x - 1 > 0) {
//
//            whiteKing.setX(x - 1);
//            whiteKing.setY(y + 1);
//
//            PlaceCheck.x = x - 1;
//            PlaceCheck.y = y + 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, killToProtect);
//                        somthing_killed = false;
//                    }
//                    whiteKing.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//
//        whiteKing.setPoint(Oldp);
//        return true;
//
//    }
//
//    public boolean CastleGenerate_moves(Player enemy, Rook whiteRook) {
//        boolean somthing_killed = false;
//        Point Oldp1 = new Point();
//
//        Point PlaceCheck = new Point();
//        int x1 = whiteRook.returnX();
//        int y1 = whiteRook.returnY();
//
//        if (whiteRook == whiteRook1) {
//            inHand = 17;
//        } else {
//            inHand = 18;
//        }
//        /////////////////////
//
//        Oldp1.x = x1;
//        Oldp1.y = y1;
//
//        PlaceCheck.y = y1;
//
//        if (x1 != 20) {
//            for (int i = 1; i <= 8; i++) {
//                whiteRook.setX(i);
//                PlaceCheck.x = i;
//
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteRook.setX(Oldp1.x);
//                            whiteRook.setY(Oldp1.y);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteRook.setX(Oldp1.x);
//            PlaceCheck.x = Oldp1.x;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//            for (int i = 1; i <= 8; i++) {
//                whiteRook.setY(i);
//                PlaceCheck.y = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteRook.setX(Oldp1.x);
//                            whiteRook.setY(Oldp1.y);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteRook.setY(Oldp1.y);
//        }
//        //////////////////////////////////////////
//        ///////////////////////////
//
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//        whiteRook.setX(Oldp1.x);
//        whiteRook.setY(Oldp1.y);
//        return true;
//    }
//
//    public boolean BishopGenerate_moves(Player enemy, Bishop whiteBishop) {
//        boolean somthing_killed = false;
//        Point Oldp1 = new Point();
//        Point PlaceCheck = new Point();
//
//        Oldp1 = whiteBishop.returnposition();
//
//        if (whiteBishop == whiteBishop1) {
//            inHand = 21;
//        } else {
//            inHand = 22;
//        }
//
//        if (Oldp1.x != 20) {
//            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {
//
//                whiteBishop.setX(x);
//                whiteBishop.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            whiteBishop.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {
//
//                whiteBishop.setX(x);
//                whiteBishop.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            whiteBishop.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteBishop.setPoint(Oldp1);
//
//        }
//
//        whiteBishop.setPoint(Oldp1);
//
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//
//        return true;
//    }
//
//    public boolean HosreGenerate_moves(Player enemy, Knight WhiteKnight) {
//        Point oldp1 = new Point();
//        boolean somthing_killed = false;
//        oldp1 = WhiteKnight.returnposition();
//
//        Point PlaceCheck = new Point();
//
//        if (WhiteKnight == whiteKnight1) {
//            inHand = 19;
//        } else {
//            inHand = 20;
//        }
//
//        int x = oldp1.x;
//        int y = oldp1.y;
//
//        if (x != 20) {
//
//            if (x + 1 <= 8 && y + 1 <= 8) {
//                WhiteKnight.setX(x + 1);
//                WhiteKnight.setY(y + 2);
//                PlaceCheck.x = x + 1;
//                PlaceCheck.y = y + 2;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        WhiteKnight.setPoint(oldp1);
//
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x + 1 <= 8 && y - 2 >= 1) {
//                WhiteKnight.setX(x + 1);
//                WhiteKnight.setY(y - 2);
//                PlaceCheck.x = x + 1;
//                PlaceCheck.y = y - 2;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x + 2 <= 8 && y + 1 <= 8) {
//                WhiteKnight.setX(x + 2);
//                WhiteKnight.setY(y + 1);
//                PlaceCheck.x = x + 2;
//                PlaceCheck.y = y + 1;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//            if (x + 2 <= 8 && y - 1 >= 1) {
//                WhiteKnight.setX(x + 2);
//                WhiteKnight.setY(y - 1);
//                PlaceCheck.x = x + 2;
//                PlaceCheck.y = y - 1;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x - 1 >= 1 && y + 2 <= 8) {
//                WhiteKnight.setX(x - 1);
//                WhiteKnight.setY(y + 2);
//                PlaceCheck.x = x - 1;
//                PlaceCheck.y = y + 2;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x - 1 >= 1 && y - 2 >= 1) {
//                WhiteKnight.setX(x - 1);
//                WhiteKnight.setY(y - 2);
//                PlaceCheck.x = x - 1;
//                PlaceCheck.y = y - 2;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x - 2 >= 1 && y + 1 <= 8) {
//                WhiteKnight.setX(x - 2);
//                WhiteKnight.setY(y + 1);
//                PlaceCheck.x = x - 2;
//                PlaceCheck.y = y + 1;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            if (x - 2 >= 1 && y - 1 >= 1) {
//                WhiteKnight.setX(x - 2);
//                WhiteKnight.setY(y - 1);
//                PlaceCheck.x = x - 2;
//                PlaceCheck.y = y - 1;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, killToProtect);
//                            somthing_killed = false;
//                        }
//                        WhiteKnight.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//        }
//        WhiteKnight.setPoint(oldp1);
//
//        return true;
//    }
//
//    public boolean QueenGenerate_moves(Player enemy) {
//        boolean somthing_killed = false;
//
//        Point Oldp1 = new Point();
//
//        Oldp1 = whiteQueen.returnposition();
//
//        Point PlaceCheck = new Point();
//
//        inHand = 23;
//
//        if (Oldp1.x != 20) {
//            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {
//
//                whiteQueen.setX(x);
//                whiteQueen.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteQueen.setPoint(Oldp1);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {
//
//                whiteQueen.setX(x);
//                whiteQueen.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteQueen.setPoint(Oldp1);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteQueen.setPoint(Oldp1);
//            PlaceCheck.x = Oldp1.x;
//            PlaceCheck.y = Oldp1.y;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            for (int i = 1; i <= 8; i++) {
//                whiteQueen.setX(i);
//
//                PlaceCheck.x = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteQueen.setX(Oldp1.x);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteQueen.setX(Oldp1.x);
//            PlaceCheck.x = Oldp1.x;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, killToProtect);
//                somthing_killed = false;
//            }
//
//            for (int i = 1; i <= 8; i++) {
//                whiteQueen.setY(i);
//                PlaceCheck.y = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            whiteQueen.setY(Oldp1.y);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, killToProtect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, killToProtect);
//                    somthing_killed = false;
//                }
//
//            }
//            whiteQueen.setY(Oldp1.y);
//        }
//
//        if (somthing_killed) {
//            enemy.changeposition(other, killToProtect);
//            somthing_killed = false;
//        }
//
//        return true;
//
//    }
//
//    public boolean SoliderGenerate_moves(Player enemy, Pawn myPawn) {
//        Point Oldp1 = new Point();
//        Oldp1 = myPawn.returnposition();
//        Point PlaceCheck = new Point();
//        PlaceCheck.x = Oldp1.x;
//        PlaceCheck.y = Oldp1.y;
//
//        if (Oldp1.x != 20) {
//            if (myPawn.Canmove(Oldp1.x, Oldp1.y - 2, color) && Oldp1.y - 2 >= 1) {
//                myPawn.setY(Oldp1.y - 2);
//
//                PlaceCheck.y = Oldp1.y - 1;
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
//                        if (!see_king_Check(enemy)) {
//
//                            myPawn.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//            }
//            if (myPawn.Canmove(Oldp1.x, Oldp1.y - 1, color) && Oldp1.y - 1 >= 1) {
//                myPawn.setY(Oldp1.y - 1);
//                PlaceCheck.y = Oldp1.y - 1;
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
//
//                        if (!see_king_Check(enemy)) {
//                            myPawn.setPoint(Oldp1);
//                            System.out.println("dff");
//                            System.out.println("dff");
//                            System.out.println("dff");
//                            return false;
//                        }
//                    }
//                }
//            }
//
//            if (!Pice_already_there_from_enemy(new Point(Oldp1.x - 1, Oldp1.y - 1), enemy)) {
//                if (kill_to_protect_king(enemy, new Point(Oldp1.x - 1, Oldp1.y - 1))) {
//
//                    if (!see_king_Check(enemy)) {
//                        enemy.changeposition(other, killToProtect);
//                        myPawn.setPoint(Oldp1);
//
//                        return false;
//                    }
//                    enemy.changeposition(other, killToProtect);
//                }
//            }
//
//            if (!Pice_already_there_from_enemy(new Point(Oldp1.x + 1, Oldp1.y - 1), enemy)) {
//                if (kill_to_protect_king(enemy, new Point(Oldp1.x + 1, Oldp1.y - 1))) {
//                    if (!see_king_Check(enemy)) {
//                        enemy.changeposition(other, killToProtect);
//                        myPawn.setPoint(Oldp1);
//
//                        return false;
//                    }
//                    enemy.changeposition(other, killToProtect);
//
//                }
//            }
//
//        }
//
//        myPawn.setPoint(Oldp1);
//        return true;
//    }
//
//    public boolean Check_The_Way_to_position(Player enemy, Point newP) {
//        boolean flag = false;
//
//        // for (int i = 1; i <= 32; i++) {
//        // if (inHand != i)// check if there is peices in the WAY
//        // {
//        // if (i < 17) {
//        // flag = checktheWay(newP, enemy.returnposition(i), inHand);// Means there is
//        // somting in the Way so
//        // } else {
//        // flag = checktheWay(newP, returnposition(i), inHand);
//        // }
//        //
//        // if (flag == true) {
//        // return false;
//        // } // Means there is a Pice in the Way
//        // }
//        // }
//        return true;
//
//    }
//
//    public boolean kill_to_protect_king(Player enemy, Point newP) {
//
//        for (int i = 1; i < 17; i++) {
//
//            other = enemy.returnposition(i);
//            if (other.x == newP.x && other.y == newP.y) {
//                killToProtect = i;
//
//                enemy.Killedpiec(i);
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public String Tell_me_About_last_move() {
//        switch (inHand) {
//
//        case 17:
//            return whiteRook1.Tell_me();
//        case 18:
//            return whiteRook2.Tell_me();
//        case 19:
//            return whiteKnight1.Tell_me();
//        case 20:
//            return whiteKnight2.Tell_me();
//        case 21:
//            return whiteBishop1.Tell_me();
//        case 22:
//            return whiteBishop2.Tell_me();
//        case 23:
//            return whiteQueen.Tell_me();
//        case 24:
//            return whiteKing.Tell_me();
//        case 25:
//            return whitePawns[0].Tell_me();
//        case 26:
//            return whitePawns[1].Tell_me();
//        case 27:
//            return whitePawns[2].Tell_me();
//        case 28:
//            return whitePawns[3].Tell_me();
//        case 29:
//            return whitePawns[4].Tell_me();
//        case 30:
//            return whitePawns[5].Tell_me();
//        case 31:
//            return whitePawns[6].Tell_me();
//        case 32:
//            return whitePawns[7].Tell_me();
//        default:
//            break;
//        }
//        return null;
//    }
//}