package Session_2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindMin {
    final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = getArray();

        findMin(array);
        findMax(array);
        findSum(array);

    }

    private static int[] getArray() {
        int range = SCANNER.nextInt();
        int [] array = new int[range];

        for (int i = 0; i < array.length; i++) {
            array[i] = SCANNER.nextInt();
        }
        return array;
    }

    private static void findSum(int[] array) {
        System.out.println(IntStream.of(array).sum());
    }

    private static void findMax(int[] array) {
        System.out.println(IntStream.of(array).max().getAsInt());
    }

    private static void findMin(int array[]) {
        System.out.println(IntStream.of(array).min().getAsInt());
    }
}
