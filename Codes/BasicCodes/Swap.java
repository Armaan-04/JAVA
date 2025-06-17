package Codes.BasicCodes;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        int temp=0;

        temp = a;
        a = b;
        b=temp;
        System.out.println("The swapped value of a is " +a);
        System.out.println("The swapped value of b is " +b);
    }
}
