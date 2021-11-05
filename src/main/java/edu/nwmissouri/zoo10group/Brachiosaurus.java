package edu.nwmissouri.zoo10group;

/**
 * Brachiosaurus class creation and extends with Animal class
 * 
 * @author Jayanth Naramsetty
 */
public class Brachiosaurus extends Animal implements Runnable {
/**
 * It initialize the location of the animal
 */
    
   private final String CurrentLocation;  
    /**
     * Brachiosaurus declaration
     * 
     * The CurrentLocation of the animal
     *
     * @param name
     */
   
     public Brachiosaurus(String name) {
        super(name);
       this.CurrentLocation= "extinct";
        
    }

    /**
     * Returns a string with what the animal says
     * @return  The animal's speech as a string
     */
    public String speak() {
        return "I can Roar,Grunts,Hisses,Squeaks";
    }

    /**
     * Returns a String with the moment of the animal
     * @return The animal moment as a string
     */
    public String move() {
        return "i walk all around the land ";
        
    }

    /**
     * Returns a String of the facts which contains info about the animal
     * @return The animal facts a String
     */
    public String facts() {
        return "WE are group of reptiles that have lived on Earth"
                + "for about 245 million years.";
        
    }

    public String getCurrentLocation() {
        return this.CurrentLocation;
    }
    
    @Override
    public void run() {
        System.out.println("Hai Humans my name is "+ getName());
        System.out.println(speak());
        System.out.println(move());
        System.out.println(facts());
        System.out.println("The Currentlocation of the Brachiosaurus is: " + getCurrentLocation());

    }

}
