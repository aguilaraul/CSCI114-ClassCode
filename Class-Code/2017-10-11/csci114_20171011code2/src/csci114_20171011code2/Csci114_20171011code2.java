/**
 * @author  Raul Aguilar
 * @class   CSCI 114 Palomar College
 */
package csci114_20171011code2;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class Csci114_20171011code2 {

    /*
        searches array to find the number. 
        If found returns its index.
        otherwise, returns -1;
    */
    static int search(int[] array, int number)
    {
        int index;
        if (array.length ==0) return -1;
        if (array.length == 1 ) {
            if ( array[0] == number ) return 0;
            else return -1;
        }
        else {
            int center = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, center);
            int[] right = Arrays.copyOfRange(array, center, array.length);
            
            if (array[center] > number) {
                System.out.println("left");
                printArray(left);
                index = search(left, number);                
            }
            else {
                System.out.println("right");
                printArray(right);
                index = search(right, number);  
                if ( index > -1) index = index + center;
            }
            return index;
        }        
    }
    
    static void printArray(int[] array) {
        for (int item: array) System.out.println(item);
    }
  
    /*
        search a number in a sorted array
    */
    public static void main(String[] args) {
        int[] array = {4, 1, 10, 15, 21, 4, 6};
        sort(array);
        
        int number = 21;
        printArray(array);
        System.out.println("------search----");
        int index = search(array, number);
        System.out.println("answer=" + index);
        
    }
}