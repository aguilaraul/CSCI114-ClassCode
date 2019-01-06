/**
 * @author raul aguilar
 */
package csci114_20171108code1;


public class Csci114_20171108code1 {
    
    public static long factorial1(int n)
    {   long result = 1;
    if (n<=1) return result;
        for ( int i = n; i > 1; i-- )
            result = result * i;
        return result;
    }
    
    public static long factorial2(int n){
        if (n == 0) return 1;
        else return n * factorial2(n-1);
    }
    
    public static long factorial3( int n, long tail) {
        if (n == 0 ) return tail;
        else {
            tail = n * tail;
            return factorial3( n -1, tail);
        }
    }
    
    
    public static void main(String[] args) {
        int number = 8;
        System.out.printf("factorial1(%d)=%d\n", number,factorial1(number) );
        System.out.printf("factorial2(%d)=%d\n", number,factorial2(number) );
        System.out.printf("factorial3(%d, 1)=%d\n", number,factorial3(number, 1) );
    }
    
}
