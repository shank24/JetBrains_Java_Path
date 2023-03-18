package Revision.General_Problems;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next().toLowerCase().trim();
        String game = scanner.next().toLowerCase().trim();


        fruitCase(fruit);

        //Optimized Way
        gameCases(game);
    }

    private static void gameCases(String game) {
        System.out.println(switch (game) {
            case "cricket" -> "England";
            case "hockey" -> "India";
            case "icehockey" -> "Canada";
            default -> "Invalid";
        });
    }

    private static void fruitCase(String fruit) {
        switch (fruit) {
            case "mango" -> System.out.println("King");
            case "apple" -> System.out.println("Red");
            case "banana" -> System.out.println("Yellow");
            case "strawberry" -> System.out.println("Pink");
            default -> System.out.println("Invalid");
        }
    }
}
