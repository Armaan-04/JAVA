package Codes.Intermediate.OOPS.shapes2;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(8.3);

        System.out.printf("Area of circle is %5.2f \n" , circle.calculateArea());
        System.out.printf("Area of the square is %5.2f " , square.calculateArea());
        }//5 is the overall max no. of digits and 2 is the max no of digits after point
    }

