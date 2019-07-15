package GreenFoxInheritanceExercise;

public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super.name = "Jane Doe";
    super.age = 30;
    super.gender = "female";
    this.level = "intermediate";
  }

  public void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + level + " mentor.");
  }
}
