/**
 * @author Raul Aguilar
 */
package csci114_20170910code2;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(5,10,20,30);
        g2.draw(box);
        box.translate(2,2);
        g2.draw(box);
        g2.fill(box);
    }
}

public class Csci114_20170910code2 {
    
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500, 300);
        window.setTitle("Hello, World!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent rect = new RectangleComponent();
        window.add(rect);
        window.setVisible(true);
    }
    
}
