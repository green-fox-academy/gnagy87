public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String StringBuilder = "always takes no longer";

    quote = quote.substring(0,21) + StringBuilder + quote.substring(20);
    System.out.println(quote);
  }
}
