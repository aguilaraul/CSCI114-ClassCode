/**
 *  @author Raul Aguilar
 */
package csci114_20171016code2;

public class Csci114_20171016code2 {

    public static void main(String[] args) {
        int COUNTRIES = 8;
        int MEDALS = 3;
        int[][] counts = new int[COUNTRIES][MEDALS];
        
        counts[0][0] = 1;
        counts[5][2] = 7;
        counts[3][1] = 4;
        
        for ( int i=0; i < counts.length; i++) //count medals
        {
            int [] array = new int[MEDALS];
            array = counts[i];
            for (int j =0; j < array.length; j++) //counts countries
                //System.out.printf("%d ", counts[i][j]);
                System.out.printf("%d ", array[j]);
                
            System.out.println();
        }
    }
    
}