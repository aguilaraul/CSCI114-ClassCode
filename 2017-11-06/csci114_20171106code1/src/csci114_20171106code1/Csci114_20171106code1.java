/**
 * @author raula
 */
package csci114_20171106code1;

import javax.swing.JOptionPane;

public class Csci114_20171106code1 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        System.out.println("You entered:"  + input);
        double number = Double.parseDouble(input);
        System.out.printf("You entered: %f \n", number);
    }
    
}
