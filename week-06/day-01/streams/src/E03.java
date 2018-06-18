import java.util.ArrayList;
import java.util.Arrays;

public class E03 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(Arrays.toString(getSquareOfPositives(numbers)));
  }

  private static int[] getSquareOfPositives(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n >= 0)
            .mapToInt(n -> n * n)
            .toArray();
  }

}
