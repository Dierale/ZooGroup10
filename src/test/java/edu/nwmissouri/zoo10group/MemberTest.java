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
 * @author Hemanth Sai Reddy Velamuri
 */
public class MemberTest {
    
    public MemberTest() {
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
     * Test of visitAnimal method, of class Member.
     */
    @Test
    public void testVisitAnimal() {
        System.out.println("visitAnimal");
        Member instance = new Member();
        instance.visitAnimal();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAnimalsVisited method, of class Member.
     */
    @Test
    public void testGetAnimalsVisited() {
        System.out.println("getAnimalsVisited");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getAnimalsVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
