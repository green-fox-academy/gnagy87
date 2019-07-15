package TheGardenApplication;

public class Tree extends Plant {

  public Tree(String color, int currentWaterAmount){
    super.color = color;
    super.currentWaterAmount = currentWaterAmount;

  }

  public void state(){
    if (super.currentWaterAmount < 10){
      System.out.println("The " + super.color + " tree needs water");
    }
    else {
      System.out.println("The " + super.color + " tree doesnt need water");
    }
  }
}
