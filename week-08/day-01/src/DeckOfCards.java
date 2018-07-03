import java.util.HashMap;

public class DeckOfCards {

  public HashMap<String, Integer> deck;

  public DeckOfCards() {
    deck = new HashMap<>();
    deck.put("2", 2);
    deck.put("3", 3);
    deck.put("4", 4);
    deck.put("5", 5);
    deck.put("6", 6);
    deck.put("7", 7);
    deck.put("8", 8);
    deck.put("9", 9);
    deck.put("T", 10);
    deck.put("J", 11);
    deck.put("Q", 12);
    deck.put("K", 13);
    deck.put("A", 14);
  }
}
