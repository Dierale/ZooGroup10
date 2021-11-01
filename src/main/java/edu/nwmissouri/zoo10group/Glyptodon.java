package edu.nwmissouri.zoo10group;

/**
 * Glyptodon Class derived from animal class
 *
 * @author Manish Goud Bandharapu
 */
public class Glyptodon extends Animal implements Runnable {

    /**
     * Animal addition
     *
     * @param name
     */
    public Glyptodon(String name) {
        super(name);
    }

    /**
     * Animal speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm Manish. I'm an Glyptodon!", this.name);
    }

    /**
     * Animal move
     */
    @Override()
    public void move() {
        System.out.println("move move move \n");
    }

    @Override
    public void run() {

    }

}
