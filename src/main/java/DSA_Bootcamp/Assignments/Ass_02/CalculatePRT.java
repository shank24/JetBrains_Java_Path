package DSA_Bootcamp.Assignments.Ass_02;

import java.util.Scanner;

public class CalculatePRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principal = in.nextInt();
        int rate = in.nextInt();
        int time = in.nextInt();
        System.out.println(principal*rate*time);

    }
}
