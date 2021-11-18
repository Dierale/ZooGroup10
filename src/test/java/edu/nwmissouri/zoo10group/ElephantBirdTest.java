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
 * Unit Test: ElephantBird Class
 *
 * @author Alex Dieringer
 */
public class ElephantBirdTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ElephantBirdTest() {
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
        String expected = "I'm ElephantBird! I'm a bird which cannot fly.";
        var eleb = new ElephantBird("Flappy Boi");
        String actual = eleb.speak();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I'm a flightless bird but I can run with 68miles per hour.";
        var eleb = new ElephantBird("Flappy Boi");
        String actual = eleb.move();
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
        String expected = "Flappy Boi";
        var eleb = new ElephantBird(expected);
        String testName = eleb.getName();

        assertEquals(expected, testName);
    }
    
    /**
     * Test custom function getAnimalName()
     *
     * @throws Exception
     */
    @Test
    public void testGetAnimalName() throws Exception {
        // set up testing variables
        String expected = "Elephant Bird";
        var eleb = new ElephantBird("Flappy Boi");
        String resultingData = eleb.getAnimalName();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getFamily()
     *
     * @throws Exception
     */
    @Test
    public void testGetFamily() throws Exception {
        // set up testing variables
        String expected = "Aepyornithidae";
        var eleb = new ElephantBird("Flappy Boi");
        String resultingData = eleb.getFamily();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getLifeSpan()
     *
     * @throws Exception
     */
    @Test
    public void testGetLifeSpan() throws Exception {
        // set up testing variables
        int expected = 60;
        var eleb = new ElephantBird("Flappy Boi");
        int resultingData = eleb.getLifeSpan();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getExistedBefore()
     *
     * @throws Exception
     */
    @Test
    public void testGetExistedBefore() throws Exception {
        // set up testing variables
        int expected = 1000;
        var eleb = new ElephantBird("Flappy Boi");
        int resultingData = eleb.getExistedBefore();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function isCanFly()
     *
     * @throws Exception
     */
    @Test
    public void testIsCanFly() throws Exception {
        // set up testing variables
        boolean expected = false;
        var eleb = new ElephantBird("Flappy Boi");
        boolean resultingData = eleb.isCanFly();

        assertEquals(expected, resultingData);
    }
}
