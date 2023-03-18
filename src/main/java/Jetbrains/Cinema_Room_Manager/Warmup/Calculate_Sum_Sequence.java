package Jetbrains.Cinema_Room_Manager.Warmup;

import java.util.Scanner;

public class Calculate_Sum_Sequence {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculate_sum_sequence();
    }

    private static void calculate_sum_sequence() {
        int sum = 0;
        while (scanner.hasNextInt()) {
            int elem = scanner.nextInt();
            sum += elem;
        }
        System.out.println(sum);
    }
}
