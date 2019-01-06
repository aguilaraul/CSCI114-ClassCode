/**
 * @author raul aguilar
 * @desc Assignment 2 for CSCI114 at Palomar College
 * @date 06 January 2019
 */

import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    
    public static void menu() {
        System.out.printf("%s%n", "===========");
        System.out.printf("%s%n", "1 Add");
        System.out.printf("%s%n", "2 Subtract");
        System.out.printf("%s%n", "3 Multiply");
        System.out.printf("%s%n", "4 Divide");
        System.out.printf("%s%n", "5 Power");
        System.out.printf("%s%n", "6 Modulo");
        System.out.printf("%s%n", "===========");
    }
    
    public static double calculator(int num1, int num2, int option){
        double answer = 0.0;
        
        switch(option) {
           case 1:
               answer = num1 + num2;
               break;
           case 2:
               answer = num1 - num2;
               break;
           case 3:
               answer = num1*num2;
               break;
           case 4:
               answer = num1/num2;
               break;
           case 5:
               answer = Math.pow(num1, num2);
               break;
           case 6:
               answer = num1%num2;
               break;
           default:
               System.out.println("Please select another option");
       }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int option = 0;
        double answer = 0.0;
        boolean optionGood = false;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = scan.nextInt();
        System.out.println("Please enter the second number:");
        num2 = scan.nextInt();
        System.out.println("Please select an option");
        menu();
        option = scan.nextInt();
        do {
             if(option >= 1 && option <= 6) {
                 answer = calculator(num1, num2, option);
                 optionGood = true;
             } else {
                 System.out.println("Please choose another option");
                 option = scan.nextInt();
             }
        } while(!optionGood);
        System.out.printf("%s%n%.2f%n", "The answer is:", answer);

     }
}
