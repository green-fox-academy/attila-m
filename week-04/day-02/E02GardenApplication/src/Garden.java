import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> gardenPlants;

  public Garden() {
    gardenPlants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    this.gardenPlants.add(plant);
  }

  public void gardenStatus() {
    for (int i = 0; i < gardenPlants.size() ; i++) {
      gardenPlants.get(i).needsWater();
    }
  }

  public void gardenWater(int waterAmount) {
    for (int i = 0; i < gardenPlants.size() ; i++) {
      gardenPlants.get(i).plantWatered(waterAmount);

    }
  }
}
