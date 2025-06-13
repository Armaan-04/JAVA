package Introduction;
import Introduction.ClassFolder.rectangle3;
import Introduction.ClassFolder.shape;

public class Inheritance {
    public static void main(String[] args){

        /*rectangle3 rect = new rectangle3(4,5);
        rect.draw();
        rect.printArea();*/


        shape shape = new rectangle3(5,2);
        shape.draw();
        shape.printArea();
    }
}
