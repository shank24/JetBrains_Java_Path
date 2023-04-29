package Jetbrains.Chuck_Norris_Cipher_Encoder.Random;

import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//upper
        int b = sc.nextInt();//lower
        int c = sc.nextInt();//digits
        int n = sc.nextInt();//length
        int nLen = n-(a+b+c);

        int clock = 0;
        char password[] = new char[n];
        String passwordArr="";

        boolean flip = true;

        for (int i = 0; i < a; i++) {
            password[clock] = flip?'A':'B';
            flip=!flip;
            clock++;
        }


        for (int i = 0; i < b; i++) {
            password[clock] = flip?'a':'b';
            flip=!flip;
            clock++;
        }

        for (int i = 0; i < c; i++) {
            password[clock] = flip?'0':'1';
            flip=!flip;
            clock++;
        }

        for (int i = 0; i < nLen; i++) {
            password[clock] = flip?'9':'8';
            flip=!flip;
            clock++;
        }

        passwordArr = password.toString();
        System.out.println(passwordArr);

    }
}
