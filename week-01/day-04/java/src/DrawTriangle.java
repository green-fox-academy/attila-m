import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter a number");
        int triangleNumber = triangle.nextInt();

        Scanner lines = new Scanner(System.in);
        System.out.println("How many lines you want?");
        int lineNumber = lines.nextInt();

        for (int triangleRow = -1; triangleRow < triangleNumber; triangleRow++) {
            for (int triangleCol = -1; triangleCol < triangleRow; triangleCol++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int i = 0; i < lineNumber ; i++) {
            System.out.print(" -");
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was