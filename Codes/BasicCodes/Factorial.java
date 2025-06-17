package Codes.BasicCodes;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter your number: ");
         int num = input.nextInt();
         long fact= factorial(num);
    }

    public static long factorial (int num){
        if (num<2){
            return 1;
        }
        long fact=1;
        int i=1;
        while(i<=num){
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial is: " + fact);
        return 0;
    }
}
