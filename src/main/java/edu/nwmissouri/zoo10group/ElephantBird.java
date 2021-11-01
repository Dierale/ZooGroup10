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
    public ElephantBird(String name) {
        super(name);
    }

    /**
     * Elephant Bird speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an ElephantBird!", this.name);
    }

    /**
     * Elephant Bird move
     */
    @Override
    public void move() {
        System.out.println("When I move, I run,run,run.\n");
    }

    @Override
    public void run() {

    }

}
