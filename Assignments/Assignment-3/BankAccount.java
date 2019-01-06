public class BankAccount {
    String Id;
    String fName;
    String lName;
    String password;
    double balance;

    public BankAccount() {
        Id = null;
        fName = null;
        lName = null;
        password = null;
        balance = 0;
    }
    public BankAccount(String id, String pass) {
        Id = id;
        password = pass;
    }
    public BankAccount(String id, String firstName, String lastName,
                       String pass) {
        Id = id;
        fName = firstName;
        lName = lastName;
        password = pass;
    }
    public BankAccount(String id, String firstName, String lastName,
                       String pass, double amount) {
        Id = id;
        fName = firstName;
        lName = lastName;
        password = pass;
        balance = amount;
    }
    public BankAccount(String id, String pass, double amount) {
        Id = id;
        password = pass;
        balance = amount;
    }
    public void printMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("Please enter an option:");
        System.out.println("1. Deposit Cash");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Print Statement");
        System.out.println("4. Exit");
        System.out.println("=========================");
    }
    public void deposit(double amount) {
        System.out.printf("\n$%,.2f has been deposited.", amount);
        balance = balance + amount;
        System.out.printf("\nYour new balance is $%,.2f", balance);
    }
    public void withdraw (double amount) {
        if (balance < amount) {
            System.out.println("Account "+ Id + ", your account does not "
                    + "have the enough funds for the requested action.");
            System.out.println("Please enter a new amount.");
        } else {
            System.out.printf("\n$%,.2f has been withdrawn.", amount);
            balance = balance - amount;
            System.out.printf("\nYour new balance is $%,.2f", balance);
        }
    }
    public void printStatement() {
        System.out.println();
        System.out.printf("%16s%n", "Statement");
        System.out.println("=========================");
        System.out.printf("%s, %s", lName, fName);
        System.out.printf("\nAccount Number: %s", Id);
        System.out.printf("\nCurrent Balance: %,.2f%n", balance);
        System.out.println("=========================");
    }
    public String toString() {
        String str = "Id: " + Id + "\nBalance: " + balance;
        return str;
    }
}
