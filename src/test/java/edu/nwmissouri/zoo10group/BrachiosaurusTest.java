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
 * Unit Test: Brachiosaurus Class
 *
 * @author Alex Dieringer
 */
public class BrachiosaurusTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BrachiosaurusTest() {
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
        String expected = "I can Roar,Grunts,Hisses,Squeaks";
        var brach = new Brachiosaurus("Long Boi");
        String actual = brach.speak();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "i walk all around the land ";
        var brach = new Brachiosaurus("Long Boi");
        String actual = brach.move();
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
        String expected = "Long Boi";
        var brach = new Brachiosaurus(expected);
        String testName = brach.getName();

        assertEquals(expected, testName);
    }

    /**
     * Test custom function facts()
     *
     * @throws Exception
     */
    @Test
    public void testFacts() throws Exception {
        // set up testing variables
        String expected = "WE are group of reptiles that have lived on Earth"
                + "for about 245 million years.";
        var brach = new Brachiosaurus("Long Boi");
        String resultingData = brach.facts();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getCurrentLocation()
     *
     * @throws Exception
     */
    @Test
    public void testGetCurrentLocation() throws Exception {
        // set up testing variables
        String expected = "extinct";
        var brach = new Brachiosaurus("Long Boi");
        String resultingData = brach.getCurrentLocation();

        assertEquals(expected, resultingData);
    }
}
