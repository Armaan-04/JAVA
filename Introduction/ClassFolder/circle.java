package Introduction.ClassFolder;

//public class circle implements shape2{ (in case of interface)
public class circle extends shape { //extends here means shape is the parent class of circle

    private static final double PI=3.14; //static means variable , method , block or nested class belongs to the class itself
    private int radius;                  //final keyword means the variable declared is constant.

    public circle(int radius){
        this.radius = radius;
        System.out.println("I am inside the constructor of circle");
    }
     public void draw(){ //when the child redefines the method with the same name as the parent..the child method is executed and not the parent's..this is called overriding
        System.out.println("The circle is drawn.");
    }
   @Override
    public void printArea(){
        System.out.println("The area of the circle is: " + (2 * PI * radius));

    }
}
