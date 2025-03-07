class BankAccount {
    private String accountHolderName;
    private String accountType;
    private double balance;
    private double minBalance;  // For Savings and Current accounts
    private int tenure;         // For Fixed Deposit accounts

    // Constructor for Savings Account
    public BankAccount(String accountHolderName, double balance, double minBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = "Savings";
        this.balance = balance;
        this.minBalance = minBalance;
    }

    // Constructor for Current Account
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountType = "Current";
        this.balance = balance;
        this.minBalance = 0; // No minimum balance for Current accounts
    }

    // Constructor for Fixed Deposit Account
    public BankAccount(String accountHolderName, double balance, int tenure) {
        this.accountHolderName = accountHolderName;
        this.accountType = "Fixed Deposit";
        this.balance = balance;
        this.tenure = tenure;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);

        if (accountType.equals("Savings") || accountType.equals("Current")) {
            System.out.println("Minimum Balance: $" + minBalance);
        } else if (accountType.equals("Fixed Deposit")) {
            System.out.println("Tenure (in years): " + tenure);
        }
    }
}

// Main class to test the constructors
public class BankingSystem {
    public static void main(String[] args) {
        // Create a Savings Account
        BankAccount savingsAccount = new BankAccount("Alice", 5000, 1000);

        // Create a Current Account
        BankAccount currentAccount = new BankAccount("Bob", 20000);

        // Create a Fixed Deposit Account
        BankAccount fixedDepositAccount = new BankAccount("Charlie", 100000, 5);

        // Display account details
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();
        System.out.println();

        System.out.println("Current Account Details:");
        currentAccount.displayAccountDetails();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDepositAccount.displayAccountDetails();
    }
}