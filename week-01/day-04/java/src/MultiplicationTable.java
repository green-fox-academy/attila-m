import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int firstInput = firstScanner.nextInt();

        int lineNumber = 0;

        for (int multiTable = 1; multiTable < 11; multiTable++) {

            int result = firstInput + (firstInput*lineNumber);

            lineNumber = lineNumber + 1;

            System.out.println(lineNumber + " * " + firstInput + " = " + result);

        }

    }
}








// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150