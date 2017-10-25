/**
 * @author  Raul Aguilar
 */
package csci114_20170920code1;

class BankAccount{
    double balance;
    String name;
    String PIN;
    String owner;
    
    //constructors
    public BankAccount() {
        balance = 0.0;
    }
    public BankAccount(String n) {
        name = n;
        balance = 0.0;
    }
    public BankAccount(String n, String owner) {
        name = n;
        this.owner = owner;
        balance = 0.0;
    }
    public BankAccount(String n, String o, double initial) {
        name = n;
        owner = o;
        balance = initial;
    }
    // Getters & Setters
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPIN() {
        return PIN;
    }
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    //functions
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void print() {
        System.out.printf("%s %s %.2f\n", name, owner, balance);
    }
    public void print(boolean fancy) {
        if (fancy){
            System.out.println("---------------------------------");
            print();
            System.out.println("---------------------------------");
        }
        else  print();
    }
    
    @Override
    public String toString() {
        return name + "=>" + owner + " => " + balance;
    }
}// end BankAccount

public class Csci114_20170920code1 {
    
    public static void main(String[] args) {
        BankAccount ac1= new BankAccount("ac1");
        ac1.setOwner("Bob Marley");
        ac1.deposit(200.00);
        ac1.deposit(5.00);
        BankAccount ac2= new BankAccount("ac2","Tom Frank");
        ac2.deposit(1200.00);
        ac2.deposit(15.00);
        BankAccount ac3= new BankAccount("ac3", "Bob Michael", 20000.00);
        ac3.deposit(250.00);
        ac3.deposit(150.00);
        ac1.withdraw(70.00);
        ac2.withdraw(170.00);
        ac3.withdraw(78.00);
        ac1.print();
        ac2.print(true);
        ac3.print();
        
        System.out.println(ac3.getOwner());
        
        System.out.println("--------------------------");
        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println(ac3);
        
    }//end Main
}