/*
*
*  Purpose: Demonstrate Flow Layout
*
*/
package csci114_20171129code4;
import java.awt.*;
import javax.swing.*;

public class Csci114_20171129code4 extends JFrame {
    
    private JLabel[] labels = new JLabel[75];
   
    public Csci114_20171129code4() {
        
        super("Layout Manager Demo");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        
        for (int i=0; i < 75; i++)
        {
            String text = "label_" + Integer.toString(i);
            labels[i] = new JLabel(text, JLabel.CENTER);
            labels[i].setForeground(Color.red);
            add(labels[i]);
        }
        
            
    }
    
    public static void main(String[] args) {
        Csci114_20171129code4 frame = new Csci114_20171129code4();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,480);       
        frame.setVisible(true);
    }}