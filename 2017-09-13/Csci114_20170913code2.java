/**
 * @author  Raul Aguilar
 */

import java.util.Scanner;

public class Csci114_20170913code2 {

     public static void main(String[] args) {
     
         String greeting = "Hello Everybody!";
         int length = greeting.length();
         System.out.println(greeting);
         System.out.println(length);
        
	 // prints out the 8th char
         char p8 = greeting.charAt(8);
         System.out.println(p8);
	 
	 //prints out each char on its own line
         for (int i =0; i<length; i++) {
            System.out.println(greeting.charAt(i)); 
         }

	 // prints starting at index 6
         String str1 = greeting.substring(6);
         System.out.println(str1); 
         
	 // prints from range
         String str2 = greeting.substring(0, 5);
         System.out.println(str2); 
         
         System.out.println("Please enter your name:"); 
         Scanner input = new Scanner(System.in); 
         String name = input.nextLine();
         
         System.out.println("Hello " + name); 
         long number = 000000114;
         System.out.println(number);
         
         if (name.equals("Raul")) {
             System.out.println("Hello Aguilar");
         }
    }
}
