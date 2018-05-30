public class Plant {
  String name;
  int waterLevel;
  int minWaterLevel;
  double waterPercentage;
  boolean plantNeedsWater;

  public Plant(String name, int waterLevel, int minWaterLevel, double waterPercentage, boolean plantNeedsWater) {
    this.name = name;
    this.waterLevel = waterLevel;
    this.minWaterLevel = minWaterLevel;
    this.plantNeedsWater = plantNeedsWater;
  }

  public void needsWater() {
    if (waterLevel < minWaterLevel) {
      System.out.println("The " + name + " needs water");
    } else {
      System.out.println("The " + name + " doesn't need water");
    }
  }

  public void plantWatered(int waterAmount) {
    double successfulWater;
    successfulWater = waterAmount / 100 * waterPercentage;
  }

  public boolean ifNeedsWater() {
    if (waterLevel < minWaterLevel) {
      plantNeedsWater
      return true;
    }
  }
}
