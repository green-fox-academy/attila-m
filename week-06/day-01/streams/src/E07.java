import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class E07 {
  public static void main(String[] args) {
    Map<Character, Long> frequencyMap = frequencyOfCharacters("Radiohead");
    System.out.println(frequencyMap);
  }

  private static Map<Character, Long> frequencyOfCharacters(String radiohead) {

    return radiohead.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c ->  c, Collectors.counting()));
  }

}
