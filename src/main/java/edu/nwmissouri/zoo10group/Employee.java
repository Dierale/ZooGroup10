package edu.nwmissouri.zoo10group;

/**
 * The abstract class Employee, that extends the abstract class Person
 * 
 * @author Alex Dieringer
 */
public abstract class Employee extends Person {
    protected PaymentType employeePaymentType;
    protected double paymentRate;
    protected double hoursWorked;
    
    public PaymentType getPaymentType() {
        return this.employeePaymentType;
    }
    
    public double getPaymentRate() {
        return this.paymentRate;
    }
    
    public double getHoursPerWeek() {
        return this.hoursWorked;
    }
    
    public double calculateMonthlyPay() {
        if(this.employeePaymentType == PaymentType.SALARY) {
            return (this.paymentRate/12);
        } else if (this.employeePaymentType == PaymentType.HOURLY) {
            return (this.paymentRate * this.hoursWorked * 4);
        } else {
            return 0;
        }
    }
    
    public double calculateYearlyPay() {
        return (calculateMonthlyPay() * 12);
    }
    
}
