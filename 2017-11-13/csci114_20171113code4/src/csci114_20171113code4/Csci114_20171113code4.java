/**
 * @author Raul Aguilar
 */
package csci114_20171113code4;
import java.io.*;
import java.util.ArrayList;

public class Csci114_20171113code4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\csis\\Desktop\\1342-0.txt";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int counter = 1;
        long numChars = 0;

        while ( (line = br.readLine()) != null ) {
            System.out.printf("%2d %s %s%n", counter, "|", line );
            counter++;
            numChars += line.length();
        }
        counter -= 1;
        System.out.println("Number of lines: " + counter);
        System.out.println("Number of characters: " + numChars);
    }
    
}