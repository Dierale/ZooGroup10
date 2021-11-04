package edu.nwmissouri.zoo10group;

import java.util.Random;

/**
 * The Caretaker class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Caretaker extends Employee {
    
    private String myAnimal;
    
    public Caretaker() {
        Random rand = new Random();
        String myList[] = Animal.getAnimalList();
        int choice = rand.nextInt(myList.length + 1) + 1;
        
        this.employeePaymentType = PaymentType.SALARY;
        this.paymentRate = 65000;
        this.hoursWorked = 40;
        this.myAnimal = myList[choice];
    }
    
    public Caretaker( String myAnimal) {    
        this.employeePaymentType = PaymentType.SALARY;
        this.paymentRate = 65000;
        this.hoursWorked = 40;
        this.myAnimal = myAnimal;
    }
    
    public void setAnimalAssignment( String assignment) {
        this.myAnimal = assignment;
    }
    
    public String getAnimalAssignment() {
        return this.myAnimal;
    }
}
