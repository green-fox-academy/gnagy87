package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(){
    super.numberOfString = 6;
  }

  public ElectricGuitar(int stringNumber){
    super.numberOfString = stringNumber;
  }

  @Override
  protected void sound() {
    System.out.println("Twang");
  }

  @Override
  public void play() {
    System.out.print("Electric guitar, a " + numberOfString + "-stringed instrument that goes ");
    sound();
  }
}
