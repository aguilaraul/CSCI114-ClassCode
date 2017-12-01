/**
 *
 * @author raul
 */
/*
*
*  Purpose: Demonstrate Border Layout
*
*/

package csci114_20171129code3;
import java.awt.*;
import javax.swing.*;

public class Csci114_20171129code3 extends JFrame {
    
    private JLabel[] labels = new JLabel[5];
   
    public Csci114_20171129code3() {
        
        super("Layout Manager Demo");
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        
        for (int i=0; i < 5; i++)
        {
            String text = "label_" + Integer.toString(i);
            labels[i] = new JLabel(text, JLabel.CENTER);
            labels[i].setForeground(Color.red);
        }
        
        add(labels[0], BorderLayout.NORTH);
        add(labels[1], BorderLayout.CENTER);
        add(labels[2], BorderLayout.EAST);
        add(labels[3], BorderLayout.WEST);
        add(labels[4], BorderLayout.SOUTH);
            
    }
    
    public static void main(String[] args) {
        Csci114_20171129code3 frame = new Csci114_20171129code3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,480);       
        frame.setVisible(true);
    }
}
