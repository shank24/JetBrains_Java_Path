package Jetbrains.Cinema_Room_Manager.Problems;

import java.util.Arrays;
import java.util.Scanner;

import static Jetbrains.Cinema_Room_Manager.Problems.ArraySearch.fillValuesForArr;

public class ArrayStreamOperations {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int size = scanner.nextInt();
        int[] arrayValues = fillValuesForArr(size, scanner);
        int[] filterOddNumbers = getOddNumbers(arrayValues);

        //Find Sum of Odd Numbers In An Array.
        System.out.println(Arrays.stream(Arrays.stream(filterOddNumbers).toArray()).sum());
    }

    private static int[] getOddNumbers(int[] arrayValues) {
        return Arrays.stream(arrayValues).filter(x -> x % 2!=0).toArray();
    }

}
