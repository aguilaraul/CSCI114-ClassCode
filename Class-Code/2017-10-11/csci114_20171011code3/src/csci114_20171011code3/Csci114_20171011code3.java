/**
 * @author  Raul Aguilar
 * @class   CSCI 114 Palomar College
 */

package csci114_20171011code3;

public class Csci114_20171011code3 {

    public static void main(String[] args) {
        String str ="We offer many degree and certificate programs, as well as course work and preparation for transfer to a four-year program of study. Please take a few moments to look through our programs, course listings, and course descriptions. We hope youâ€™ll find something that will stimulate your interest. " +
        "If we can be of any assistance or guidance in planning your course of study or helping you choose a class, please feel free to contact us. Once again, welcome to Palomar College and we hope your course of study in CSIT will be a rewarding one.";
        
        String[] array = str.split(" ");
        for (String word: array)
            System.out.println(word);
        System.out.println("---------------------------");
        System.out.println("number of words is " + array.length);
        System.out.println("number of chars is " + str.length());
        
        char[] charArray = str.toCharArray();
        System.out.println(charArray.length);
        int[] chars= new int[256];
        for ( int i =0; i < charArray.length; i++ )
            if (( charArray[i] > 64 && charArray[i] < 91 ) ||
                 ( charArray[i] > 96 && charArray[i] < 123 ) )   
                chars[(int) charArray[i]]++;
        //sort(chars);
        for (int i =0; i < 256; i++) {
            if (( i > 64 && i < 91 ) ||
                 ( i > 96 && i < 123 ) ) 
            System.out.printf("[%c]=%d\n", i, chars[i]);
        }
    }// end Main
}
