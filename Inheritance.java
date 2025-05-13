import OOPS.circle;
import OOPS.rectangle3;
import OOPS.shape;

public class Inheritance {
    public static void main(String[] args){

        /*rectangle3 rect = new rectangle3(4,5);
        rect.draw();
        rect.printArea();*/


        shape shape = new rectangle3 (4,5);
        shape.draw();
        shape.printArea();
    }
}
