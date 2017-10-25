/**
 * @author  Raul Aguilar
 * @class   Palomar College CSCI 114
 */
package csci114_20171018code1;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Csci114_20171018code1 extends JFrame {
    int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 50;

    public static final int EYE_WIDTH = 10;
    public static final int EYE_HEIGHT = 20;
    public static final int X_RIGHT_EYE = 155;
    public static final int Y_RIGHT_EYE = 100;
    public static final int X_LEFT_EYE = 230;
    public static final int Y_LEFT_EYE = Y_RIGHT_EYE;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = 150;
    public static final int Y_MOUTH = 160;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_DEGREES_SHOWN = 180;

    @Override
    public void paint(Graphics canvas)
    {
        //Cleanup
        canvas.clearRect(0, 0, 400, 400);
        //Draw face outline:
        canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //Draw eyes:
        canvas.setColor(Color.blue);
        canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        //Draw mouth:
        canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                       MOUTH_START_ANGLE, MOUTH_DEGREES_SHOWN);
        canvas.setColor(Color.RED);
        
        int[] xPoints = {100, 120, 150,200, 140};
        int[] yPoints = {80,90,130,300, 100};
        canvas.drawPolyline(xPoints,yPoints, 5);
        
    }

public Csci114_20171018code1() {
    setSize(400,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
        Csci114_20171018code1 guiWindow = new Csci114_20171018code1();
	guiWindow.setVisible(true);
    }
}