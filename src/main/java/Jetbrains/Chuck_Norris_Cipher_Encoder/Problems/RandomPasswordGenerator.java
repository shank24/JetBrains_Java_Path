package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems;

import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String output = "";
        int sum = a + b + c;

        if (a != 0) {
            if (a % 2 == 0) {
                for (int i = 0; i < a / 2; i++) {
                    output += "A" + "B";
                }
            } else {
                for (int i = 0; i <= a / 2; i++) {
                    output += "A" + "B" + "C";
                }
                output = output.replace(output.substring(output.length()-1), "");
                output = output.substring(0, output.length() - 1);
            }
        }

        if (b != 0) {
            if (b % 2 == 0) {
                for (int i = 0; i < b / 2; i++) {
                    output += "a" + "b";
                }
            } else {
                for (int i = 0; i <= b / 2; i++) {
                    output += "a" + "b" + "c";
                }
                output = output.replace(output.substring(output.length()-1), "");
                output = output.substring(0, output.length() - 1);
            }
        }

        if (c != 0) {
            if (c % 2 == 0) {
                for (int i = 0; i < c / 2; i++) {
                    output += "1" + "2";
                }
            } else {
                for (int i = 0; i <= c / 2; i++) {
                    output += "1" + "2" + "3";
                }
                output = output.replace(output.substring(output.length()-1), "");
                output = output.substring(0, output.length() - 1);
            }
        }

        int remainder = n - sum;
        if (remainder != 0) {
            if (remainder % 2 == 0) {
                for (int i = 0; i < remainder / 2; i++) {
                    output += "C" + "D";
                }
            } else {
                for (int i = 0; i <= remainder / 2; i++) {
                    output += "C" + "D" + "E";
                }
                output = output.replace(output.substring(output.length()-1), "");
                output = output.substring(0, output.length() - 1);
            }
        }

        System.out.println(output);

    }

}
