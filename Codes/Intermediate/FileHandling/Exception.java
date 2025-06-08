package Codes.Intermediate;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d ", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception; //throw means exception couldnt be handled and it is returned.3
            }
        }
    }
}
