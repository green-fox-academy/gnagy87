import java.util.HashMap;

public class ShoppingList2 {
  public static void main(String[] args) {
    HashMap<String, Double> prices = new HashMap<>();
    HashMap<String, Integer> bobsList = new HashMap<>();
    HashMap<String, Integer> alicesList = new HashMap<>();

    prices.put("Milk", 1.07);
    prices.put("Rice", 1.59);
    prices.put("Eggs", 3.14);
    prices.put("Cheese", 12.60);
    prices.put("Chicken Breasts", 9.40);
    prices.put("Apples", 2.31);
    prices.put("Tomato", 2.58);
    prices.put("Potato", 1.75);
    prices.put("Onion", 1.10);

    bobsList.put("Milk", 3);
    bobsList.put("Rice", 2);
    bobsList.put("Eggs", 2);
    bobsList.put("Cheese", 1);
    bobsList.put("Chicken Breasts", 4);
    bobsList.put("Apples", 1);
    bobsList.put("Tomato", 2);
    bobsList.put("Potato", 1);

    alicesList.put("Rice", 1);
    alicesList.put("Eggs", 5);
    alicesList.put("Chicken Breasts", 2);
    alicesList.put("Apples", 1);
    alicesList.put("Tomato", 10);

    System.out.println("How much does Bob pay? " + bobPay(prices,bobsList));
    System.out.println("How much does Alice pay? " + alicePay(prices,alicesList));
    System.out.println(productCompare("Tomato",bobsList,alicesList));
    System.out.println(moreDifferentProducts(bobsList,alicesList));
    System.out.println(morePiecesOfProducts(bobsList,alicesList));

  }
  public static double bobPay (HashMap<String, Double> prices, HashMap<String , Integer> bobsList){
    double bobPay = 0;
    for (String amount : bobsList.keySet()) {
      bobPay+=bobsList.get(amount)*prices.get(amount);
    }
    return bobPay;
  }

  public static double alicePay (HashMap<String, Double> prices, HashMap<String , Integer> alicesList){
    double alicePay = 0;
    for (String amount : alicesList.keySet()) {
      alicePay+=alicesList.get(amount)*prices.get(amount);
    }
    return alicePay;
  }

  public static String productCompare (String product, HashMap<String, Integer> bobsList, HashMap<String, Integer> alicesList){
    String winner = "";
    int a = bobsList.get(product);
    int b = alicesList.get(product);

    if(a==b){
      winner = "They have the same amount of " + product;
    }
    else if (a>b){
      winner = "Bob buys more " + product;
    }
    else if (a<b){
      winner = "Alice buys more " + product;
    }
    return winner;
  }

  public static String moreDifferentProducts (HashMap<String, Integer> bobsList, HashMap<String, Integer> alicesList){
    int result = bobsList.size()-alicesList.size();
    String winner = "";
    if(result>0){
      winner = "Bob buys more different products.";
    }
    else if (result == 0) {
      winner = "They have the same products";
    }
    else if (result<0){
      winner = "Alice buys more different products.";
    }
    return winner;
  }
  public static String morePiecesOfProducts (HashMap<String, Integer> bobsList, HashMap<String, Integer> alicesList){
    int alicePieces = 0;
    int bobPieces = 0;
    String winner = "";

    for (String bobsKey : bobsList.keySet()) {
      bobPieces+=bobsList.get(bobsKey);
    }
    for (String alicessKey : alicesList.keySet()) {
      alicePieces+=alicesList.get(alicessKey);
    }
    if(alicePieces>bobPieces){
      winner = "Bob has more pieces of products.";
    }
    else if (bobPieces>alicePieces){
      winner = "Alice has more pieces of products.";
    }
    else {
      winner = "Alice and Bob have the same pieces of products.";
    }
    return winner;
  }
}