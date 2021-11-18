package edu.nwmissouri.zoo10group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit Test: Glyptodon Class
 *
 * @author Alex Dieringer
 */
public class GlyptodonTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public GlyptodonTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test speak method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm an Glyptodon! and I roar liek a lion";
        var glypt = new Glyptodon("Waddly Boi");
        String actual = glypt.speak();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I walk slowly on land surfaces but I enjoy moving through water.";
        var glypt = new Glyptodon("Waddly Boi");
        String actual = glypt.move();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function getName()
     *
     * @throws Exception
     */
    @Test
    public void testGetName() throws Exception {
        // set up testing variables
        String expected = "Waddly Boi";
        var glypt = new Glyptodon(expected);
        String testName = glypt.getName();

        assertEquals(expected, testName);
    }
    
    /**
     * Test custom function getMyName()
     *
     * @throws Exception
     */
    @Test
    public void testGetMyName() throws Exception {
        // set up testing variables
        String expected = "Glyptodon";
        var glypt = new Glyptodon("Waddly Boi");
        String resultingData = glypt.getMyName();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getGenus()
     *
     * @throws Exception
     */
    @Test
    public void testGetGenus() throws Exception {
        // set up testing variables
        String expected = "armadillos";
        var glypt = new Glyptodon("Waddly Boi");
        String resultingData = glypt.getGenus();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getFoundin()
     *
     * @throws Exception
     */
    @Test
    public void testGetFoundin() throws Exception {
        // set up testing variables
        String expected = "Forest";
        var glypt = new Glyptodon("Waddly Boi");
        String resultingData = glypt.getFoundin();

        assertEquals(expected, resultingData);
    }
    
    
    /**
     * Test custom function getTravelled()
     *
     * @throws Exception
     */
    @Test
    public void testGetTravelled() throws Exception {
        // set up testing variables
        int expected = 20;
        var glypt = new Glyptodon("Waddly Boi");
        int resultingData = glypt.getTravelled();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getPercieve()
     *
     * @throws Exception
     */
    @Test
    public void testGetPercieve() throws Exception {
        // set up testing variables
        boolean expected = true;
        var glypt = new Glyptodon("Waddly Boi");
        boolean resultingData = glypt.getPercieve();

        assertEquals(expected, resultingData);
    }
}
