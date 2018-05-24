public class E08StringsAgain {
  public static void main(String[] args) {
    recursiveStringsAgain("xasdXxxa","",-1);
  }

  private static String recursiveStringsAgain(String xString,String xLessString, int counter) {
    counter++;
    if (counter<xString.length()) {
      Character currentChar = xString.charAt(counter);
      if (currentChar.equals('x') ) {
        xLessString += "";
        return recursiveStringsAgain(xString,xLessString,counter);
      } else {
        xLessString += currentChar;
        return recursiveStringsAgain(xString,xLessString,counter);
      }
    } else {
      System.out.println(xLessString);
      return xLessString;
    }
  }
}