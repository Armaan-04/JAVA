import java.util.Scanner;

public class UserInput {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); //System.in means to take the input from command line
       System.out.print("Please enter your name: ");
       String name= scanner.nextLine();
       System.out.println(name); 

       System.out.println("Please enter your age: ");
       int age = scanner.nextInt(); //nextInt() is used to take integer input
       System.out.println("Your age is: " + age);
   }
}