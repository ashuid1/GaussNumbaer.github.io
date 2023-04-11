
import java.util.Random;
import java.util.Scanner;

public class Gussnumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfGuesses = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        //System.out.println(numberToGuess);

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numberOfGuesses++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
    }
}

