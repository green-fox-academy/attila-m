import java.util.Arrays;

public class AppendAnimlas {

  public static void main(String[] args) {

    String[] animals = {"kuty", "macsk", "cic"};

    System.out.println(Arrays.toString(appenda(animals)));

  }

  public static String[] appenda(String[] plusA) {

    for (int i = 0; i < plusA.length; i++) {
      plusA[i] = plusA[i] + "a";
      }
      return plusA;

    }
  }

// - Create an array variable named `animals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end