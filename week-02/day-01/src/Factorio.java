public class Factorio {
  public static void main(String[] args) {

    int number = 5;
    System.out.println(factorio(number));

    }

  public static int factorio(int n1) {
    int factor = n1;
    for (int i = factor - 1; i > 0 ; i--) {

      factor = factor * i;
      }

      return factor;
    }
  }

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial