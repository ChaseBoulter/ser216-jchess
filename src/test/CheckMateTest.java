package test;

import static org.junit.Assert.assertFalse;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.King;
import pieces.Rook;

public class CheckMateTest {
    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The white king. */
    protected static King whiteKing;

    /** The black king. */
    protected static King blackKing;

    /** The white rook1. */
    protected static Rook whiteRook1;

    /** The white rook2. */
    protected static Rook whiteRook2;

    /**
     * Setup.
     * 
     * @throws Exception
     *             Throws Exception.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        whiteKing = new King(
                fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wk.gif",
                6, 2);
        blackKing = new King(
                fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bk.gif",
                4, 5);
        whiteRook1 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif",
                7, 1);
        whiteRook2 = new Rook(
                fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wr.gif",
                2, 2);

    }

    /**
     * TearDown.
     * 
     * @throws Exception
     *             Throws Exception.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        whiteKing = blackKing = null;
        whiteRook1 = whiteRook2 = null;
        LOG.info("@AfterClass CheckMateTest complete");
    }

    @Test
    public void testCheckMate() {
        assertFalse(whiteRook1.checkKing(6, 1,
                new Point(blackKing.getPixelX(), blackKing.getPixelY())));
        assertFalse(whiteRook2.checkKing(3, 5,
                new Point(blackKing.getPixelX(), blackKing.getPixelY())));
        assertFalse(whiteRook1.checkKing(5, 2,
                new Point(blackKing.getPixelX(), blackKing.getPixelY())));
    }

}
