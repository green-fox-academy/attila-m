import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner oddOrEven = new Scanner(System.in);

        System.out.println("Dear User, please enter a number.");

        float numberEnter = oddOrEven.nextInt();

        boolean isItEven = numberEnter % 2 == 0;

        if (isItEven == true) {
            System.out.println("Your number is even.");
        }

            else {
            System.out.println("Your number is a little bit odd, my dear User.");
        }

    }
}



// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.