package Jetbrains.Simple_ChatBot.WarmUp;

import java.util.Scanner;

public class RangeCheckVal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(rangeCheck(val));
    }

    private static boolean rangeCheck(int val) {
        return (val >0 && val<10);
    }
}
