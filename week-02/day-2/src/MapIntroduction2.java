import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> hashMap = new HashMap<>();

    hashMap.put("978-1-60309-452-8","A Letter to Jo");
    hashMap.put("978-1-60309-459-7","Lupus");
    hashMap.put("978-1-60309-444-3","Red Panda and Moon Bear");
    hashMap.put("978-1-60309-461-0","The Lab");

    for (String a: hashMap.keySet()){
      System.out.println(hashMap.get(a) + " (ISBN" + a + ")");
    }

    for (String deleteKey : hashMap.keySet()) {
      if (deleteKey.equals("978-1-60309-444-3")) {
        hashMap.remove(deleteKey);
        break;
      }
    }
    System.out.println(hashMap);


    for (String key : hashMap.keySet()){
      if(hashMap.get(key).equals("The Lab")){
        hashMap.remove(key);
        break;
      }
    }
    System.out.println(hashMap);

    hashMap.put("978-1-60309-450-4","They Called Us Enemy");
    hashMap.put("978-1-60309-453-5","Why Did We Trust Him?");

    System.out.println(hashMap);

    for (String c : hashMap.keySet()){
      if (c.equals("978-1-60309-453-5")){
        System.out.println(hashMap.get(c));
        break;
      }
    }
  }
}
