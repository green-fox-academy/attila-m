import java.util.Arrays;

public class E05 {
  public static void main(String[] args) {
    System.out.println(getUpperCase("rAdIoHEad"));
  }

  private static String getUpperCase(String wordToCheck) {
    String[] chars = wordToCheck.split("");
    return Arrays.stream(chars)
            .map(c -> c.charAt(0))
            .filter(Character::isUpperCase)
            .map(c -> Character.toString(c))
            .reduce((uppercase, letter) -> uppercase + letter)
            .get();
  }

}
