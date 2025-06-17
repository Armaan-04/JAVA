package Codes.BasicCodes;
import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=input.nextInt();

        if (num>0){
            System.out.println("The number is positive");
        } else if (num == 0) {
            System.out.println("The number is zero");
        } else{
            System.out.println("The number is negative");
        }
    }
}
