/**
 * @author Raul Aguilar
 */
package csci114_20171113code3;
import java.io.*;
import java.util.ArrayList;

public class Csci114_20171113code3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\csis\\Desktop\\kilmore.csv";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int counter = 1;
        double ageSum = 0;
        ArrayList<String> names = new ArrayList();
        while ( (line = br.readLine()) != null ) {
            System.out.printf("%2d %s %s%n", counter, "|", line );
            String[] fields = line.split(",");
            System.out.println("Name:" + fields[0]);
            ageSum += Integer.parseInt(fields[1]);
            names.add(fields[0]);
            counter++;
        }
        counter -= 1;
        System.out.println("Number of lines: " + counter);
        System.out.println("Average age: " + ageSum/counter);
        for(String name: names) System.out.println(name);
    }
    
}