package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Queen;
import pieces.Rook;

/**
 * The Class RookTest.
 */
public class RookTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The white rook 1. */
    protected static Rook whiteRook1;

    /** The white rook 2. */
    protected static Rook whiteRook2;

    /** The black rook 1. */
    protected static Rook blackRook1;

    /** The black rook 2. */
    protected static Rook blackRook2;

    /** The white queen. */
    protected static Queen whiteQueen;

    /** The black queen. */
    protected static Queen blackQueen;

    /** New point. */
    protected static Point p1 = new Point(3, 1);

    /** New point. */
    protected static Point p2 = new Point(5, 1);

    /** New point. */
    protected static Point p3 = new Point(4, 2);

    /** New point. */
    protected static Point p4 = new Point(4, 7);

    /** New point. */
    protected static Point p5 = new Point(3, 6);

    /** New point. */
    protected static Point p6 = new Point(5, 6);

    /** New point. */
    protected static Point p7 = new Point(3, 2);

    /** New point. */
    protected static Point p8 = new Point(5, 2);

    /** New point. */
    protected static Point p9 = new Point(3, 8);

    /** New point. */
    protected static Point p10 = new Point(5, 8);

    /**
     * Sets up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        whiteRook1 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif",
                8, 8);
        whiteRook2 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif",
                1, 8);
        blackRook1 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "br.gif",
                1, 1);

        blackRook2 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "br.gif",
                8, 1);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {

        LOG.info("@AfterClass RookTest complete");

    }

    /**
     * Test can move.
     */
    @Test
    public void testCanMove() {
        assertTrue(whiteRook1.canMove(7, 8));
        assertTrue(whiteRook1.canMove(8, 7));
        assertFalse(whiteRook1.canMove(7, 7));

        assertTrue(whiteRook2.canMove(2, 8));
        assertTrue(whiteRook2.canMove(1, 7));
        assertFalse(whiteRook2.canMove(2, 7));

        assertTrue(blackRook1.canMove(1, 2));
        assertTrue(blackRook1.canMove(2, 1));
        assertFalse(blackRook1.canMove(2, 2));

        assertTrue(blackRook2.canMove(8, 2));
        assertTrue(blackRook2.canMove(7, 1));
        assertFalse(blackRook1.canMove(7, 2));

    }

    /**
     * Test generatePossibleMoves().
     */
    @Test
    public void testGeneratePossibleMoves() {
        assertNotNull(whiteRook1.generatePossibleMoves());
    }

    /**
     * Test pieceInMyWay.
     */
    @Test
    public void testPieceInMyWay() {

        /** No pieces are in the way */
        assertFalse(whiteRook1.pieceInMyWay(3, 4, p1));
        assertFalse(blackRook1.pieceInMyWay(3, 4, p1));
        assertFalse(whiteRook1.pieceInMyWay(3, 4, p2));
        assertFalse(blackRook1.pieceInMyWay(3, 4, p2));
        assertFalse(whiteRook1.pieceInMyWay(6, 4, p2));
        assertFalse(blackRook1.pieceInMyWay(6, 4, p2));
        assertFalse(whiteRook1.pieceInMyWay(2, 4, p3));
        assertFalse(blackRook1.pieceInMyWay(2, 4, p3));
        assertFalse(whiteRook1.pieceInMyWay(4, 4, p4));
        assertFalse(blackRook1.pieceInMyWay(5, 4, p4));
        assertFalse(whiteRook1.pieceInMyWay(4, 7, p5));
        assertFalse(whiteRook1.pieceInMyWay(4, 7, p6));
        assertFalse(whiteRook1.pieceInMyWay(4, 6, p4));
        assertFalse(whiteRook1.pieceInMyWay(4, 6, p5));
        assertFalse(whiteRook1.pieceInMyWay(4, 6, p6));
        assertFalse(blackRook1.pieceInMyWay(4, 1, p7));
        assertFalse(blackRook1.pieceInMyWay(4, 1, p8));
        assertFalse(whiteRook1.pieceInMyWay(4, 8, p9));
        assertFalse(whiteRook1.pieceInMyWay(4, 8, p4));
        assertFalse(blackRook1.pieceInMyWay(4, 1, p3));

        /** A piece is in my way. */
        assertTrue(whiteRook2.pieceInMyWay(4, 8, p9));
        Rook whiteRook3 = new Rook(fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteRook.png", 3, 6);
        Point p12 = new Point(3, 7);
        Point p13 = new Point(3, 5);
        Point p14 = new Point(2, 6);
        Point p15 = new Point(4, 6);
        assertTrue(whiteRook3.pieceInMyWay(3, 8, p12));
        assertTrue(whiteRook3.pieceInMyWay(3, 4, p13));
        assertTrue(whiteRook3.pieceInMyWay(1, 6, p14));
        assertTrue(whiteRook3.pieceInMyWay(5, 6, p15));

    }

    /**
     * Test tellMe().
     */
    @Test
    public void testTellMe() {
        assertNotNull(whiteRook1.tellMe());
    }

    /**
     * Test Check King.
     */
    @Test
    public void testCheckKing() {
        Rook whiteRook4 = new Rook(fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "whiteRook.png", 7, 3);
        Point p15 = new Point(8, 8);
        assertFalse(whiteRook4.checkKing(7, 2, p15));
        assertFalse(whiteRook4.checkKing(8, 8, new Point(7, 2)));

    }

}
