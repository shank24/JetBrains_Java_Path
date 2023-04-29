package Jetbrains.Simple_ChatBot.WarmUp;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.next();
        String text2 = scanner.next();
        String text3 = scanner.next();
        String text4 = scanner.next();


        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.print(text4);


        scanner.close();

    }
}
