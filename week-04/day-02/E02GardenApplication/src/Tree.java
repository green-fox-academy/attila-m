public class Tree extends Plant {

  public Tree (String name, int waterStatus) {
    super(name, waterStatus);
  }

  public void needsWater() {
    if (this.waterStatus < 10) {
      System.out.println("The " + this.name + " needs water");
    } else {
      System.out.println("The " + this.name + " doesn't need water");
    }
  }
}
