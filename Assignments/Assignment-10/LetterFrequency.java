/**
 * @author raula
 */
package letterfrequency;
import java.util.Scanner;
public class LetterFrequency {

    public static void main(String[] args) {
        String str;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter a string to count: ");
            str = in.nextLine();
        }
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int[] chars= new int[256];
        for ( int i =0; i < charArray.length; i++ )
            if (charArray[i] > 96 && charArray[i] < 123)   
                chars[(int) charArray[i]]++;
        //compares chars;
        int max = 0;
        char cMax = 'a';
        for(int i = 0; i < 256; i++) {
            if(chars[i] > max) {
                cMax = (char) i;
                max = chars[i];
            }
        }
        System.out.printf("%s %c %d%n", "Most used character:", cMax, max);
    }
    
}
