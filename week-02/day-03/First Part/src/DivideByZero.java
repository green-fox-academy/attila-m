import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a divisior.");
    int divisor = scanner.nextInt();

    try {
     int theDivision = 12/divisor;
      System.out.println(theDivision);
    } catch (ArithmeticException e) {
      System.out.println("It is agreed we can't divide by zero.");
    }
  }
}
