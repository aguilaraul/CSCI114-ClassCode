/*
*
*  Purpose: Demonstrate Grid Layout
*
*/
package csci114_20171129code5;
import java.awt.*;
import javax.swing.*;

public class Csci114_20171129code5 extends JFrame {
    
    private JButton[] labels = new JButton[15];
   
    public Csci114_20171129code5() {
        
        super("Grid Button Manager Demo");
        GridLayout layout = new GridLayout(3,5);
        setLayout(layout);
        
        for (int i=0; i < 15; i++)
        {
            String text = "label_" + Integer.toString(i);
//            labels[i] = new JLabel(text, JLabel.CENTER);
            labels[i] = new JButton(text);
            labels[i].setForeground(Color.red);
            add(labels[i]);
        }
            
    }
    
    public static void main(String[] args) {
        Csci114_20171129code5 frame = new Csci114_20171129code5();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,480);       
        frame.setVisible(true);
    }
}