import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();

        for (int i=0;i<square;i++){
            if (i==0 || i==square-1){
                for(int j=0;j<square;j++){
                    System.out.print("%");
                }
            }
            else {
                System.out.print("%");
                for (int k=0;k<square-2;k++){
                    System.out.print(" ");
                }
                System.out.print("%");
            }
            System.out.println();
        }
    }
}
