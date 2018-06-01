public class BassGuitar extends StringedInstruments {

  public BassGuitar () {
    name = "Bass Guitar";
    setSound("Duum-duum-duum");
    setNumberOfStrings(4);
  }

  public BassGuitar (int numberOfStrings) {
    this();
    setNumberOfStrings(numberOfStrings);
  }
}