package TheGardenApplication;

public class Flower extends Plant {
  public Flower(String color, int currentWaterAmount) {
    super.color = color;
    super.currentWaterAmount = currentWaterAmount;
  }
  public void state(){
    if (super.currentWaterAmount < 5){
      System.out.println("The " + super.color + " Flower needs water");
    }
    else {
      System.out.println("The " + super.color + " Flower doesnt need water");
    }
  }

}
