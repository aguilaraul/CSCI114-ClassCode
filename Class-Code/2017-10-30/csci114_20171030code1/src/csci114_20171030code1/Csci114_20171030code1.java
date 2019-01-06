/**
 * @author raula
 */
package csci114_20171030code1;

class BankAccount{
    String ID;
    double balance;
    
    public BankAccount(String id)
    {
        ID = id;
        balance = 0.0;
    }
    public void deposit(double amount)
    {
        balance =balance + amount;
    }
    public void withdraw(double amount)
    {
        if (amount < balance )
            balance =balance - amount;
    }
    @Override
    public String toString(){
        return "ID:" + ID + "=>" + balance;
    }    
}

class Savings extends BankAccount{
    public Savings(String id)
    {
        super(id);
        balance = 3.0;
    }
    public void deposit(double amount)
    {
        balance = balance + amount * 1.1; 
    }
}

class StudentSavings extends Savings {
    String studentID;
    public StudentSavings(String id, String sid)
    {
        super(id);
        studentID = sid;
    }
    public void deposit(double amount)
    {
        if (amount > 100.00)
            balance = balance + amount * 1.2;
        else 
            balance = balance + amount * 1.1;
    }
    
    public void withdraw(double amount)
    {
        if ((balance - amount) > 50.0 )
            balance = balance - amount;
        else
            System.out.println("declined!!!!");
    }
    
}

public class Csci114_20171030code1 {

    public static void main(String[] args) {
       BankAccount Bobs = new BankAccount("bob"); 
       Bobs.deposit(20.00);
       Bobs.withdraw(5.00);
       System.out.println(Bobs);
       
       Savings Brenda = new Savings("brenda");
       Brenda.deposit(20.00);
       Brenda.withdraw(10);
       System.out.println(Brenda);
       
       StudentSavings Tom = new StudentSavings("Tom", "12345");
       Tom.deposit(120.00);
       Tom.withdraw(10);
       System.out.println(Tom);
       Tom.withdraw(100);
    }
    
}