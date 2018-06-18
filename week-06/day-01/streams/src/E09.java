import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class E09 {
  public static void main(String[] args) {
    Character[] charArray = {'R', 'a', 'd', 'i', 'o', 'h', 'e', 'a', 'd'};
    System.out.println(getString(charArray));
  }

  private static String getString(Character[] charArray) {
    return Arrays.stream(charArray)
            .map(c -> c.toString())
            .collect(Collectors.joining());
  }
}
