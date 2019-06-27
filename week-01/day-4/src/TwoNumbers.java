public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22;
        int b = 13;
        // Print the result of 13 added to 22
        System.out.println(a+b);
        // Print the result of 13 substracted from 22
        System.out.println(b-a);
        // Print the result of 22 multiplied by 13
        System.out.println(a*b);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        double c=a/b;
        System.out.println(22./13);
        // Print the integer part of 22 divided by 13
        int d=a/b;
        System.out.println(d);
        // Print the remainder of 22 divided by 13
        System.out.println(a%b);
    }
}