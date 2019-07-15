package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  String nameOfGarden;
  List<Plant> plants = new ArrayList<>();

  public Garden(String nameOfGarden){
    this.nameOfGarden = nameOfGarden;
  }
  public void gardenStatus(){
    for (int i = 0; i < plants.size(); i++) {
      if(plants.get(i) instanceof Flower){
        ((Flower) plants.get(i)).state();
      }
      else if(plants.get(i) instanceof Tree){
        ((Tree) plants.get(i)).state();
      }
    }
    System.out.println("");
  }
  public void wateringWith40(){
    int wateringAmount = 40/amountForEachPlants();
    for (int i = 0; i < plants.size(); i++) {
      if(plants.get(i) instanceof Tree && plants.get(i).currentWaterAmount < 10){
        plants.get(i).currentWaterAmount+=(wateringAmount*0.40);
      }
      if(plants.get(i) instanceof Flower && plants.get(i).currentWaterAmount < 5){
        plants.get(i).currentWaterAmount+=(wateringAmount*0.75);
      }
    }
    System.out.println("Watering with 40");
    gardenStatus();
    System.out.println("");
  }

  public void wateringWith70(){
    int wateringAmount = 70/amountForEachPlants();
    for (int i = 0; i < plants.size(); i++) {
      if(plants.get(i) instanceof Tree && plants.get(i).currentWaterAmount < 10){
        plants.get(i).currentWaterAmount+=(wateringAmount*0.40);
      }
      if(plants.get(i) instanceof Flower && plants.get(i).currentWaterAmount < 5){
        plants.get(i).currentWaterAmount+=(wateringAmount*0.75);
      }
    }
    System.out.println("Watering with 70");
    gardenStatus();
    System.out.println("");
  }

  public int amountForEachPlants(){
    int counter = 0;
    for (int i = 0; i < plants.size(); i++) {
      if(plants.get(i) instanceof Tree && plants.get(i).currentWaterAmount < 10){
        counter++;
      }
      if(plants.get(i) instanceof Flower && plants.get(i).currentWaterAmount < 5){
        counter++;
      }
    }
    return counter;
  }

  public void addPlants(){
    plants.add(new Flower("yellow",0));
    plants.add(new Flower("blue",0));
    plants.add(new Tree("purple",0));
    plants.add(new Tree("orange",0));
  }
}