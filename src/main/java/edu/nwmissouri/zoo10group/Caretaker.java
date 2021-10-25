package edu.nwmissouri.zoo10group;

/**
 * The Caretaker class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Caretaker extends Employee {
    
    public Caretaker() {
        this.employeePaymentType = PaymentType.SALARY;
        this.paymentRate = 65000;
        this.hoursWorked = 40;
    }
}
