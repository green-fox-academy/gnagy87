public class Car {

  int gasAmount;
  int capacity;

  public Car(){
    this.gasAmount=0;
    this.capacity=100;
  }

  public static void main(String[] args) {
    Car newCar = new Car();
    Station newStation = new Station();
    newStation.refill(newCar);
    System.out.println(newCar.gasAmount);
    System.out.println(newStation.gasAmount);
  }
}
