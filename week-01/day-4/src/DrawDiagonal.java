import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diagonal = scanner.nextInt();

        for(int i=0;i<diagonal;i++){
            if(i==0 || i==diagonal-1){
                for(int j=0;j<diagonal;j++) {
                    System.out.print("%");
                }
            }
            else {
                System.out.print("%");
                for (int k = 1; k < diagonal - 1; k++) {
                    if (k == i) {
                        System.out.print("%");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("%");
            }
            System.out.println();
        }
    }
}
