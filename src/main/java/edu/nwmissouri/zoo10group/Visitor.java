package edu.nwmissouri.zoo10group;

/**
 * The abstract class visitor, a non employee who visits our Zoo
 * 
 * @author Alex Dieringer
 */
public abstract class Visitor extends Person {

    protected double entranceFee;
    protected double discount;
    protected int groupSize;

    /**
     * Sets the protected variable entranceFee to a given value
     *
     * @param amount How much it costs a visitor to enter the zoo
     */
    public void setEntranceFee(double amount) {
        this.entranceFee = amount;
    }

    /**
     * Grabs and returns the value of the protected variable entranceFee
     *
     * @return How much the visitor pays to enter the zoo as a double
     */
    public double getEntranceFee() {
        return this.entranceFee;
    }

    /**
     * Sets the protected variable setDiscount to a given value
     *
     * @param amount How much of a discount a visitor receives
     */
    public void setDiscount(double amount) {
        this.discount = amount;
    }

    /**
     * Grabs and returns the value of the protected variable entranceFee
     *
     * @return How much of a discount the visitor receives as a double
     */
    public double getDiscount() {
        return this.discount;
    }

    /**
     * Sets the protected variable groupSize to a given value
     *
     * @param size How big the group of visitors is
     */
    public void setGroupSize(int size) {
        this.groupSize = size;
    }

    /**
     * Grabs and returns the value of the protected variable groupSize
     *
     * @return How many people are visiting in the group
     */
    public int getGroupSize() {
        return this.groupSize;
    }

    /**
     * Calculates a visitor's fee using entranceFee and discount After
     * calculation it applies the fee to the total group size
     *
     * @return How much it costs a group to visit a zoo
     */
    public double getGroupCost() {
        double fee = this.entranceFee - this.discount;
        return (this.groupSize * fee);
    }
}
