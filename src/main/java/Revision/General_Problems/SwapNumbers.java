package Revision.General_Problems;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        swapWithoutThird(n1,n2);
        //swapWithThirdVar(n1,n2);
    }

    private static void swapWithThirdVar(int n1, int n2) {
        int temp = n1;
        n2 = temp;
        n1 = temp-n2;

        System.out.println(n1 + " -- "  + n2);
    }

    private static void swapWithoutThird(int n1, int n2) {
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println(n1 + " -- "  + n2);
    }
}
