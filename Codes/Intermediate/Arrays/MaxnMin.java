package Codes.Intermediate.Arrays;
import java.util.Scanner;

public class MaxnMin {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max of the array is: " + max);
        System.out.println("Min of the array is: " + min);
    }

    public static int min(int[] numArr){

        int min = Integer.MAX_VALUE ;
        int i = 0;
        while (i < numArr.length){
            if( numArr[i] < min){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numArr){
            int max = Integer.MIN_VALUE;
            int i = 0;
            while(i<numArr.length){
                if(max < numArr[i]){
                    max = numArr[i];
                }
                i++;
            }
        return max;
    }
}
