import java.util.HashMap;

public class Poker {

  public static DeckOfCards deck = new DeckOfCards();

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
    int cardTemp = 0;
    for (String card : hand) {
      if (deck.deck.get(card.split("")[0]) > cardTemp) {
        cardTemp = deck.deck.get(card.split("")[0]);
      }
    }
    return cardTemp;
  }

  public static String getWinningPair(String[] white, String[] black) {
    int cardTemp1 = 0;
    for (String card : white) {

    }


    return "Black wins!";
  }

  public static HashMap<String, Integer> getHandValue(String[] hand) {
    HashMap<String, Integer> handValue = new HashMap<>();

    return handValue;
  }
}
