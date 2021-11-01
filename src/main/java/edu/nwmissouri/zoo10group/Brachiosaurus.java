package edu.nwmissouri.zoo10group;

/**
 * Brachiosaurus class creation and extends with Animal class
 * 
 * @author Jayanth Naramsetty
 */
public class Brachiosaurus extends Animal implements Runnable {

    /**
     * Brachiosaurus declaration
     *
     * @param name
     */
    public Brachiosaurus(String name) {
        super(name);
    }

    /**
     * speak() method
     */
    public void speak() {
        System.out.println("I can Roar,Grunts,Hisses,Squeaks");
    }

    /**
     * move() method
     */
    public void move() {
        System.out.println("i walk all around the land ");
    }

    /**
     * facts() methods
     */
    public void facts() {
        System.out.println("WE are group of reptiles that have lived on Earth\nfor about 245 million years. ");
    }

    @Override
    public void run() {

    }

}
