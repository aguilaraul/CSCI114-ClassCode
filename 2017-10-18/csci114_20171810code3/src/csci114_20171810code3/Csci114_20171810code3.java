/**
 * @author raul aguilar
 */
package csci114_20171810code3;

import java.util.ArrayList;

public class Csci114_20171810code3 {
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(5);
        al.add(6);
        al.add(9);
        System.out.println(al.get(1));
        
        ArrayList<String> friends = new ArrayList();
        friends.add("Alba");
        friends.add("Baliey");
        friends.add("Carbon");
        friends.add("Diana");
        for (String friend : friends) {
            System.out.println(friend);
        }
            
        ArrayList grades = new ArrayList();
        grades.add(56.45);
        grades.add(90.34);
        grades.add(75.43);
        for(int i = 0; i < grades.size(); i++){
            System.out.println(grades.get(i));
        }
    }
    
}
