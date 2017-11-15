/**
 * @author Raul Aguilar
 */
package csci114_20171113code2;
import java.io.*;

public class Csci114_20171113code2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //String fileName = "C:\\Users\\csis\\Desktop\\README.txt";
        String fileName;
        fileName = "C:\\Users\\csis\\Desktop\\2017-11-13\\csci114_20171113code1\\src\\csci114_20171113code1\\README.txt";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int counter = 1;
        while ( (line = br.readLine()) != null ) {
            System.out.printf("%2d %s %s%n", counter, "|", line );
            counter++;
        }
    }

}