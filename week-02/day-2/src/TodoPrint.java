public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String myTodo = "My todo:\n";
    String downloadGames = " - Download games\n";
    String diablo = "\t - Diablo";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    System.out.println(myTodo + todoText + downloadGames + diablo);
  }
}
