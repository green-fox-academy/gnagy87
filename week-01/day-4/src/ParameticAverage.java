import java.util.Scanner;

public class ParameticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber=20;
        int sum = 0;

        for(int i=0;i<maxNumber;i++){
            int number = scanner.nextInt();
            sum+=number;
        }
        System.out.println("Sum: "+sum+", Average: "+(double)sum / maxNumber);
    }
}
