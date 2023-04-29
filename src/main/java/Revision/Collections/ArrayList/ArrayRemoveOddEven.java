package Revision.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRemoveOddEven {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) arr.clone();
        getEven(arr);
        getOdd(arr1);
    }

    private static void getOdd(ArrayList<Integer> arr) {
        arr.removeIf(x -> x%2!=0);
        System.out.println(arr);
    }

    private static void getEven(ArrayList<Integer> arr) {
        arr.removeIf(x -> x%2==0);
        System.out.println(arr);
    }
}
