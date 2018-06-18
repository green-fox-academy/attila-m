public class ConcertApp {

  public static void main(String[] args) {

    StringedInstruments electricGuitar = new ElectricGuitar();
    StringedInstruments bassGuitar = new BassGuitar();
    StringedInstruments violin = new Violin();

    Person flea = new Musician("Flea", 52, bassGuitar);
    Person jonny = new Musician("Jonny Greenwood", 49, electricGuitar);



    Band theBand = new Band("The Green Foxes");
    theBand.bandMembers.add(flea);
    theBand.bandMembers.add(jonny);

    electricGuitar.play();
    bassGuitar.play();
    violin.play();

    for (int i = 0; i < theBand.bandMembers.size(); i++) {
      System.out.println(theBand.bandMembers.get(i).name);
    }
  }
}

