package edu.nwmissouri.zoo10group;

import java.util.Random;

/**
 * The Caretaker class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Caretaker extends Employee implements Runnable {
    
    private String myAnimal;
    
    /**
     * Class constructor for Caretaker()
     * Randomly generates an animal for myAnimal
     */
    public Caretaker() {
        Random rand = new Random();
        String myList[] = Animal.getAnimalList();
        int choice = rand.nextInt(myList.length);
        
        setDefaultVariables();
        this.myAnimal = myList[choice];
    }
    
    /**
     * Class constructor for Caretaker()
     * 
     * @param myAnimal The animal to assign the Caretaker to
     */
    public Caretaker( String myAnimal) {    
        setDefaultVariables();
        this.myAnimal = myAnimal;
    }
    
    /**
     * The setter function for private String myAnimal
     * 
     * @param assignment The string to set myAnimal to
     */
    public void setAnimalAssignment( String assignment) {
        this.myAnimal = assignment;
    }
    
    /**
     * The getter function for private String myAnimal
     * 
     * @return  The value of this caretaker's myAnimal String
     */
    public String getAnimalAssignment() {
        return this.myAnimal;
    }
    
    /**
     * Used by constructor classes to standardize default variable values
     * Assigns values to superclass protected variables as follows
     *  - employeePaymentType, paymentRate, hoursWorked, employeeTitle, employeeDescription
     */
    private void setDefaultVariables() {
        this.employeePaymentType = PaymentType.SALARY;
        this.paymentRate = 65000;
        this.hoursWorked = 40;
        this.employeeTitle = "Caretaker";
        this.jobDescription = "A caretaker keeps the animals at the zoo healthy and socialized. "
                + "They are tasked with the wellbeing of the animals and their safety.";
    }
    
    /**
     * Implements the run() function from Runnable
     * Prints out statements about the Caretaker's hours per week, payment type, and payment rate
     */
    @Override
    public void run() {
        System.out.println("A Caretaker works for " + getHoursPerWeek() + " hours per week.");
        System.out.println("They are paid as a: " + getPaymentTypeString() + " employee");
        System.out.println("This means they are paid " + getPaymentRate() + " dollars per year");
    }
    
}
