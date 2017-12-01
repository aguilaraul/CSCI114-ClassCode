/**
 * @author raul aguilar
 * @purpuse Creates a class to find individual areas of circles, rectangles,
 *  and triangles
 */
package csci114_20171127code3;
class SpecialNumbers{
    static double PI=3.14;
}
abstract class Shape{
    String type;
    double area;
    double circumference; 
    abstract void calculateArea();
    abstract void calculatePerimeter();    
}
class Circle extends Shape{
    double radios;
    public Circle(double r)
    {
        radios = r;
    }  
    @Override
    void calculateArea(){
        area = SpecialNumbers.PI*radios * radios;
    }
    @Override
    void calculatePerimeter() {
        circumference = 2 * SpecialNumbers.PI* radios;
    }
}

class Square extends Shape{
    double length;
    public Square(double a)
    {
        length = a;
    }
    @Override
    void calculateArea(){
        area = length * length;
    }
    @Override
    void calculatePerimeter() {
        circumference = 4 * length;
    }
} 
class Triangle extends Shape{
    double length;
    public Triangle(double a)
    {
        length = a;
    }
    @Override
    void calculateArea(){
        area = 0.25 *(length * length)* Math.sqrt(3.0);
    }
    @Override
    void calculatePerimeter() {
        circumference = 3 * length;
    }
} 



public class Csci114_20171127code3 {

    public static void main(String[] args) {
        Shape myCircle = new Circle(4.0);
        myCircle.calculateArea();
        myCircle.calculatePerimeter();
        System.out.println(myCircle.area);
        System.out.println(myCircle.circumference);  
        
        Shape mySquare = new Square(4.0);
        mySquare.calculateArea();
        mySquare.calculatePerimeter();
        System.out.println(mySquare.area);
        System.out.println(mySquare.circumference); 
        
        Shape myTriangle = new Triangle(4.0);
        myTriangle.calculateArea();
        myTriangle.calculatePerimeter();
        System.out.println(myTriangle.area);
        System.out.println(myTriangle.circumference);  
    }
    
}
