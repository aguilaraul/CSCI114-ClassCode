/**
 * @author  raul aguilar
 * @desc    Hurricane categorizer
 */
package csci114_20170828code2;

import static java.lang.System.exit;
import java.util.Scanner;

public class Csci114_20170828code2 {

    public static void main(String[] args) {
        // step 1- print title
        System.out.println("Hurricane Categorizer ");
        System.out.println("---------------------");
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in); 
        String name = input.nextLine();
        System.out.println("-----");
        System.out.println("You entered:");
        System.out.println(name);
        System.out.println("Please enter your speed:");
        Scanner input1 = new Scanner(System.in); 
        int speed = input1.nextInt();
        System.out.println("-----");
        System.out.println("You entered:");
        System.out.println(speed);
        
        if ( speed >= 157) {
            System.out.println( name + ", you are catigory five hurricane!");
            exit(0);
        }
        if ( speed >= 130) {
            System.out.println( name + ", you are catigory four hurricane!");
            exit(0);
        }
        
        if ( speed >= 111) {
            System.out.println( name + ", you are catigory four hurricane!");
            exit(0);
        }
        
    }
}