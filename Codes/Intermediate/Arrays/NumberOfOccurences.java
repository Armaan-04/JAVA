package Codes.Intermediate.Arrays;
import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find: ");
        int num = input.nextInt();
        int noOfOccs = occurences(numArray , num);
        System.out.println("Your element was found " + noOfOccs + " times in the array.");
    }

    public static int occurences(int[] numArray , int num){
        int occ = 0;
        int i = 0;
        while( i < numArray.length){
            if (numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
