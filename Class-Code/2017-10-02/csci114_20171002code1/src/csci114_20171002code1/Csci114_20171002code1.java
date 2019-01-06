/**
 * @author  Raul Aguilar
 */
package csci114_20171002code1;

import java.util.Scanner;

public class Csci114_20171002code1 {

    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner input =  new Scanner(System.in);
        String str = input.nextLine();
        for ( int i = 0; i < str.length(); i= i + 1)
            System.out.printf("%d => %c\n", i+1, str.charAt(i));  
    }
    
}
