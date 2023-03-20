package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        getTable(num);

    }

    private static void getTable(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num*i);
        }
    }
}
