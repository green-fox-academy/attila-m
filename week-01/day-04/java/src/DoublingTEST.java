public class DoublingTEST {

  public static void main(String[] args) {

    int number = 123;

    int number2 = 312;

    System.out.println(doubling(number, number2));

    }

    public static int doubling (int n, int n2) {

      int sum = n + n2 * 2;

      return sum;
  }

}

// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
