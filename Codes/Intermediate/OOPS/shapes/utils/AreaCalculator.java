package Codes.Intermediate.OOPS.shapes.utils;
import Codes.Intermediate.OOPS.shapes.geometry.Circle;
import Codes.Intermediate.OOPS.shapes.geometry.Rectangle;

public class AreaCalculator {
    public static void main(String[] args){
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(5,4);

        double cirArea = Math.PI * Math.pow(cir.radius ,2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of the circle is: %f  , Area of the rectangle is: %f " , cirArea , rectArea);
    }
}
