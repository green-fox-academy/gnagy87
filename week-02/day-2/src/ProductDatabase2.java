import java.util.HashMap;

public class ProductDatabase2 {
  public static void main(String[] args) {
    HashMap<String, Integer> priceList = new HashMap<>();

    priceList.put("Eggs",200);
    priceList.put("Milk",200);
    priceList.put("Fish",400);
    priceList.put("Apples",150);
    priceList.put("Bread",50);
    priceList.put("Chicken",550);

    System.out.println(lessThan(priceList));
    System.out.println(moreThan(priceList));


  }
  public static String lessThan(HashMap<String, Integer> priceList){
    String lessThan201 = "";

    for (String key : priceList.keySet()) {
      if(priceList.get(key)<201){
        lessThan201 += key + " ";
      }
    }
    return lessThan201;
  }
  public static String moreThan(HashMap<String, Integer> priceList){
    String moreThan150 = "";

    for (String key : priceList.keySet()) {
      if(priceList.get(key)>150){
        moreThan150 = moreThan150 + key + " " + priceList.get(key).toString() + " ";
      }
    }
    return moreThan150;



  }
}
