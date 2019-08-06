import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

  String name;
  String color;
  int age;

  public Fox(String name, String color, int age){
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("vuk","red",2));
    foxes.add(new Fox("karak","red",15));
    foxes.add(new Fox("greenfox","green",2));
    foxes.add(new Fox("foxy","green",3));
    foxes.add(new Fox("bluefox","blue",1));

    foxesWithGreenColor(foxes);
    foxesWithGreenColorAndLessThanFiveYears(foxes);
    foxesColorFrequency(foxes);
  }

  public static void foxesWithGreenColor(List<Fox> foxes){

    foxes.stream()
            .filter(n -> n.color == "green")
            .forEach(n -> System.out.println(n.name));
  }

  public static void foxesWithGreenColorAndLessThanFiveYears(List<Fox> foxes){

    foxes.stream()
            .filter(n -> n.color == "green" && n.age < 5)
            .forEach(n -> System.out.println(n.color + " " + n.age));
  }

  public static void foxesColorFrequency(List<Fox> foxes){

    System.out.println(
            foxes.stream()
            .collect(Collectors.groupingBy(n -> n.color, Collectors.counting())));
  }
}
