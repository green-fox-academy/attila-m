import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner chicken = new Scanner(System.in);

        System.out.println("Number of chickens the farmer has?");

        int userChicken = chicken.nextInt();

        Scanner pig = new Scanner(System.in);

        System.out.println("Number of pigs the farmer has?");

        int userPig = pig.nextInt();

        int legsOfFarm= userChicken * 2 + userPig * 4;

        System.out.println("The animals have " + legsOfFarm + " legs. Bye.");

    }
}