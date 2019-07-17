package main.java.reservation;

public class Reservation implements Reservationy {

  public Reservation(){

  }
  public void writeOut(){
    System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
  }

  @Override
  public String getDowBooking() {
    return dow();
  }

  @Override
  public String getCodeBooking() {
    return code();
  }

  private String dow(){
    String[]days = {"MON", "TUE", "WED", "THU","FRI","SAT","SUN"};
    return days[(int)(Math.random()*7)];
  }
  private String code(){
    String codeCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String generatedCode = "";
    for (int i = 0; i < 8; i++) {
      generatedCode+=codeCharacters.charAt((int)(Math.random()*codeCharacters.length()-1));
    }
    return generatedCode;
  }
}
