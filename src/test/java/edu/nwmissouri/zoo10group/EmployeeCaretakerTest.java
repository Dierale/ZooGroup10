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
public class EmployeeCaretakerTest {
    
    public EmployeeCaretakerTest() {
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
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentType() {
        PaymentType expected = PaymentType.SALARY;
        var caret = new Caretaker();
        PaymentType result = caret.getPaymentType();
        //Caretaker is defaulted to PaymentType.SALARY
        assertEquals(expected, result);
    }

    /**
     * Test of getPaymentTypeString method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentTypeString() {
        String expected = "Salary";
        var caret = new Caretaker();
        String result = caret.getPaymentTypeString();
        //Caretaker is defaulted to PaymentType.SALARY resulting in "Salary"
        assertEquals(expected, result);
    }

    /**
     * Test of getPaymentRate method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetPaymentRate() {
        double expected = 65000;
        var caret = new Caretaker();
        double result = caret.getPaymentRate();
        //Caretaker is defaulted to payment rate of 25
        assertEquals(expected, result);
    }

    /**
     * Test of getHoursPerWeek method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetHoursPerWeek() {
        double expected = 40;
        var caret = new Caretaker();
        double result = caret.getHoursPerWeek();
        //Caretaker is defaulted to hours per week of 40
        assertEquals(expected, result);
    }

    /**
     * Test of calculateMonthlyPay method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testCalculateMonthlyPay() {
        // We're default Hourly so we calculate like this
        double expected = ((65000.0)/12.0);
        var caret = new Caretaker();
        double result = caret.calculateMonthlyPay();
        //Caretaker defaults salary, 65000 paymentRate per year divided by 12
        assertEquals(expected, result);
    }

    /**
     * Test of calculateYearlyPay method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testCalculateYearlyPay() {
        // The way we calculate yearly is the same as monthly * 12
        // Yearly pay for a salary is just salary
        double expected = 65000;
        var caret = new Caretaker();
        double result = caret.calculateYearlyPay();
        //Caretaker defaults salary, 65000
        assertEquals(expected, result);
    }

    /**
     * Test of getEmployeeTitle method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetEmployeeTitle() {
        String expected = "Caretaker";
        var caret = new Caretaker();
        String result = caret.getEmployeeTitle();
        //Caretaker title should default to "Caretaker"
        assertEquals(expected, result);
    }

    /**
     * Test of getJobDescription method, of class Employee.
     * Uses a subclass to test because we cannot test an abstract class alone
     * In this test we use the Caretaker() subclass as it extends Employee
     */
    @Test
    public void testGetJobDescription() {
        String expected = "A caretaker keeps the animals at the zoo healthy and socialized. "
                + "They are tasked with the wellbeing of the animals and their safety.";
        var caret = new Caretaker();
        String result = caret.getJobDescription();
        //Caretaker title should default to "Caretaker"
        assertEquals(expected, result);
    }

    /**
     * I'm pretty sure EmployeeImpl is the implementation of Employee
     * as a non abstract class to be used in my EmployeeTest
     * I'm not quite sure how to use it yet so I did it using an instance
     * of Caretaker() which is likely not a very good way to test at all
     */
    /**
    public class EmployeeImpl extends Employee {
        
    }
    */
}
