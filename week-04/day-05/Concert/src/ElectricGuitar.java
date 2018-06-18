
public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar() {
    name = "Electric Guitar";
    setSound("Twang");
    setNumberOfStrings(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    this();
    setNumberOfStrings(numberOfStrings);
  }
}


