package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import players.Player1;
import players.Player2;

public class GameBoardSetupTest {


    /** The Constant LOG. */
    private static final Logger LOG = Logger.getLogger("myLogger");

    /** The file separator. */
    protected static String fileSeparator = System.getProperty("file.separator");

    /** The (white) Player 1 */
    protected static Player1 player1;


    /** The (black) Player 2*/
    protected static Player2 player2;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        player1 = new Player1();
        player2 = new Player2();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        player1 = null;
        player2 = null;
        LOG.info("@AfterClass GameBoardSetupTest complete");
    }



    @Test
    public void testGameSetupWhite() {
        assertTrue(player1.returnPostion(17).getX() == 8);
        assertTrue(player1.returnPostion(17).getY() == 8);

        assertTrue(player1.returnPostion(18).getX() == 1);
        assertTrue(player1.returnPostion(18).getY() == 8);

        assertTrue(player1.returnPostion(19).getX() == 2);
        assertTrue(player1.returnPostion(19).getY() == 8);

        assertTrue(player1.returnPostion(20).getX() == 7);
        assertTrue(player1.returnPostion(20).getY() == 8);

        assertTrue(player1.returnPostion(21).getX() == 3);
        assertTrue(player1.returnPostion(21).getY() == 8);

        assertTrue(player1.returnPostion(22).getX() == 6);
        assertTrue(player1.returnPostion(22).getY() == 8);

        assertTrue(player1.returnPostion(23).getX() == 4);
        assertTrue(player1.returnPostion(23).getY() == 8);

        assertTrue(player1.returnPostion(24).getX() == 5);
        assertTrue(player1.returnPostion(24).getY() == 8);

        assertTrue(player1.returnPostion(25).getX() == 1);
        assertTrue(player1.returnPostion(25).getY() == 7);

        assertTrue(player1.returnPostion(26).getX() == 2);
        assertTrue(player1.returnPostion(26).getY() == 7);

        assertTrue(player1.returnPostion(27).getX() == 3);
        assertTrue(player1.returnPostion(27).getY() == 7);

        assertTrue(player1.returnPostion(28).getX() == 4);
        assertTrue(player1.returnPostion(28).getY() == 7);

        assertTrue(player1.returnPostion(29).getX() == 5);
        assertTrue(player1.returnPostion(29).getY() == 7);

        assertTrue(player1.returnPostion(30).getX() == 6);
        assertTrue(player1.returnPostion(30).getY() == 7);

        assertTrue(player1.returnPostion(31).getX() == 7);
        assertTrue(player1.returnPostion(31).getY() == 7);

        assertTrue(player1.returnPostion(32).getX() == 8);
        assertTrue(player1.returnPostion(32).getY() == 7);
    }


    @Test
    public void testGameSetupBlack() {
        assertTrue(player2.returnPostion(1).getX() == 1);
        assertTrue(player2.returnPostion(1).getY() == 1);

        assertTrue(player2.returnPostion(2).getX() == 8);
        assertTrue(player2.returnPostion(2).getY() == 1);

        assertTrue(player2.returnPostion(3).getX() == 2);
        assertTrue(player2.returnPostion(3).getY() == 1);

        assertTrue(player2.returnPostion(4).getX() == 7);
        assertTrue(player2.returnPostion(4).getY() == 1);

        assertTrue(player2.returnPostion(5).getX() == 3);
        assertTrue(player2.returnPostion(5).getY() == 1);

        assertTrue(player2.returnPostion(6).getX() == 6);
        assertTrue(player2.returnPostion(6).getY() == 1);

        assertTrue(player2.returnPostion(7).getX() == 4);
        assertTrue(player2.returnPostion(7).getY() == 1);

        assertTrue(player2.returnPostion(8).getX() == 5);
        assertTrue(player2.returnPostion(8).getY() == 1);

        assertTrue(player2.returnPostion(9).getX() == 1);
        assertTrue(player2.returnPostion(9).getY() == 2);

        assertTrue(player2.returnPostion(10).getX() == 2);
        assertTrue(player2.returnPostion(10).getY() == 2);

        assertTrue(player2.returnPostion(11).getX() == 3);
        assertTrue(player2.returnPostion(11).getY() == 2);

        assertTrue(player2.returnPostion(12).getX() == 4);
        assertTrue(player2.returnPostion(12).getY() == 2);

        assertTrue(player2.returnPostion(13).getX() == 5);
        assertTrue(player2.returnPostion(13).getY() == 2);

        assertTrue(player2.returnPostion(14).getX() == 6);
        assertTrue(player2.returnPostion(14).getY() == 2);

        assertTrue(player2.returnPostion(15).getX() == 7);
        assertTrue(player2.returnPostion(15).getY() == 2);

        assertTrue(player2.returnPostion(16).getX() == 8);
        assertTrue(player2.returnPostion(16).getY() == 2);
    }

    @Test
    public void testPlayer1CheckMove() {

        assertFalse(player1.checkMove(new Point(1,1), 17));
        assertTrue(player1.checkMove(new Point(1,1), 18));
        assertFalse(player1.checkMove(new Point(1,1), 19));
        assertFalse(player1.checkMove(new Point(1,1), 20));
        assertFalse(player1.checkMove(new Point(1,1), 21));
        assertFalse(player1.checkMove(new Point(4,4), 22));
        assertFalse(player1.checkMove(new Point(1,1), 23));
        assertFalse(player1.checkMove(new Point(3,1), 24));
        assertFalse(player1.checkMove(new Point(3,1), 25));
        assertFalse(player1.checkMove(new Point(3,6), 26));
        assertFalse(player1.checkMove(new Point(1,5), 27));
        assertFalse(player1.checkMove(new Point(7,1), 28));		
        assertFalse(player1.checkMove(new Point(6,5), 29));
        assertFalse(player1.checkMove(new Point(1,2), 30));
        assertFalse(player1.checkMove(new Point(5,3), 31));
        assertFalse(player1.checkMove(new Point(2,4), 32));

    }

}
