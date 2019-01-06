/**
 * @author raul aguilar
 */
package csci114_20170910code1;
import java.util.Scanner;
import static java.util.Arrays.sort;

public class Csci114_20170910code1 {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", 
            "Friday", "Saturday", "Sunday"};
        double[] temp = new double[7];
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < days.length; i++) {
            System.out.printf("Please enter the temperature for %s:%n", days[i]);
            temp[i] = in.nextDouble();
        }
        
        System.out.printf("Average temperature is: %.2f%n", average(temp));
        
        sort(days);
        
        //enchanced loop
        for(int j = 0; j < days.length; j++)
            System.out.println(days[j]);
        System.out.println("=============");
        for (String item: days)
            System.out.println(item);
        
    }
    
    static double average(double[] numbers) {
        double sum = 0;
        for(int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i];
        }
        
        return (sum / numbers.length);
    }
    

}
