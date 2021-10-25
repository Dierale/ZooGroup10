package edu.nwmissouri.zoo10group;

/**
 * The Curator class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Curator extends Employee {
    
    public Curator() {
        this.employeePaymentType = PaymentType.HOURLY;
        this.paymentRate = 25;
        this.hoursWorked = 40;
    }
}
