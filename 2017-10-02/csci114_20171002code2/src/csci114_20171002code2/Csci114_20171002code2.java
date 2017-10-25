/**
 * @author  Raul Aguilar
 */
package csci114_20171002code2;

import java.util.Scanner;

public class Csci114_20171002code2 {

    public static boolean isPalendrome( String s) {
        int i =0;
        int j = s.length()-1;
        
        while ( i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i = i + 1;
                j = j - 1;
            }
            else return false;
        }
        return true;
    }
    
    public static boolean isPalendrome2( String s) {
        String reverse = "";
        for ( int i=0; i < s.length(); i = i +1 )
            reverse = reverse + s.charAt(s.length()-1-i);
        return s.equals(reverse); 
    }
    
    public static void main(String[] args) {
       System.out.println("Please enter a string:");
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       System.out.println("Your entered: " + str);
      
       if ( isPalendrome2(str) ) 
           System.out.println( str + ": is a palendrome");
       else 
           System.out.println( str + ": is not a palendrome");
    }   
}