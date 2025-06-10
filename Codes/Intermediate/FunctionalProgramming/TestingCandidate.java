package Codes.Intermediate.FunctionalProgramming;

public class TestingCandidate {
    public static void main(String[] args) {
        Candidate candidate = num -> { //lambda expression
            for(int i=2 ; i < num ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(12));
    }
}
