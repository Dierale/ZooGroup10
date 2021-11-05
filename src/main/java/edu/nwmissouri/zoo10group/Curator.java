package edu.nwmissouri.zoo10group;

import java.util.Random;

/**
 * The Curator class that extends a Person of type Employee
 * 
 * @author Alex Dieringer
 */
public class Curator extends Employee {
    
    private String[] myExhibits;
    
    public Curator() {
        Random rand = new Random();
        String myList[] = Animal.getAnimalList();
        int max = myList.length;
        int choice = rand.nextInt(max + 1) + 1;
        int choice2 = choice;
        
        while( choice == choice2) {
            choice2 = rand.nextInt(max + 1) + 1;
        }
        String[] exhibits = new String[2];
        exhibits[0] = myList[choice];
        exhibits[1] = myList[choice2];
        
        this.employeePaymentType = PaymentType.HOURLY;
        this.paymentRate = 25;
        this.hoursWorked = 40;
        this.myExhibits = exhibits;
    }
    
    public Curator(String[] exhibit) {
        this.employeePaymentType = PaymentType.HOURLY;
        this.paymentRate = 25;
        this.hoursWorked = 40;
        this.myExhibits = exhibit;
    }
    
    public void setExhibits( String[] exhibits) {
        this.myExhibits = exhibits;
    }
    
    public String[] getExhibits() {
        return this.myExhibits;
    }
}
