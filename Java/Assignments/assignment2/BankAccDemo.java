class BankAccount {
     String accountHolderName;
     String accountNumber;
     char accountType;
     double balance;
    public BankAccount(String accountHolderName,String accountNumber,char accountType,double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit done.Balance: " +balance);
    }
    public void withdraw(double amount) {
        if (balance-amount>=1000) {
            balance -= amount;
            System.out.println("Withdrawal done.Balance: " +balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sam", "1234567890", 'S', 50000);
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();
        account.deposit(2000);
        System.out.println("\nAccount Details after Deposit:");
        account.displayAccountDetails();
        account.withdraw(3000);
        System.out.println("\nAccount Details after Withdrawal:");
        account.displayAccountDetails();
    }
}

