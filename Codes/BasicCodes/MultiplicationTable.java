package Codes.BasicCodes;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = abcd.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }
    }
}
