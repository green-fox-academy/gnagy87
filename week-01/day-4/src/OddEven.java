import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + " is odd.");
        }
    }
}
