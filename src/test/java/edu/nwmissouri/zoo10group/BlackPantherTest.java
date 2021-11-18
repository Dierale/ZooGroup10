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
 * Unit Test: Black Panther Class
 *
 * @author Alex Dieringer
 */
public class BlackPantherTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BlackPantherTest() {
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
        String expected = "I am a BlackPanther I roar very loud, but I am" + "more aggressive!!";
        var bp = new BlackPanther("Growler");
        String actual = bp.speak();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Griffin.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can run faster on land" + "I can chase faster on trees!";
        var bp = new BlackPanther("Growler");
        String actual = bp.move();
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
        String expected = "Growler";
        var bp = new BlackPanther(expected);
        String testName = bp.getName();

        assertEquals(expected, testName);
    }

    /**
     * Test custom function getGroup_Name()
     *
     * @throws Exception
     */
    @Test
    public void testGetGroup_Name() throws Exception {
        // set up testing variables
        String expected = "Cat";
        var bp = new BlackPanther("Growler");
        String resultingData = bp.getGroup_Name();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getEye_Color()
     *
     * @throws Exception
     */
    @Test
    public void testGetEye_Color() throws Exception {
        // set up testing variables
        String expected = "Green";
        var bp = new BlackPanther("Growler");
        String resultingData = bp.getEye_Color();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getNativity()
     *
     * @throws Exception
     */
    @Test
    public void testGetNativity() throws Exception {
        // set up testing variables
        String expected = "Asia";
        var bp = new BlackPanther("Growler");
        String resultingData = bp.getNativity();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function getAvgSpeed()
     *
     * @throws Exception
     */
    @Test
    public void testGetAvgSpeed() throws Exception {
        // set up testing variables
        int expected = 56;
        var bp = new BlackPanther("Growler");
        int resultingData = bp.getAvgSpeed();

        assertEquals(expected, resultingData);
    }
    
    /**
     * Test custom function isIsCarnivores()
     *
     * @throws Exception
     */
    @Test
    public void testIsIsCarnivores() throws Exception {
        // set up testing variables
        boolean expected = true;
        var bp = new BlackPanther("Growler");
        boolean resultingData = bp.isIsCarnivores();

        assertEquals(expected, resultingData);
    }
}
