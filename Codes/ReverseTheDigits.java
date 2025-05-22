package Codes;
import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your numebr is " + reverse);
    }

    public static int reverse(int num){
        int newNum=0;
        while (num > 0){
            int LastDigit= num % 10; //gives remainder
            newNum= newNum * 10 + LastDigit;
            num = num/10; //gives quotient
        }
        return newNum;
    }
}
