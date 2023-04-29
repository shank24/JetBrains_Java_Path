package Revision.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class SearchInArray {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size=scanner.nextInt();
        int [] arrayValues = fillValues(size, scanner);
        boolean isElemPresent = findElement(arrayValues,scanner);
        System.out.println(isElemPresent);
    }

    private static boolean findElement(int[] arrayValues, Scanner scanner) {
        int valueToSearch = scanner.nextInt();

        return stream(arrayValues).filter(x -> x == valueToSearch)
                .findAny().isPresent();
    }

    private static int[] fillValues(int size, Scanner scanner) {

        int [] result = new int[size];

        for(int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }
}
