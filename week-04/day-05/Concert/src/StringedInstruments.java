public abstract class StringedInstruments extends Instruments {

  private int numberOfStrings;
  private String sound;

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  void play() {
    System.out.println(name + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + getSound() );
  }
}

