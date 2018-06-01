import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTestGood {

  Extension extension = new Extension();

  @Test
  void should_returnSum_when_twoInput() {
    int inputNumber1 = 2;
    int inputNumber2 = 1;
    int expectedResult1 = 3;
    int actualResult1 = extension.add(inputNumber1, inputNumber2);

    assertEquals(expectedResult1, actualResult1);
  }

  @Test
  void should_returnMaxInput_when_threeInput() {
    int inputNumber1 = 1;
    int inputNumber2 = 5;
    int inputNumber3 = 3;
    int expectedResult1 = 5;
    int actualResult1 = extension.maxOfThree(inputNumber1, inputNumber2, inputNumber3);

    assertEquals(expectedResult1, actualResult1);
  }

@Test
  void should_returnMedian_when_threeInput() {
  int inputNumber1 = 1;
  int inputNumber2 = 5;
  int inputNumber3 = 3;
  }
}