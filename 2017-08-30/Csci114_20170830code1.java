/**
 * @author  Raul Aguilar
 */

public class Csci114_20170830code1 {
    
    /*
    role: calculates sum of numbers starting with "begin" and ending with end 
    input paramters: integer variable begin, integer variable end 
    output: an integer value
    */
    public static int sum1(int begin, int end) {
       int s = 0;
       for (int i = 1; i <= 100; i = i+1)
       {
           s = s + i;
       }
       return s;
    }  
    
    /*
    role: calculates sum of numbers starting with "begin" and ending with end 
    input paramters: integer variable begin, integer variable end 
    output: an integer value
    */
    public static int sum2(int begin, int end) {
       int s = (begin + end) * 100 /2; 
       return s;
    }
       
    /*
    role: display a string provided as the input parameter
    input paramter: a String variable
    output: None
    */
    public static void display(String message) {
        System.out.println(message);
    }	
	
    /*
    main method: program starts here. other methods can be called from here.
    */	
    public static void main(String[] args) {
       
       //first method 
       int mySum = sum1( 1, 100);
       System.out.println("MySum = " + mySum);
       
       //second method 
       mySum = sum2( 1, 100);
       System.out.println("MySum = " + mySum);
       
       //third method 
       display("Hello World");
       String myMessage = "Yolanda";
       display(myMessage);
    }
    
}
