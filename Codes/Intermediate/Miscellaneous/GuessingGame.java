package Codes.Intermediate.Miscellaneous;
import java.util.Scanner;

public class GuessingGame {
      int random;

      GuessingGame() {
          random = (int) Math.ceil(Math.random()*100);
      }
      //guessNumber the number that player guessed
      //return-
      // -ve if the number is smaller
      // 0 if the number is equal
      // +ve if the number is higher

    int guess(int guessNumber){
          return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the Guessing Game , guess the number now.");
        int guess;
        int result;
        do {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess); //returns either +ve , -ve or 0
            if (result == 0) {
                System.out.println("Congrats your guess is correct.");
            } else if (result < 0) {
                System.out.println("Please guess higher.");
            } else {
                System.out.println("Please guess lower.");
            }
        }  while (result != 0);
    }
}

