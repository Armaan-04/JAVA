import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try{
            System.out.println("division is: " + (a/b));
        } catch (ArithmeticException e){ //first executes the block in inside try and then if an exception arises , it is shifted to catch block
            System.out.println("Division is not possible");
        } finally {//finally keyword is always executed no matter the try and catch block is executed or not.
            System.out.println("I am in finally");
        }
    }
}
