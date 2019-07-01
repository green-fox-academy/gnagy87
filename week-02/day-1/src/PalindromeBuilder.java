public class PalindromeBuilder {
  public static void main(String[] args) {
    String word = "greenfox";
    System.out.println(createPalindrome(word));

  }
  public static String createPalindrome (String word){
    String palindrome = "";
    for (int i = word.length()-1; i >=0; i--){
      palindrome+=word.charAt(i);
    }
    return word + palindrome;
  }
}
