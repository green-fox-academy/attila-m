public class PrintAll {
  public static void main(String[] args) {
    int[] numbers = {4, 5, 6, 7, 9, 8, 12};
    printArray(numbers);
  }

  public static void printArray(int[] anArray) {
    System.out.println(anArray.toString());

    for (int i = 0; i < anArray.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
      System.out.print(anArray[i]);
    }
  }
}
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`