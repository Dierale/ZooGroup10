package edu.nwmissouri.zoo10group;

/**
 * The abstract class Employee, that extends the abstract class Person
 * 
 * @author Alex Dieringer
 */
public abstract class Employee extends Person {
    protected PaymentType employeePaymentType;
    protected double paymentRate;
    protected double hoursWorked;
    protected String employeeTitle;
    protected String jobDescription;
    
    /**
     * Getter function for employeePaymentType
     * 
     * @return  The value of employeePaymentType as type PaymentType
     */
    public PaymentType getPaymentType() {
        return this.employeePaymentType;
    }
    
    /**
     * Generates a String value for paymentType as a getter
     * Used for easier print statements instead of translating PaymentType type after getter
     * 
     * @return  The value of the Employee's employeePaymentType translated as a String
     */
    public String getPaymentTypeString() {
        PaymentType tp = this.employeePaymentType;
        if( null != tp) switch (tp) {
            case HOURLY:
                return "Hourly";
            case SALARY:
                return "Salary";
            case CONTRACT:
                return "Contract"; 
            default:
                break;
        }
        return "Unknown";
    }
    
    /**
     * Getter function for employee's paymentRate double
     * 
     * @return  How much the employee is payed per payment cycle as a double
     */
    public double getPaymentRate() {
        return this.paymentRate;
    }
    
    /**
     * Getter function for employee's hoursPerWeek double
     * 
     * @return  How many hours per week the employee works as a double
     */
    public double getHoursPerWeek() {
        return this.hoursWorked;
    }
    
    /**
     * Calculates how much the employee is paid monthly
     * Parses paymentRate depending on PaymentType
     * 
     * @return  The employee's monthly pay as a double
     */
    public double calculateMonthlyPay() {
        if(this.employeePaymentType == PaymentType.SALARY) {
            return (this.paymentRate/12);
        } else if (this.employeePaymentType == PaymentType.HOURLY) {
            return (this.paymentRate * this.hoursWorked * 4);
        } else {
            return 0;
        }
    }
    
    /**
     * Calculates employee's yearly pay
     * Takes the employee's monthly pay multiplied by 12
     * 
     * @return  The employee's monthly pay as a double
     */
    public double calculateYearlyPay() {
        return (calculateMonthlyPay() * 12);
    }
    
    /**
     * Getter function for employee's private employeeTitle String
     * 
     * @return  The title of the employee as a String
     */
    public String getEmployeeTitle() {
        return this.employeeTitle;
    }
    
    /**
     * Getter function for employee's private jobDescription String
     * 
     * @return  The job description of the employee as a String
     */
    public String getJobDescription() {
        return this.jobDescription;
    }
}
