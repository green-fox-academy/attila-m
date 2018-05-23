public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use () {
    this.inkAmount -=2;
  }
}
