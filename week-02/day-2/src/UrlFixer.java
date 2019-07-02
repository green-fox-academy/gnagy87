public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.replace("bots", "odds");

    System.out.println(url.substring(0,5) + ":" + url.substring(5));
  }
}
