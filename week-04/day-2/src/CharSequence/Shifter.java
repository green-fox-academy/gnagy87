package CharSequence;

public class Shifter implements CharSequence {
  String word;
  int shift;

  public Shifter(String word, int shift){
    this.word = word;
    this.shift = shift;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.word.charAt(index + this.shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
