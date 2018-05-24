public class E11Refactorio {
  public static void main(String[] args) {
    refactorio(8,1);
  }

  private static int refactorio(int n, int sum) {
    if (n>0) {
      sum=sum*(n);
      n--;
      return refactorio(n,sum);
      } else {
        System.out.println(sum);
        return sum;
    }
  }
}
