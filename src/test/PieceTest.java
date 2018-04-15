/**
 * JUnit test case is testing a generic chess piece
 */
package test;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import pieces.Piece;

public class PieceTest {
	

	private final static Logger LOG = Logger.getLogger("myLogger");
	protected static String fileSeparator= System.getProperty("file.separator");
	protected static Piece aPiece;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		aPiece = new Piece("src" + fileSeparator + "Icons" + fileSeparator
        + "Player1Icons" + fileSeparator + "wr.gif", 1, 8);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.info("@AfterClass");
	}


	@Test
	public void testPieceConstructor() {
		assertTrue(aPiece.returnX() == 1);
		assertTrue(aPiece.returnY() == 8);
		assertNotNull(aPiece.returnPieceImage());
		assertTrue(aPiece.returnLife());
		assertTrue(aPiece.returnPostion().getX()==1);
		assertTrue(aPiece.returnPostion().getY()==8);
	}

	@Test
	public void testPieceMethods() {
		aPiece.setPixels(1, 2);
		assertTrue(aPiece.getpixelPoint().getX()==1);
		assertTrue(aPiece.getpixelPoint().getY()==2);
        assertTrue(aPiece.inThisPosition(1,8));
        Point aPoint = new Point(5,1);
        aPiece.setPoint(aPoint);
		assertTrue(aPiece.inThisPosition(5,1));
        assertTrue(aPiece.returnOld().getX()==1);
        assertTrue(aPiece.returnOld().getY()==8);
        aPiece.toOld(aPiece.returnOld());
		assertTrue(aPiece.inThisPosition(1,8));

	}
	
	
}
