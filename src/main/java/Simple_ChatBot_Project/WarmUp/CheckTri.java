package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class CheckTri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        checkTri(sideA, sideB, sideC);
    }

    private static void checkTri(int sideA, int sideB, int sideC) {
        if((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
