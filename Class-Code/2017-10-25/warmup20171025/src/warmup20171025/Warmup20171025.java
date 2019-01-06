/**
 * @author raul aguilar
 */
package warmup20171025;
import static java.util.Arrays.sort;

public class Warmup20171025 {
    
    public static int sum(int[] a) {
        int[] array = a;
        int sum = 0;
        for(int i: array ) { sum += i; }
        return sum;
    }
    public static double ave(int[] a) {
        int length = a.length;
        return sum(a)/length;
    }
    public static int min(int[] a) {
        int[] array = a;
        sort(array);
        int min = array[0];
        return min;
    }
    public static int min1(int[] a) {
        int[] array = a;
        int min = array[0];
        for(int i = 0; i < array.length; i++) { if(min > a[i]) min = i; }
        return min;
    }
    public static long sumSquare(int[] a) {
        int[] array = a;
        int length = array.length;
        int sum = 0;
        for(int i = 0; i < length; i++) { sum += array[i]*array[i];}
        return sum;
    }
    
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 3, 4, 11, 12, 16, 21};
        
        System.out.printf("%-8s = %d%n", "Sum", sum(array));
        System.out.printf("%-8s = %.2f%n", "Average", ave(array));
        System.out.printf("%-8s = %d%n", "Minimum", min1(array));
        System.out.printf("%-8s = %d%n", "Sum^2", sumSquare(array));
    }
    
}
