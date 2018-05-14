public class Summing {
  public static void main(String[] args) {

    int until = 3;
    System.out.println(summer(until));
  }

  public static int summer(int n) {
    int sum = 0;

    for (int i = 0; i < n; i++) {
      sum += i;
      }
      return sum;

  }

}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer