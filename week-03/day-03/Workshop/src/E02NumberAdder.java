public class E02NumberAdder {
  public static void main(String[] args) {

   int sum = recursiveNumberAdder1(10);
   System.out.println(sum);
   recursiveNumberAdder2(10, 1, 0);

  }

  private static int recursiveNumberAdder1(int m) {
    if (m == 1) {
      return 1;
    } else {
      return m + recursiveNumberAdder1(m-1);
    }
  }

  private static int recursiveNumberAdder2(int n, int counter, int sum) {

    sum += counter;
    counter++;

    if (counter <= n) {
      System.out.println(sum);
      return recursiveNumberAdder2(n,counter,sum);
    } else {
      System.out.println(sum);
      return sum;
    }
  }
}
