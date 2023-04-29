package Jetbrains.Cinema_Room_Manager.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArraysElements {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int range = scanner.nextInt();
        int [] array = new int[range];

        for (int i = 0; i < range; i++) {
           array[i]  = scanner.nextInt();
        }

        swapFirstAndLastElements(array);
        System.out.println(Arrays.toString(array));
    }

    private static void swapFirstAndLastElements(int[] array) {
        if(array.length < 1){
            return;
        }

        int temp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = temp;
    }
}
