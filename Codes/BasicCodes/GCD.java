package Codes.BasicCodes;
import java.util.Scanner;

public class GCD { //Greatest common divisor
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the 1st number: ");
    int num1= input.nextInt();
    System.out.println("Please enter the second number: ");
    int num2= input.nextInt();
    int x = gcd(num1 , num2);
    System.out.println("The greatest common divisor is " + x);
    }

    public static int gcd(int num1 , int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

        public static int least ( int num1, int num2){
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }


