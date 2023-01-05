package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class IfElseCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        checkGroup(count);
    }

    private static void checkGroup(int count) {

        if (count < 1) {
            System.out.println("no army");
        }
        else if (count >= 1 && count <= 19) {
            System.out.println("pack");
        }
        else if (count > 19 && count <= 249) {
            System.out.println("throng");
        }
        else if (count > 249 && count <= 999) {
            System.out.println("zounds");
        }
        else {
            System.out.println("legion");
        }
    }
}
