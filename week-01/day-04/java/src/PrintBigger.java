import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner numberOne = new Scanner (System.in);
        System.out.println("Number one?");
        int userInputOne = numberOne.nextInt();

        Scanner numbertwo = new Scanner (System.in);
        System.out.println("Number two?");
        int userInputTwo = numbertwo.nextInt();

        if (userInputOne < userInputTwo) {
            System.out.println(userInputTwo);
            } else if (userInputOne > userInputTwo) {
                System.out.println(userInputOne);
            } else {
                System.out.println("Try again.");
            }
    }
}

// Write a program that asks for two numbers and prints the bigger one