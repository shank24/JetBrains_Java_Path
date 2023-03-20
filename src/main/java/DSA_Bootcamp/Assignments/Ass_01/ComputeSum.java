package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(getSum(n1,n2));
    }

    private static int getSum(int n1, int n2) {
        return n1+n2;
    }
}
