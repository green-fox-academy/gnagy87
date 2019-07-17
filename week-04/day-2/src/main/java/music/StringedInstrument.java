package main.java.music;

public abstract class StringedInstrument extends Instrument{

  protected int numberOfString;

  protected abstract void sound();

  @Override
  protected void play() {

  }
}
