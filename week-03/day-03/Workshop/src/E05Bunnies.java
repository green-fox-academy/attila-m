public class E05Bunnies {
  public static void main(String[] args) {
    recursiveBunny(10, 2,0);
  }

  private static int recursiveBunny(int bunnyNumber,int bunnyEar, int bunnyEarSum) {
    if (bunnyNumber>0) {
      bunnyNumber--;
      bunnyEarSum+=bunnyEar;
      return recursiveBunny(bunnyNumber,bunnyEar,bunnyEarSum);
    } else {
      System.out.println(bunnyEarSum);
      return bunnyEarSum;
    }
  }
}