package edu.nwmissouri.zoo10group;

import java.util.Random;

/**
 * The Curator class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Curator extends Employee implements Runnable {
    
    private String[] myExhibits;
    
    /**
     * Class constructor for Curator()
     * Randomly generates animals for myExhibits
     */
    public Curator() {
        Random rand = new Random();
        String myList[] = Animal.getAnimalList();
        int max = myList.length;
        int choice = rand.nextInt(max);
        int choice2 = choice;
        
        while( choice == choice2) {
            choice2 = rand.nextInt(max);
        }
        String[] exhibits = new String[2];
        exhibits[0] = myList[choice];
        exhibits[1] = myList[choice2];
        
        setDefaultVariables();
        this.myExhibits = exhibits;
    }
    
    /**
     * Class constructor for Curator()
     * Accepts a String array instead of randomizing myExhibits
     * 
     * @param exhibit   The array of strings to set myExhibits to
     */
    public Curator(String[] exhibit) {
        setDefaultVariables();
        this.myExhibits = exhibit;
    }
    
    /**
     * The setter function for private String array myExhibits
     * 
     * @param exhibits  The array of Strings to set myExhibits to
     */
    public void setExhibits( String[] exhibits) {
        this.myExhibits = exhibits;
    }
    
    /**
     * The getter function for private String array myExhibits
     * 
     * @return  The array of Strings that contain the Curator's exhibits
     */
    public String[] getExhibits() {
        return this.myExhibits;
    }
    
    /**
     * Used by constructor classes to standardize default variable values
     * Assigns values to superclass protected variables as follows
     *  - employeePaymentType, paymentRate, hoursWorked, employeeTitle, employeeDescription
     */
    private void setDefaultVariables() {
        this.employeePaymentType = PaymentType.HOURLY;
        this.paymentRate = 25;
        this.hoursWorked = 40;
        this.employeeTitle = "Curator";
        this.jobDescription = "A curator keeps our visitors happy by being friendly and curteous. "
                + "They are tasked with providing visitors with information on each animal's exhibit.";
    }
    
    /**
     * Implements the run() function from Runnable
     * Prints out statements about the Curator's hours per week, payment type, and payment rate
     */
    @Override
    public void run() {
        System.out.println("A Curator works for " + getHoursPerWeek() + " hours per week.");
        System.out.println("They are paid as a: " + getPaymentTypeString() + " employee");
        System.out.println("This means they are paid " + getPaymentRate() + " dollars per hour");
    }
}
