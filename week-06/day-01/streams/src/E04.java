import java.util.ArrayList;
import java.util.Arrays;

public class E04 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(Arrays.toString(whichSquaredIsMore(numbers)));
  }

  private static int[] whichSquaredIsMore(ArrayList<Integer> numbers) {
    return numbers.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .mapToInt(n -> n).toArray();
  }

}
