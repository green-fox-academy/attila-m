public class PrintParams {

  public static void main(String[] args) {

    String a = "Dear ";
    String b = "User, ";
    String c = "Feel free ";
    String d = "to use my ";
    String e = "program.";

    printParams(a, b, c, d, e);

  }
  public static void printParams(String... params) {

    for (String param : params) {
      System.out.print(param);

    }
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...