package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name){
    super.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }
}
