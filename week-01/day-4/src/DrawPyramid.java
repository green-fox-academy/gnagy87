import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int pyramidLines = scanner.nextInt();
        int l=1;

        for(int i=1;i<=pyramidLines;i++){

            for(int j=i;j<pyramidLines;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<l;k++){
                System.out.print("*");
            }
            System.out.println("");
            l+=2;
        }
    }
}
