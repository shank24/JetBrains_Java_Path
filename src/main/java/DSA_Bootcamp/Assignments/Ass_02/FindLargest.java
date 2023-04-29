package DSA_Bootcamp.Assignments.Ass_02;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        System.out.println(getLargest(a1,a2));
    }

    private static int getLargest(int a1, int a2) {
        return a1>a2?a1:a2;
    }
}
