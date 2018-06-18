import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E02 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getOddAvg(numbers));
  }

  private static double getOddAvg(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(number -> number % 2 == 1)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();
  }

}
