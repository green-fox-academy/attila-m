import java.util.Scanner;

public class PartyIndicator {


    public static void main(String[] args) {

        Scanner numberOne = new Scanner(System.in);
        System.out.println("How many girls are at the party?");
        int userGirls = numberOne.nextInt();

        Scanner numberTwo = new Scanner(System.in);
        System.out.println("How many boys are at the party?");
        int userBoys = numberTwo.nextInt();

        if ((userBoys == userGirls) && (userBoys + userGirls) >= 20) {
            System.out.println("The party is excellent!");
        } else if ((userBoys != userGirls) && (userBoys + userGirls) > 20) {
            System.out.println("Quite cool party!");
        } else if ((userBoys+userGirls < 20) && (userGirls > 0)) {
            System.out.println("Average party...");
        } else if (userGirls == 0) {
            System.out.println("Sausage party.");
        } else {
            System.out.println("Try again.");
        }
    }
}

// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
