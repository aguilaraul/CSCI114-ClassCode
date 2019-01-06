/**
 * @author Raul Aguilar
 */
package csci114_20171113code5;
import java.io.*;

public class Csci114_20171113code5 {
    
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\csis\\Desktop\\raul.txt";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Aguilar Raul");
        bw.newLine();
        bw.close();
    }
    
}
