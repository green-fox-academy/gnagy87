package main.java.flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, int age, int weight){
    super.name = name;
    super.age = age;
    super.weight = weight;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
