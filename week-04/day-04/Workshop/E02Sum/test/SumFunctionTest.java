import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumFunctionTest extends SumFunction {

  static SumFunction sumFunction;
  List<Integer> inputList = new ArrayList<>();


  @BeforeAll
  public static void init() {
    sumFunction = new SumFunctionTest();
    }

  @Test
  public void should_returnSum_when_filleddListInput() {

    // Assignment
    int expectedresult1 = 6;
    inputList.add(1);
    inputList.add(2);
    inputList.add(3);

    // Act
    int result1 = sumFunction.getSum(inputList);

    // Assessment
    assertEquals(expectedresult1, result1);

  }

  @Test
  public void should_return

}