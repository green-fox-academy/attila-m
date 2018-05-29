public class HomeworkApp {
  public static void main(String[] args) {

    Person person1 = new Person("Sanya", 18, "male");
    Person person2 = new Person("Gyurka", 23, "male");
    Person person3 = new Person("Csilla", 20, "female");

    person1.introduce();
    person2.introduce();
    person3.introduce();
  }
}
