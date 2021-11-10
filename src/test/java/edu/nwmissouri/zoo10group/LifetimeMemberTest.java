/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo10group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jayanth Naramsetty
 */
public class LifetimeMemberTest {
    
    public LifetimeMemberTest() {
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
     * Test of getMembershipDuration method, of class LifetimeMember.
     */
    @Test
    public void testGetMembershipDuration() {
        System.out.println("getMembershipDuration");
        LifetimeMember instance = new LifetimeMember();
        int expResult = 0;
        int result = instance.getMembershipDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMembershipDuration method, of class LifetimeMember.
     */
    @Test
    public void testSetMembershipDuration() {
        System.out.println("setMembershipDuration");
        int membershipDuration = 0;
        LifetimeMember instance = new LifetimeMember();
        instance.setMembershipDuration(membershipDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntranceFee method, of class LifetimeMember.
     */
    @Test
    public void testGetEntranceFee() {
        System.out.println("getEntranceFee");
        LifetimeMember instance = new LifetimeMember();
        double expResult = 50;
        double result = instance.getEntranceFee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntranceFee method, of class LifetimeMember.
     */
    @Test
    public void testSetEntranceFee() {
        System.out.println("setEntranceFee");
        double entranceFee = 50;
        LifetimeMember instance = new LifetimeMember();
        instance.setEntranceFee(entranceFee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class LifetimeMember.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        LifetimeMember instance = new LifetimeMember();
        double expResult = 20;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscount method, of class LifetimeMember.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        double discount = 20;
        LifetimeMember instance = new LifetimeMember();
        instance.setDiscount(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupSize method, of class LifetimeMember.
     */
    @Test
    public void testGetGroupSize() {
        System.out.println("getGroupSize");
        LifetimeMember instance = new LifetimeMember();
        int expResult = 0;
        int result = instance.getGroupSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupSize method, of class LifetimeMember.
     */
    @Test
    public void testSetGroupSize() {
        System.out.println("setGroupSize");
        int groupSize = 0;
        LifetimeMember instance = new LifetimeMember();
        instance.setGroupSize(groupSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
