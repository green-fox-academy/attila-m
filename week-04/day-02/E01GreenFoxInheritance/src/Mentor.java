public class Mentor extends Person {
  String level;

  public void introduce() {
    super.introduce();
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant software developers!");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }
}
