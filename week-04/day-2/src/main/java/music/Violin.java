package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    super.numberOfString = 4;
  }

  @Override
  protected void sound() {
    System.out.println("Screech");
  }

  @Override
  public void play() {
    System.out.print("Violin, a " + numberOfString + "-stringed instrument that goes ");
    sound();
  }
}
