package Jetbrains.Cinema_Room_Manager.SwitchCase;

import java.util.Scanner;

public class AdaptiveSystem {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int value = SCANNER.nextInt();
        printResult(value);
    }

    private static void printResult(int value) {
        switch (value) {
            case 1:
                System.out.println("Yes!");
                break;

            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;

            default:
                System.out.println("Unknown number");
                break;
        }
    }
}
