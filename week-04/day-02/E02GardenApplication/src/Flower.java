public class Flower extends Plant {

  public Flower (String name, int waterStatus) {
    super(name, waterStatus);
  }

  public void needsWater() {
    if (this.waterStatus < 5) {
      System.out.println("The " + this.name + " needs water");
    } else {
      System.out.println("The " + this.name + " doesn't need water");
    }
  }
}
