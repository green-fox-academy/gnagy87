package main.java.reservation;

import javax.sound.midi.Soundbank;

public class Main {
  public static void main(String[] args) {

    Reservation myReservation1 = new Reservation();
    Reservation myReservation2 = new Reservation();

    myReservation1.writeOut();
    myReservation2.writeOut();

  }
}
