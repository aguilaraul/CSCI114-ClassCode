/**
 * @author Raul Aguilar
 */
package pkg20180918_code1;

public class Main {
    
    public static void main(String[] args) {
        /*
        int myDecimal = 7923;
        String binaryString = decimalToBinary(myDecimal);
        System.out.println( myDecimal + "->" + binaryString);
        */
        
        for(int i = 0; i < 1000000; i++) {
            String binaryString;
            binaryString = decimalToBinary(i);
            System.out.println( i + "->" + binaryString);
        }

    } // end Main
    
    public static String decimalToBinary(int number) {
        String result = "";
        
        if(number == 0 ) result = "0";
        while(number > 0) {
            result = number % 2 + result;
            number = number / 2;
        }
        return result;
    } // end decimalToBinary
}
