package Jetbrains.Cinema_Room_Manager.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class GetSumOfRange {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int startPosition = scanner.nextInt();
        int endPosition = scanner.nextInt();

        int[] arrayValues = fillValuesForArr(startPosition, endPosition);
        int sum = getSumInRange(arrayValues);
        System.out.println(sum);

    }

    private static int getSumInRange(int[] arrayValues) {
        return Arrays.stream(arrayValues).reduce(0, Integer::sum);
    }


    public static int[] fillValuesForArr(int startPosition, int endPosition) {

        int[] result = new int[endPosition-startPosition+1];
        for (int i = startPosition; i <= endPosition; i++) {
            result[i-startPosition] = i;
        }
        return result;
    }
}
