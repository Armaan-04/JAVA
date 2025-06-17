package Codes.BasicCodes;
import java.util.Scanner;

//Check if the number is even or odd using bitwise operator.
//Even number bits end with 0 and Odd number bits end with 1.

public class BitwiseOperator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        if((num & 1) ==1){
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }

    }
}
