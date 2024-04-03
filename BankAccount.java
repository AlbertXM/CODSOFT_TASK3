
/**
 * BankAccount class to represent the user's bank account
 *  
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 3
 */
public class BankAccount 
{
	 private double myBalance;

	    /**
	     * Constructor to initialize the myBalance
	     * @param initialmyBalance
	     */
	    public BankAccount(double balance) 
	    {
	        this.myBalance = balance;
	    }

	    /**
	     *  Method to get the current myBalance
	     * @return
	     */
	    public double getMyBalance() 
	    {
	        return myBalance;
	    }

	    /**
	     *  Method to deposit money into the account
	     * @param amount
	     */
	    public void deposit(double amount) 
	    {
	        myBalance += amount;
	    }

	    /**
	     * Method to withdraw money from the account
	     * @param amount
	     * @return
	     */
	    public boolean withdraw(double amount) 
	    {
	        if (myBalance >= amount) 
	        {
	            myBalance -= amount;
	            return true;
	        }
	        return false;
	    }

}
