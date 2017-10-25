/**
 * @author raul aguilar
 */
package csci11420171025code3;

class BankAccount {
    String id;
    double balance;
    public BankAccount(String id){
        this.id = id;
        balance = 0.0;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public String toString() {
        return id + balance;
    }
    
}

class Savings extends BankAccount {
    
    public Savings(String id) {
        super(id);
    }
    public void deposit(double amount) {
        balance += (amount*2)*0.1;
    }
}

public class Csci11420171025code3 {
    
    public static void main(String[] args) {
        BankAccount toms = new BankAccount("123");
        System.out.println(toms);
        toms.deposit(20);
        toms.withdraw(20);
        System.out.println(toms);
    }
    
}
