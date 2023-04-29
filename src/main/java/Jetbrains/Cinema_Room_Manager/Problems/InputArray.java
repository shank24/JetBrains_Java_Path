package Jetbrains.Cinema_Room_Manager.Problems;

import java.util.Scanner;

public class InputArray {

    final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        checkOccurence();
    }

    private static void checkOccurence() {

        int range = SCANNER.nextInt();
        int [] array = new int[range];
        System.out.println("Enter the Array");

        for (int i = 0; i < range; i++) {
            array[i] = SCANNER.nextInt();
        }
        System.out.println("Input Number to Find");
        int findNum = SCANNER.nextInt();

        int count = 0;

        for (int i = 0; i < range; i++) {
            if(array[i] == findNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
