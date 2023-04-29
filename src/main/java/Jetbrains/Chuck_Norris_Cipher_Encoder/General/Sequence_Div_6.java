package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.General;

import java.util.Scanner;

public class Sequence_Div_6 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        calSumOfNumDivBy6();
    }

    private static void calSumOfNumDivBy6() {
        int range = SCANNER.nextInt();
        int sum = 0;
        while (range > 0) {
            int n = SCANNER.nextInt();
            if (n%6 == 0) {
                sum = sum + n;
            }
            range--;
        }
        System.out.println(sum);
    }
}
