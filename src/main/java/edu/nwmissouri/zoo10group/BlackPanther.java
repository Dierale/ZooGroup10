package edu.nwmissouri.zoo10group;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPanther extends Animal implements Runnable {

    /**
     * String declaration.
     *
     * @param name
     */
    public BlackPanther(String name) {
        super(name);
    }

    /**
     * BlackPanther Speak
     *
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an BlackPanther!", this.name);
    }

    /**
     *
     * BlackPanther move
     */
    @Override
    public void move() {
        System.out.println("When I move, I run, run, run.\n");
    }

    @Override
    public void run() {

    }

}
