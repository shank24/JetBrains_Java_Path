package Jetbrains.Cinema_Room_Manager.Warmup;

import java.util.Scanner;

public class Pattern {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int range = SCANNER.nextInt();
        patternPrint(range);
        checkContinue(range);
    }

    private static void checkContinue(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private static void patternPrint(int range) {


        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.print(j + " ");
                if(i == j) {
                    break;
                }
            }
            System.out.println();
        }

    }
}
