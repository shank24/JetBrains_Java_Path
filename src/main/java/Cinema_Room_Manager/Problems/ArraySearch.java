package Cinema_Room_Manager.Problems;

import java.util.Scanner;
import static java.util.Arrays.*;

public class ArraySearch {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] arrayValues = fillValuesForArr(size, scanner);
        boolean iselementPresent = searchElement(arrayValues,scanner);
        System.out.println(iselementPresent);
    }

    private static boolean searchElement(int[] arrayValues, Scanner scanner) {

        int elementToFind = scanner.nextInt();

        return stream(arrayValues)
                .filter(x -> x == elementToFind)
                .findAny().isPresent();
    }



    public static int[] fillValuesForArr(int len, Scanner scanner) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }
}
