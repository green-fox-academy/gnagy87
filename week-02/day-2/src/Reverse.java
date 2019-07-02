public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverse(reversed));
  }

  public static String reverse (String reversed){
    String result = "";
    for (int i = reversed.length(); i > 0; i--){
      result+=reversed.charAt(i-1);
    }
    return result;
  }
}
