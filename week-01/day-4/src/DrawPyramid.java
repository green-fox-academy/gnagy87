import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){

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
