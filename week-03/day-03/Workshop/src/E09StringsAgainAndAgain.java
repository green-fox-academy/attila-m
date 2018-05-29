public class E09StringsAgainAndAgain {
  public static void main(String[] args) {
    recursiveStringsAgainAndAgain("FunnyWord", "", 0);
  }

  private static String recursiveStringsAgainAndAgain(String starless, String starful, int counter) {
    Character currentChar = starless.charAt(counter);
    if (counter<starless.length()-1) {
      starful+=currentChar+"*";
      counter++;
      return recursiveStringsAgainAndAgain(starless,starful,counter);
    } else {
      starful+=starless.charAt(counter);
      System.out.println(starful);
      return starful;
    }
  }
}



