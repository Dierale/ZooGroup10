package edu.nwmissouri.zoo10group;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class Member extends Visitor {

    /**
     * Gives the count of animals visited
     */
    protected int animalsVisited = 0;

    /**
     * Member interface so that gives details about the entrance fee, discount and size of the group
     */
    public Member() {
        this.entranceFee = 50;
        this.discount = 10;
        this.groupSize = 1;
    }

    /**
     * Each click on an animal increments the person visiting a animal
     */
    public void visitAnimal() {
        this.animalsVisited += 1;
    }

    /**
     * Gets the animal visited
     * @return
     */
    public int getAnimalsVisited() {
        return animalsVisited;
    }
}
