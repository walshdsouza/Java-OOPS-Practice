import java.util.*;
interface Shape{
    double calculateArea();
}
class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calculateArea(){
        return length*breadth;
    }
}
public class ShapeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        Shape rectangle = new Rectangle(length,breadth);
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
    }
}