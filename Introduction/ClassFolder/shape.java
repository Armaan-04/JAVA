package Introduction.ClassFolder;


public abstract class shape {//abstract means no one can create an object in this class , this class is used for inheritance.

    public shape() {
        System.out.println("Inside shape constructor.");
    }
    public void draw(){
        System.out.println("Drawing a shape.");
    }

    public abstract void printArea(); //abstract because no definition.
}
