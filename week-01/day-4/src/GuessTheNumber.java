import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int storedNumber = 5;

        for(;;) {
            int number = scanner.nextInt();
            if (number < storedNumber) {
                System.out.println("The stored number is higher");
            } else if (storedNumber < number) {
                System.out.println("The stored number is lower");
            } else if (storedNumber == number) {
                System.out.println("You found the number");
                break;
            }
        }
    }
}
