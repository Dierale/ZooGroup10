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
    protected String[] animalList = {
      "Black Panther", "Branchiosaurus", "Elephant Bird", "Glyptodon", "Griffin"  
    };
    
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
    
    protected String[] getAnimalList() {
        return this.animalList;
    }
    
    protected String getAnimalFromList( int index) {
        int length = this.animalList.length;
        if (index >= 0 && index < length) {
            return this.animalList[index];
        } else if (index < 0 ) {
            return this.animalList[0];
        } else {
            return this.animalList[length-1];
        }
    }
    
}
