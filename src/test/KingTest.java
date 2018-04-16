package test;

import static org.junit.Assert.*;

import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.King;

public class KingTest {
	private final static Logger LOG = Logger.getLogger("myLogger");
	protected static String fileSeparator= System.getProperty("file.separator");
    protected static King whiteKing;
    protected static King blackKing;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        whiteKing = new King("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "wk.gif", 5, 8);
        blackKing = new King("src" + fileSeparator + "Icons" 
                + fileSeparator + "Player2Icons" + fileSeparator + "bk.gif", 5, 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		whiteKing = blackKing = null;
		LOG.info("@AfterClass KingTest complete");
	}


	@Test
	public void testCanMove() {
		assertTrue(whiteKing.canMove(4, 8));
		assertTrue(whiteKing.canMove(6, 8));
		assertTrue(whiteKing.canMove(4, 7));
		assertTrue(whiteKing.canMove(5, 7));
		assertTrue(whiteKing.canMove(6, 7));
		assertFalse(whiteKing.canMove(3, 7));
		assertFalse(whiteKing.canMove(3, 2));
		assertFalse(whiteKing.canMove(4, 1));
		
		
		assertTrue(blackKing.canMove(4, 1));
		assertTrue(blackKing.canMove(6, 1));
        assertTrue(blackKing.canMove(4, 2));
		assertTrue(blackKing.canMove(5, 2));
		assertTrue(blackKing.canMove(6, 2));
		assertFalse(blackKing.canMove(3, 2));
		assertFalse(blackKing.canMove(3,3));
		assertFalse(blackKing.canMove(1,5));
	}

}
