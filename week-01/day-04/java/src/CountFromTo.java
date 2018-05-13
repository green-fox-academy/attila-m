import java.util.Scanner;

public class CountFromTo {


    public static void main(String[] args) {

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int firstInput = firstNumber.nextInt();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Please enter your second number.");
        int secondInput = secondNumber.nextInt();

        if (firstInput > secondInput) {
            System.out.println("The second number should be bigger.");
        } else if (firstInput < secondInput) {

            for (int result = firstInput; result < secondInput; result++) {
                System.out.println(result);
            }
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5