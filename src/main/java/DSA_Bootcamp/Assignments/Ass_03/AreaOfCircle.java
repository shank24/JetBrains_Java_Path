package DSA_Bootcamp.Assignments.Ass_03;

import java.util.Scanner;

public class AreaOfCircle {
    static final double PI=3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Radius");
        double radius = input.nextDouble();
        System.out.println(getAreaOfCircle(radius));
    }

    private static double getAreaOfCircle(double rad) {
        return PI*rad*rad;
    }
}
