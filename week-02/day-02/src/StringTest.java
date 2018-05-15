public class StringTest {
  public static void main(String[] args) {
    String text = "  example text   ";
    String csv = "one;two;three";

    System.out.println(text.substring(text.indexOf("x"), text.indexOf("l")));                         // a masodik indextol levagta a szot
    System.out.println(text.replace("x", "y")); // kicsereli az adott karaktereket
    System.out.println(text.trim());
    System.out.println(text.charAt(4));
    System.out.println(text.contains("te"));
    System.out.println(csv.split(";"));
    for (String s : csv.split(";")) {
      System.out.println(s);                                       // kerdezni
    }
    System.out.println(text.indexOf("k"));                        // -1 ertek mivel nincs benne k
    System.out.println();

  }
}
