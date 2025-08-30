// Abstract class for Accounts
abstract class Accounts {
    // Data members
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;
    protected double balance;

    // Constructor
    public Accounts(int accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void display();
}

// Subclass for SavingsAccount
class SavingsAccount extends Accounts {
    private double rateOfInterest;

    // Constructor
    public SavingsAccount(int accountNumber, String accountHoldersName, String address, double balance,
            double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    // Method to deposit money
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    @Override
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }

    // Method to calculate interest amount
    public void calculateAmount() {
        double interestAmount = balance * rateOfInterest / 100;
        System.out.println("Interest Amount: " + interestAmount);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount(123456, "Alice Johnson", "456 Elm Street", 8000.0, 3.5);

        // Display account details
        account.display();

        // Deposit money
        account.deposit(2000.0);

        // Withdraw money
        account.withdraw(1000.0);

        // Display account details again
        account.display();

        // Calculate interest amount
        account.calculateAmount();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
}