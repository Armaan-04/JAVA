package Codes;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        int sum = summation(num);
        System.out.println("The sum of the digits is: " +sum);
    }

    public static int summation(int num){
        int i=0;
        int add=0;
        while(num>0){
            i=num%10;
            add= add+i;
            num=num/10;
        }

        return add;
    }
}
