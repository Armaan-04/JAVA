package Codes.Intermediate.FunctionalProgramming;
import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
         BinaryOperator<Integer> multi = (a,b) -> a*b; //binary operator takes 2 input and gives 1 output.
         int result = multi.apply(4,5);
        System.out.println(result);
    }
}
