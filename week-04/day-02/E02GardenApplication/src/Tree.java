public class Tree extends Plant {

  public Tree (String name, int waterLevel) {
    super(name + "Tree", waterLevel);
  }

  public void needsWater() {
    if (this.waterLevel < 10) {
      System.out.println("The " + this.name + " needs water");
    } else {
      System.out.println("The " + this.name + " doesn't need water");
    }
  }
}
