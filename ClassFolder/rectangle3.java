package ClassFolder;

/* Types of access modifiers-used in ABSTRACTION
 *public-anyone can use once defined
 * protected-child can use
 * default-anyone can use within the package
 * private-can be only used within the class boundary
*/


//ABSTRACTION-Only showing the areas which are required and hiding the other non-important areas

//public class implements shape2{ (in case of interface)
public class rectangle3 extends shape {
    private int length;
    private int breadth;//member variable



    //CONSTRUCTORS-constructs objects and is executed first.
    public rectangle3 (int length , int breadth){ //constructor name is always same as class name
        super();//calls parent constructor-this is called constructor chaining
        this.length=length;
        this.breadth=breadth;
        System.out.println("I am inside the constructor of rectangle");
    }


    public void draw(){
        System.out.println("The rectangle is drawn ");
    }

    public void printArea(){
        System.out.println("The area of the rectangle is: " + (length * breadth));

    }
}