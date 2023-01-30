package Revision.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static Cinema_Room_Manager.Problems.ArraySearch.fillValuesForArr;

public class FindOddNumers {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] arrayValues = fillValuesForArr(size, scanner);
        int[] filterOddNumbers = getOddNumbers(arrayValues);
        System.out.println(Arrays.stream(filterOddNumbers).findFirst().getAsInt());
    }

    private static int[] getOddNumbers(int[] arrayValues) {
        return Arrays.stream(arrayValues).filter(x -> x%2!=0).toArray();
    }


}
