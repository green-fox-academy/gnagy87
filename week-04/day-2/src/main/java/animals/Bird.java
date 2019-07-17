package main.java.animals;

import main.java.flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name){
    super.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String breed() {
    return "laying eggs";
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
