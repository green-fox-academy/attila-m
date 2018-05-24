public class E06BunniesAgain {
  public static void main(String[] args) {
    recursiveBunnyAgain(5, 0);
  }

  private static int recursiveBunnyAgain(int bunnyNumber, int bunnyEarSum) {
    if (bunnyNumber>0) {
      if (bunnyNumber%2 == 0) {
        bunnyNumber--;
        bunnyEarSum += 3;
        return recursiveBunnyAgain(bunnyNumber,bunnyEarSum);
      } else {
        bunnyNumber--;
        bunnyEarSum += 2;
        return recursiveBunnyAgain(bunnyNumber, bunnyEarSum);
      }
    } else {
      System.out.println(bunnyEarSum);
      return bunnyEarSum;
    }
  }
}