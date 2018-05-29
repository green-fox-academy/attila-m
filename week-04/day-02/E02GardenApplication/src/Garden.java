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
}
