import java.util.ArrayList;
import java.util.List;

public class SumFunction {

  public int getSum(List<Integer> numberList) {
    int sum = 0;
    for (int i = 0; i < numberList.size(); i++) {
      sum += numberList.get(i);
    }
    return sum;
  }

}
