import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args){
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>b) {
            System.out.println(a);
        }
        else if(b>a) {
            System.out.println(b);
        }
        //the task doesn't have an instruction for equal numbers, so i wrote a plus else if statement.
        else if(a==b){
            System.out.println("equal");
        }
    }
}
