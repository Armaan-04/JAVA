package Introduction;

public class polymorphism {//using multiple methods with the same name but different arguments.
    //method overloading-multiple behaviour based on different arguments with the same method name.
    public static void main(String[] args){
        System.out.println("Sum is: " + add(2,4));
        int result = add(2,4);
        int newresult = add(result , 6);
        System.out.println("Sum is: " +add(1,3,4));
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
