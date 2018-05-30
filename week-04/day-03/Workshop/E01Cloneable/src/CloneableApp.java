public class CloneableApp {
  public static void main(String[] args) {
    Person john = new Student("John", 20, "male", "BME");
    john.introduce();
    ((Student) john).clone().introduce();
    }
  }
