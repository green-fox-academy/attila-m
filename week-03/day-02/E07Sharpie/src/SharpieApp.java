public class SharpieApp {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("green", 1);
    sharpie1.use();
    sharpie1.use();
    sharpie1.use();

    System.out.println(sharpie1.inkAmount);
  }
}
