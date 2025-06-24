package Codes.Intermediate.OOPS.AbstractShape;

class circle extends shape{
    double radius;

    circle(double radius){
        this.radius = radius;
    }

    void area(){
        double result = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + result);
    }
}


