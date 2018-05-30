public class Shifter implements CharSequence {
  String name;
  int shifter;

  public Shifter (String name, int shifter) {
    this.name = name;
    this.shifter = shifter;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {

    CharSequence word1 = name.subSequence(shifter, name.length());
    Character character1 = word1.charAt(index);
    return character1;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
