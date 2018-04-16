package test;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pieces.Knight;

public class KnightTest {
	private final static Logger LOG = Logger.getLogger("myLogger");
	protected static String fileSeparator= System.getProperty("file.separator");
    protected static Knight whiteKnight1;
    protected static Knight whiteKnight2;
    protected static Knight blackKnight1;
    protected static Knight blackKnight2;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        whiteKnight1 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "wn.gif", 2, 8);
        whiteKnight2 = new Knight("src" + fileSeparator + "Icons" + fileSeparator
                + "Player1Icons" + fileSeparator + "wn.gif", 7, 8);
        blackKnight1 = new Knight("src" + fileSeparator + "Icons" 
                + fileSeparator + "Player2Icons" + fileSeparator + "bn.gif", 2, 1);
        blackKnight2 = new Knight("src" + fileSeparator + "Icons" 
                    + fileSeparator + "Player2Icons" + fileSeparator + "bn.gif", 7, 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		whiteKnight1 = whiteKnight2 = blackKnight2 = blackKnight1 =null;
		LOG.info("@AfterClass KnightTest complete");
	}

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
		assertFalse(blackKnight1.canMove(7, 3));	}

}
