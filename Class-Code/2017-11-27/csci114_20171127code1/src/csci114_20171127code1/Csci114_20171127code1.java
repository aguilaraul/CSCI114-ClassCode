/**
 * @author raul aguilar
 */
package csci114_20171127code1;
import java.util.ArrayList;

class myQueue{
    ArrayList<String>  data; 
    int size;
    public myQueue()
    {
        data = new ArrayList<String>() ;
        size = 0;
    }
    public void push(String item){
        data.add(item);
        size++;
    }
    public String pop(){
        if (size<1) return null;
        else {
            String item = data.get(0);
            data.remove(0);
            size--;
            return item;
        }
    }
    @Override
    public String toString(){
        String str ="";
        for (String item: data)
            str = str + "," + item;
        return str;
    }
    
    
}
        
public class Csci114_20171127code1 {
    public static void main(String[] args) {
       myQueue q = new myQueue();
       q.push("Adam");
       q.push("Brenda");
       q.push("Clara");
       q.push("Davis");
       q.push("El");
       q.push("Frank");
       System.out.println(q);
       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q);        
    }
    
}
