/**
 * @author raul aguilar
 * November 4, 2018
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
        public static void FileWrite(String importFile, FileCompute fc) {
                String exportFile = "results_" + importFile.substring(0,importFile.indexOf('.')) + ".csv";
                BufferedWriter bw;
                try {
                        bw = new BufferedWriter(new FileWriter(exportFile));
                        bw.write("File Name," + exportFile);
                        bw.newLine();
                        bw.write("Total Lines," + fc.getNumLines());
                        bw.newLine();
                        bw.write("Total Words," + fc.getNumWords());
                        bw.newLine();
                        bw.write("Total Characters," + fc.getNumChars());
                        bw.newLine();
                        for(int i = 0; i < 256; i++) {
                                if(fc.getChars()[i] > 0) {
                                        bw.write( (char) i + "," + fc.getChars()[i]);
                                        bw.newLine();
                                }
                        }
                        bw.newLine();
                        bw.write("Length of Longest Line," + fc.getLongestLine());
                        bw.newLine();
                        bw.write("Most Used Character," + fc.getMostFreqChar() + "," + fc.getCharFreq());
                        bw.newLine();
                        bw.write("Longest Word," + fc.getLongestWord());
                        bw.newLine();
                        bw.close();
                } catch (IOException e) {
                        System.out.println("File could not be created. Make sure you have proper permissions.");
                        System.out.println(e);
                }

        }
}
