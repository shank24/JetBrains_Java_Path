package Jetbrains.Chuck_Norris_Cipher_Encoder.General;

import java.util.Scanner;

public class PrintTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }

    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    public static void print(String strArg, int value) {
        System.out.println("print(\""+strArg+"\", " + value + ")");
    }


}
