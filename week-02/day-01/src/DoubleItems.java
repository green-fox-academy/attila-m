import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {
    int [] numList = {3, 4, 5, 6, 7};

    System.out.println(Arrays.toString(doubler(numList)));
  }
  public static int [] doubler(int [] array) {

    for (int i = 0; i < array.length ; i++) {
       array[i] = array[i] * 2;

    }
    return array;
  }

}

// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array