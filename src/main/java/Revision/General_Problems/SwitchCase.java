package Revision.General_Problems;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String fruit = scanner.next().toLowerCase().trim();
        System.out.println("Enter a game name: ");
        String game = scanner.next().toLowerCase().trim();
        System.out.println("Enter a number between 1 to 7: ");
        int day = scanner.nextInt();


        fruitCases(fruit);
        //Optimized Way
        gameCases(game);
        dayCases(day);
    }

    private static void dayCases(int day) {
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }

    private static void gameCases(String game) {
        System.out.println(switch (game) {
            case "cricket" -> "England";
            case "hockey" -> "India";
            case "icehockey" -> "Canada";
            default -> "Invalid";
        });
    }

    private static void fruitCases(String fruit) {
        switch (fruit) {
            case "mango" -> System.out.println("King");
            case "apple" -> System.out.println("Red");
            case "banana" -> System.out.println("Yellow");
            case "strawberry" -> System.out.println("Pink");
            default -> System.out.println("Invalid");
        }
    }
}
