public class Factorio {
  public static void main(String[] args) {
    int fact = 5;
    System.out.println(factorio(fact));
  }
  public static int factorio(int fact){

    int factorial = 1;

    for(int i=0;i<fact;i++){
      factorial*=(fact-i);
    }
    return factorial;
  }
}
