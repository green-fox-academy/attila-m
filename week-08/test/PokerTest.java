import org.junit.Test;

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
    String[] black = new String[] {"2H", "2D", "5S", "9C", "KD"};
    String[] white = new String[] {"2C", "3H", "4S", "KC", "AH"};
    assertEquals("Black wins!", Poker.getWinningPair(white, black));
  }
}