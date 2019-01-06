/**
 * @author raul aguilar
 */
package pkg20170918_code4;

public class Main {
    
    public static void main(String[] args) {
        String string1 = "Raul Aguilar";
        int i = 0;
        
        while(i < string1.length() ) {
            char c = string1.charAt(i);
            System.out.printf("%d - %c%n", i, c);
            i += 1;
        }
    }
    
}
