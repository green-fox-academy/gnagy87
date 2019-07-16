package GreenFoxInheritanceExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;
  List<Student>clones = new ArrayList<>();

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super.name ="Jane Doe";
    super.age = 30;
    super.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal(){
    System.out.println("My goal is: Be a junior software developer");
  }
  public void skipDays(int numberOfDays){
    this.skippedDays+=numberOfDays;
  }

  @Override
  protected Student clone() {
    Student clones = new Student();
    clones.name = this.name;
    clones.age = this.age;
    clones.gender = this.gender;
    clones.previousOrganization = this.previousOrganization;
    return clones;
  }
}
