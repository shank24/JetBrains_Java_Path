package Jetbrains.Cinema_Room_Manager.SwitchCase;

import java.util.Scanner;

public class PrintShapes {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int value = SCANNER.nextInt();
        printShapes(value);
    }

    private static void printShapes(int value) {
        switch (value) {
            case 0:
                System.out.println("do not move");
                break;

            case 1:
                System.out.println("You have chosen a square");
                break;

            case 2:
                System.out.println("You have chosen a circle");
                break;

            case 3:
                System.out.println("You have chosen a triangle");
                break;

            case 4:
                System.out.println("You have chosen a rhombus");
                break;

            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}
