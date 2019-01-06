/**
 * @author raul aguilar
 * @purpose increment counter by button press. Shows ActionListener
 */
package csci114_20171127code4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Csci114_20171127code4 extends JFrame{
    private int numClicks=0;
    public Csci114_20171127code4() {
        super("csci114_20171127code4");
        setLayout(new BorderLayout()); 
        JLabel label1 = new JLabel("Hello CSCI114");
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1, BorderLayout.NORTH);
        final JLabel label2 =  new JLabel();
        label2.setHorizontalAlignment(JLabel.CENTER);
        
        JButton button =  new JButton("Click Me!");
        button.setSize(60, 20);
        //=============
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numClicks ++; 
            label2.setText("Cool! You Clicked " + numClicks + " times");
            //JOptionPane.showMessageDialog(null, "Heyyy!!! You clicked me!");
            }
        });
	//=============
        add(button, BorderLayout.SOUTH);
        add(label2);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Csci114_20171127code4 frame;
        frame = new Csci114_20171127code4();
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}