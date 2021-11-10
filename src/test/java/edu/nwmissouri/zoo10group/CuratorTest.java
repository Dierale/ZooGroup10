package edu.nwmissouri.zoo10group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex Dieringer
 */
public class CuratorTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
        
    public CuratorTest() {
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
     * Test the Curator constructor when given a random exhibits
     * - Checks if this.exhibits is not null
     */
    @Test
    public void testCuratorConstructorRandomExhibits() {
        var cur = new Curator();
        String[] animals = cur.getExhibits();
        assertFalse((animals == null));
    }
    
    /**
     * Test of setExhibits and getExhibits methods,
     * of class Curator.
     */
    @Test
    public void testSetGetExhibits() {
        String[] expected = {"Griffin", "Glyptodon"};
        var cur = new Curator();
        
        cur.setExhibits(expected);
        String[] results = cur.getExhibits();
        
        assertEquals(expected, results);
    }


    /**
     * Test of run method, of class Curator.
     * Because print statement can be variable, we just check
     * to make sure its not an empty string
     */
    
    @Test
    public void testRun() {
        var care = new Caretaker();
        care.run();
        String output = outputStreamCaptor.toString().trim();
        assertTrue((!output.isEmpty()));
    }
}
