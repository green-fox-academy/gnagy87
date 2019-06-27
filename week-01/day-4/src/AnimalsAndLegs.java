import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner chickens = new Scanner(System.in);
        Scanner pigs = new Scanner(System.in);
        int chickenLeg = chickens.nextInt();
        int pigLeg = pigs.nextInt();

        System.out.println("Chickens and pigs have " + ((chickenLeg*2)+(pigLeg*4)) + " legs.");
    }
}
