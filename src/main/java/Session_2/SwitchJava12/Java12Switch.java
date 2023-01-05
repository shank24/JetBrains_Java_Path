package Session_2.SwitchJava12;

import java.util.Scanner;

public class Java12Switch {
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input A Number Lower Than 16:");
        int digitInDecimal = SCANNER.nextInt();

        char digitInHex = numericSwitchExpression(digitInDecimal);

        System.out.println(digitInHex);
    }

    private static char numericSwitchExpression(int digitInDecimal) {
        char digitInHex =
                switch (digitInDecimal){
                    case 0 -> '0';
                    case 1 -> '1';
                    case 2 -> '2';
                    case 3 -> '3';
                    case 4 -> '4';
                    case 5 -> '5';
                    case 6 -> '6';
                    case 7 -> '7';
                    case 8 -> '8';
                    case 9 -> '9';
                    case 10 -> 'A';
                    case 11 -> 'B';
                    case 12 -> 'C';
                    case 13 -> 'D';
                    case 14 -> 'E';
                    case 15 -> 'F';

                    default -> '?';
                };
        return digitInHex;
    }
}
