package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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

    /**
     * Sets up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        whiteRook1 = new Rook(
                "src" + fileSeparator + "Icons" + fileSeparator 
                + "Player1Icons" + fileSeparator + "wr.gif", 8, 8);
        whiteRook2 = new Rook(
                "src" + fileSeparator + "Icons" + fileSeparator 
                + "Player1Icons" + fileSeparator + "wr.gif", 1, 8);
        blackRook1 = new Rook(
                "src" + fileSeparator + "Icons" + fileSeparator 
                + "Player2Icons" + fileSeparator + "br.gif", 1, 1);

        blackRook2 = new Rook(
                "src" + fileSeparator + "Icons" + fileSeparator 
                + "Player2Icons" + fileSeparator + "br.gif", 8, 1);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        whiteRook1 = whiteRook2 = blackRook1 = blackRook2 = null;
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

}
