package Codes.Intermediate.OOPS.AbstractShape;

public class rectangle extends shape{
    double length , breadth;

    rectangle (double length ,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double result = length * breadth;
        System.out.println("The area of the rectangle is: " + result);
    }
}
