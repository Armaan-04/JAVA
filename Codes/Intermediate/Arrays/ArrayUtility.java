package Codes.Intermediate.Arrays;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {//as long as static is used we can use the method by referring to the class name.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter element number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArray){
        int i= 0;
        while (i < numArray.length){
            System.out.println(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
