/**
 * Testing pawn class
 */

package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Before;
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
    protected static Pawn[] whitePawns1 = new Pawn[8];

    /** The black pawns. */
    protected static Pawn[] blackPawns1 = new Pawn[8];

    /** The white pawns 2. */
    protected static Pawn[] whitePawns2 = new Pawn[8];

    /** The black pawns 2. */
    protected static Pawn[] blackPawns2 = new Pawn[8];

    /** The white pawns 3. */
    protected static Pawn[] whitePawns3 = new Pawn[8];
    
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
    @Before
    public void setUp() throws Exception {

        for (int i = 0, j = 1; i <= 7; i++, j++) {
        	whitePawns1[i] = new Pawn("src" + fileSeparator + "Icons"+ fileSeparator + "Player1Icons" + fileSeparator + "WhitePawn.png", j, 7);

        	
            blackPawns1[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons"
                    + fileSeparator  + "BlackPawn.png", j, 2);
        }

        for (int i = 0, j = 1; i <= 7; i++, j++) {
            whitePawns2[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" 
                    + fileSeparator + "WhitePawn.png", j, 5);
            whitePawns3[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" 
                    + fileSeparator + "WhitePawn.png", j, 3);
            blackPawns2[i] = new Pawn(
                    "src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" 
                    + fileSeparator + "BlackPawn.png", j, 4);
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
       // whitePawns1 = whitePawns2 = blackPawns1 = blackPawns2 = null;
        LOG.info("@AfterClass PawnTest complete");
    }

    /**
     * Test first can move.
     */
    @Test
    public void testFirstCanMove() {

        // Testing white pawn's first move
        for (int i = 0, j = 1; i <= 7; i++, j++) {

            assertFalse(whitePawns1[i].canMove(j + 1, 5, "white"));
            assertFalse(whitePawns1[i].canMove(j - 1, 5, "white"));
            assertFalse(whitePawns1[i].canMove(j + 1, 6, "white"));
            assertFalse(whitePawns1[i].canMove(j - 1, 6, "white"));
            assertFalse(whitePawns1[i].canMove(j, 4, "white"));
            assertFalse(whitePawns1[i].canMove(j, 3, "white"));
            assertFalse(whitePawns1[i].canMove(j, 2, "white"));
            assertFalse(whitePawns1[i].canMove(j, 1, "white"));

        }

        // Testing black pawn's first move
        for (int i = 0, j = 1; i <= 7; i++, j++) {
            assertTrue(blackPawns1[i].canMove(j, 3, "black"));
            assertTrue(blackPawns1[i].canMove(j, 4, "black"));

            assertFalse(blackPawns1[i].canMove(j, 5, "black"));
            assertFalse(blackPawns1[i].canMove(j, 6, "black"));
            assertFalse(blackPawns1[i].canMove(j, 7, "black"));
            assertFalse(blackPawns1[i].canMove(j, 8, "black"));
            assertFalse(blackPawns1[i].canMove(j + 1, 3, "black"));
            assertFalse(blackPawns1[i].canMove(j - 1, 3, "black"));
            assertFalse(blackPawns1[i].canMove(j + 1, 4, "black"));
            assertFalse(blackPawns1[i].canMove(j - 1, 4, "black"));
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
            assertFalse(blackPawns1[i].pieceInMyWay(blackPawns1[i].returnX(), blackPawns1[i]
                    .returnY(), otherPosition,"black"));
            assertFalse(blackPawns1[i].pieceInMyWay(3, 4, p1, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(3, 4, p1, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(3, 4, p2, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(3, 4, p2, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(6, 4, p2, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(6, 4, p2, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(2, 4, p3, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(2, 4, p3, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 4, p4, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(5, 4, p4, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 7, p5, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 7, p6, "black")); 
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p4, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p5, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p6, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(4, 1, p7, "black"));
            assertFalse(whitePawns1[i].pieceInMyWay(4, 1, p8, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 8, p9, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 8, p10, "black"));
            assertFalse(blackPawns1[i].pieceInMyWay(3, 4, p1, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(3, 4, p1, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(3, 4, p2, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(3, 4, p2, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(6, 4, p2, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(6, 4, p2, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(2, 4, p3, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(2, 4, p3, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 4, p4, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(5, 4, p4, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 7, p5, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 7, p6, "white")); 
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p4, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p5, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 6, p6, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(4, 1, p7, "white"));
            assertFalse(whitePawns1[i].pieceInMyWay(4, 1, p8, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 8, p9, "white"));
            assertFalse(blackPawns1[i].pieceInMyWay(4, 8, p10, "white"));
            
        }

    }
    
    /**
     * Test tellMe().
     */
    @Test
    public void testTellMe() {
    	assertNotNull(blackPawns1[0].tellMe());
    }

    /**
     * Test generatePossibleMoves()
     */
    @Test
    public void testGeneratePossibleMoves() {
    	assertNotNull(blackPawns1[0].generatePossibleMoves());
    }

    

    /**
     * Test setSeenByChecking()
     */
    @Test
    public void testSetSeenByChecking() {
    	for (int i = 0; i < 7; i++ ) {
    	  assertFalse(blackPawns1[i].setSeenByChecking(p1, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p2, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p3, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p4, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p5, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p6, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p7, "black"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p8, "black"));
    	  
    	  assertFalse(blackPawns1[i].setSeenByChecking(p10, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p9, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p3, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p4, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p5, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p6, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p7, "white"));
    	  assertFalse(blackPawns1[i].setSeenByChecking(p8, "white"));
    	  
    	  assertFalse(whitePawns1[i].setSeenByChecking(p1, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p2, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p3, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p4, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p10, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p9, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p7, "white"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p8, "white"));
    	  
          assertFalse(whitePawns1[i].setSeenByChecking(p1, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p2, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p3, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p4, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p5, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p6, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p7, "black"));
    	  assertFalse(whitePawns1[i].setSeenByChecking(p8, "black"));
    	  
    	  assertFalse(blackPawns1[i].returnMyseen());
    	  blackPawns1[i].setMYseen(true);
    	  assertTrue(blackPawns1[i].returnMyseen());
    	  
    	}
    	
    }
}