import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> al1, ArrayList<String> al2) {

    ArrayList<String> matched = new ArrayList<>();

    for (int i = 0; (i < al2.size()) && (i < al1.size()); i++) {
      matched.add(al1.get(i));
      matched.add(al2.get(i));
    }

    if (al1.size() > al2.size()) {
      matched.add(al1.get(al1.size()-1));
    } else {
      matched.add(al2.get(al2.size()-1));
    }

    return matched;
  }
}