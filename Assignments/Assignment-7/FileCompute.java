/**
 * @author raul aguilar
 * November 4, 2018
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileCompute {
    private Scanner file;
    private String line;
    private String[] words;
    private int numLines;
    private long numChars;
    private int numWords;
    private int longestLine;
    private int longestWord;
    private int[] chars = new int[256];
    private int frequency;
    private int charFreq;

    /**
     * Opens the input file and gets ready to parse it
     * @param importFile
     */
    public void open(String importFile) {
        try {
            file = new Scanner(new FileReader(importFile));
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found. Ending program.");
            System.exit(0);
        }
    }

    /**
     * Returns boolean if more commands left, closes stream if not
     * @return True if more commands, else closes stream
     */
    public boolean hasMoreLines() {
        if( file.hasNextLine() ) {
            return true;
        } else {
            file.close();
            return false;
        }
    }

    /**
     * Driver to analyze file
     */
    public void FileCompute() {
        numLines++;
        line = file.nextLine();
        splitWords();
        countChars();
        countLongestLine();
        countWords();
        longestWord();
        letterFrequency();
        mostFrequentChar();
    }

    /**
     * Fills array with words from each line
     */
    private void splitWords() {
        words = line.split(" ");
    }

    /**
     * Count the chars in each line to
     * find total number of chars in file
     */
    private void countChars() {
        numChars += line.length();
    }

    /**
     * Finds length of the longest line of the file
     */
    private void countLongestLine() {
        if (line.length() > longestLine) {
            longestLine = line.length();
        }
    }

    /**
     * Counts the number of words in each line
     * to find the total number of words
     */
    private void countWords() {
        numWords += words.length;
    }

    /**
     * Finds the longest word from filled in array
     */
    private void longestWord() {
        for (String word : words) {
            if (words.length > longestWord) {
                longestWord = word.length();
            }
        }
    }

    /**
     * Counts how many times each lowercase letter appears in file
     */
    private void letterFrequency() {
        String str = line.toLowerCase();
        char[] charArray = str.toCharArray();
        for (char aCharArray : charArray) {
            if (aCharArray > 96 && aCharArray < 123) {
                chars[(int) aCharArray]++;
            }
        }
    }

    /**
     * Finds the most frequent character in the file
     */
    public void mostFrequentChar() {
        for(int i = 0; i < 256; i++) {
            if(chars[i] > charFreq) {
                frequency = i;
                charFreq = chars[i];
            }
        }
    }

    /**
     * Getter for the number of lines in the file
     * @return Int number of lines
     */
    public int getNumLines() {
        return numLines;
    }

    /**
     * Getter for the number of words in the file
     * @return Int number of words
     */
    public int getNumWords() {
        return numWords;
    }

    /**
     * Getter for number of characters in the file
     * @return
     */
    public long getNumChars() {
        return numChars;
    }

    public void printLetterFrequency() {
        //print letter frequency by line
        for(int i = 0; i < 256; i++) {
            if(chars[i] > 0) {
                System.out.printf("%c %d%n", (char) i, chars[i]);
            }
        }
    }

    public int[] getChars() {
        return chars;
    }

    public int getLongestLine() {
        return longestLine;
    }

    public int getLongestWord() {
        return longestWord;
    }

    public String getLine() {
        return line;
    }

    public char getMostFreqChar() {
        return (char) frequency;
    }

    public int getCharFreq() {
        return chars[frequency];
    }

}