package DSA_Bootcamp.Assignments.Ass_02;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(checkEvenOrOdd(n));
    }

    private static String checkEvenOrOdd(int n) {
        return n%2==0?"even":"odd";
    }
}
