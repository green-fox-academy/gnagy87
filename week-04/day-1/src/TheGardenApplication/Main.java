package TheGardenApplication;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden("my little garden");
    myGarden.addPlants();
    myGarden.gardenStatus();
    myGarden.wateringWith40();
    myGarden.wateringWith70();

  }
}
