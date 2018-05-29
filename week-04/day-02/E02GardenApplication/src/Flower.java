public class Flower extends Plant {

  public Flower (String name, int waterStatus) {
    super(name + " Flower", waterStatus);
  }

  public void needsWater() {
    if (this.waterLevel < 5) {
      System.out.println("The " + this.name + " needs water");
    } else {
      System.out.println("The " + this.name + " doesn't need water");
    }
  }
}
