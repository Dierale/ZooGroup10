package edu.nwmissouri.zoo10group;

/**
 *
 * @author Alex Dieringer
 */
public class Griffin extends Animal implements Runnable {

    /**
     * Define variables to hold data about the Griffin class May refactor
     * variables into super class To be used in additional methods added later
     */
    private final String species_name;
    private final String species_latin;
    private final String locationFound;
    private final int sleepDuration_hours;
    private final int movementSpeed_mph;
    private final boolean isExtinct;

    /**
     * Griffin constructor Creates an instance of the Griffin class, requires a
     * name
     *
     * @param name The name we will be giving our new Griffin
     */
    public Griffin(String name) {
        super(name);

        this.species_name = "Griffin";
        this.species_latin = "grȳpus";
        this.locationFound = "Fantasy";
        this.sleepDuration_hours = 8;
        this.movementSpeed_mph = 80;
        this.isExtinct = true;
    }

    /******************************
     * SUPERCLASS FUNCTION OVERRIDES
     *******/
    
    
    /**
     * speak() - Presents the types of sounds made by the Griffin
     */
    @Override
    public String speak() {
        String spoken = "I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.";
        return spoken;
    }

    /**
     * move() - Describes the general type of movement the animal Griffin
     */
    @Override
    public String move() {
        String movement = "I can walk but I really enjoy flying through the sky.";
        return movement;
    }

    @Override
    public void run() {
        System.out.println("Hello, my name is : " + getName() + "!");

        System.out.println(speak());
        System.out.println(move());

        System.out.println("\nMy species is called " + getSpeciesName());;
        System.out.println("Sometimes I'm referred to as the species: " + getLatinName());
        System.out.println("My preferred habit is: " + getLocationFound());
        System.out.println("When I get tired I like to sleep for " + getSleepDuration() + " hours");
        System.out.println("When I'm really speeding along I max out at "
                + getMovementSpeed() + " mph");

        String isFound = (getIsExtinct()) ? "yes" : "no";
        System.out.println("Can you find me out in the wild? The answer is "
                + isFound);
        System.out.println(speak());
        System.out.println(move());
    }
    
    /******************************
     * GRIFFIN UNIQUE FUNCTIONS
     *******/
    
    /**
     * getMyName() - Returns the animal's name
     *
     * @return The name of the animal as a String
     */
    public String getMyName() {
        return this.name;
    }

    /**
     * getSpeciesName() - Returns the animal's species
     *
     * @return The animal's species as a String
     */
    public String getSpeciesName() {
        return this.species_name;
    }

    /**
     * getLatinName() - Returns the animal's Latin name
     *
     * @return The animal's Latin name as a String
     */
    public String getLatinName() {
        return this.species_latin;
    }

    /**
     * getLocationFound() - Return the location the animal is found
     *
     * @return The location of the animal as a String
     */
    public String getLocationFound() {
        return this.locationFound;
    }

    /**
     * getSleepDuration() - Return how long the animal sleeps
     *
     * @return The length the animal sleeps in hours
     */
    public int getSleepDuration() {
        return this.sleepDuration_hours;
    }

    /**
     * getMovementSpeed() - Returns the max movement speed of the animal
     *
     * @return How fast the animal can move in mph
     */
    public int getMovementSpeed() {
        return this.movementSpeed_mph;
    }

    /**
     * getIsExtinct() - Returns whether the animal is extinct or not
     *
     * @return Returns true or false on whether the animal is extinct
     */
    public boolean getIsExtinct() {
        return this.isExtinct;
    }
  
}
