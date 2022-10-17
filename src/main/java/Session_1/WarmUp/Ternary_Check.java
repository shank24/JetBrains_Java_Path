package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class Ternary_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean b1 = scanner.hasNextBoolean();
        boolean b2 = scanner.hasNextBoolean();
        boolean b3 = scanner.hasNextBoolean();


        int result = (b1 && b2) ? 10 : (b2 || b3) ? 20 : 30;
        System.out.println(result);
    }
}
