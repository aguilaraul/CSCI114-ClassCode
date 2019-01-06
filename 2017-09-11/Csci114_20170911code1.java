/**
 * @author  Raul Aguilar
 */

public class Csci114_20170911code1 {
    public static long fib(int n) {
       if (n == 0) { return 0;}
       else {
           if ( n== 1) { return 1; }
           else { return fib(n-1) + fib( n-2 ); }
       }
    }
            
    public static void display(long xyz) {
        System.out.println(xyz);
    }
    public static void displayTwo(int n, long xyz) {
        System.out.println(n + " => " + xyz);
    }
    public static void greeting() {
        System.out.println("Hello");
    }
    public static int createTen() {
        return 10;
    }
    
    public static void main(String[] args) {
         int x = 10;
         int z = createTen() ;
         long y = fib(z);
         displayTwo(z, y);
         greeting();
    }

}
