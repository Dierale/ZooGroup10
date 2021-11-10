package edu.nwmissouri.zoo10group;

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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getPaymentType method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentType() {
        PaymentType expected = PaymentType.HOURLY;
        var cur = new Curator();
        PaymentType result = cur.getPaymentType();
        //Curator is defaulted to PaymentType.HOURLY
        assertEquals(expected, result);
    }

    /**
     * Test of getPaymentTypeString method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentTypeString() {
        String expected = "Hourly";
        var cur = new Curator();
        String result = cur.getPaymentTypeString();
        //Curator is defaulted to PaymentType.HOURLY resulting in "Hourly"
        assertEquals(expected, result);
    }

    /**
     * Test of getPaymentRate method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentRate() {
        double expected = 25;
        var cur = new Curator();
        double result = cur.getPaymentRate();
        //Curator is defaulted to payment rate of 25
        assertEquals(expected, result);
    }

    /**
     * Test of getHoursPerWeek method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetHoursPerWeek() {
        double expected = 40;
        var cur = new Curator();
        double result = cur.getPaymentRate();
        //Curator is defaulted to hours per week of 25
        assertEquals(expected, result);
    }

    /**
     * Test of calculateMonthlyPay method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testCalculateMonthlyPay() {
        // We're default Hourly so we calculate like this
        double expected = (25*40*4);
        var cur = new Curator();
        double result = cur.calculateMonthlyPay();
        //Curator defaults hourly, 25 paymentRate, 40 hours
        assertEquals(expected, result);
    }

    /**
     * Test of calculateYearlyPay method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testCalculateYearlyPay() {
        // The way we calculate yearly is the same as monthly * 12
        double expected = (25*40*4)*12;
        var cur = new Curator();
        double result = cur.getPaymentRate();
        //Curator defaults hourly, 25 paymentRate, 40 hours
        assertEquals(expected, result);
    }

    /**
     * Test of getEmployeeTitle method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetEmployeeTitle() {
        String expected = "Curator";
        var cur = new Curator();
        String result = cur.getEmployeeTitle();
        //Curator title should default to "Curator"
        assertEquals(expected, result);
    }

    /**
     * Test of getJobDescription method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Curator() subclass as it extends Employee
     */
    @Test
    public void testGetJobDescription() {
        String expected = "A curator keeps our visitors happy by being friendly and curteous. "
                + "They are tasked with providing visitors with information on each animal's exhibit.";
        var cur = new Curator();
        String result = cur.getJobDescription();
        //Curator title should default to "Curator"
        assertEquals(expected, result);
    }

    /**
     * I'm pretty sure EmployeeImpl is the implementation of Employee
     * as a non abstract class to be used in my EmployeeTest
     * I'm not quite sure how to use it yet so I did it using an instance
     * of Curator() which is likely not a very good way to test at all
     */
    /**
    public class EmployeeImpl extends Employee {
        
    }
    */
}
