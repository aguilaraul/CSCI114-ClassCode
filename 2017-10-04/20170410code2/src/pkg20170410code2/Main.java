/**
 * @author raul aguilar
 */
package pkg20170410code2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string:");
        String str1 = input.nextLine();
        
        String nStr = cStr2nStr(str1);
        String cStr = nStr2cStr(nStr);
        
        System.out.println(nStr);
        System.out.println(cStr);
    }

    private static String cStr2nStr(String str) {
        String str1 = str.toLowerCase();
        String result ="";
        
        for(int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i)-'a'+1;
            if(index < 10) result = result + "0" + index + " ";
            else result = result + index + " ";
        }
        
        return result;
    }
    
    private static String nStr2cStr(String str) {
        String result ="";
        
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i)-'a';
            if(index < 10) result = result + "0" + index + " ";
            else result = result + index + " ";
        }
        
        return result;
    }
}
