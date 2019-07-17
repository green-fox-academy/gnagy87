package CharSequence;
 public class Gnirts implements CharSequence {
  String word;

  public Gnirts(String word){
    this.word = word;
  }

  @Override
  public int length() {
    return this.word.length();
  }

   @Override
   public char charAt(int index) {
     return this.word.charAt(this.word.length()-1-index);
   }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
