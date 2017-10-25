/**
 * @author raul aguilar
 */
package csci11420171025code2;

public class Csci11420171025code2 {
    
    public static void towerMove(int n, String start, String helper, String end)
    {
        if(n == 1) { System.out.println(start + " -> " + end); }
        else {
            towerMove(n-1, start, end, helper);
            System.out.println(start + " -> " + end);
            towerMove(n-1, helper, start, end);
        }
    }
    
    public static void main(String[] args) {
        for(int n = 1; n < 5; n++) {
            towerMove(n, "A", "B", "C");
            System.out.println("--------------");
        }
    }
    
}
