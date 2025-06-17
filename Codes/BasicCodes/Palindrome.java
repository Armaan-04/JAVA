package Codes.BasicCodes;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num=input.nextInt();
        boolean Palindrome = isPalindrome(num);
        if(Palindrome){
            System.out.println("Your number is a Palindrome.");
        } else{
            System.out.println("Your number is not a Palindrome.");
        }
    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num==reverse;
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num>0){
            int digit = num%10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
