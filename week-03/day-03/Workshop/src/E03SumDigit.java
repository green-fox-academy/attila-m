public class E03SumDigit {

  public static void main(String[] args) {
    recursiveSumDigit(10100100, 1);
  }

  private static int recursiveSumDigit(int num, int counter) {

    counter++;

    if (num>10) {
      num=num/10;
      return recursiveSumDigit(num, counter);
    } else {
      System.out.println(counter);
      return counter;
    }
  }
}
