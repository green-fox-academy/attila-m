public class E04Power {
  public static void main(String[] args) {
    recursivePower(3,4, 1);
  }

    private static int recursivePower(int base, int exponent, int sum) {
    if (exponent > 0) {
      exponent--;
      sum*=base;
      System.out.println(sum);
      return recursivePower(base,exponent,sum);
    } else {
      System.out.println(sum);
      return sum;
    }
  }
}
