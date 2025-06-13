package Introduction.ClassFolder;



                 //ENCAPSULATION-encapsules methods under itself
public class rectangle2 {
    public int length; //member variable
    public int breadth; //member variable



                    //CONSTRUCTORS-constructs objects, executed first.
    public rectangle2(int length , int breadth){ //constructor name is always same as class name
        this.length=length;  //'this' keyword always accesses member variable
        this.breadth=breadth;
        System.out.println("I am inside the constructor");
    }


    public void draw(){
        System.out.println("Drawing a rectangle. ");
    }

    public void area(){
        System.out.println("Area is: " + (length * breadth));
    }
}
