//base template for players to extend from.There is no modularity for all the players.What if they wanted 4 player chess?Etc.
//package players;
//
//import java.awt.Image;
//import java.awt.Point;
//
//import pieces.*;
//
//public class Player {
//    public Rook WC1;
//    public Rook WC2;
//    public Knight WH1;
//    public Knight WH2;
//    public Queen WQ;
//    public Bishop WE1;
//    public Bishop WE2;
//    public Pawn[] WS = new Pawn[8];
//    public King WK;
//    private int inHand = -1;
//    private boolean kingischeck = false;
//    private int choosenOne;
//    public String Color = "white";
//    private Point other;
//    int ate_to_protect;
//
//    public Point returnposition(int i) {
//
//        switch (i) {
//
//        case 17:
//            return WC1.returnposition();
//        case 18:
//            return WC2.returnposition();
//        case 19:
//            return WH1.returnposition();
//        case 20:
//            return WH2.returnposition();
//        case 21:
//            return WE1.returnposition();
//        case 22:
//            return WE2.returnposition();
//        case 23:
//            return WQ.returnposition();
//        case 24:
//            return WK.returnposition();
//        case 25:
//            return WS[0].returnposition();
//        case 26:
//            return WS[1].returnposition();
//        case 27:
//            return WS[2].returnposition();
//        case 28:
//            return WS[3].returnposition();
//        case 29:
//            return WS[4].returnposition();
//        case 30:
//            return WS[5].returnposition();
//        case 31:
//            return WS[6].returnposition();
//        case 32:
//            return WS[7].returnposition();
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
//            return WC1.returnOld();
//        case 18:
//            return WC2.returnOld();
//        case 19:
//            return WH1.returnOld();
//        case 20:
//            return WH2.returnOld();
//        case 21:
//            return WE1.returnOld();
//        case 22:
//            return WE2.returnOld();
//        case 23:
//            return WQ.returnOld();
//        case 24:
//            return WK.returnOld();
//        case 25:
//            return WS[0].returnOld();
//        case 26:
//            return WS[1].returnOld();
//        case 27:
//            return WS[2].returnOld();
//        case 28:
//            return WS[3].returnOld();
//        case 29:
//            return WS[4].returnOld();
//        case 30:
//            return WS[5].returnOld();
//        case 31:
//            return WS[6].returnOld();
//        case 32:
//            return WS[7].returnOld();
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
//            return WC1.returnPieceImage();
//
//        case 17:
//            return WC1.returnPieceImage();
//        case 18:
//            return WC2.returnPieceImage();
//        case 19:
//            return WH1.returnPieceImage();
//        case 20:
//            return WH2.returnPieceImage();
//        case 21:
//            return WE1.returnPieceImage();
//        case 22:
//            return WE2.returnPieceImage();
//        case 23:
//            return WQ.returnPieceImage();
//        case 24:
//            return WK.returnPieceImage();
//        case 25:
//            return WS[0].returnPieceImage();
//        case 26:
//            return WS[1].returnPieceImage();
//        case 27:
//            return WS[2].returnPieceImage();
//        case 28:
//            return WS[3].returnPieceImage();
//        case 29:
//            return WS[4].returnPieceImage();
//        case 30:
//            return WS[5].returnPieceImage();
//        case 31:
//            return WS[6].returnPieceImage();
//        case 32:
//            return WS[7].returnPieceImage();
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
//            WC1.setPoint(newPoint);
//            break;
//        case 18:
//            WC2.setPoint(newPoint);
//            break;
//        case 19:
//            WH1.setPoint(newPoint);
//            break;
//        case 20:
//            WH2.setPoint(newPoint);
//            break;
//        case 21:
//            WE1.setPoint(newPoint);
//            break;
//        case 22:
//            WE2.setPoint(newPoint);
//            break;
//        case 23:
//            WQ.setPoint(newPoint);
//            break;
//        case 24:
//            WK.setPoint(newPoint);
//            break;
//        case 25:
//            WS[0].setPoint(newPoint);
//            break;
//        case 26:
//            WS[1].setPoint(newPoint);
//            break;
//        case 27:
//            WS[2].setPoint(newPoint);
//            break;
//        case 28:
//            WS[3].setPoint(newPoint);
//            break;
//        case 29:
//            WS[4].setPoint(newPoint);
//            break;
//        case 30:
//            WS[5].setPoint(newPoint);
//            break;
//        case 31:
//            WS[6].setPoint(newPoint);
//            break;
//        case 32:
//            WS[7].setPoint(newPoint);
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
//            WC1.toOld(newPoint);
//            break;
//        case 18:
//            WC2.toOld(newPoint);
//            break;
//        case 19:
//            WH1.toOld(newPoint);
//            break;
//        case 20:
//            WH2.toOld(newPoint);
//            break;
//        case 21:
//            WE1.toOld(newPoint);
//            break;
//        case 22:
//            WE2.toOld(newPoint);
//            break;
//        case 23:
//            WQ.toOld(newPoint);
//            break;
//        case 24:
//            WK.toOld(newPoint);
//            break;
//        case 25:
//            WS[0].toOld(newPoint);
//            break;
//        case 26:
//            WS[1].toOld(newPoint);
//            break;
//        case 27:
//            WS[2].toOld(newPoint);
//            break;
//        case 28:
//            WS[3].toOld(newPoint);
//            break;
//        case 29:
//            WS[4].toOld(newPoint);
//            break;
//        case 30:
//            WS[5].toOld(newPoint);
//            break;
//        case 31:
//            WS[6].toOld(newPoint);
//            break;
//        case 32:
//            WS[7].toOld(newPoint);
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
//            WC1.setPixels(newPixelX, newPixelY);
//            break;
//        case 18:
//            WC2.setPixels(newPixelX, newPixelY);
//            break;
//        case 19:
//            WH1.setPixels(newPixelX, newPixelY);
//            break;
//        case 20:
//            WH2.setPixels(newPixelX, newPixelY);
//            break;
//        case 21:
//            WE1.setPixels(newPixelX, newPixelY);
//            break;
//        case 22:
//            WE2.setPixels(newPixelX, newPixelY);
//            break;
//        case 23:
//            WQ.setPixels(newPixelX, newPixelY);
//            break;
//        case 24:
//            WK.setPixels(newPixelX, newPixelY);
//            break;
//        case 25:
//            WS[0].setPixels(newPixelX, newPixelY);
//            break;
//        case 26:
//            WS[1].setPixels(newPixelX, newPixelY);
//            break;
//        case 27:
//            WS[2].setPixels(newPixelX, newPixelY);
//            break;
//        case 28:
//            WS[3].setPixels(newPixelX, newPixelY);
//            break;
//        case 29:
//            WS[4].setPixels(newPixelX, newPixelY);
//            break;
//        case 30:
//            WS[5].setPixels(newPixelX, newPixelY);
//            break;
//        case 31:
//            WS[6].setPixels(newPixelX, newPixelY);
//            break;
//        case 32:
//            WS[7].setPixels(newPixelX, newPixelY);
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
//            return WC1.getpixelPoint();
//
//        case 17:
//            return WC1.getpixelPoint();
//        case 18:
//            return WC2.getpixelPoint();
//        case 19:
//            return WH1.getpixelPoint();
//        case 20:
//            return WH2.getpixelPoint();
//        case 21:
//            return WE1.getpixelPoint();
//        case 22:
//            return WE2.getpixelPoint();
//        case 23:
//            return WQ.getpixelPoint();
//        case 24:
//            return WK.getpixelPoint();
//        case 25:
//            return WS[0].getpixelPoint();
//        case 26:
//            return WS[1].getpixelPoint();
//        case 27:
//            return WS[2].getpixelPoint();
//        case 28:
//            return WS[3].getpixelPoint();
//        case 29:
//            return WS[4].getpixelPoint();
//        case 30:
//            return WS[5].getpixelPoint();
//        case 31:
//            return WS[6].getpixelPoint();
//        case 32:
//            return WS[7].getpixelPoint();
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
//            return WC1.Canmove(newP.x, newP.y);
//        case 18:
//            return WC2.Canmove(newP.x, newP.y);
//        case 19:
//            return WH1.Canmove(newP.x, newP.y);
//        case 20:
//            return WH2.Canmove(newP.x, newP.y);
//        case 21:
//            return WE1.Canmove(newP.x, newP.y);
//        case 22:
//            return WE2.Canmove(newP.x, newP.y);
//        case 23:
//            return WQ.Canmove(newP.x, newP.y);
//        case 24:
//            return WK.Canmove(newP.x, newP.y);
//        case 25:
//            return WS[0].Canmove(newP.x, newP.y, Color);
//        case 26:
//            return WS[1].Canmove(newP.x, newP.y, Color);
//        case 27:
//            return WS[2].Canmove(newP.x, newP.y, Color);
//        case 28:
//            return WS[3].Canmove(newP.x, newP.y, Color);
//        case 29:
//            return WS[4].Canmove(newP.x, newP.y, Color);
//        case 30:
//            return WS[5].Canmove(newP.x, newP.y, Color);
//        case 31:
//            return WS[6].Canmove(newP.x, newP.y, Color);
//        case 32:
//            return WS[7].Canmove(newP.x, newP.y, Color);
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public boolean setSeentoSiliders(int i, Point P) {
//        switch (i) {
//        case 25:
//            return WS[0].setSeenbychecking(P, Color);
//        case 26:
//            return WS[1].setSeenbychecking(P, Color);
//        case 27:
//            return WS[2].setSeenbychecking(P, Color);
//        case 28:
//            return WS[3].setSeenbychecking(P, Color);
//        case 29:
//            return WS[4].setSeenbychecking(P, Color);
//        case 30:
//            return WS[5].setSeenbychecking(P, Color);
//        case 31:
//            return WS[6].setSeenbychecking(P, Color);
//        case 32:
//            return WS[7].setSeenbychecking(P, Color);
//        default:
//            break;
//        }
//        return false;
//    }
//
//    public boolean returnsoliderSeen(int i) {
//        switch (i) {
//        case 25:
//            return WS[0].returnMyseen();
//        case 26:
//            return WS[1].returnMyseen();
//        case 27:
//            return WS[2].returnMyseen();
//        case 28:
//            return WS[3].returnMyseen();
//        case 29:
//            return WS[4].returnMyseen();
//        case 30:
//            return WS[5].returnMyseen();
//        case 31:
//            return WS[6].returnMyseen();
//        case 32:
//            return WS[7].returnMyseen();
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
//            return WC1.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 18:
//            return WC2.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 21:
//            return WE1.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 22:
//            return WE2.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 23:
//            return WQ.PieceInMYway(newP.x, newP.y, positionFromOthers);
//        case 25:
//            return WS[0].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 26:
//            return WS[1].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 27:
//            return WS[2].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 28:
//            return WS[3].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 29:
//            return WS[4].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 30:
//            return WS[5].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 31:
//            return WS[6].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
//        case 32:
//            return WS[7].PieceInMYway(newP.x, newP.y, positionFromOthers, Color);
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
//            WC1.setPoint(out);
//            return true;
//        case 18:
//            WC2.setPoint(out);
//            return true;
//        case 19:
//            WH1.setPoint(out);
//            return true;
//        case 20:
//            WH2.setPoint(out);
//            return true;
//        case 21:
//            WE1.setPoint(out);
//            return true;
//        case 22:
//            WE2.setPoint(out);
//            return true;
//        case 23:
//            WQ.setPoint(out);
//            return true;
//        case 24:
//            return false;
//        case 25:
//            WS[0].setPoint(out);
//            return true;
//        case 26:
//            WS[1].setPoint(out);
//            return true;
//        case 27:
//            WS[2].setPoint(out);
//            return true;
//        case 28:
//            WS[3].setPoint(out);
//            return true;
//        case 29:
//            WS[4].setPoint(out);
//            return true;
//        case 30:
//            WS[5].setPoint(out);
//            return true;
//        case 31:
//            WS[6].setPoint(out);
//            return true;
//        case 32:
//            WS[7].setPoint(out);
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
//            return WC1.checkKing(p1.x, p1.y, p2);
//        case 18:
//            return WC2.checkKing(p1.x, p1.y, p2);
//        case 19:
//            return WH1.Canmove(p1.x, p1.y);
//        case 20:
//            return WH2.Canmove(p1.x, p1.y);
//        case 21:
//            return WE1.checkKing(p1.x, p1.y, p2);
//        case 22:
//            return WE2.checkKing(p1.x, p1.y, p2);
//        case 23:
//            return WQ.checkKing(p1.x, p1.y, p2);
//
//        case 25:
//            return WS[0].Canmove(p1.x, p1.y, Color);
//        case 26:
//            return WS[1].Canmove(p1.x, p1.y, Color);
//        case 27:
//            return WS[2].Canmove(p1.x, p1.y, Color);
//        case 28:
//            return WS[3].Canmove(p1.x, p1.y, Color);
//        case 29:
//            return WS[4].Canmove(p1.x, p1.y, Color);
//        case 30:
//            return WS[5].Canmove(p1.x, p1.y, Color);
//        case 31:
//            return WS[6].Canmove(p1.x, p1.y, Color);
//        case 32:
//            return WS[7].Canmove(p1.x, p1.y, Color);
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
//        } else if (!CastleGenerate_moves(Enemy, WC1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!CastleGenerate_moves(Enemy, WC2)) {
//
//            inHand = -1;
//            return false;
//        } else if (!BishopGenerate_moves(Enemy, WE1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!BishopGenerate_moves(Enemy, WE2)) {
//
//            inHand = -1;
//            return false;
//        } else if (!HosreGenerate_moves(Enemy, WH1)) {
//
//            inHand = -1;
//            return false;
//        } else if (!HosreGenerate_moves(Enemy, WH2)) {
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
//            if (!SoliderGenerate_moves(Enemy, WS[i])) {
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
//        Point My_King_position = WK.returnposition();
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
//                if (Black.setSeentoSiliders(i, My_King_position)) {
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
//                // If so we Can't move (Same Color)!!
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
//        int x = WK.returnX();
//        int y = WK.returnY();
//        Oldp.x = x;
//        Oldp.y = y;
//
//        if (x + 1 <= 8) {
//
//            WK.setX(x + 1);
//            WK.setY(y);
//            PlaceCheck.x = x + 1;
//            PlaceCheck.y = y;
//
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    WK.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8) {
//
//            WK.setX(x);
//            WK.setY(y + 1);
//            PlaceCheck.x = x;
//            PlaceCheck.y = y + 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//
//                    WK.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    return false;
//
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//
//        if (y - 1 > 0) {
//
//            WK.setX(x);
//            WK.setY(y - 1);
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
//                    WK.setPoint(Oldp);
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (x - 1 > 0) {
//
//            WK.setX(x - 1);
//            WK.setY(y);
//
//            PlaceCheck.x = x - 1;
//            PlaceCheck.y = y;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    WK.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (y - 1 > 0 && x - 1 > 0) {
//
//            WK.setX(x - 1);
//            WK.setY(y - 1);
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
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    WK.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8 && x + 1 <= 8) {
//
//            WK.setX(x + 1);
//            WK.setY(y + 1);
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
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    WK.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (y - 1 > 0 && x + 1 <= 8) {
//
//            WK.setX(x + 1);
//            WK.setY(y - 1);
//
//            PlaceCheck.x = x + 1;
//            PlaceCheck.y = y - 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    WK.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//        WK.setPoint(Oldp);
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        if (y + 1 <= 8 && x - 1 > 0) {
//
//            WK.setX(x - 1);
//            WK.setY(y + 1);
//
//            PlaceCheck.x = x - 1;
//            PlaceCheck.y = y + 1;
//            if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                somthing_killed = true;
//            }
//            if (Pice_already_there(PlaceCheck)) {
//                if (!see_king_Check(enemy)) {
//                    if (somthing_killed) {
//                        enemy.changeposition(other, ate_to_protect);
//                        somthing_killed = false;
//                    }
//                    WK.setPoint(Oldp);
//                    return false;
//                }
//            }
//
//        }
//
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//
//        WK.setPoint(Oldp);
//        return true;
//
//    }
//
//    public boolean CastleGenerate_moves(Player enemy, Rook WC) {
//        boolean somthing_killed = false;
//        Point Oldp1 = new Point();
//
//        Point PlaceCheck = new Point();
//        int x1 = WC.returnX();
//        int y1 = WC.returnY();
//
//        if (WC == WC1) {
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
//                WC.setX(i);
//                PlaceCheck.x = i;
//
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WC.setX(Oldp1.x);
//                            WC.setY(Oldp1.y);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WC.setX(Oldp1.x);
//            PlaceCheck.x = Oldp1.x;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//            for (int i = 1; i <= 8; i++) {
//                WC.setY(i);
//                PlaceCheck.y = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WC.setX(Oldp1.x);
//                            WC.setY(Oldp1.y);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WC.setY(Oldp1.y);
//        }
//        //////////////////////////////////////////
//        ///////////////////////////
//
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//        WC.setX(Oldp1.x);
//        WC.setY(Oldp1.y);
//        return true;
//    }
//
//    public boolean BishopGenerate_moves(Player enemy, Bishop WE) {
//        boolean somthing_killed = false;
//        Point Oldp1 = new Point();
//        Point PlaceCheck = new Point();
//
//        Oldp1 = WE.returnposition();
//
//        if (WE == WE1) {
//            inHand = 21;
//        } else {
//            inHand = 22;
//        }
//
//        if (Oldp1.x != 20) {
//            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {
//
//                WE.setX(x);
//                WE.setY(y);
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
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            WE.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {
//
//                WE.setX(x);
//                WE.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            WE.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WE.setPoint(Oldp1);
//
//        }
//
//        WE.setPoint(Oldp1);
//
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//
//        return true;
//    }
//
//    public boolean HosreGenerate_moves(Player enemy, Knight WH) {
//        Point oldp1 = new Point();
//        boolean somthing_killed = false;
//        oldp1 = WH.returnposition();
//
//        Point PlaceCheck = new Point();
//
//        if (WH == WH1) {
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
//                WH.setX(x + 1);
//                WH.setY(y + 2);
//                PlaceCheck.x = x + 1;
//                PlaceCheck.y = y + 2;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        WH.setPoint(oldp1);
//
//                        if (somthing_killed) {
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x + 1 <= 8 && y - 2 >= 1) {
//                WH.setX(x + 1);
//                WH.setY(y - 2);
//                PlaceCheck.x = x + 1;
//                PlaceCheck.y = y - 2;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x + 2 <= 8 && y + 1 <= 8) {
//                WH.setX(x + 2);
//                WH.setY(y + 1);
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
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//            if (x + 2 <= 8 && y - 1 >= 1) {
//                WH.setX(x + 2);
//                WH.setY(y - 1);
//                PlaceCheck.x = x + 2;
//                PlaceCheck.y = y - 1;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x - 1 >= 1 && y + 2 <= 8) {
//                WH.setX(x - 1);
//                WH.setY(y + 2);
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
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x - 1 >= 1 && y - 2 >= 1) {
//                WH.setX(x - 1);
//                WH.setY(y - 2);
//                PlaceCheck.x = x - 1;
//                PlaceCheck.y = y - 2;
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x - 2 >= 1 && y + 1 <= 8) {
//                WH.setX(x - 2);
//                WH.setY(y + 1);
//                PlaceCheck.x = x - 2;
//                PlaceCheck.y = y + 1;
//
//                if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                    somthing_killed = true;
//                }
//                if (Pice_already_there(PlaceCheck)) {
//                    if (!see_king_Check(enemy)) {
//                        if (somthing_killed) {
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            if (x - 2 >= 1 && y - 1 >= 1) {
//                WH.setX(x - 2);
//                WH.setY(y - 1);
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
//                            enemy.changeposition(other, ate_to_protect);
//                            somthing_killed = false;
//                        }
//                        WH.setPoint(oldp1);
//                        return false;
//                    }
//                }
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//        }
//        WH.setPoint(oldp1);
//
//        return true;
//    }
//
//    public boolean QueenGenerate_moves(Player enemy) {
//        boolean somthing_killed = false;
//
//        Point Oldp1 = new Point();
//
//        Oldp1 = WQ.returnposition();
//
//        Point PlaceCheck = new Point();
//
//        inHand = 23;
//
//        if (Oldp1.x != 20) {
//            for (int x = Oldp1.x, y = Oldp1.y; x >= 1 && y <= 8; x--, y++) {
//
//                WQ.setX(x);
//                WQ.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WQ.setPoint(Oldp1);
//
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//            for (int x = Oldp1.x, y = Oldp1.y; y >= 1 && x <= 8; x++, y--) {
//
//                WQ.setX(x);
//                WQ.setY(y);
//                PlaceCheck.x = x;
//                PlaceCheck.y = y;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WQ.setPoint(Oldp1);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WQ.setPoint(Oldp1);
//            PlaceCheck.x = Oldp1.x;
//            PlaceCheck.y = Oldp1.y;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            for (int i = 1; i <= 8; i++) {
//                WQ.setX(i);
//
//                PlaceCheck.x = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WQ.setX(Oldp1.x);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WQ.setX(Oldp1.x);
//            PlaceCheck.x = Oldp1.x;
//
//            if (somthing_killed) {
//                enemy.changeposition(other, ate_to_protect);
//                somthing_killed = false;
//            }
//
//            for (int i = 1; i <= 8; i++) {
//                WQ.setY(i);
//                PlaceCheck.y = i;
//                if (Check_The_Way_to_position(enemy, Oldp1)) {
//                    if (kill_to_protect_king(enemy, returnposition(inHand))) {
//                        somthing_killed = true;
//                    }
//                    if (Pice_already_there(PlaceCheck)) {
//                        if (!see_king_Check(enemy)) {
//                            WQ.setY(Oldp1.y);
//                            if (somthing_killed) {
//                                enemy.changeposition(other, ate_to_protect);
//                                somthing_killed = false;
//                            }
//                            return false;
//                        }
//                    }
//                }
//
//                if (somthing_killed) {
//                    enemy.changeposition(other, ate_to_protect);
//                    somthing_killed = false;
//                }
//
//            }
//            WQ.setY(Oldp1.y);
//        }
//
//        if (somthing_killed) {
//            enemy.changeposition(other, ate_to_protect);
//            somthing_killed = false;
//        }
//
//        return true;
//
//    }
//
//    public boolean SoliderGenerate_moves(Player enemy, Pawn Sold) {
//        Point Oldp1 = new Point();
//        Oldp1 = Sold.returnposition();
//        Point PlaceCheck = new Point();
//        PlaceCheck.x = Oldp1.x;
//        PlaceCheck.y = Oldp1.y;
//
//        if (Oldp1.x != 20) {
//            if (Sold.Canmove(Oldp1.x, Oldp1.y - 2, Color) && Oldp1.y - 2 >= 1) {
//                Sold.setY(Oldp1.y - 2);
//
//                PlaceCheck.y = Oldp1.y - 1;
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
//                        if (!see_king_Check(enemy)) {
//
//                            Sold.setPoint(Oldp1);
//                            return false;
//                        }
//                    }
//                }
//
//            }
//            if (Sold.Canmove(Oldp1.x, Oldp1.y - 1, Color) && Oldp1.y - 1 >= 1) {
//                Sold.setY(Oldp1.y - 1);
//                PlaceCheck.y = Oldp1.y - 1;
//
//                if (Pice_already_there(PlaceCheck)) {
//                    if (Pice_already_there_from_enemy(PlaceCheck, enemy)) {
//
//                        if (!see_king_Check(enemy)) {
//                            Sold.setPoint(Oldp1);
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
//                        enemy.changeposition(other, ate_to_protect);
//                        Sold.setPoint(Oldp1);
//
//                        return false;
//                    }
//                    enemy.changeposition(other, ate_to_protect);
//                }
//            }
//
//            if (!Pice_already_there_from_enemy(new Point(Oldp1.x + 1, Oldp1.y - 1), enemy)) {
//                if (kill_to_protect_king(enemy, new Point(Oldp1.x + 1, Oldp1.y - 1))) {
//                    if (!see_king_Check(enemy)) {
//                        enemy.changeposition(other, ate_to_protect);
//                        Sold.setPoint(Oldp1);
//
//                        return false;
//                    }
//                    enemy.changeposition(other, ate_to_protect);
//
//                }
//            }
//
//        }
//
//        Sold.setPoint(Oldp1);
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
//                ate_to_protect = i;
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
//            return WC1.Tell_me();
//        case 18:
//            return WC2.Tell_me();
//        case 19:
//            return WH1.Tell_me();
//        case 20:
//            return WH2.Tell_me();
//        case 21:
//            return WE1.Tell_me();
//        case 22:
//            return WE2.Tell_me();
//        case 23:
//            return WQ.Tell_me();
//        case 24:
//            return WK.Tell_me();
//        case 25:
//            return WS[0].Tell_me();
//        case 26:
//            return WS[1].Tell_me();
//        case 27:
//            return WS[2].Tell_me();
//        case 28:
//            return WS[3].Tell_me();
//        case 29:
//            return WS[4].Tell_me();
//        case 30:
//            return WS[5].Tell_me();
//        case 31:
//            return WS[6].Tell_me();
//        case 32:
//            return WS[7].Tell_me();
//        default:
//            break;
//        }
//        return null;
//    }
//}