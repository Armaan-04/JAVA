package OOPS;

/* Types of access modifiers-used in ABSTRACTION
 *public-anyone can use once defined
 * protected-child can use
 * default-anyone can use within the package
 * private-can be only used within the class boundary
*/


//ABSTRACTION-Only showing the areas which are required and hiding the other non-important areas
public class rectangle3 {
    private int area; //member variable



    //CONSTRUCTORS-constructs objects and is executed first.
    public rectangle3 (int length , int breadth){ //constructor name is always same as class name
     this.area = length * breadth;
        System.out.println("I am inside the constructor");
    }


    public void draw(){
        System.out.println("Drawing a rectangle. ");
    }

    public void printArea(){
        System.out.println("Area is: " + area);
    }
}