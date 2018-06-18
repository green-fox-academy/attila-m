import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E06 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(getSpecialCities(cities));
  }

  private static List<String> getSpecialCities(ArrayList<String> cities) {
    return cities.stream()
            .filter(x -> x.charAt(0) == 'A')
            .filter(x -> x.charAt(x.length() - 1) == 'I')
            .collect(Collectors.toList());
  }

}
