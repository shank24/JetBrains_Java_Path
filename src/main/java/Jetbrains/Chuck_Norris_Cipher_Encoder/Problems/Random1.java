package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        int length = 10;
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String finalString = cap_letter + small_letter +
                numbers;

        Random random = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++)
        {
            password[i] =
                    finalString.charAt(random.nextInt(finalString.length()));

        }
        System.out.println(password);
    }
}
