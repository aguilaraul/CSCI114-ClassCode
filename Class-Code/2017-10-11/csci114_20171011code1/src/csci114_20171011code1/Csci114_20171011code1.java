/**
 * @author  Raul Aguilar
 * @class   CSCI 114
 */
package csci114_20171011code1;
import static java.util.Arrays.sort;

public class Csci114_20171011code1 {

    public static void main(String[] args) {
        int[] array = {2, 5, 3, 7, 9,21,8,7, 11, 13}; 
        System.out.println("original:");
        for (int element: array) { System.out.println(element);}
        sort(array);
        System.out.println("sorted:");
        for (int element: array){ System.out.println(element); }
        
        System.out.println("method1: max=" + getMax1(array)); 
        System.out.println("method2: max=" + getMax2(array));
        System.out.printf("the index of %d is %d\n", 5, search(5, array));
        System.out.printf("the index of %d is %d\n", 7, search(7, array));
        System.out.printf("the index of %d is %d\n", 107, search(107, array));
         
    }
    
    static int getMax1(int[] numbers) {
        int greatest = numbers[0];
        for (int i =1 ; i < numbers.length; i++ ) {
            if ( greatest < numbers[i]) { greatest = numbers[i]; }
        }
        return greatest;
    }// end getMax1
    
    static int getMax2(int[] numbers) {
        sort(numbers);
        return numbers[numbers.length-1];
    }// end getMax2
    
    static int search(int number, int[] numbers) {
        int counter = 0;
        for ( int element: numbers ) {
            if (element == number) return counter; 
            counter++;
        }
        return -1;
    }
}
