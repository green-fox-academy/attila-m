public class E07Strings {
  public static void main(String[] args) {
    recursiveStrings("xasdXxxa","",-1);
  }

  private static String recursiveStrings(String xString,String yString, int counter) {
    counter++;
    if (counter<xString.length()) {
      Character currentChar = xString.charAt(counter);
      if (currentChar.equals('x') ) {
        yString += 'y';
        return recursiveStrings(xString,yString,counter);
      } else {
        yString += currentChar;
        return recursiveStrings(xString,yString,counter);
      }
    } else {
      System.out.println(yString);
      return yString;
    }
  }
}