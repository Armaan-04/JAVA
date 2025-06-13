import ClassFolder.Rectangle;

public class Encapsulation {
    public static void main(String[] args)  {
     Rectangle rect1 = new Rectangle();
     rect1.length = 4;
     rect1.breadth = 5;
     rect1.draw();
     rect1.area();
    }
}
