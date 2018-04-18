package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chessgame.Preloader;

/**
 * The Class PreloaderTest.
 */
public class PreloaderTest {

    /** The preloader. */
    Preloader preloader; //singleton

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        preloader = Preloader.getInstance();
    }

    /**
     * Tear down.
     *
     * @throws Exception the exception
     */
    @After
    public void tearDown() throws Exception {
        preloader = null;
    }

    /**
     * Test valid name.
     */
    @Test
    public void testValidName() {
        assertTrue(preloader.validName("Josh"));
        assertFalse(preloader.validName(""));
        assertFalse(preloader.validName("Player Name"));
        assertFalse(preloader.validName("player name"));
        assertFalse(preloader.validName("Chase"));
    }
    
    /**
     * Test play game.
     */
    @Test
    public void testPlayGame() {
        
        //default
        preloader.setName("Josh");
        assertTrue(preloader.readyToPlay());      
        
        //example how it should run, use validateIpAddress first.
        if (Preloader.validateIpAddress("123")) {
            preloader.setIpAddress("123");
            assertTrue(preloader.readyToPlay());
        }
        
        //tests the local button
        assertTrue(preloader.readyToPlay());
    }

}
