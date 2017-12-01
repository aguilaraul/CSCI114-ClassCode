/**
 * @author raul aguilar
 */

package csci114_20171129code1;

class Stack{
    String[] array;
    
    public void push(String item) {
            if ( array == null ) {
                array = new String[1];
                array[0] = item;                
            }
            else {
                String[] tempArray = new String[array.length + 1];
                tempArray[0] = item;
                for ( int i=0; i < array.length; i++)
                    tempArray[i+1] =array[i];             
                array = tempArray;
            }
            
    }  
    public String pop() {
        String item=null;
        if (array==null) return item;
        if (array.length == 1) {
            item =array[0];
            array = null;        
        }
        else{
            item =array[0];
            String[] tempArray = new String[array.length - 1];
            for ( int i=0; i < array.length-1; i++)
                    tempArray[i] =array[i+1];
            array = tempArray;           
        }  
        return item;
    } 
    public String toString(){
        String str ="";
        for (String item: array)
            str = str + "," + item;
        return str;
    }
    
}

public class Csci114_20171129code1 {
    public static void main(String[] args) {
        Stack mySack = new Stack();
        mySack.push("Adam");
        mySack.push("Bob");
        mySack.push("Cindy");
        mySack.push("Dana");
        //mySack.push("Frank");
        System.out.println(mySack);
        System.out.println(mySack.pop());
        System.out.println(mySack.pop());
        System.out.println("===========");
        System.out.println(mySack);
    }
    
}