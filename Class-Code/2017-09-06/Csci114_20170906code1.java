/**
 * @author  raul aguilar
 */

public class Csci114_20170906code1 {
    
    public static void main(String[] args) {
       int n = 15;
       System.out.println( fib(n) );
    }
    
    public static int fib(int n) {
        if (n <= 0) { return 0; }
        else {
            if ( n == 1) { return 1; }
            else  { return ( fib(n-1) + fib(n-2) ); }
        }
    }
}
