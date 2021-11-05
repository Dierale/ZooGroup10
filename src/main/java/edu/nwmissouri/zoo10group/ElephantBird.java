package edu.nwmissouri.zoo10group;

/**
 * Elephant Bird class derived from animal class
 *
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBird extends Animal implements Runnable {

    /**
     * ElephantBird name
     *
     * @param name
     */
    
    private final String animalName;
    private final String family;
    private final int lifeSpan;
    private final int existedBefore;
    private final boolean canFly;
    
    /**
     *
     * @param name
     */
    public ElephantBird(String name) {
        super(name);
        
        this.animalName = "Elephant Bird";
        this.family = "Aepyornithidae";
        this.lifeSpan = 60;
        this.existedBefore = 1000;
        this.canFly = false;
    }

    /**
     * Elephant Bird speaks and describes about it.
     * @return 
     */
    @Override
    public String speak() {
        String voice = "I'm ElephantBird! I'm a bird which cannot fly.";
        return voice;
    }

    /**
     * Elephant Bird move and describes about its movements
     * @return 
     */
    @Override
    public String move() {
        String moves = "I'm a flightless bird but I can run with 68miles per hour.";
        return moves;
    }
    /**
     * Elephant bird and few of its features 
     *  
     */
    @Override
    public void run() {
        System.out.println("Welcome to everyone, my name is : " + getName() + "!");
        
        System.out.println(speak());
        System.out.println(move());
        System.out.println("\n");
        
        System.out.println("I'm from species " + getFamily() +".");
        System.out.println("My average life span is " + getLifeSpan() +".");
        System.out.println("I existed before " + getExistedBefore() +"AD.");
        System.out.println("Can I fly or not? " + isCanFly() +".");
        
    }
    
    /**
     * Gets animal name
     * @return
     */
    public String getAnimalName() {
        return animalName;
    }
    /**
     * Gets animal related family
     * @return
     */
    public String getFamily() {
        return family;
    }

    /**
     * gets animal average lifespan
     * @return
     */
    public int getLifeSpan() {
        return lifeSpan;
    }

    /**
     * gets animal existed before certain years
     * @return
     */
    public int getExistedBefore() {
        return existedBefore;
    }

    /**
     * gets whether animal can fly or not
     * @return
     */
    public boolean isCanFly() {
        return canFly;
    }

}
