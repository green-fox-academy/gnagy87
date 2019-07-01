public class Sum {
  public static void main(String[] args) {
    int a = 5;
    System.out.println(sum(a));
  }
  public static int sum(int a){
    int sum = 0;
    for (int i=0; i <= a; i++){
      sum+=a-i;
    }
    return sum;
  }
}
