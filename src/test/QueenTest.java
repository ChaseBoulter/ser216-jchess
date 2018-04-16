package test;

import static org.junit.Assert.*;

import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Queen;

public class QueenTest {
	private final static Logger LOG = Logger.getLogger("myLogger");
	protected static String fileSeparator= System.getProperty("file.separator");
    protected static Queen whiteQueen;
    protected static Queen blackQueen;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        whiteQueen = new Queen("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "wq.gif", 4, 6);
        blackQueen = new Queen("src" + fileSeparator + "Icons" 
                + fileSeparator + "Player2Icons" + fileSeparator + "bq.gif", 4, 3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		whiteQueen = blackQueen = null;
		LOG.info("@AfterClass QueenTest complete");
	}


	@Test
	public void testCanMove() {
		assertTrue(whiteQueen.canMove(3, 6));
		assertTrue(whiteQueen.canMove(5, 6));
		assertTrue(whiteQueen.canMove(4, 7));
		assertTrue(whiteQueen.canMove(5, 7));
		assertTrue(whiteQueen.canMove(3, 7));
		assertTrue(whiteQueen.canMove(4, 5));
		assertTrue(whiteQueen.canMove(5, 5));
		assertTrue(whiteQueen.canMove(3, 5));
		
		
		assertTrue(whiteQueen.canMove(6, 4));
		assertTrue(whiteQueen.canMove(2, 4));
		assertTrue(whiteQueen.canMove(2, 8));
		assertTrue(whiteQueen.canMove(6, 8));
		
		assertTrue(blackQueen.canMove(3, 3));
		assertTrue(blackQueen.canMove(5, 3));
		assertTrue(blackQueen.canMove(4, 2));
		assertTrue(blackQueen.canMove(5, 2));
		assertTrue(blackQueen.canMove(3, 2));
		assertTrue(blackQueen.canMove(4, 4));
		assertTrue(blackQueen.canMove(5, 4));
		assertTrue(blackQueen.canMove(3, 4));
		
		
		assertTrue(blackQueen.canMove(6, 1));
		assertTrue(blackQueen.canMove(2, 1));
		assertTrue(blackQueen.canMove(2, 5));
		assertTrue(blackQueen.canMove(6, 5));

		assertFalse(blackQueen.canMove(3, 1));
		assertFalse(blackQueen.canMove(5, 1));
		assertFalse(blackQueen.canMove(3, 5));
		assertFalse(blackQueen.canMove(5, 5));
	
		assertFalse(whiteQueen.canMove(3, 4));
		assertFalse(whiteQueen.canMove(5, 4));
		assertFalse(whiteQueen.canMove(3, 8));
		assertFalse(whiteQueen.canMove(5, 8));
		
	}

}
