public class E10Fibonacci {
  public static void main(String[] args) {
    fibonacci(10, 0, 1);
  }

  private static int fibonacci(int counter, int sum, int add) {
    if (counter>0) {
      counter--;
      int temp = sum;
      sum=add;
      add+=temp;
      return fibonacci(counter,sum,add);
    } else {
      System.out.println(sum);
      return sum;
    }
  }
}
