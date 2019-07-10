import java.util.Scanner;

public class DevideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int devidedBy = scanner.nextInt();

    System.out.println(devider(number, devidedBy));

  }
  public static int devider (int number, int devidedBy){
    int result = 0;
    try {
      result = number / devidedBy;
    } catch (ArithmeticException e){
      System.out.println("fail");
    }
    return result;
  }
}
