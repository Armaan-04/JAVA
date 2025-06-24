package Codes.Intermediate.OOPS.AbstractShape;

public class Main {
    public static void main(String[] args) {
        shape s;

        s = new circle(4.5);
        s.area();
        s= new rectangle(4.6,2.5);
        s.area();
        s=new square(7.8);
        s.area();
    }
}
