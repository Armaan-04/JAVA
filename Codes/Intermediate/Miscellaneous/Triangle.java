package Codes.Intermediate.Miscellaneous;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {

        if (isValid(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Error: Given sides do not form a valid triangle.");
        }
    }


    public boolean isValid(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public double Area() {
        return 0.5 * b * c;
    }

    public double perimeter() {
        return a + b + c;
    }


    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of the triangle is: " + t.Area());
        System.out.println("Perimeter of the triangle is:" + t.perimeter());
    }
}

