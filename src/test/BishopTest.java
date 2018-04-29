/**
 * Testing bishop
 */

package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Bishop;
import pieces.Queen;

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

    /** New point. */
    protected static Point p1 = new Point(3,1);
    
    /** New point. */
    protected static Point p2 = new Point(5,1);
    
    /** New point. */
    protected static Point p3 = new Point(4,2);
    
    /** New point. */
    protected static Point p4 = new Point(4,7);
    
    /** New point. */
    protected static Point p5 = new Point(3,6);
    
    /** New point. */
    protected static Point p6 = new Point(5,6);
    
    /** New point. */
    protected static Point p7 = new Point(3,2);
    
    /** New point. */
    protected static Point p8 = new Point(5,2);
    
    /** New point. */
    protected static Point p9 = new Point(3,8);
    
    /** New point. */
    protected static Point p10 = new Point(5,8);

    /**
     * Sets up before class.
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
        LOG.info("@AfterClass BishopTest complete");
    }

    
    /**
     * Test can move.
     */
    @Test
    public void testCanMove() {
        /** Can move. */
        assertTrue(whiteBishop1.canMove(4, 7));
        assertTrue(whiteBishop1.canMove(2, 7));
        assertTrue(whiteBishop2.canMove(7, 7));
        assertTrue(whiteBishop2.canMove(5, 7));
        assertTrue(blackBishop1.canMove(2, 2));
        assertTrue(blackBishop1.canMove(4, 2));
        assertTrue(blackBishop2.canMove(5, 2));
        assertTrue(blackBishop2.canMove(7, 2));
        assertTrue(whiteBishop1.canMove(5, 6));
        assertTrue(whiteBishop1.canMove(4, 7));
        assertTrue(blackBishop1.canMove(5, 3));
        assertTrue(blackBishop1.canMove(4, 2));
        assertTrue(blackBishop1.canMove(3, 1));
        assertTrue(whiteBishop1.canMove(3, 8));
        
        /** Can't move. */
        assertFalse(whiteBishop1.canMove(3, 7));
        assertFalse(whiteBishop2.canMove(6, 7));
        assertFalse(blackBishop1.canMove(3, 2));
        assertFalse(blackBishop1.canMove(6, 2));
        assertFalse(whiteBishop1.canMove(3, 6));
        assertFalse(whiteBishop1.canMove(5, 7));
        assertFalse(whiteBishop1.canMove(3, 7));
        assertFalse(whiteBishop1.canMove(4, 5));
        assertFalse(whiteBishop1.canMove(5, 5));
        assertFalse(whiteBishop1.canMove(3, 5));
        assertFalse(whiteBishop1.canMove(6, 4));
        assertFalse(whiteBishop1.canMove(2, 4));
        assertFalse(whiteBishop1.canMove(2, 8));
        assertFalse(whiteBishop1.canMove(6, 8));
        assertFalse(blackBishop1.canMove(3, 3));
        assertFalse(blackBishop1.canMove(5, 2));
        assertFalse(blackBishop1.canMove(3, 2));
        assertFalse(blackBishop1.canMove(4, 4));
        assertFalse(blackBishop1.canMove(5, 4));
        assertFalse(blackBishop1.canMove(3, 4));
        assertFalse(blackBishop1.canMove(6, 1));
        assertFalse(blackBishop1.canMove(2, 1));
        assertFalse(blackBishop1.canMove(2, 5));
        assertFalse(blackBishop1.canMove(6, 5));
        assertFalse(blackBishop1.canMove(5, 1));
        assertFalse(blackBishop1.canMove(3, 5));
        assertFalse(blackBishop1.canMove(5, 5));
        assertFalse(whiteBishop1.canMove(3, 4));
        assertFalse(whiteBishop1.canMove(5, 4));
        assertFalse(whiteBishop1.canMove(5, 8));

    }
    
    /**
     * Test pieceInMyWay.
     */
    @Test
    public void testpieceInMyWay() {
     
       
       /** No pieces are in the way */
       assertFalse(whiteBishop1.pieceInMyWay(2, 4, p1));
       assertFalse(blackBishop1.pieceInMyWay(2, 4, p1));
       assertFalse(whiteBishop1.pieceInMyWay(2, 4, p2));
       assertFalse(blackBishop1.pieceInMyWay(2, 4, p2));
       assertFalse(whiteBishop1.pieceInMyWay(7, 4, p2));
       assertFalse(blackBishop1.pieceInMyWay(7, 4, p2));
       assertFalse(whiteBishop1.pieceInMyWay(2, 4, p3));
       assertFalse(blackBishop1.pieceInMyWay(2, 4, p3));
       assertFalse(whiteBishop1.pieceInMyWay(4, 4, p4));
       assertFalse(blackBishop1.pieceInMyWay(7, 4, p4));
       assertFalse(whiteBishop1.pieceInMyWay(2, 7, p5));
       assertFalse(whiteBishop1.pieceInMyWay(4, 7, p6)); 
       assertFalse(whiteBishop1.pieceInMyWay(4, 6, p4));
       assertFalse(whiteBishop1.pieceInMyWay(4, 6, p5));
       assertFalse(whiteBishop1.pieceInMyWay(4, 6, p6));
       assertFalse(blackBishop1.pieceInMyWay(4, 1, p7));
       assertFalse(blackBishop1.pieceInMyWay(4, 1, p8));
       assertFalse(whiteBishop1.pieceInMyWay(4, 8, p9));
       assertFalse(whiteBishop1.pieceInMyWay(4, 8, p10));
       assertFalse(whiteBishop1.pieceInMyWay(4, 8, p4));
       assertFalse(blackBishop1.pieceInMyWay(4, 1, p3));
       assertFalse(whiteBishop1.pieceInMyWay(4, 8, p4));
       
       
       /** A piece is in my way */
       whiteBishop1 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
               + "Player1Icons" + fileSeparator + "whiteBishop.png", 4, 8);
       whiteBishop2 = new Bishop("src" + fileSeparator + "Icons" + fileSeparator
               + "Player1Icons" + fileSeparator + "whiteBishop.png", 4, 6); 
       Point p14 = new Point(3,7);
       Point p15 = new Point(5,7);

       assertTrue(whiteBishop1.pieceInMyWay(2, 6, p14));
       assertTrue(whiteBishop1.pieceInMyWay(6, 6, p15));
  
       assertTrue(whiteBishop2.pieceInMyWay(2, 8, p14));
       assertTrue(whiteBishop2.pieceInMyWay(6, 8, p15));


  
    }
    
    /**
     * Test checkKing.
     */
    @Test
    public void testCheckKing() {
    	
        assertFalse(blackBishop1.checkKing(4, 1, p3));
        assertFalse(whiteBishop1.checkKing(2, 6, p5));
        assertFalse(blackBishop1.checkKing(2, 1, p7));
        assertFalse(whiteBishop1.checkKing(3, 4, p1));
        assertFalse(blackBishop1.checkKing(3, 4, p1));
        assertFalse(whiteBishop1.checkKing(3, 4, p2));
        assertFalse(blackBishop1.checkKing(3, 4, p2));
        assertFalse(whiteBishop1.checkKing(6, 4, p2));
        assertFalse(blackBishop1.checkKing(6, 4, p2));
        assertFalse(whiteBishop1.checkKing(2, 4, p3));
        assertFalse(blackBishop1.checkKing(2, 4, p3));
        assertFalse(whiteBishop1.checkKing(4, 4, p4));
        assertFalse(blackBishop1.checkKing(5, 4, p4));
        assertFalse(whiteBishop1.checkKing(4, 7, p5));
        assertFalse(whiteBishop1.checkKing(4, 7, p6)); 
        assertFalse(whiteBishop1.checkKing(4, 6, p4));
        assertFalse(whiteBishop1.checkKing(4, 6, p5));
        assertFalse(whiteBishop1.checkKing(4, 6, p6));
        assertFalse(blackBishop1.checkKing(4, 1, p7));
        assertFalse(blackBishop1.checkKing(4, 1, p8));
        assertFalse(whiteBishop1.checkKing(4, 8, p9));
        assertFalse(whiteBishop1.checkKing(4, 8, p10));
 	    assertFalse(whiteBishop1.checkKing(1, 2, p1));
        assertFalse(blackBishop1.checkKing(1, 2, p1));
        assertFalse(whiteBishop1.checkKing(1, 2, p2));
        assertFalse(blackBishop1.checkKing(1, 2, p2));
        assertFalse(whiteBishop1.checkKing(6, 2, p2));
        assertFalse(blackBishop1.checkKing(6, 2, p2));
        assertFalse(whiteBishop1.checkKing(2, 2, p3));
        assertFalse(blackBishop1.checkKing(2, 2, p3));
        assertFalse(whiteBishop1.checkKing(2, 2, p4));
        assertFalse(blackBishop1.checkKing(5, 2, p4));
        assertFalse(whiteBishop1.checkKing(2, 7, p5));
        assertFalse(whiteBishop1.checkKing(2, 7, p6)); 
        assertFalse(whiteBishop1.checkKing(2, 6, p4));
        assertFalse(whiteBishop1.checkKing(2, 6, p6));
        assertFalse(blackBishop1.checkKing(2, 1, p8));
        assertFalse(whiteBishop1.checkKing(2, 8, p9));
        assertFalse(whiteBishop1.checkKing(2, 8, p10));
 	    assertFalse(whiteBishop1.checkKing(1, 2, p3));
        assertFalse(blackBishop1.checkKing(1, 2, p3));
        assertFalse(whiteBishop1.checkKing(1, 2, p10));
        assertFalse(blackBishop1.checkKing(1, 2, p10));
        assertFalse(whiteBishop1.checkKing(6, 2, p10));
        assertFalse(blackBishop1.checkKing(6, 2, p10));
        assertFalse(whiteBishop1.checkKing(2, 1, p3));
        assertFalse(blackBishop1.checkKing(1, 2, p3));
        assertFalse(whiteBishop1.checkKing(2, 5, p2));
        assertFalse(blackBishop1.checkKing(5, 5, p2));
        assertFalse(whiteBishop1.checkKing(2, 5, p5));
        assertFalse(whiteBishop1.checkKing(2, 4, p6)); 
        assertFalse(whiteBishop1.checkKing(2, 4, p2));
        assertFalse(whiteBishop1.checkKing(2, 4, p5));
        assertFalse(whiteBishop1.checkKing(4, 6, p6));
        assertFalse(blackBishop1.checkKing(4, 1, p7));
        assertFalse(blackBishop1.checkKing(4, 1, p8));
        assertFalse(whiteBishop1.checkKing(3, 8, p9));
        assertFalse(whiteBishop1.checkKing(5, 8, p10));
        assertFalse(whiteBishop1.checkKing(4, 2, p3));

        
    }
    
    /**
     * Test tellMe().
     */
    @Test
    public void testTellMe() {
    	assertNotNull(whiteBishop1.tellMe());
    }

    /**
     * Test generatePossibleMoves()
     */
    @Test
    public void testGeneratePossibleMoves() {
    	assertNotNull(whiteBishop1.generatePossibleMoves());
    }

}
