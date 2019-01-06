/**
 * @author  Raul Aguilar
 */

public class Csci114_20170913code3 {

    public static void main(String[] args) {
	    String str = "Hello Everybody!!!";
	    int counter = 0;
	    while (counter < str.length()) {
		    System.out.println(str.charAt(counter));
		    if (str.charAt(counter)=='E'){
			    break;
		    }
		    counter = counter + 1;
	    }
    }    
}
