public class DrawChessTable {
    public static void main(String[] args) {
        int n = 8;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=0;j<n/2;j++){
                System.out.print(" %");
            }
            System.out.println();
        }
    }
}
