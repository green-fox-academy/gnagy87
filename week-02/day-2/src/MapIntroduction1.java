import java.util.HashMap;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> hashMap = new HashMap<>();

    System.out.println(hashMap);

    hashMap.put(97, 'a');
    hashMap.put(98, 'b');
    hashMap.put(99, 'c');
    hashMap.put(65, 'A');
    hashMap.put(66, 'B');
    hashMap.put(67, 'C');

    System.out.println(hashMap);
    System.out.println(hashMap.keySet());
    System.out.println(hashMap.values());

    hashMap.put(68, 'D');
    System.out.println(hashMap);

    int sum = 0;
    for (int i = 1; i < hashMap.size(); i++){
      sum++;
    }
    System.out.println(sum);


    System.out.println(hashMap.get(99));

    hashMap.remove(97);
    System.out.println(hashMap);

    System.out.println(hashMap.get(100));

    hashMap.clear();
    System.out.println(hashMap);

  }
}
