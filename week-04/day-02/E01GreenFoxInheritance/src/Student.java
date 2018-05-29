public class Student extends Person {

 String previousOrganization;
 int skippedDays;

 public void getGoal() {
    System.out.println("Hi, I am " + name + ", " + age + " year old " + gender + " from " +
            previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int days) {
    this.skippedDays = this.skippedDays + days;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
}
