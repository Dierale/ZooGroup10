package edu.nwmissouri.zoo10group;

/**
 *
 * @author Jayanth Naramsetty
 */
public class LifetimeMember extends Visitor {
    /**
     * we declares the duration of the membership
     */

    private int membershipDuration;

    /**
     *  LifetimeMember constructor gives the entranceFee,discount,groupSize,membershipDuration
     * 
     */
    public LifetimeMember() {
        this.entranceFee = 50;
        this.discount= 20;
        this.groupSize=1;
        this.membershipDuration=0;
    }

    /**
     *gets membership Duration
     * @return
     */
    public int getMembershipDuration() {
        return membershipDuration;
    }

    /**
     * sets membership duration
     * @param membershipDuration
     */
    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    /**
     *gets entrance fee
     * @return
     */
    public double getEntranceFee() {
        return entranceFee;
    }

    /**
     *sets entrance fee
     * @param entranceFee
     */
    public void setEntranceFee(double entranceFee) {
        this.entranceFee = entranceFee;
    }

    /**
     *gets discount
     * @return
     */
    public double getDiscount() {
        return discount;
    }

    /**
     *sets discount
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     *gets group size
     * @return
     */
    public int getGroupSize() {
        return groupSize;
    }

    /**
     *is sets the group size and also it is a responsive type we can set the what ever group size it is
     * @param groupSize
     */
    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    
}
