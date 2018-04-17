package connectionTests;

import chessgame.Preloader;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServerTest {
    
    Preloader preloader; //singleton

    @Before
    public void setUp() throws Exception {
        preloader = Preloader.getInstance();
    }

    @After
    public void tearDown() throws Exception {
        preloader = null;
    }

    @Test
    public void testIpAddress() {
        //preloader.setIpAddress("1234");
        assertFalse(preloader.validateIpAddress("1234"));
        
        //if it is invalid it will be 127.0.0.1
        assertTrue(preloader.getIpAddress().equals("127.0.0.1"));
        
        assertTrue(preloader.validateIpAddress("127.0.0.1"));
        
        assertFalse(preloader.validateIpAddress("123.456.789.1234"));
        assertTrue(preloader.getIpAddress().equals("127.0.0.1"));
        
        assertTrue(preloader.validateIpAddress("70.177.168.69"));
        preloader.setIpAddress("70.177.168.69");
        System.out.println(preloader.getIpAddress());
        assertTrue(preloader.getIpAddress().equals("70.177.168.69"));
    }
    
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
