/**
 * @author Raul Aguilar
 **/
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int tries = 0;
        double amount;
        byte option;
        BankAccount user000114;
        user000114 = new BankAccount("000114", "Raul", "Aguilar", "114", 200.00);
        Scanner input = new Scanner(System.in);
        
        while (tries < 3) {
            System.out.println("Please enter your account number: ");
            if(user000114.Id.equals(input.next())) {
                System.out.println("Please enter your PIN:");
                if(user000114.password.equals(input.next())) {
                    System.out.print("\nWelcome to the Palomar CSCI114 ATM");
                    break;
                } else {
                    System.out.println("Your PIN is incorrect.");
                    tries++;
                }
            } else {
                System.out.println("Your account number is incorrect.");
                tries++;
            }
        } // end Login
        if(tries == 3) {
            System.out.println("You've exceeded the number of attempts. "
             + "For your accounts protection, the session will now end.");
            System.exit(0);
        }
        do {
            user000114.printMenu();
            option = input.nextByte();
        
            switch (option) {
                case 1:
                    System.out.println("Please enter deposit amount:");
                    amount = input.nextDouble();
                    user000114.deposit(amount);
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount:");
                    amount = input.nextDouble();
                    user000114.withdraw(amount);
                    break;
                case 3:
                    user000114.printStatement();
                    break;
                case 4:
                    System.out.println("\nThank you for banking with us!");
                    System.out.println("CSCI114 Bank");
                    System.out.println("Member of FDIC, Equal House Lender");
                    break;
                default:
                    System.out.println("Perform another trasaction?");
                    break;
            }
        } while (option != 4); // end Menu

        input.close();
    } // end of main
}
