import java.util.HashMap;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> priceList = new HashMap<>();

    priceList.put("Eggs",200);
    priceList.put("Milk",200);
    priceList.put("Fish",400);
    priceList.put("Apples",150);
    priceList.put("Bread",50);
    priceList.put("Chicken",550);

    System.out.println("The Fish costs: " + howMuchIsTheFish(priceList));
    System.out.println("The most expensive product is: " + mostExpensiveProduct(priceList));
    System.out.println("The average is: " + average(priceList));
    System.out.println("How many products' price is below 300? " + below300(priceList));
    System.out.println("Is there anything we can buy for exactly 125? " + exactly125(priceList));
    System.out.println("The cheapest product is: " + cheapestProduct(priceList));


  }
  public static int howMuchIsTheFish(HashMap<String, Integer> priceList){
    return priceList.get("Fish");
  }
  public static int mostExpensiveProduct(HashMap<String, Integer> priceList){
    int mostExpensive = 0;
    for (String key : priceList.keySet()) {
      if(priceList.get(key)>mostExpensive){
        mostExpensive = priceList.get(key);
      }
    }
    return mostExpensive;
  }
  public static double average(HashMap<String, Integer> priceList){
    int sum = 0;
    int elements = 0;
    for (String key : priceList.keySet()) {
      sum+=priceList.get(key);
      elements++;
    }
    return sum/elements;
  }
  public static int below300(HashMap<String, Integer> priceList){
    int counter = 0;
    for (String key : priceList.keySet()) {
      if(priceList.get(key)<300){
        counter++;
      }
    }
    return counter;
  }
  public static boolean exactly125(HashMap<String, Integer> priceList){
    for (String key : priceList.keySet()) {
      if(priceList.get(key)==125){
        return true;
      }
    }
    return false;
  }
  public static String cheapestProduct(HashMap<String, Integer> priceList){
    String cheapestProduct = "";
    int cheapestPrice = mostExpensiveProduct(priceList);

    for (String key : priceList.keySet()) {
      if(priceList.get(key)<=cheapestPrice){
        cheapestPrice=priceList.get(key);
        cheapestProduct=key;
      }
    }
    return cheapestProduct;
  }
}
