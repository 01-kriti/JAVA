// abstract class Employee{
//     String name;
//     int employeeId;
//    Employee(String name,int employeeId){
//        this.name=name;
//        this.employeeId=employeeId;
//    }
//    abstract double calculateSalary();
//    void showDetails(){
//        System.out.println("Employee Name: "+name);
//        System.out.println("Employee Id: "+employeeId);
//    }
// } 


// class FullTimeEmployee extends Employee{
//     double salary;
//     FullTimeEmployee(String name,int employeeId,double salary){
//         super(name,employeeId);
//         this.salary=salary;
//     }
//     double calculateSalary(){
//         return salary;
//     }
// }

// class ContractEmployee extends Employee{
//     int hourWorked;
//     double hourlyRate;
//     ContractEmployee(String name,int employeeId,int hourWorked,double hourlyRate){
//         super(name,employeeId);
//         this.hourWorked=hourWorked;
//         this.hourlyRate=hourlyRate;
//     }
//     double calculateSalary(){
//         return hourWorked*hourlyRate;
//     }
// }
// public class practicec{
//    public static void main(String[] args) {
//     Employee e1=new FullTimeEmployee("John",101,50000);
//     Employee e2=new ContractEmployee("Smith",102,40,100);
//     e1.showDetails();
//     System.out.println("Salary: "+e1.calculateSalary());
//     e2.showDetails();
//     System.out.println("Salary: "+e2.calculateSalary());


//    }
// }




abstract class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}


public class practicec {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", "Alice", 1000.0, 5.0);
        CurrentAccount current = new CurrentAccount("CA67890", "Bob", 2000.0);

        savings.deposit(500);
        current.deposit(1000);

        savings.calculateInterest();
        current.calculateInterest();

        savings.displayAccountInfo();
        current.displayAccountInfo();
    }
}