package GreenFoxInheritanceExercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student> students = new ArrayList<>();
  List<Mentor> mentors = new ArrayList<>();

  public Cohort(String name){
    this.name = name;
  }
  public void addStudent(Student student){
    students.add(student);
  }
  public void addMentor(Mentor mentor){
    mentors.add(mentor);
  }
  public void info(){
    System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
