import java.util.ArrayList;
import java.util.List;

public class Musician extends Person{

  public List<StringedInstruments> instrumentsHave;

  public Musician(String name, int age, StringedInstruments instrument) {
    super.name = name;
    super.age = age;
    instrumentsHave = new ArrayList<>();
    instrumentsHave.add(instrument);
  }
}


