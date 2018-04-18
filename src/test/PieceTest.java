/**
 * JUnit test case is testing a generic chess piece
 */
package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Piece;

/**
 * The Class PieceTest.
 */
public class PieceTest {

    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The a piece. */
    protected static Piece aPiece;

    /**
     * Sets up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        aPiece = new Piece("src" + fileSeparator + "Icons" + fileSeparator 
                + "Player1Icons" + fileSeparator + "wr.gif",1, 8);
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        aPiece = null;
        LOG.info("@AfterClass PieceTest complete");
    }

    /**
     * Test piece constructor.
     */
    @Test
    public void testPieceConstructor() {
        assertTrue(aPiece.returnX() == 1);
        assertTrue(aPiece.returnY() == 8);
        assertNotNull(aPiece.returnPieceImage());
        assertTrue(aPiece.returnLife());
        assertTrue(aPiece.returnPostion().getX() == 1);
        assertTrue(aPiece.returnPostion().getY() == 8);
    }

    /**
     * Test piece methods.
     */
    @Test
    public void testPieceMethods() {
        aPiece.setPixels(1, 2);
        assertTrue(aPiece.getpixelPoint().getX() == 1);
        assertTrue(aPiece.getpixelPoint().getY() == 2);
        assertTrue(aPiece.inThisPosition(1, 8));
        Point aPoint = new Point(5, 1);
        aPiece.setPoint(aPoint);
        assertTrue(aPiece.inThisPosition(5, 1));
        assertTrue(aPiece.returnOld().getX() == 1);
        assertTrue(aPiece.returnOld().getY() == 8);
        aPiece.toOld(aPiece.returnOld());
        assertTrue(aPiece.inThisPosition(1, 8));

    }

}
