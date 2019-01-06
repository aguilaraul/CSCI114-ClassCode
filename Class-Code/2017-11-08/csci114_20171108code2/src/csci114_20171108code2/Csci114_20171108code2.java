/**
 * @author raul aguilar
 */
package csci114_20171108code2;

public class Csci114_20171108code2 {

    public static long fibonacci(int n)
    {  
        if (n == 0 ) return 0;
        if (n == 1 ) return 1;
        else return fibonacci(n-1) + fibonacci(n-2); 
    }
    
    
    //wrong implementation
    public static long fibonacci2(int n)
    {   long[] bucket = new long[n+1];
        for (int i=0; i <bucket.length; i++)
            bucket[i] = -1;
        if (n <= 0 ) return 0;
        if (n == 1 ) return 1;
        else 
        {   
            if ( bucket[n]>0 ) {    
                //System.out.printf("hit %d\n", n);
                return bucket[n]; }
            else {
                //System.out.printf("no hit %d\n", n);
                bucket[n] = fibonacci2(n-1) + fibonacci2(n-2);
                //System.out.printf("bucket[%d]=%d\n", n, bucket[n]);
                return bucket[n];
            }
        } 
    }
    
    //correct implementation
    public static long fibonacci3(int number)
    {
        long[] bucket = new long[number+1];
        return fibonacci3(number, bucket);
    }
    public static long fibonacci3(int number, long[] bucket)
    {
        if ( number == 0 || number ==1) return number;
        else {
            if(bucket[number]>0) {
                //System.out.printf("hit: number[%d] = %d\n", number, bucket[number] );
                return bucket[number];
            }
            else {
                bucket[number] = fibonacci3(number-1, bucket) + fibonacci3(number-2, bucket);
                return bucket[number];
            }
        }
    }
    
    public static void main(String[] args) {
        int number =20;
        System.out.println("start1");
        System.out.printf("fibonacci(%d)=%d\n", number, fibonacci(number));
        System.out.println("end1");
        
        //calling wrong method 
        System.out.println("start2");
        System.out.printf("fibonacci2(%d)=%d\n", number, fibonacci2(number));
        System.out.println("end2");  
        
        //calling correct method
        System.out.println("start3");
        System.out.printf("fibonacci3(%d)=%d\n", number, fibonacci3(number));
        System.out.println("end3");  
        
    }
    
}