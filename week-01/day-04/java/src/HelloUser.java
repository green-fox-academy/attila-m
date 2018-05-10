import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {


        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");

        String userName = userInput.nextLine();

        System.out.println("Hello " + userName + "!");

    }
}