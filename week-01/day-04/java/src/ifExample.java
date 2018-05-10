import java.sql.SQLOutput;

public class ifExample {

    public static void main(String[] args) {

        int number = 1;

        System.out.println(number / 2f);

        if (number % 2 == 0) {
            System.out.println("Szuper");
        } else if (number == 2) {
            System.out.println("Majdnem szuper");
        } else if (number == 3) {
            System.out.println("Nem igazan szuper");
        } else {
            System.out.println("Nem szuper");
        }

    }

}
