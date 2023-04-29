package Jetbrains.Cinema_Room_Manager.Method;

import java.util.Scanner;

public class GCD {
    final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int val1 = SCANNER.nextInt();
        int val2 = SCANNER.nextInt();

        int value = gcd(val1, val2);
        System.out.println(value);
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
