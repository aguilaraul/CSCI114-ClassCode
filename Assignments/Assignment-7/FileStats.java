/**
 * @author raul aguilar
 * November 4, 2018
 */

import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {

        FileCompute fc = new FileCompute();

        // Importing file
        String importFile;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the file name you'd like to analyze.");
        System.out.println("Don't forget the .txt");
        importFile = in.nextLine();
        in.close();

        fc.open(importFile);

        while ( fc.hasMoreLines() ) {
            fc.FileCompute();
        }

        // Printing to console
        System.out.println("Number of lines: " + fc.getNumLines());
        System.out.println("Number of words: " + fc.getNumWords());
        System.out.println("Number of characters: " + fc.getNumChars());
        fc.printLetterFrequency();
        System.out.println("Length of Longest Line: " + fc.getLongestLine());
        System.out.println("Most used character: " + fc.getMostFreqChar() + " " + fc.getCharFreq());
        System.out.println("Longest Word: " + fc.getLongestWord());

        FileWrite.FileWrite(importFile, fc);
    }
}