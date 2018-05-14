import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter how many numbers you want to use.");
    int userNumbers = scanner.nextInt();

    int sum = 0;
    int userNumbers2;

    System.out.println("Enter " + userNumbers + " numbers.");

    for (int i = 0; i < userNumbers; i++) {

      userNumbers2 = scanner.nextInt();

      sum += userNumbers2;

    }
    int average = sum / userNumbers;

    System.out.print("Sum: " + sum + ", Average: " + average);
  }
}

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4