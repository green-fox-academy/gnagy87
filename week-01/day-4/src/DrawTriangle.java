import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int triangleLine = scanner.nextInt();
        String triangle = "*";

        for(int i=0;i<triangleLine;i++){
            System.out.println(triangle);
            triangle+="*";
        }
    }
}
