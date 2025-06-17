package Codes.BasicCodes;
import java.util.Scanner;


public class ArmstrongNumber { // 153 = 1^3 + 5^3 + 3^3 = 153
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num=input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong.");
        }else{
            System.out.println("Your number is not Armstrong.");
        }
    }

    public static boolean isArmstrong(int num){
        int digits = NoOfDigits(num);
        int numCopy=num;
        System.out.println("Number of digits: " + digits);
        int FinalNumber = 0;
        while(num >0){
            int lastDigit = num % 10;
            num = num / 10;
            FinalNumber = FinalNumber + Power(lastDigit , digits);
        }
        return FinalNumber == numCopy;
    }

    public static int Power(int num1, int num2){
        int result = 1;
        int i = 0;
        while( i < num2){
            result = result * num1;
            i++;
        }
        return result;
    }

    public static int NoOfDigits(int num){
        int digits=0;
        while (num>0){ //check notepad for logic
            digits++;
            num = num/10;
        }
        return digits;
    }
}
