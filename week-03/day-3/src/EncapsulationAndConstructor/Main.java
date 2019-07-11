package EncapsulationAndConstructor;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();
    dog.eat();
    cat.play();

    System.out.println(dog.hunger);
    System.out.println(cat.hunger + " " + cat.thirst);

    Sharpie sharpie1 = new Sharpie("black",20);
    sharpie1.use();
    System.out.println(sharpie1.inkAmount);
  }
}
