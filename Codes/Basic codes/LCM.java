package Codes;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your 2nd number: ");
        int num2 = input.nextInt();
        int x=lcm(num1 ,num2);
        System.out.println("LCM of the 2 numbers is: " +x);
    }

    public static int lcm (int num1 ,int num2){
        int i=1;
        int factor=0;
        while(true){
            factor= num1*i; //logic- the table of num1 is calculated and if any of the product is divisible by num2 then it is the LCM.
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}

