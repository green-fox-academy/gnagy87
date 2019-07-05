import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }
  public static String bubble (int [] bubblesort){
    for(int i = 0; i < bubblesort.length-1; i++){
      for (int j = 0; j < bubblesort.length-1; j++){
        int swap = 0;
        if(bubblesort[j]>bubblesort[j+1]){
          swap = bubblesort[j];
          bubblesort[j]=bubblesort[j+1];
          bubblesort[j+1]=swap;
        }
      }
    }
    return Arrays.toString(bubblesort);
  }
  public static String advancedBubble (int [] inverseBubblesort, boolean sort){
    if (sort == true){
      for(int i = 0; i < inverseBubblesort.length-1; i++){
        for (int j = 0; j < inverseBubblesort.length-1; j++){
          int swap = 0;
          if(inverseBubblesort[j]<inverseBubblesort[j+1]){
            swap = inverseBubblesort[j];
            inverseBubblesort[j]=inverseBubblesort[j+1];
            inverseBubblesort[j+1]=swap;
          }
        }
      }
    }
    else {
      return "Ha visszafelé akarod látni a számokat, akkor adj true-t...";
    }
    return Arrays.toString(inverseBubblesort);
  }
}