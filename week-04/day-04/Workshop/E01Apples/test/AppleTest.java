import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest extends Apple {

  static Apple apple;

  @BeforeClass
  public static void init() {
  apple = new Apple();
  }

  @Test
  public void should_returnApple () {

    // Assignment
    String inputString1 = "a";
    // Act
    String result1 = apple.getApple(inputString1);

    // Assertion
    assertEquals(inputString1,result1);
  }

}