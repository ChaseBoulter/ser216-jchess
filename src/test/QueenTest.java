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

/**
 * The Class QueenTest.
 */
public class QueenTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

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
        whiteQueen = new Queen( fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "wq.gif", 4, 6);
        blackQueen = new Queen( fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "bq.gif", 4, 3);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        LOG.info("@AfterClass QueenTest complete");
    }

    /**
     * Test can move.
     */
    @Test
    public void testCanMove() {
        assertTrue(whiteQueen.canMove(3, 6));
        assertTrue(whiteQueen.canMove(5, 6));
        assertTrue(whiteQueen.canMove(4, 7));
        assertTrue(whiteQueen.canMove(5, 7));
        assertTrue(whiteQueen.canMove(3, 7));
        assertTrue(whiteQueen.canMove(4, 5));
        assertTrue(whiteQueen.canMove(5, 5));
        assertTrue(whiteQueen.canMove(3, 5));

        assertTrue(whiteQueen.canMove(6, 4));
        assertTrue(whiteQueen.canMove(2, 4));
        assertTrue(whiteQueen.canMove(2, 8));
        assertTrue(whiteQueen.canMove(6, 8));

        assertTrue(blackQueen.canMove(3, 3));
        assertTrue(blackQueen.canMove(5, 3));
        assertTrue(blackQueen.canMove(4, 2));
        assertTrue(blackQueen.canMove(5, 2));
        assertTrue(blackQueen.canMove(3, 2));
        assertTrue(blackQueen.canMove(4, 4));
        assertTrue(blackQueen.canMove(5, 4));
        assertTrue(blackQueen.canMove(3, 4));

        assertTrue(blackQueen.canMove(6, 1));
        assertTrue(blackQueen.canMove(2, 1));
        assertTrue(blackQueen.canMove(2, 5));
        assertTrue(blackQueen.canMove(6, 5));

        assertFalse(blackQueen.canMove(3, 1));
        assertFalse(blackQueen.canMove(5, 1));
        assertFalse(blackQueen.canMove(3, 5));
        assertFalse(blackQueen.canMove(5, 5));

        assertFalse(whiteQueen.canMove(3, 4));
        assertFalse(whiteQueen.canMove(5, 4));
        assertFalse(whiteQueen.canMove(3, 8));
        assertFalse(whiteQueen.canMove(5, 8));

    }

    /**
     * Test pieceInMyWay.
     */
    @Test
    public void testpieceInMyWay() {

        /** No pieces are in the way */
        assertFalse(whiteQueen.pieceInMyWay(3, 4, p1));
        assertFalse(blackQueen.pieceInMyWay(3, 4, p1));
        assertFalse(whiteQueen.pieceInMyWay(3, 4, p2));
        assertFalse(blackQueen.pieceInMyWay(3, 4, p2));
        assertFalse(whiteQueen.pieceInMyWay(6, 4, p2));
        assertFalse(blackQueen.pieceInMyWay(6, 4, p2));
        assertFalse(whiteQueen.pieceInMyWay(2, 4, p3));
        assertFalse(blackQueen.pieceInMyWay(2, 4, p3));
        assertFalse(whiteQueen.pieceInMyWay(4, 4, p4));
        assertFalse(blackQueen.pieceInMyWay(5, 4, p4));
        assertFalse(whiteQueen.pieceInMyWay(4, 7, p5));
        assertFalse(whiteQueen.pieceInMyWay(4, 7, p6));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p4));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p5));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p6));
        assertFalse(blackQueen.pieceInMyWay(4, 1, p7));
        assertFalse(blackQueen.pieceInMyWay(4, 1, p8));
        assertFalse(whiteQueen.pieceInMyWay(4, 8, p9));
        assertFalse(whiteQueen.pieceInMyWay(4, 8, p10));
        assertFalse(whiteQueen.pieceInMyWay(3, 4, p1));
        assertFalse(blackQueen.pieceInMyWay(3, 4, p1));
        assertFalse(whiteQueen.pieceInMyWay(3, 4, p2));
        assertFalse(blackQueen.pieceInMyWay(3, 4, p2));
        assertFalse(whiteQueen.pieceInMyWay(6, 4, p2));
        assertFalse(blackQueen.pieceInMyWay(6, 4, p2));
        assertFalse(whiteQueen.pieceInMyWay(2, 4, p3));
        assertFalse(blackQueen.pieceInMyWay(2, 4, p3));
        assertFalse(whiteQueen.pieceInMyWay(4, 4, p4));
        assertFalse(blackQueen.pieceInMyWay(5, 4, p4));
        assertFalse(whiteQueen.pieceInMyWay(4, 7, p5));
        assertFalse(whiteQueen.pieceInMyWay(4, 7, p6));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p4));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p5));
        assertFalse(whiteQueen.pieceInMyWay(4, 6, p6));
        assertFalse(blackQueen.pieceInMyWay(4, 1, p7));
        assertFalse(blackQueen.pieceInMyWay(4, 1, p8));
        assertFalse(whiteQueen.pieceInMyWay(4, 8, p9));
        assertFalse(whiteQueen.pieceInMyWay(4, 8, p10));

        /** A piece is in my way */
        assertTrue(whiteQueen.pieceInMyWay(4, 8, p4));
        Queen whiteQueen2 = new Queen( fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "whiteQueen.png", 4, 8);
        Point p11 = new Point(4, 7);
        Point p12 = new Point(3, 8);
        Point p13 = new Point(5, 8);
        Point p14 = new Point(3, 7);
        Point p15 = new Point(5, 7);
        assertTrue(whiteQueen2.pieceInMyWay(4, 6, p11));
        assertTrue(whiteQueen2.pieceInMyWay(2, 8, p12));
        assertTrue(whiteQueen2.pieceInMyWay(6, 8, p13));
        assertTrue(whiteQueen2.pieceInMyWay(2, 6, p14));
        assertTrue(whiteQueen2.pieceInMyWay(6, 6, p15));
        assertTrue(whiteQueen.pieceInMyWay(4, 8, p11));
        assertTrue(whiteQueen.pieceInMyWay(2, 8, p14));
        assertTrue(whiteQueen.pieceInMyWay(6, 8, p15));
        assertTrue(blackQueen.pieceInMyWay(4, 1, p3));

    }

    /**
     * Test checkKing.
     */
    @Test
    public void testCheckKing() {
        // assertTrue(whiteQueen.checkKing(4, 8, p4));
        assertTrue(blackQueen.checkKing(4, 1, p3));
        assertTrue(whiteQueen.checkKing(2, 6, p5));
        assertTrue(blackQueen.checkKing(2, 1, p7));

        assertFalse(whiteQueen.checkKing(3, 4, p1));
        assertFalse(blackQueen.checkKing(3, 4, p1));
        assertFalse(whiteQueen.checkKing(3, 4, p2));
        assertFalse(blackQueen.checkKing(3, 4, p2));
        assertFalse(whiteQueen.checkKing(6, 4, p2));
        assertFalse(blackQueen.checkKing(6, 4, p2));
        assertFalse(whiteQueen.checkKing(2, 4, p3));
        assertFalse(blackQueen.checkKing(2, 4, p3));
        assertFalse(whiteQueen.checkKing(4, 4, p4));
        assertFalse(blackQueen.checkKing(5, 4, p4));
        assertFalse(whiteQueen.checkKing(4, 7, p5));
        assertFalse(whiteQueen.checkKing(4, 7, p6));
        assertFalse(whiteQueen.checkKing(4, 6, p4));
        assertFalse(whiteQueen.checkKing(4, 6, p5));
        assertFalse(whiteQueen.checkKing(4, 6, p6));
        assertFalse(blackQueen.checkKing(4, 1, p7));
        assertFalse(blackQueen.checkKing(4, 1, p8));
        assertFalse(whiteQueen.checkKing(4, 8, p9));
        assertFalse(whiteQueen.checkKing(4, 8, p10));
        assertFalse(whiteQueen.checkKing(1, 2, p1));
        assertFalse(blackQueen.checkKing(1, 2, p1));
        assertFalse(whiteQueen.checkKing(1, 2, p2));
        assertFalse(blackQueen.checkKing(1, 2, p2));
        assertFalse(whiteQueen.checkKing(6, 2, p2));
        assertFalse(blackQueen.checkKing(6, 2, p2));
        assertFalse(whiteQueen.checkKing(2, 2, p3));
        assertFalse(blackQueen.checkKing(2, 2, p3));
        assertFalse(whiteQueen.checkKing(2, 2, p4));
        assertFalse(blackQueen.checkKing(5, 2, p4));
        assertFalse(whiteQueen.checkKing(2, 7, p5));
        assertFalse(whiteQueen.checkKing(2, 7, p6));
        assertFalse(whiteQueen.checkKing(2, 6, p4));
        assertFalse(whiteQueen.checkKing(2, 6, p6));
        assertFalse(blackQueen.checkKing(2, 1, p8));
        assertFalse(whiteQueen.checkKing(2, 8, p9));
        assertFalse(whiteQueen.checkKing(2, 8, p10));
        assertFalse(whiteQueen.checkKing(1, 2, p3));
        assertFalse(blackQueen.checkKing(1, 2, p3));
        assertFalse(whiteQueen.checkKing(1, 2, p10));
        assertFalse(blackQueen.checkKing(1, 2, p10));
        assertFalse(whiteQueen.checkKing(6, 2, p10));
        assertFalse(blackQueen.checkKing(6, 2, p10));
        assertFalse(whiteQueen.checkKing(2, 1, p3));
        assertFalse(blackQueen.checkKing(1, 2, p3));
        assertFalse(whiteQueen.checkKing(2, 5, p2));
        assertFalse(blackQueen.checkKing(5, 5, p2));
        assertFalse(whiteQueen.checkKing(2, 5, p5));
        assertFalse(whiteQueen.checkKing(2, 4, p6));
        assertFalse(whiteQueen.checkKing(2, 4, p2));
        assertFalse(whiteQueen.checkKing(2, 4, p5));
        assertFalse(whiteQueen.checkKing(4, 6, p6));
        assertFalse(blackQueen.checkKing(4, 1, p7));
        assertFalse(blackQueen.checkKing(4, 1, p8));
        assertFalse(whiteQueen.checkKing(3, 8, p9));
        assertFalse(whiteQueen.checkKing(5, 8, p10));
        assertFalse(whiteQueen.checkKing(4, 2, p3));

    }

    /**
     * Test tellMe().
     */
    @Test
    public void testTellMe() {
        assertNotNull(whiteQueen.tellMe());
    }

    /**
     * Test generatePossibleMoves().
     */
    @Test
    public void testGeneratePossibleMoves() {
        assertNotNull(whiteQueen.generatePossibleMoves());
    }

}
