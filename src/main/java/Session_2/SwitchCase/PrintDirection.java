package Session_2.SwitchCase;

import java.util.Scanner;

public class PrintDirection {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int value = SCANNER.nextInt();
        moveDirection(value);
    }

    private static void moveDirection(int value) {
        switch (value) {
            case 0:
                System.out.println("do not move");
                break;

            case 1:
                System.out.println("move up");
                break;

            case 2:
                System.out.println("move down");
                break;

            case 3:
                System.out.println("move left");
                break;

            case 4:
                System.out.println("move right");
                break;

            default:
                System.out.println("error!");
                break;
        }
    }
}
