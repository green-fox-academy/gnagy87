import java.util.Arrays;

public class PrintAll {
  public static void main(String[] args) {
    int[] numbers = {4, 5, 6, 7};

    for(int number : numbers){
      System.out.println(number);
    }
    //Another solution:
    //System.out.println(Arrays.toString(numbers));
  }
}
