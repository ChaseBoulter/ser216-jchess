/**
 * Testing bishop
 */
package test;

import static org.junit.Assert.*;

import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Bishop;

/**
 * The Class BishopTest.
 */
public class BishopTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The white bishop 1. */
    protected static Bishop whiteBishop1;

    /** The white bishop 2. */
    protected static Bishop whiteBishop2;

    /** The black bishop 1. */
    protected static Bishop blackBishop1;

    /** The black bishop 2. */
    protected static Bishop blackBishop2;

    /**
     * Sets the up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        whiteBishop1 = new Bishop(
                "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator 
                + "wb.gif", 3, 8);
        whiteBishop2 = new Bishop(
                "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator 
                + "wb.gif", 6, 8);
        blackBishop1 = new Bishop(
                "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator 
                + "bb.gif", 3, 1);
        blackBishop2 = new Bishop(
                "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator 
                + "bb.gif", 6, 1);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        whiteBishop1 = whiteBishop2 = blackBishop2 = blackBishop1 = null;
        LOG.info("@AfterClass BishopTest complete");
    }

    /**
     * Test can move.
     */
    @Test
    public void testCanMove() {
        assertTrue(whiteBishop1.canMove(4, 7));
        assertTrue(whiteBishop1.canMove(2, 7));
        assertFalse(whiteBishop1.canMove(3, 7));

        assertTrue(whiteBishop2.canMove(7, 7));
        assertTrue(whiteBishop2.canMove(5, 7));
        assertFalse(whiteBishop2.canMove(6, 7));

        assertTrue(blackBishop1.canMove(2, 2));
        assertTrue(blackBishop1.canMove(4, 2));
        assertFalse(blackBishop1.canMove(3, 2));

        assertTrue(blackBishop2.canMove(5, 2));
        assertTrue(blackBishop2.canMove(7, 2));
        assertFalse(blackBishop1.canMove(6, 2));

    }

}
