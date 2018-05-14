/* import java.util.Arrays;

public class ArraysAndFunctions {

  public static void main(String[] args) {

    int[] numbers = new int[4];
    String[] texts = new String[4];
    //null - nincs memoriaerteke
    boolean[] truths = new boolean[4];
    Object[] objects = {2, 'alma', true};
    if (objects instanceof String) {  // megnezi az objects variable string-e
      System.out.println("true");
    }

    int[][] map = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
    };

    map []

    numbers[0] = 1;
    numbers[1] = 5;
    numbers[2] = 8;
    numbers[3] = 4;
    // numbers[4] = 5; hibakod : java.lang.ArrayIndexOutOfBoundsException: 4

    System.out.println(Arrays.toString(numbers));

    // System.out.println(numbers); az array memoriacimet nyomtatna: [I@47d384ee

    // System.out.println(Arrays.toString(numbers)); // prints numbers as string [1, 5, 8, 4]

    int[] numbers2 = {3, 5, 8, 11}; // a new is ott van, csak shortcut miatt nem latszik
    int[] numbers3;

    numbers3 = new int[] {9, 8, 7, 4, 1, 2}; // a new foglalja le a helyet a memoriaban

    System.out.println(Arrays.toString(numbers3));




  }

}

*/