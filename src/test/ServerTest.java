package test;

import chessgame.Preloader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * The Class ServerTest.
 */
public class ServerTest {

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
     * Test ip address.
     */
    @Test
    public void testIpAddress() {
        // preloader.setIpAddress("1234");
        assertFalse(Preloader.validateIpAddress("1234"));

        // if it is invalid it will be 127.0.0.1
        // assertFalse(preloader.getIpAddress().equals("127.0.0.1"));

        assertTrue(Preloader.validateIpAddress("127.0.0.1"));

        assertFalse(Preloader.validateIpAddress("123.456.789.1234"));
        // assertFalse(preloader.getIpAddress().equals("127.0.0.1"));

        assertTrue(Preloader.validateIpAddress("70.177.168.69"));
        this.preloader.setIpAddress("70.177.168.69");
        assertTrue(this.preloader.getIpAddress().equals("70.177.168.69"));
    }

    /**
     * Test port.
     */
    @Test
    public void testPort() {
        assertFalse(this.preloader.validatePortNumber("123"));

        assertTrue(this.preloader.validatePortNumber("1234"));
        this.preloader.setPortNumber("1234");

        assertTrue(this.preloader.getPortNumber().equals("1234"));

        assertFalse(this.preloader.validatePortNumber("231132142"));

        assertFalse(this.preloader.validatePortNumber("trying to break!"));

        assertFalse(this.preloader.validatePortNumber("65533"));
        this.preloader.setPortNumber("65533");
        assertTrue(this.preloader.getPortNumber().equals("65533"));

        assertFalse(this.preloader.validatePortNumber("-1230"));

    }

}
