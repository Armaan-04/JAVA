package Codes;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        System.out.println("The fibonacci series is ");
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if (num<0) return;
        System.out.println("0 ");
        if (num == 0 ) return;
        System.out.println("1 ");

        int first=0;
        int second=1;
        while(first+second <=num){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
}
