package connectionTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chessgame.Preloader;

public class PreloaderTest {

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
    public void testValidName() {
        assertTrue(preloader.validName("Josh"));
        assertFalse(preloader.validName(""));
        assertFalse(preloader.validName("Player Name"));
        assertFalse(preloader.validName("player name"));
        assertFalse(preloader.validName("Chase"));
    }
    
    @Test
    public void testPlayGame() {
        
        //default
        preloader.setName("Josh");
        assertTrue(preloader.readyToPlay());      
        
        //example how it should run, use validateIpAddress first.
        if(preloader.validateIpAddress("123")) {
            preloader.setIpAddress("123");
            assertTrue(preloader.readyToPlay());
        }
        
        //tests the local button
        assertTrue(preloader.readyToPlay());
    }

}
