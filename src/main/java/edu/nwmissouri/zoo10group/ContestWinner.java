package edu.nwmissouri.zoo10group;

import java.util.Date;
/**
 *
 * @author Manish Goud Bandharapu
 */
public class ContestWinner extends Visitor {
    
   
    private String ContestName;
    private Date DateOfContest;
    
    /**
     * Initializing Contest Winner
     * 
     */
    public ContestWinner(){
        this.ContestName= "Ali baba Animals";
        this.DateOfContest= new Date();
        this.entranceFee=50;
        this.discount=50;
        this.groupSize=1;
       
    }

    /**
     * Declaring the contest Name
     * 
     * @return
     */
    public String getContestName() {
        return ContestName;
    }

    /**
     *
     * @param ContestName
     */
    public void setContestName(String ContestName) {
        this.ContestName = ContestName;
    }

    /**
     * Declaring the date of contest
     * 
     * @return
     */
    public Date getDateOfContest() {
        return DateOfContest;
    }

    /**
     *
     * @param DateOfContest
     */
    public void setDateOfContest(Date DateOfContest) {
        this.DateOfContest = DateOfContest;
    }

    /**
     * Declaring the Entrance fee
     *  
     * @return
     */
    public double getEntranceFee() {
        return entranceFee;
    }

    /**
     *
     * @param entranceFee
     */
    public void setEntranceFee(double entranceFee) {
        this.entranceFee = entranceFee;
    }

    /**
     * Declaring the discount
     * @return
     */
    public double getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * Declaring the group size
     *  
     * @return
     */
    public int getGroupSize() {
        return groupSize;
    }

    /**
     *
     * @param groupSize
     */
    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    

    
    
}
