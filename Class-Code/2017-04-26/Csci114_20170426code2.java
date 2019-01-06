/**
 * @author raul Aguilar
 **/
package csci114_20170426code2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Csci114_20170426code2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader read = new FileReader("/Users/csis/Desktop/csci114_20170426/csci114_20170426code1/stock.csv");
        BufferedReader bf = new BufferedReader(read);
        double sum = 0;
        String line = bf.readLine();
        String[] array = line.split(",");
        sum = sum + Double.parseDouble(array[1]);
        
        while(line != null) {
            array = line.split(",");
            System.out.println(line);
            sum = sum + Double.parseDouble(array[1]);
            line = bf.readLine();
        } // end while
        System.out.println(sum);
        read.close();
        bf.close();
    }
    
}
