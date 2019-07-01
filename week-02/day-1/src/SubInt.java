import java.util.Arrays;

public class SubInt {
  public static void main(String[] args) {
    int subInt = 1;
    int[] array = {1};
    System.out.println(subInt(array,subInt));

  }
  public static String subInt(int[] array, int subInt){

    int index = 0;
    int[] indices = new int[index];
    String si = String.valueOf(subInt);
    String arr = "";

    for(int i = 0; i < array.length; i++){
      arr=String.valueOf(array[i]);
      for(int j = 0; j < arr.length(); j++){
        if(si.equals(arr.substring(j,j+1)));
        index++;
        indices[index-1]=i;
        break;
      }
    }
    return Arrays.toString(indices);
  }
}
