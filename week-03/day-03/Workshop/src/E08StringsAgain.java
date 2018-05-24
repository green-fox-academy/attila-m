public class E08StringsAgain {
  public static void main(String[] args) {
    recursiveStrings("xasdXxxa","",-1);
  }

  private static String recursiveStrings(String xString,String xLessString, int counter) {
    counter++;
    if (counter<xString.length()) {
      Character currentChar = xString.charAt(counter);
      if (currentChar.equals('x') ) {
        xLessString += "";
        return recursiveStrings(xString,xLessString,counter);
      } else {
        xLessString += currentChar;
        return recursiveStrings(xString,xLessString,counter);
      }
    } else {
      System.out.println(xLessString);
      return xLessString;
    }
  }
}