import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        double km = miles * 1.609344;

        System.out.println(miles + " miles is: " + km + " km");



    }
}