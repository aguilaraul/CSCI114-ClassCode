/**
 * @author  Raul Aguilar
 */
package csci114_20171004code1;

public class Csci114_20171004code1 {

    public static void main(String[] args) {
        String str = "We offer many degree and certificate programs, as well as course work and preparation for transfer to a four-year program of study. Please take a few moments to look through our programs, course listings, and course descriptions. We hope youâ€™ll find something that will stimulate your interest."; 
        String subStr = str.substring(10, 20);
        System.out.printf("%s\n", subStr);
        
        for (int i=0; i < subStr.length(); i++)
            System.out.printf("%c\n", subStr.charAt(i));
        
        String newStr = "I love ".concat(subStr);
        System.out.printf("%s\n", newStr);
        
        String str1 = "raul";
        String str2 = "aguilar";
        String str3 = "palomar";
        int result12 = str1.compareTo(str2);
        int result13 = str1.compareTo(str3);
        //int result33 = str3.compareToIgnoreCase("PALOMAR");
        int result33 = str3.compareTo("PALOMAR");
        System.out.printf("result12 = %d%n", result12);
        System.out.printf("result13 = %d%n", result13);
        System.out.printf("result33 = %d%n", result33);
    }
    
}
