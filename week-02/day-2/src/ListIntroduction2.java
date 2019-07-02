import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> ListA = new ArrayList<>();

    ListA.add("Apple");
    ListA.add("Avocado");
    ListA.add("Blueberries");
    ListA.add("Durian");
    ListA.add("Lychee");

    ArrayList<String> ListB = new ArrayList<>(ListA);

    boolean durian = ListA.contains("Durian");
    System.out.println(durian);

    ListB.remove(3);
    System.out.println(ListB);

    ListA.add(4,"Kiwifruit");
    System.out.println(ListA);

    System.out.println(ListA.size() + " , " + ListB.size());

    for (int i = 0; i < ListA.size(); i++){
      if (ListA.get(i).equals("Avocado")){
        System.out.println("Index of avocado in ListA: " + i);
      }
    }
    for (int j = 0; j < ListB.size(); j++){
      if (ListB.get(j).equals("Durian")){
        System.out.println("Index of Durian in ListB: " + j);
      }
    }
    System.out.println(ListA.get(2));
  }
}
