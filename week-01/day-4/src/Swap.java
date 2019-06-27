public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables

        //version 1:

        int a = 123;
        int b = 526;
        int c = 0;

        c=a;
        a=b;
        b=c;

        System.out.println(a);
        System.out.println(b);


        //version 2:
        /*
        int a = 123;
        int b = 526;

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println(a);
        System.out.println(b);
        */

    }
}