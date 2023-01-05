package Session_2.Problems;

import java.util.Scanner;

public class Sequence_Prob {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        findDivisbleBy4();
    }

    private static void findDivisbleBy4() {
        int range = SCANNER.nextInt();
        int max = 0;
        while (range > 0) {
            int n = SCANNER.nextInt();
            if (n%4 == 0 && n > max) {
                max = n;
            }
            range--;
        }
        System.out.println(max);
    }
}
