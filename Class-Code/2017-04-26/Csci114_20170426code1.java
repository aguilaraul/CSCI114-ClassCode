/**
 * @author raul aguilar
 **/
package csci114_20170426code1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Csci114_20170426code1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                , "Saturday", "Sunday" };
        int[] temp = new int[7];
        
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < days.length; i++) {
            System.out.printf("Please enter the temperature for %s%n", days[i]);
            temp[i] = scan.nextInt();
        }
        
        PrintWriter weather = new PrintWriter("weather.csv");
        for(int i = 0; i < temp.length; i++) {
            weather.printf("The temperature for %s is %d%n", days[i], temp[i]);
        }
        weather.close();
    }
}