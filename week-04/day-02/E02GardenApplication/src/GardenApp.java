public class GardenApp {

  public static void main(String[] args) {

    Plant yellowFlower = new Flower("yellow", 1);
    Plant blueFlower = new Flower("blue", 1);
    Plant purpleTree = new Tree("purple", -20);
    Plant orangeTree = new Tree("orange", -20);

    Garden secretGarden = new Garden();
    secretGarden.addPlant(yellowFlower);
    secretGarden.addPlant(blueFlower);
    secretGarden.addPlant(purpleTree);
    secretGarden.addPlant(orangeTree);

  }
}
