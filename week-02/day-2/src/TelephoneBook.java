import java.util.HashMap;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> telBook = new HashMap<>();

    telBook.put("William A. Lathan", "405-709-1865");
    telBook.put("John K. Miller", "402-247-8568");
    telBook.put("Hortensia E. Foster", "606-481-6467");
    telBook.put("Amanda D. Newland", "319-243-5613");
    telBook.put("Brooke P. Askew", "307-687-2982");

    System.out.println("John K. Miller's phone number is: " + JohnKMiller(telBook));
    System.out.println("307-687-2982 is " + numberSearcher(telBook) + "'s number");
    System.out.println("Do we know Chris E. Myers' phone number? " + chrisEMyer(telBook));
  }
  public static String JohnKMiller(HashMap<String, String> telBook){
    return telBook.get("John K. Miller");
  }
  public static String numberSearcher(HashMap<String, String> telBook){
    String result = "";
    for (String searcher: telBook.keySet()) {
      if (telBook.get(searcher).equals("307-687-2982")){
        result=searcher;
        break;
      }
    }
    return result;
  }
  public static boolean chrisEMyer(HashMap<String, String> telBook){
    boolean cEM = telBook.containsKey("Chris E. Myer");
    return cEM;
  }
}


