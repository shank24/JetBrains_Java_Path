package Jetbrains.Cinema_Room_Manager.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GetFirstAndLastElements {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array in a line ");
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    private static int[] getFirstAndLast(int[] array) {
        return new int[] {array[0], array[array.length-1]};
    }
}
