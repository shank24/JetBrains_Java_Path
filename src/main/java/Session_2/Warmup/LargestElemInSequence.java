package Session_2.Warmup;

import java.util.Scanner;

public class LargestElemInSequence {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        calculateMax();
    }

    private static void calculateMax() {
        int max = 0;
        int number = 0;
        do {
            number = scanner.nextInt();
            if (max < number) {
                max = number;
            }
        } while(number != 0);
        System.out.println(max);
    }
}
