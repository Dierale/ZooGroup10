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
public class CaretakerTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public CaretakerTest() {
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
     * Test the Caretaker constructor when given a random animal
     * - Checks if this.animal has been assigned a value
     */
    @Test
    public void testCaretakerConstructorRandomAnimal() {
        var care = new Caretaker();
        String animal = care.getAnimalAssignment();
        assertTrue((!animal.isEmpty()));
    }

    /**
     * Test of setAnimalAssignment and getAnimalAssingment methods,
     * of class Caretaker.
     */
    @Test
    public void testSetGetAnimalAssignment() {
        String expected = "Griffin";
        var care = new Caretaker();
        
        care.setAnimalAssignment("Griffin");
        String results = care.getAnimalAssignment();
        
        assertEquals(expected, results);
    }
    
    /**
     * Test of run method, of class Caretaker.
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
