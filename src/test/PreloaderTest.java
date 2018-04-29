package test;

import chessgame.Preloader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The Class PreloaderTest.
 */
public class PreloaderTest {

    /** The preloader. */
    Preloader preloader; // singleton

    /**
     * Sets up.
     *
     * @throws Exception
     *             the exception
     */
    @Before
    public void setUp() throws Exception {
        this.preloader = Preloader.getInstance();
    }

    /**
     * Tear down.
     *
     * @throws Exception
     *             the exception
     */
    @After
    public void tearDown() throws Exception {
        this.preloader = null;
    }

    /**
     * Test valid name.
     */
    @Test
    public void testValidName() {
        assertTrue(this.preloader.validName("Josh"));
        assertFalse(this.preloader.validName(""));
        assertFalse(this.preloader.validName("Player Name"));
        assertFalse(this.preloader.validName("player name"));
        assertFalse(this.preloader.validName("Chase"));
    }

    /**
     * Test play game.
     */
    @Test
    public void testPlayGame() {

        // default
        this.preloader.setName("Josh");
        assertTrue(this.preloader.readyToPlay());

        // example how it should run, use validateIpAddress first.
        if (Preloader.validateIpAddress("123")) {
            this.preloader.setIpAddress("123");
            assertTrue(this.preloader.readyToPlay());
        }

        // tests the local button
        assertTrue(this.preloader.readyToPlay());
    }

}
