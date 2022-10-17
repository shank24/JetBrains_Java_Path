package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int limit = scanner.nextInt();

        if (limit < minHours){
            System.out.println("Deficiency");
        }
        else if (limit > maxHours){
            System.out.println("Excess");
        }
        else {
            System.out.println("Normal");
        }
    }
}
