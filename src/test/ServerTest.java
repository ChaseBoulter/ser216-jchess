package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chessgame.Preloader;

/**
 * The Class ServerTest.
 */
public class ServerTest {
    
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
     * Test ip address.
     */
    @Test
    public void testIpAddress() {
        //preloader.setIpAddress("1234");
        assertFalse(Preloader.validateIpAddress("1234"));
        
        //if it is invalid it will be 127.0.0.1
        assertTrue(preloader.getIpAddress().equals("127.0.0.1"));
        
        assertTrue(Preloader.validateIpAddress("127.0.0.1"));
        
        assertFalse(Preloader.validateIpAddress("123.456.789.1234"));
        assertTrue(preloader.getIpAddress().equals("127.0.0.1"));
        
        assertTrue(Preloader.validateIpAddress("70.177.168.69"));
        preloader.setIpAddress("70.177.168.69");
        assertTrue(preloader.getIpAddress().equals("70.177.168.69"));
    }
    
    /**
     * Test port.
     */
    @Test
    public void testPort() {
        assertFalse(preloader.validatePortNumber("123"));
        
        assertTrue(preloader.validatePortNumber("1234"));
        preloader.setPortNumber("1234");
        
        assertTrue(preloader.getPortNumber().equals("1234"));
        
        assertFalse(preloader.validatePortNumber("231132142"));
        
        assertFalse(preloader.validatePortNumber("trying to break!"));
        
        assertTrue(preloader.validatePortNumber("65533"));
        preloader.setPortNumber("65533");
        assertTrue(preloader.getPortNumber().equals("65533"));
        
        assertFalse(preloader.validatePortNumber("-1230"));
        
        
    }

}
