import java.util.HashMap;

public class Poker {

  public static HashMap<String, Integer> deck;

  public static void main(String[] args) {

  }

  public static String getHighCard(String cardA, String cardB) {
    return cardB;
  }

  public static String getWinningHand(String[] white, String[] black) {
    if (getHighestCardValue(white) > getHighestCardValue(black)) {
      return "White wins!";
    } else if (getHighestCardValue(white) < getHighestCardValue(black)) {
      return "Black wins!";
    } return "It's a tie!";
  }

  public static int getHighestCardValue(String[] hand) {

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

    int cardTemp = 0;
    for (String card : hand) {
      if (deck.get(card.split("")[0]) > cardTemp) {
        cardTemp = deck.get(card.split("")[0]);
      }
    }
    return cardTemp;
  }
}
