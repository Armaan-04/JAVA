package Codes.Intermediate.Arrays;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,6});
        ArrayOperations.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
    }
}
