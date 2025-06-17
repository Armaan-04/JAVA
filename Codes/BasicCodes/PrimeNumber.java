package Codes.BasicCodes;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to check: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("The number is Prime.");
        }else {
            System.out.println("The number is not prime");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i<num){
            if(num % i ==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
