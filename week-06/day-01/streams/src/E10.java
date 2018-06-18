import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E10 {
  public static void main(String[] args) {
    Fox jozsiFox = new Fox("Jozsi", "culpeo", "red");
    Fox belaFox = new Fox("Bela", "pallida", "green");
    Fox janiFox = new Fox("Jani", "fennec", "green");
    Fox pistaFox = new Fox("Pista", "red fox", "red");
    Fox kalmanFox = new Fox("Kalman", "corsac", "red");

    List<Fox> foxList = new ArrayList<>();
    foxList.add(jozsiFox);
    foxList.add(belaFox);
    foxList.add(janiFox);
    foxList.add(pistaFox);
    foxList.add(kalmanFox);

    for (Fox fox : getGreenFox(foxList)) {
      System.out.println(fox.name);
    }

    System.out.println();

    for (Fox fox : getGreenPallidaFox(foxList)) {
      System.out.println(fox.name);
    }
  }

  private static List<Fox> getGreenFox(List<Fox> foxList) {
    return foxList.stream()
            .filter(f -> f.color.equals("green"))
            .collect(Collectors.toList());
  }

  private static List<Fox> getGreenPallidaFox(List<Fox> foxList) {
    return foxList.stream()
            .filter(f -> f.color.equals("green"))
            .filter(f -> f.type.equals("pallida"))
            .collect(Collectors.toList());
  }

}


