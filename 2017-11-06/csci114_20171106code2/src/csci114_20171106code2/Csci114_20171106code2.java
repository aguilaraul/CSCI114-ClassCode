/**
 * @author raul aguilar
 */
package csci114_20171106code2;

import javax.swing.JOptionPane;

public class Csci114_20171106code2 {

    public static void main(String[] args) {
        //first ask the weight (pounds)
        //ask the height (iches)
        //calculate and print out the BMI. 
        String weight = JOptionPane.showInputDialog("Please enter your weight in pounds:");
        String height = JOptionPane.showInputDialog("Please enter your height in inches:");
        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);
        double bmi = 703 * w / (h * h );
        System.out.printf("w= %f, h=%f , BMI =%f\n", w, h, bmi);
        String message;
        if ( bmi <= 18.5 ) message = "Please eat more!!!!";
        else if (bmi >18.5 && bmi <= 24.9) message = "Keep doing what you are doing!!!!";
        else if (bmi > 24.9 && bmi < 29.9) message = "Please check your eating!!!!";
        else message = "Please slow down!!!!";
        JOptionPane.showMessageDialog(null, message);
    }
    
}