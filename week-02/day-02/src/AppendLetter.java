import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");

    System.out.println(appendA(far));

  }
  public static ArrayList<String> appendA(List<String> al1) {

    ArrayList<String> aAppended = new ArrayList<>();

    for (int i = 0; i < al1.size(); i++) {

      aAppended.add(al1.get(i) + "a");

    }
    return aAppended;
  }
}
// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"