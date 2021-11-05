package edu.nwmissouri.zoo10group;

/**
 * Glyptodon Class derived from animal class
 *
 * @author Manish Goud Bandharapu
 */
public class Glyptodon extends Animal implements Runnable {
    
    private final String name;
    private final String genus;
    private final String foundin;
    private final int travelled_feet;
    private final boolean isPerceive;
    
    /**
     * Animal addition
     *
     * @param name
     */
    public Glyptodon(String name) {
        super(name);
        
        this.name = "Glyptodon";
        this.genus = "armadillos";
        this.foundin = "Forest";
        this.travelled_feet = 20;
        this.isPerceive = true;
    }

    /**
     * Animal speak
     * @return 
     */
    @Override
    public String speak() {
        String spoken = "I'm an Glyptodon! and I roar liek a lion";
        return spoken;
       
    }

    /**
     * Animal move
     * @return 
     */
    @Override()
    public String move() {
        String movement = "I walk slowly on land surfaces but I enjoy moving through water.";
        return movement;
    }

    /**
     *
     */
    @Override
    public void run() {
        System.out.println("Hello, my name is : " + getMyName() + "!");

        System.out.println(speak());
        System.out.println(move());

        System.out.println("\nMy name is called " + getMyName());
        System.out.println("Sometimes I'm referred to as the genus: " + getGenus());
        System.out.println("I can see found in: " + getFoundin());
        System.out.println("When I move I walk  " + getTravelled() + " feet");
        String isSeen = (getPercieve()) ? "yes" : "no";
        System.out.println("Can you find me forest? The answer is "
                + isSeen);
        System.out.println(speak());
        System.out.println(move());

    }

    /**
     * getMyName() - Returns the name of the animal
     * 
     * @return
     */
    public String getMyName() {
        return this.name;
    }
    
    /**
     * getGenus() - Returns the genus of the animal
     * 
     * @return
     */
    public String getGenus() {
        return this.genus;
    }

    /**
     * getGenus() - Returns the place where the animal is found
     * 
     * @return
     */
    public String getFoundin() {
        return this.foundin;
    }

    /**
     *getTravelled() - Returns the area teh animal has travelled
     * 
     * @return
     */
    public int getTravelled() {
        return this.travelled_feet;
    }

    /**
     *
     * @return
     */
    public boolean getPercieve() {
        return this.isPerceive;
    }
   
}
