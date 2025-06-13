package Codes.Intermediate.FunctionalProgramming;

public class TestingFunctionalinterface {
    public static void main(String[] args) {
        Functionalinterface candidate = num -> {
            for (int i = 2; i < num ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(6));
    }
}
