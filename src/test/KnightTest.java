package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Knight;

/**
 * The Class KnightTest.
 */
public class KnightTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The white knight 1. */
    protected static Knight whiteKnight1;

    /** The white knight 2. */
    protected static Knight whiteKnight2;

    /** The black knight 1. */
    protected static Knight blackKnight1;

    /** The black knight 2. */
    protected static Knight blackKnight2;

    /**
     * Sets up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        whiteKnight1 = new Knight( fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "wn.gif", 2, 8);
        whiteKnight2 = new Knight( fileSeparator + "Icons" + fileSeparator + "Player1Icons"
                + fileSeparator + "wn.gif", 7, 8);
        blackKnight1 = new Knight( fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "bn.gif", 2, 1);
        blackKnight2 = new Knight( fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                + fileSeparator + "bn.gif", 7, 1);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        LOG.info("@AfterClass KnightTest complete");
    }

    /**
     * Test can move.
     */
    @Test
    public void testCanMove() {
        assertTrue(whiteKnight1.canMove(1, 6));
        assertTrue(whiteKnight1.canMove(3, 6));
        assertFalse(whiteKnight1.canMove(2, 6));

        assertTrue(whiteKnight2.canMove(8, 6));
        assertTrue(whiteKnight2.canMove(6, 6));
        assertFalse(whiteKnight2.canMove(7, 6));

        assertTrue(blackKnight1.canMove(1, 3));
        assertTrue(blackKnight1.canMove(3, 3));
        assertFalse(blackKnight1.canMove(2, 3));

        assertTrue(blackKnight2.canMove(6, 3));
        assertTrue(blackKnight2.canMove(8, 3));
        assertFalse(blackKnight1.canMove(7, 3));
    }

    /**
     * Test tellMe().
     */
    @Test
    public void testTellMe() {
        assertNotNull(whiteKnight1.tellMe());
    }

    /**
     * Test generatePossibleMoves().
     */
    @Test
    public void testGeneratePossibleMoves() {
        assertNotNull(whiteKnight1.generatePossibleMoves());
    }

}
