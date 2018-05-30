public class Gnirts implements CharSequence {
  String name;

  public Gnirts(String name) {
    this.name = name;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    Character character1 = this.name.charAt(name.length()-(index+1));
    return character1;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
