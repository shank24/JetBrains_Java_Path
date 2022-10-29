package Session_2.Problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static Session_2.Problems.ArraySearch.fillValuesForArr;

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
