/**
 * @author  Raul Aguilar
 * @class   CSCI 114
 */
package csci114_20171016code1;
import java.util.Scanner;

public class Csci114_20171016code1 {

    static String letterGrade(int score) {
       String grade; 
       if (score > 89 ) grade = "A";
       else {
             if (score > 79 ) grade = "B";
             else 
             {
                 if (score > 69 ) grade = "C";
                 else 
                 {
                    if (score > 59 ) grade = "D";
                    else grade = "F";
                 }
             }
        }  
       return grade;
    }
    
    static String letterGrade2(int score) {
       String grade; 
       if (score > 89 ) grade = "A";
       else if (score > 79 ) grade = "B"; 
       else if (score > 69 ) grade = "C"; 
       else if (score > 59 ) grade = "D"; 
       else grade = "F";
       return grade;
    }
    
    static String letterGrade3(int score) {
       String grade; 
       int value = score/10;
       if ( score > 10 ) score =10;
       switch (value) {
           case 9: grade = "A"; break;
           case 8: grade = "B"; break;
           case 7: grade = "C"; break;
           case 6: grade = "D"; break;
           default: grade = "F"; break;                    
       }
       
       return grade;
    }
    
    public static void main(String[] args) {
        String grade;
        System.out.println("Please enter your grade:");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println("You entered " + score); 
        System.out.println("Your grade is: " + letterGrade3(score));
    }
    
}