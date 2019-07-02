import java.util.ArrayList;

public class ShoppingList {
  public static void main(String[] args) {
    ArrayList<String> shoppingList = new ArrayList<>();

    shoppingList.add("Eggs");
    shoppingList.add("milk");
    shoppingList.add("fish");
    shoppingList.add("apples");
    shoppingList.add("bread");
    shoppingList.add("banana");

    System.out.println(milk(shoppingList));
    System.out.println(banana(shoppingList));

  }
  public static String milk(ArrayList<String> shoppingList){
    String milk = "You don't have milk on the list";

    for (int i = 0; i < shoppingList.size(); i++){
      if(shoppingList.get(i).equals("milk")){
        milk = "You have milk on the list";
        return milk;
      }
    }
   return milk;
  }
  public static String banana(ArrayList<String> shoppingList){
    String banana = "You don't have banana milk on the list";

    for (int i = 0; i < shoppingList.size(); i++){
      if(shoppingList.get(i).equals("banana")){
        banana = "You have banana on the list";
        return banana;
      }
    }
    return banana;
  }
}