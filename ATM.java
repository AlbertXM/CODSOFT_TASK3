import java.util.Scanner;
		
/**
 * ATM class representing the ATM machine
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 1
 */
public class ATM 
{
    private BankAccount myAccount;

    /**
     * Constructor to initialize the ATM with a bank account
     * @param account
     */
    public ATM(BankAccount account) {
        this.myAccount = account;
    }

    

    /**
     *  Method to perform actions based on user requested for
     * @param choice
     * @param scan
     */
    public void performAction(int choice, Scanner scan) 
    {
        switch (choice) 
        {
            case 1:
                System.out.println("Current Balance: R" + myAccount.getMyBalance());
                break;
                
            case 2:
                System.out.print("Enter deposit amount: R");
                
                double depositAmount = scan.nextDouble();
                myAccount.deposit(depositAmount);
                
                System.out.println("Deposit successful");
                break;
                
            case 3:
                System.out.print("Enter withdrawal amount: R");
                double withdraw = scan.nextDouble();
                
                if (myAccount.withdraw(withdraw)) 
                {
                    System.out.println("Withdrawal successful");
                } 
                else 
                {
                    System.out.println("Insufficient funds");
                }
                break;
                
            case 4:
                System.out.println("Thank you for using the ATM");
                break;
                
            default:
                System.out.println("Invalid choice");
        }
    }
    
    /**
     *  Method to display the ATM menu
     */
    public void Menu() 
    {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) 
    {
        // Create a bank account with an initial balance of $1000
        BankAccount account = new BankAccount(1000);
        
        // Create an ATM object with the bank account
        ATM atm = new ATM(account);
        
        Scanner scan = new Scanner(System.in);
        int choice;

        // Display the ATM menu and perform actions until the user chooses to exit
        do 
        {
            atm.Menu();
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            atm.performAction(choice, scan);
        }
        while (choice != 4);

        // Close the scan
        scan.close();
    }
    
 
}



