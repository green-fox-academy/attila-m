import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.*;

public class PokerTest {

  @Test
  public void shouldReturnHigherCard() {
    String cardA = "3D";
    String cardB = "AH";
    assertEquals(cardB, Poker.getHighCard(cardA, cardB));
  }

  @Test
  public void shouldReturnWinningHand() {
    String[] black = new String[] {"2H", "3D", "5S", "9C", "KD"};
    String[] white = new String[] {"2C", "3H", "4S", "8C", "AH"};
    assertEquals("White wins!", Poker.getWinningHand(white, black));
  }

  @Test
  public void shouldReturnWinningHandWithPair() {
    Random random = new Random();
    String randomW = (2 + random.nextInt(2)) + "";
    String[] black = new String[] {"6S", "3C", "5S", "9C", (randomW + "S")};
    String[] white = new String[] {"2C", "4H", "4S", "KC", (randomW + "D")};
    String temp;
    if (randomW.equals("2")) {
      temp = "White wins!";
    }
    temp = "Black wins!";

    assertEquals(temp, Poker.getWinningPair(white, black));
  }

  @Test
  public void shouldReturnHigherPair() {
    String[] black = new String[] {"2H", "3D", "5S", "9C", "KD"};
    String[] white = new String[] {"2C", "2H", "4S", "KC", "AH"};
    assertEquals("Black wins!", Poker.getWinningPair(white, black));
  }

  @Test
  public void shouldReturnHandHashMap() {
    String[] black = new String[] {"2H", "3D", "5S", "9C", "KD"};
    HashMap<String, Integer> blackHand = new HashMap<>();
    blackHand.put("2H", 2);
    blackHand.put("3D", 3);
    blackHand.put("5S", 5);
    blackHand.put("9C", 9);
    blackHand.put("KD", 13);
    assertEquals(blackHand, Poker.getHandValue(black));
  }
}