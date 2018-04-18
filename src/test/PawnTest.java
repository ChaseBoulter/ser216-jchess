/**
 * Testing pawn class
 */
package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Pawn;

/**
 * The Class PawnTest.
 */
public class PawnTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The white pawns. */
    protected static Pawn[] whitePawns = new Pawn[8];

    /** The black pawns. */
    protected static Pawn[] blackPawns = new Pawn[8];

    /** The white pawns 2. */
    protected static Pawn[] whitePawns2 = new Pawn[8];

    /** The black pawns 2. */
    protected static Pawn[] blackPawns2 = new Pawn[8];

    /** The white pawns 3. */
    protected static Pawn[] whitePawns3 = new Pawn[8];

    /**
     * Sets up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        for (int i = 0, j = 1; i <= 7; i++, j++) {
            whitePawns[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" 
                    + fileSeparator + "wp.gif", j, 7);
            blackPawns[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" 
                    + fileSeparator  + "bp.gif", j, 2);
        }

        for (int i = 0, j = 1; i <= 7; i++, j++) {
            whitePawns2[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" 
                    + fileSeparator + "wp.gif", j, 5);
            whitePawns3[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" 
                    + fileSeparator + "wp.gif", j, 3);
            blackPawns2[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" 
                    + fileSeparator + "bp.gif", j, 4);
        }
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        whitePawns = whitePawns2 = blackPawns = blackPawns2 = null;
        LOG.info("@AfterClass PawnTest complete");
    }

    /**
     * Test first can move.
     */
    @Test
    public void testFirstCanMove() {

        // Testing white pawn's first move
        for (int i = 0, j = 1; i <= 7; i++, j++) {
            assertTrue(whitePawns[i].canMove(j, 5, "white"));
            assertTrue(whitePawns[i].canMove(j, 6, "white"));

            assertFalse(whitePawns[i].canMove(j + 1, 5, "white"));
            assertFalse(whitePawns[i].canMove(j - 1, 5, "white"));
            assertFalse(whitePawns[i].canMove(j + 1, 6, "white"));
            assertFalse(whitePawns[i].canMove(j - 1, 6, "white"));
            assertFalse(whitePawns[i].canMove(j, 4, "white"));
            assertFalse(whitePawns[i].canMove(j, 3, "white"));
            assertFalse(whitePawns[i].canMove(j, 2, "white"));
            assertFalse(whitePawns[i].canMove(j, 1, "white"));

        }

        // Testing black pawn's first move
        for (int i = 0, j = 1; i <= 7; i++, j++) {
            assertTrue(blackPawns[i].canMove(j, 3, "black"));
            assertTrue(blackPawns[i].canMove(j, 4, "black"));

            assertFalse(blackPawns[i].canMove(j, 5, "black"));
            assertFalse(blackPawns[i].canMove(j, 6, "black"));
            assertFalse(blackPawns[i].canMove(j, 7, "black"));
            assertFalse(blackPawns[i].canMove(j, 8, "black"));
            assertFalse(blackPawns[i].canMove(j + 1, 3, "black"));
            assertFalse(blackPawns[i].canMove(j - 1, 3, "black"));
            assertFalse(blackPawns[i].canMove(j + 1, 4, "black"));
            assertFalse(blackPawns[i].canMove(j - 1, 4, "black"));
        }

    }

    /**
     * Test can move after first.
     */
    @Test
    public void testCanMoveAfterFirst() {

        // Testing white pawn's consecutive moves
        for (int i = 0, j = 1; i <= 7; i++, j++) {

            // can move one square forward
            assertTrue(whitePawns2[i].canMove(j, 4, "white"));
            // but not two
            assertFalse(whitePawns2[i].canMove(j, 3, "white"));

            // not diagonally
            assertFalse(whitePawns2[i].canMove(j + 1, 4, "white"));
            assertFalse(whitePawns2[i].canMove(j - 1, 4, "white"));
            assertFalse(whitePawns2[i].canMove(j + 1, 3, "white"));
            assertFalse(whitePawns2[i].canMove(j - 1, 3, "white"));

            // not backwards
            assertFalse(whitePawns2[i].canMove(j, 6, "white"));
            assertFalse(whitePawns2[i].canMove(j + 1, 6, "white"));
            assertFalse(whitePawns2[i].canMove(j - 1, 6, "white"));

            assertFalse(whitePawns2[i].canMove(j, 7, "white"));
            assertFalse(whitePawns2[i].canMove(j + 1, 7, "white"));
            assertFalse(whitePawns2[i].canMove(j - 1, 7, "white"));

            assertFalse(whitePawns2[i].canMove(j, 8, "white"));
            assertFalse(whitePawns2[i].canMove(j + 1, 8, "white"));
            assertFalse(whitePawns2[i].canMove(j - 1, 8, "white"));

        }

        // Testing black pawn's consecutive moves
        for (int i = 0, j = 1; i <= 7; i++, j++) {

            // pawn can move one square forward
            assertTrue(blackPawns2[i].canMove(j, 5, "black"));

            // but not two squares
            assertFalse(blackPawns2[i].canMove(j, 6, "black"));

            // not diagonally
            assertFalse(blackPawns2[i].canMove(j + 1, 5, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 6, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 7, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 8, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 5, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 6, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 7, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 8, "black"));

            // not backwards
            assertFalse(blackPawns2[i].canMove(j, 3, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 3, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 3, "black"));

            assertFalse(blackPawns2[i].canMove(j, 2, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 2, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 2, "black"));

            assertFalse(blackPawns2[i].canMove(j, 1, "black"));
            assertFalse(blackPawns2[i].canMove(j - 1, 1, "black"));
            assertFalse(blackPawns2[i].canMove(j + 1, 1, "black"));

        }

    }

    /**
     * Test piece in my way.
     */
    @Test
    public void testPieceInMyWay() {
        Point otherPosition;
        for (int i = 0, j = 1; i <= 7; i++, j++) {
            otherPosition = new Point(whitePawns3[i].returnX(), whitePawns3[i].returnY());
            // System.out.println(whitePawns3[i].returnX() + ", "+whitePawns3[i].returnY());
            // System.out.println(blackPawns[i].returnX() + ", "+blackPawns[i].returnY());
            assertFalse(blackPawns[i].pieceInMyWay(blackPawns[i].returnX(), blackPawns[i]
                    .returnY(), otherPosition,"black"));
        }

    }

}