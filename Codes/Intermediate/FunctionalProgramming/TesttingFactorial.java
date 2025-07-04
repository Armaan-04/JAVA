package Codes.Intermediate.FunctionalProgramming;

import java.util.stream.IntStream;

public class TesttingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int number = 9;
        System.out.println(factorial(number));

        IntStream.rangeClosed(1,number)
                .reduce ((a,b) -> a * b)
                .ifPresent(System.out::println);
    }


    public static long factorial (int num){
        if (num == 0 || num == 1){
            return 1;
        }
        int fact = 1;
        for(int i =1 ; i<=num ; i++){
            fact = fact * i;
        }
        return fact;
    }
}

