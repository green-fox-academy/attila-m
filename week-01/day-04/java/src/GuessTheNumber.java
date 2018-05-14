import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
      int numberStored = 8;

        Scanner guess = new Scanner(System.in);
        System.out.println("Guess the number.");
        int userGuess = guess.nextInt();

        if (userGuess == numberStored) {
            System.out.println("You found the number: " + numberStored);
        } else {
            do {
                if (userGuess < numberStored) {
                    System.out.println("The stored number is higher.");
                } else if (userGuess > numberStored) {
                    System.out.println("The stroed number is lower.");
                } else {
                    System.out.println("Try with a number, buddy.");
                }
                userGuess = guess.nextInt();
            } while (userGuess != numberStored);
            System.out.println("You found the number: " + numberStored);
        }
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8