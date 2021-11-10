/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo10group;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Manish Goud Bandharapu
 */
public class ContestWinnerTest {
    
    public ContestWinnerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getContestName method, of class ContestWinner.
     */
    @Test
    public void testGetContestName() {
        System.out.println("getContestName");
        ContestWinner instance = new ContestWinner();
        String expResult = "Ali baba Animals";
        String result = instance.getContestName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContestName method, of class ContestWinner.
     */
    @Test
    public void testSetContestName() {
        System.out.println("setContestName");
        String ContestName = "Ali baba Animals";
        ContestWinner instance = new ContestWinner();
        instance.setContestName(ContestName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOfContest method, of class ContestWinner.
     */
    @Test
    public void testGetDateOfContest() {
        System.out.println("getDateOfContest");
        ContestWinner instance = new ContestWinner();
        Date expResult = null;
        Date result = instance.getDateOfContest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfContest method, of class ContestWinner.
     */
    @Test
    public void testSetDateOfContest() {
        System.out.println("setDateOfContest");
        Date DateOfContest = null;
        ContestWinner instance = new ContestWinner();
        instance.setDateOfContest(DateOfContest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntranceFee method, of class ContestWinner.
     */
    @Test
    public void testGetEntranceFee() {
        System.out.println("getEntranceFee");
        ContestWinner instance = new ContestWinner();
        double expResult = 0.0;
        double result = instance.getEntranceFee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntranceFee method, of class ContestWinner.
     */
    @Test
    public void testSetEntranceFee() {
        System.out.println("setEntranceFee");
        double entranceFee = 0.0;
        ContestWinner instance = new ContestWinner();
        instance.setEntranceFee(entranceFee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class ContestWinner.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        ContestWinner instance = new ContestWinner();
        double expResult = 0.0;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscount method, of class ContestWinner.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        double discount = 0.0;
        ContestWinner instance = new ContestWinner();
        instance.setDiscount(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupSize method, of class ContestWinner.
     */
    @Test
    public void testGetGroupSize() {
        System.out.println("getGroupSize");
        ContestWinner instance = new ContestWinner();
        int expResult = 0;
        int result = instance.getGroupSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupSize method, of class ContestWinner.
     */
    @Test
    public void testSetGroupSize() {
        System.out.println("setGroupSize");
        int groupSize = 0;
        ContestWinner instance = new ContestWinner();
        instance.setGroupSize(groupSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
