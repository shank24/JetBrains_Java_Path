package Session_2.Warmup;

import java.util.Scanner;

public class CalculateSmallestValue {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        findNumberLessThanFactorial();
    }

    private static void findNumberLessThanFactorial() {
        long value = scanner.nextLong();
        long fact = 1;
        for (int i = 1 ; ; i++ ) {
            fact = fact * i;
            if(fact > value) {
                System.out.println(i);
                break;
            }
        }
    }
}
