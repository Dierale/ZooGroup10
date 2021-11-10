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
 * Unit Test: Griffin Class
 *
 * @author Alex Dieringer
 */
public class GriffinTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public GriffinTest() {
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
        String expected = "I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.";
        var grif = new Griffin("Griff");
        String actual = grif.speak();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can walk but I really enjoy flying through the sky.";
        var grif = new Griffin("Griff");
        String actual = grif.move();
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
        String expected = "Griffo";
        var grif = new Griffin(expected);
        String testName = grif.getName();

        assertEquals(expected, testName);
    }

    /**
     * Test custom function getSpeciesName()
     *
     * @throws Exception
     */
    @Test
    public void testGetSpeciesName() throws Exception {
        // set up testing variables
        String expected = "Griffin";
        var grif = new Griffin("Griffo");
        String resultingData = grif.getSpeciesName();

        assertEquals(expected, resultingData);
    }

    /**
     * Test custom function getLatinName()
     *
     * @throws Exception
     */
    @Test
    public void testGetLatinName() throws Exception {
        // set up testing variables
        String expected = "grȳpus";
        var grif = new Griffin("Griffo");
        String resultingData = grif.getLatinName();

        assertEquals(expected, resultingData);
    }

    /**
     * Test custom function getLocationFound()
     *
     * @throws Exception
     */
    @Test
    public void testGetLocationFound() throws Exception {
        // set up testing variables
        String expected = "Fantasy";
        var grif = new Griffin("Griffo");
        String resultingData = grif.getLocationFound();

        assertEquals(expected, resultingData);
    }

    /**
     * Test custom function getSleepDuration()
     *
     * @throws Exception
     */
    @Test
    public void testGetSleepDuration() throws Exception {
        // set up testing variables
        int expected = 8;
        var grif = new Griffin("Griffo");
        int resultingData = grif.getSleepDuration();

        assertEquals(expected, resultingData);
    }

    /**
     * Test custom function getMovementSpeed()
     *
     * @throws Exception
     */
    @Test
    public void testGetMovementSpeed() throws Exception {
        // set up testing variables
        int expected = 80;
        var grif = new Griffin("Griffo");
        int resultingData = grif.getMovementSpeed();

        assertEquals(expected, resultingData);
    }

    /**
     * Test custom function getIsExtinct()
     *
     * @throws Exception
     */
    @Test
    public void testGetIsExtinct() throws Exception {
        // set up testing variables
        boolean expected = true;
        var grif = new Griffin("Griffo");
        boolean resultingData = grif.getIsExtinct();

        assertEquals(expected, resultingData);
    }
}
