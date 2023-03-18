package Jetbrains.Problem_Of_The_Day;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        char op = scanner.next().trim().charAt(0);
        long n2 = scanner.nextLong();

        long ans = 0;

        switch (op) {
            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1 - n2);
            case '*' -> System.out.println(n1 * n2);
            case '/' -> {
                if (n2 == 0)
                    System.out.println("Division by 0!");
                else
                    System.out.println(n1 / n2);
            }
            default -> System.out.println("Unknown operator");
        }
    }
}
