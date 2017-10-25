/**
 * @author  Raul Aguilar
 */
package csci114_20170913code4;

class Account{
        int number;
        double balance;
        public void deposit(double amount) {
            balance = balance + amount;
        }
        public void withdraw(double amount) {
            balance = balance - amount;
        }
    }

public class Csci114_20170913code4 {

    public static void main(String[] args) {
        Account bob = new Account(); 
        Account mary = new Account(); 
        bob.deposit(100);
        mary.deposit(300);
        mary.withdraw(5);
    }
    
}