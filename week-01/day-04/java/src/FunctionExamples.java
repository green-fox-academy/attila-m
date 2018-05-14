public class FunctionExamples {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 6};
    float average = average(numbers);
    System.out.println(average);

    int n = 3;
    n = increaseNumber(n);
    System.out.println(n);

    // System.out.println(increaseNumber( number ));

    String appl = "alm";
    appl = appendA(appl);
    System.out.println(appl);

    String apple = appl + "a"; // 3 memoriahelyet foglal, mert az "a"nak is ad, mivel a String nem primitiv
    System.out.println(apple);

   /* if (apple == "alma") {    // == stringeknel nem hasznalatos .equals-t kell hasznalni
      System.out.println("Yepp");
    } else {
      System.out.println("Nope");
    } */

   // helloUser("Pisti");

    printUntil3(numbers);

  }

  public static void printUntil3(int[] numbers) {
    for (int number : numbers) {
      System.out.println(number);
      if (number == 3) {
       break;
      }
    }
    System.out.println("Ez volt mind");
  }

  public static void  helloUser(String userName) {
    System.out.println("Hello " + userName);
  }

  public static String appendA(String text) {
    return text + "a";
  }

  public static int[] increaseElements(int[] numbers) { // TO CHECK LATER!!
    for (int i = 0; i < numbers.length; i++) {
      ++numbers[i];

    }

    return numbers;

  }
  public static int increaseNumber(int number) {
    return number + 1;
  }

  public static float average(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length ; i++) {
      sum += numbers[i];
    }
    return sum / (float) numbers.length; // castoljuk az int numbers-t, a lenght integer, ezert ha az array float lenne
                                      // akkor is integert ad vissza
  }

}
