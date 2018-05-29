public class Plant {
  String name;
  int waterLevel;
  int minWaterLevel;

  public Plant(String name, int waterLevel, int minWaterLevel) {
    this.name = name;
    this.waterLevel = waterLevel;
    this.minWaterLevel = minWaterLevel;
  }

  public void needsWater() {
    if (waterLevel < minWaterLevel) {
      System.out.println("The " + name + " needs water");
    } else {
      System.out.println("The " + name + " doesn't need water");
    }
  }
}
