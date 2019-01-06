/**
 * @author Raul Aguilar
 */
package csci114_20170410code4;

public class CSCI114_20170410code4 {
    
    public static void main(String[] args) {
        int[] array = {12, 34, 6, 67, 10, 45, 102};
        String[] sArray = {"Palomar", "Jr.", "People"};
        
        
        System.out.println(array[3]);
        array[4] = array[3] + 123;
        System.out.println(array[4]);
        for(int i = 0; i < sArray.length; i++)
            System.out.println(sArray[i]);
        
        String str = "Every villian is lemons";
        String[] words = str.split(" ");
        for(int j = 0; j < words.length; j++)
            System.out.printf("%d = %s%n", j, words[j]);
    }
    
}
