import java.util.Random;
import java.util.*;

public class NumberGame {

    public static void main(String args[]) {
        Random random = new Random();
        int target_No = random.nextInt(100) + 1;
        int userGuess;
        int atmpt = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            userGuess = s.nextInt();
            atmpt++;

            if (userGuess < target_No) {
                System.out.println("It's low, Try again...");
            } else if (userGuess > target_No) {
                System.out.println("It's high, Try again...");
            } else {
                System.out.println("Excellent! You guessed the number in " + atmpt + " attempts...");
            }

        } while (userGuess != target_No);

        s.close();
    }
}
