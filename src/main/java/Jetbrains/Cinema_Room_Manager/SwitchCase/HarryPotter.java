package Jetbrains.Cinema_Room_Manager.SwitchCase;

import java.util.Scanner;

public class HarryPotter {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String houseName = SCANNER.next();
        findHouse(houseName);
    }

    private static void findHouse(String houseName) {
        switch (houseName) {
            case "gryffindor":
                System.out.println("bravery");
                break;

            case "hufflepuff":
                System.out.println("loyalty");
                break;

            case "slytherin":
                System.out.println("cunning");
                break;

            case "ravenclaw":
                System.out.println("intellect");
                break;

            default:
                System.out.println("not a valid house");
                break;
        }
    }
}
