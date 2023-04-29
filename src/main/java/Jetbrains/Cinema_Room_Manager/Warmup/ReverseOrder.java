package Jetbrains.Cinema_Room_Manager.Warmup;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reverseWords(scanner);
    }

    private static void reverseWords(Scanner scanner) {
        String [] array = new String[3];
        int range = array.length;

        while (range > 0) {
            array[range-1] = scanner.nextLine();
            range--;
        }

        for (int i = 0 ; i <= array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
}
