package Codes.Intermediate.OOPS.AbstractShape;

public class square extends shape{
    double side;

    square(double side){
        this.side=side;
    }

    void area(){
        double result = side * side;
        System.out.println("The area of the square is: " + result);
    }
}
