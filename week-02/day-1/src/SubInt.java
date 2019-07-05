import java.util.ArrayList;

public class SubInt {
  public static void main(String[] args) {
    int subInt = 66;
    int[] array = {1, 11, 23, 56, 1, 54, 566, 3453};

    System.out.println(subInt(array, subInt));
  }

  public static ArrayList<Integer> subInt(int[] array, int subInt) {

    ArrayList<Integer> result = new ArrayList<>();
    String subI = String.valueOf(subInt);
    String arrayElement = "";

    for (int i = 0; i < array.length; i++) {
      arrayElement = String.valueOf(array[i]);
      for (int j = 0; j < arrayElement.length() - subI.length() + 1; j++) {
        if (subI.equals(arrayElement.substring(j, j + subI.length()))) {
          result.add(i);
          break;
        }
      }
    }
    return result;
  }
}
