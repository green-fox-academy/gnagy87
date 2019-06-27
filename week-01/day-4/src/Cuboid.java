public class Cuboid {
    public static void main(String[] args){
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double a = 5;
        double b = 8;
        double c = 11;

        System.out.println("Surface Area: " + 2*((a*b)+(a*c)+(b*c)));
        System.out.println("Volume: " + a*b*c);
    }
}
