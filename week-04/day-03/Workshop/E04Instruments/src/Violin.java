public class Violin extends StringedInstrument {

  public Violin () {
    name = "Violin";
    setSound("Screech");
    setNumberOfStrings(4);
  }

  public Violin (int numberOfStrings) {
    this();
    setNumberOfStrings(numberOfStrings);
  }
}
