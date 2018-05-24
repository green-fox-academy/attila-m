public class E03SumDigit {
  public static void main(String[] args) {
    recursiveSumDigit(123456789, 0);
    recursiveSumDigitBonus(10001, 0);
  }

  private static int recursiveSumDigit(int number, int sum) {
    if (number>0) {
      sum+=number%10;
      number=number/10;
      return recursiveSumDigit(number,sum);
    } else {
      sum+=number;
      System.out.println(sum);
      return sum;
    }
  }

  private static int recursiveSumDigitBonus(int num, int counter) { // How many digits are there in my number? - bonus exercise
    counter++;
    if (num>=10) {
      num=num/10;
      return recursiveSumDigitBonus(num, counter);
    } else {
      System.out.println(counter);
      return counter;
    }
  }
}
