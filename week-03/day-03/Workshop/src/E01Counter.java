public class E01Counter {
  public static void main(String[] args) {
    recursiveCounter(100); //10 000 mar nem mukodik :(((
  }

  private static void recursiveCounter(int n) {
    if (n == 0) {
      System.out.println("Function finished.");
    } else {
        System.out.println(n);
        n--;
        recursiveCounter(n);
    }
  }
}
