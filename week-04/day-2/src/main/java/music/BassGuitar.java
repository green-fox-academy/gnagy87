package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
    super.numberOfString = 4;
  }

  public BassGuitar(int stringNumber){
    super.numberOfString = stringNumber;
  }

  @Override
  protected void sound() {
    System.out.println("Duum-duum-duum");
  }

  @Override
  public void play() {
    System.out.print("Bass guitar, a " + numberOfString + "-stringed instrument that goes ");
    sound();
  }
}
