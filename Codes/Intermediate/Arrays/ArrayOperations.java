package Codes.Intermediate.Arrays;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int number : numbers){
                sum = sum+number;
            }
            return sum/numbers.length;
        }
    }
}
