package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class CheckDecSymmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        System.out.println(checkDecSymmetric(num));
    }

    private static int checkDecSymmetric(String num) {
        if(num.length() < 4) {
            return -1;
        }
        if((num.charAt(0) == num.charAt(3)) && (num.charAt(2) == num.charAt(1))) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
