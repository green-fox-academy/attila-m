import java.util.Scanner;

public class mtkm {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner userKm = new Scanner(System.in);

        System.out.println("Dear User, input KM output Mile.");

        int userGivenKm = userKm.nextInt();

        double inMile = userGivenKm * 0.6;

        System.out.println("Here you go: " + inMile);

    }
}