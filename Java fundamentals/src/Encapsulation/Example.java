package Encapsulation;

/**
 *
 * @author Alex Bonilla
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Class that represents a bank account using encapsulation
        BankAccount account = new BankAccount("Alex Bonilla", 1000.0);

        // Display account info
        System.out.println("Account Holder: " + account.getOwner());
        System.out.println("Initial Balance: " + account.getBalance()+ "€");

        // Deposit money
        account.deposit(500.0);

        // Withdraw money
        account.withdraw(300.0);

        // Try to withdraw more than the balance
        account.withdraw(2000.0);
    }
}
