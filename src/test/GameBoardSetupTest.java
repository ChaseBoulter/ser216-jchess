package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import mainframe.chessframe.ChatPanel;
import mainframe.chessframe.MainFrame;
import mainframe.chessframe.MainPanel;
import mainframe.chessframe.ToolPanel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Bishop;
import pieces.Knight;
import pieces.Pawn;
import pieces.Rook;
import players.Player1;
import players.Player2;

public class GameBoardSetupTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The (white) Player 1. */
    protected static Player1 player1;

    /** The (black) Player 2. */
    protected static Player2 player2;

    /**
     * Setup.
     * @throws Exception Throws Exception.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        player1 = new Player1();
        player2 = new Player2();
    }

    /**
     * Tear Down.
     * @throws Exception Throws Exception.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        player1 = null;
        player2 = null;
        LOG.info("@AfterClass GameBoardSetupTest complete");
    }

    /**
     * Test Setup White.
     */
    @Test
    public void testGameSetupWhite() {
        assertTrue(player1.returnPostion(17).getX() == 8);
        assertTrue(player1.returnPostion(17).getY() == 8);

        assertTrue(player1.returnPostion(18).getX() == 1);
        assertTrue(player1.returnPostion(18).getY() == 8);

        assertTrue(player1.returnPostion(19).getX() == 2);
        assertTrue(player1.returnPostion(19).getY() == 8);

        assertTrue(player1.returnPostion(20).getX() == 7);
        assertTrue(player1.returnPostion(20).getY() == 8);

        assertTrue(player1.returnPostion(21).getX() == 3);
        assertTrue(player1.returnPostion(21).getY() == 8);

        assertTrue(player1.returnPostion(22).getX() == 6);
        assertTrue(player1.returnPostion(22).getY() == 8);

        assertTrue(player1.returnPostion(23).getX() == 4);
        assertTrue(player1.returnPostion(23).getY() == 8);

        assertTrue(player1.returnPostion(24).getX() == 5);
        assertTrue(player1.returnPostion(24).getY() == 8);

        assertTrue(player1.returnPostion(25).getX() == 1);
        assertTrue(player1.returnPostion(25).getY() == 7);

        assertTrue(player1.returnPostion(26).getX() == 2);
        assertTrue(player1.returnPostion(26).getY() == 7);

        assertTrue(player1.returnPostion(27).getX() == 3);
        assertTrue(player1.returnPostion(27).getY() == 7);

        assertTrue(player1.returnPostion(28).getX() == 4);
        assertTrue(player1.returnPostion(28).getY() == 7);

        assertTrue(player1.returnPostion(29).getX() == 5);
        assertTrue(player1.returnPostion(29).getY() == 7);

        assertTrue(player1.returnPostion(30).getX() == 6);
        assertTrue(player1.returnPostion(30).getY() == 7);

        assertTrue(player1.returnPostion(31).getX() == 7);
        assertTrue(player1.returnPostion(31).getY() == 7);

        assertTrue(player1.returnPostion(32).getX() == 8);
        assertTrue(player1.returnPostion(32).getY() == 7);
    }

    @Test
    public void testGameSetupBlack() {
        assertTrue(player2.returnPostion(1).getX() == 1);
        assertTrue(player2.returnPostion(1).getY() == 1);

        assertTrue(player2.returnPostion(2).getX() == 8);
        assertTrue(player2.returnPostion(2).getY() == 1);

        assertTrue(player2.returnPostion(3).getX() == 2);
        assertTrue(player2.returnPostion(3).getY() == 1);

        assertTrue(player2.returnPostion(4).getX() == 7);
        assertTrue(player2.returnPostion(4).getY() == 1);

        assertTrue(player2.returnPostion(5).getX() == 3);
        assertTrue(player2.returnPostion(5).getY() == 1);

        assertTrue(player2.returnPostion(6).getX() == 6);
        assertTrue(player2.returnPostion(6).getY() == 1);

        assertTrue(player2.returnPostion(7).getX() == 4);
        assertTrue(player2.returnPostion(7).getY() == 1);

        assertTrue(player2.returnPostion(8).getX() == 5);
        assertTrue(player2.returnPostion(8).getY() == 1);

        assertTrue(player2.returnPostion(9).getX() == 1);
        assertTrue(player2.returnPostion(9).getY() == 2);

        assertTrue(player2.returnPostion(10).getX() == 2);
        assertTrue(player2.returnPostion(10).getY() == 2);

        assertTrue(player2.returnPostion(11).getX() == 3);
        assertTrue(player2.returnPostion(11).getY() == 2);

        assertTrue(player2.returnPostion(12).getX() == 4);
        assertTrue(player2.returnPostion(12).getY() == 2);

        assertTrue(player2.returnPostion(13).getX() == 5);
        assertTrue(player2.returnPostion(13).getY() == 2);

        assertTrue(player2.returnPostion(14).getX() == 6);
        assertTrue(player2.returnPostion(14).getY() == 2);

        assertTrue(player2.returnPostion(15).getX() == 7);
        assertTrue(player2.returnPostion(15).getY() == 2);

        assertTrue(player2.returnPostion(16).getX() == 8);
        assertTrue(player2.returnPostion(16).getY() == 2);
    }

    @Test
    public void testPlayer1CheckMove() {

        assertFalse(player1.checkMove(new Point(1, 1), 17));
        assertTrue(player1.checkMove(new Point(1, 1), 18));
        assertFalse(player1.checkMove(new Point(1, 1), 19));
        assertFalse(player1.checkMove(new Point(1, 1), 20));
        assertFalse(player1.checkMove(new Point(1, 1), 21));
        assertFalse(player1.checkMove(new Point(4, 4), 22));
        assertFalse(player1.checkMove(new Point(1, 1), 23));
        assertFalse(player1.checkMove(new Point(3, 1), 24));
        assertFalse(player1.checkMove(new Point(3, 1), 25));
        assertFalse(player1.checkMove(new Point(3, 6), 26));
        assertFalse(player1.checkMove(new Point(1, 5), 27));
        assertFalse(player1.checkMove(new Point(7, 1), 28));
        assertFalse(player1.checkMove(new Point(6, 5), 29));
        assertFalse(player1.checkMove(new Point(1, 2), 30));
        assertFalse(player1.checkMove(new Point(5, 3), 31));
        assertFalse(player1.checkMove(new Point(2, 4), 32));

    }

    @Test
    public void testGenerateBishopMoves() {

        Bishop whiteBishop = new Bishop( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteBishop.png", 3, 8);
        Bishop blackBishop = new Bishop( fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackBishop.png", 3, 1);
        assertFalse(player1.generateBishopMoves(player2, whiteBishop));
        assertFalse(player2.generateBishopMoves(player1, blackBishop));
    }

    /**
     * Test generateCastleMoves.
     */
    @Test
    public void testGenerateCastleMoves() {
        Rook whiteRook1 = new Rook(fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "blackRook.png", 1, 1);
        assertTrue(player1.generateCastleMoves(player2, whiteRook1));
    }

    /**
     * Test generateHorseMoves.
     */
    @Test
    public void testGenerateKnightMoves() {
        Knight whiteKnight1 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 2, 8);
        Knight whiteKnight2 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 3, 3);
        Knight whiteKnight3 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 4, 5);
        Knight whiteKnight4 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteKnight.png", 7, 6);
        Knight blackKnight1 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 2, 1);
        Knight blackKnight2 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 7, 1);
        Knight blackKnight3 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 3, 2);
        Knight blackKnight4 = new Knight( fileSeparator + "Icons" + fileSeparator
                + "Player2Icons" + fileSeparator + "blackKnight.png", 6, 2);

        assertFalse(player1.generateHorseMoves(player2, whiteKnight1));
        assertFalse(player1.generateHorseMoves(player2, whiteKnight2));
        assertFalse(player1.generateHorseMoves(player2, whiteKnight3));
        assertFalse(player1.generateHorseMoves(player2, whiteKnight4));
        assertFalse(player2.generateKnightMoves(player1, blackKnight1));
        assertFalse(player2.generateKnightMoves(player1, blackKnight2));
        assertFalse(player2.generateKnightMoves(player1, blackKnight3));
        assertFalse(player2.generateKnightMoves(player1, blackKnight4));
    }

    /**
     * Test generateHorseMoves.
     */
    @Test
    public void testGenerateMoves() {
        assertFalse(player1.generateMoves(player2));
    }

    /**
     * Test generatePawnMoves.
     */
    @Test
    public void testGeneratePawnMoves() {
        Pawn[] whitePawns1 = new Pawn[8];
        for (int i = 0, j = 1; i <= 7; i++, j++) {
            whitePawns1[i] = new Pawn(fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "whitePawn.png", j, 7);
            assertFalse(player1.generatePawnMoves(player2, whitePawns1[i]));
        }
    }

    /**
     * Test getPixelPoint.
     */
    @Test
    public void testGetPixelPoint() {

        assertFalse(player1.getPixelPoint(20).x == 1);
        assertFalse(player1.getPixelPoint(31).x == 1);
        assertFalse(player1.getPixelPoint(26).x == 1);
        assertFalse(player1.getPixelPoint(24).y == 1);
        assertFalse(player1.getPixelPoint(25).x == 7);
        assertFalse(player1.getPixelPoint(21).y == 5);
        assertFalse(player1.getPixelPoint(22).x == 4);
        assertFalse(player1.getPixelPoint(30).y == 4);
        assertFalse(player2.getPixelPoint(1).x == 1);
        assertFalse(player2.getPixelPoint(2).x == 1);
        assertFalse(player2.getPixelPoint(3).x == 1);
        assertFalse(player2.getPixelPoint(5).y == 1);
        assertFalse(player2.getPixelPoint(10).x == 7);
        assertFalse(player2.getPixelPoint(14).y == 5);
        assertFalse(player2.getPixelPoint(16).x == 4);
        assertFalse(player2.getPixelPoint(15).y == 4);

    }

    /**
     * Test returnIconImage.
     */
    @Test
    public void testReturnIconImage() {
        for (int i = 17; i <= 32; i++) {
            assertNotNull(player1.returnIconImage(i));
        }
    }

    /**
     * Test generateKingMoves.
     */
    @Test
    public void testGenerateKingMoves() {

        assertTrue(player1.generateKingMoves(player2));
        assertTrue(player2.generateKingMoves(player1));

    }

    /**
     * Test checkKing.
     */
    @Test
    public void testCheckKing() {
        /** New point. */
        Point p1 = new Point(2, 1);
        Point p2 = new Point(4, 1);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(5, 2);
        Point p5 = new Point(3, 6);
        new Point(3, 7);
        new Point(4, 7);
        new Point(4, 8);
        Point p9 = new Point(3, 8);
        Point p10 = new Point(5, 8);

        for (int i = 17; i <= 32; i++) {

            assertFalse(player1.checkKing(p10, p2, i));
            assertFalse(player1.checkKing(p9, p4, i));
            assertFalse(player1.checkKing(p1, p2, i));
            assertFalse(player1.checkKing(p2, p3, i));
            assertFalse(player1.checkKing(p3, p4, i));
            assertFalse(player1.checkKing(p4, p5, i));

        }

        p1 = new Point(2, 8);
        p2 = new Point(4, 8);
        p3 = new Point(3, 8);
        p4 = new Point(5, 8);
        p5 = new Point(3, 6);
        new Point(3, 7);

        for (int i = 0; i <= 16; i++) {
            assertFalse(player2.checkKing(p10, p2, i));
            assertFalse(player2.checkKing(p9, p4, i));
            assertFalse(player2.checkKing(p1, p2, i));
            assertFalse(player2.checkKing(p2, p3, i));
            assertFalse(player2.checkKing(p3, p4, i));
            assertFalse(player2.checkKing(p4, p5, i));
        }

    }

    /**
     * Test killedPiece.
     */
    @Test
    public void testKilledPiece() {
        Player1 player11 = new Player1();
        Player2 player22 = new Player2();

        assertTrue(player11.killedPiece(17));
        assertTrue(player11.killedPiece(18));
        assertTrue(player11.killedPiece(19));
        assertTrue(player11.killedPiece(20));
        assertTrue(player11.killedPiece(21));
        assertTrue(player11.killedPiece(22));
        assertTrue(player11.killedPiece(23));

        assertTrue(player22.killedPiece(1));
        assertTrue(player22.killedPiece(2));
        assertTrue(player22.killedPiece(3));
        assertTrue(player22.killedPiece(4));
        assertTrue(player22.killedPiece(5));
        assertTrue(player22.killedPiece(6));
        assertTrue(player22.killedPiece(7));

    }

    /**
     * Test returnOldPostion.
     */
    @Test
    public void returnOldPostion() {
        Player1 playerNew1 = new Player1();
        Player2 playerNew2 = new Player2();
        for (int i = 17; i <= 32; i++) {
            playerNew1.changePostion(new Point(2, 2), i);
        }

        for (int i = 0; i <= 16; i++) {
            playerNew2.changePostion(new Point(4, 4), i);
        }

        assertTrue(playerNew1.returnOldPostion(17).getX() == 8);
        assertTrue(playerNew1.returnOldPostion(17).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(18).getX() == 1);
        assertTrue(playerNew1.returnOldPostion(18).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(19).getX() == 2);
        assertTrue(playerNew1.returnOldPostion(19).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(20).getX() == 7);
        assertTrue(playerNew1.returnOldPostion(20).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(21).getX() == 3);
        assertTrue(playerNew1.returnOldPostion(21).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(22).getX() == 6);
        assertTrue(playerNew1.returnOldPostion(22).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(23).getX() == 4);
        assertTrue(playerNew1.returnOldPostion(23).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(24).getX() == 5);
        assertTrue(playerNew1.returnOldPostion(24).getY() == 8);

        assertTrue(playerNew1.returnOldPostion(25).getX() == 1);
        assertTrue(playerNew1.returnOldPostion(25).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(26).getX() == 2);
        assertTrue(playerNew1.returnOldPostion(26).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(27).getX() == 3);
        assertTrue(playerNew1.returnOldPostion(27).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(28).getX() == 4);
        assertTrue(playerNew1.returnOldPostion(28).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(29).getX() == 5);
        assertTrue(playerNew1.returnOldPostion(29).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(30).getX() == 6);
        assertTrue(playerNew1.returnOldPostion(30).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(31).getX() == 7);
        assertTrue(playerNew1.returnOldPostion(31).getY() == 7);

        assertTrue(playerNew1.returnOldPostion(32).getX() == 8);
        assertTrue(playerNew1.returnOldPostion(32).getY() == 7);

        assertTrue(playerNew2.returnOldPostion(1).getX() == 1);
        assertTrue(playerNew2.returnOldPostion(1).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(2).getX() == 8);
        assertTrue(playerNew2.returnOldPostion(2).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(3).getX() == 2);
        assertTrue(playerNew2.returnOldPostion(3).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(4).getX() == 7);
        assertTrue(playerNew2.returnOldPostion(4).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(5).getX() == 3);
        assertTrue(playerNew2.returnOldPostion(5).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(6).getX() == 6);
        assertTrue(playerNew2.returnOldPostion(6).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(7).getX() == 4);
        assertTrue(playerNew2.returnOldPostion(7).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(8).getX() == 5);
        assertTrue(playerNew2.returnOldPostion(8).getY() == 1);

        assertTrue(playerNew2.returnOldPostion(9).getX() == 1);
        assertTrue(playerNew2.returnOldPostion(9).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(10).getX() == 2);
        assertTrue(playerNew2.returnOldPostion(10).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(11).getX() == 3);
        assertTrue(playerNew2.returnOldPostion(11).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(12).getX() == 4);
        assertTrue(playerNew2.returnOldPostion(12).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(13).getX() == 5);
        assertTrue(playerNew2.returnOldPostion(13).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(14).getX() == 6);
        assertTrue(playerNew2.returnOldPostion(14).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(15).getX() == 7);
        assertTrue(playerNew2.returnOldPostion(15).getY() == 2);

        assertTrue(playerNew2.returnOldPostion(16).getX() == 8);
        assertTrue(playerNew2.returnOldPostion(16).getY() == 2);

    }

    /**
     * Test basic generateQueenMoves.
     */
    @Test
    public void testGenerateQueenMoves() {
        player2.generateQueenMoves(player1);
    }

    /**
     * Test basic gui elements.
     */
    @Test
    public void testGuiComponents() {
        MainFrame mf = new MainFrame();
        assertTrue(mf.getFocusableWindowState());
        ChatPanel cp = new ChatPanel();
        ToolPanel tp = new ToolPanel();
        MainPanel mp = new MainPanel(tp);
        assertFalse(mp.getBoardPosition(0, 0));
        assertNotNull(mf);
        assertNotNull(cp);
        assertNotNull(tp);
        assertNotNull(mp);

    }

}
