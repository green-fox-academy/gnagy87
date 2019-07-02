import java.util.ArrayList;

public class ListIntroduction1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    names.add("William");
    names.add("John");
    names.add("Amanda");

    System.out.println(names.size());
    System.out.println(names.get(2));

    for (String name: names) {
      int i = 0;
      System.out.println(name);
    }
    for (int i = 0; i < names.size(); i++){
      System.out.println(i+1 + ". " + names.get(i));
    }
    names.remove(1);
    for (int j = names.size()-1; j >= 0; j--){
      System.out.println(names.get(j));
    }
    names.clear();
    System.out.println(names);
  }
}
