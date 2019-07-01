import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamond = scanner.nextInt();
        int l=1;

        for (int i=0;i<diamond;i++){
            if(i<=diamond/2) {
                for (int j = i; j < diamond / 2; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < l; k++) {
                    System.out.print("*");
                }
                l+=2;
            }
            else {
                for (int j = diamond/2; j < i; j++){
                    System.out.print(" ");
                }
                for (int k = 0;k<l-4;k++){
                    System.out.print("*");
                }
                l-=2;
            }
            System.out.println();
        }
    }
}





// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was