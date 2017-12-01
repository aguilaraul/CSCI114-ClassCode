/**
 * @author raul aguilar
 * @purpose Finds the area of a circle or a rectangle
 */
package csci114_20171127code2;

class SpecialNumbers{
    static double PI=3.14;
}
class Shape{
    String type;
    double area;
    double circumference;    
}
class circle{
    double radios;
    public circle(double r)
    {
        radios = r;
    }  
    double calculateArea(){
        return SpecialNumbers.PI*radios * radios;
    }
}


public class Csci114_20171127code2 {

    public static void main(String[] args) {
        circle myCircle = new circle(4.0);
        System.out.println(myCircle.calculateArea());
        
        double myNumber = SpecialNumbers.PI * 100;
        System.out.println(myNumber);
    }
    
}
