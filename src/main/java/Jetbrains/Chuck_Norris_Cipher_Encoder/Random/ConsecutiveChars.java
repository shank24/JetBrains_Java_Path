package Jetbrains.Chuck_Norris_Cipher_Encoder.Random;

import java.util.Arrays;

public class ConsecutiveChars {
    public static void main(String args[])
    {
        String str = "dcef";

        if(check(str.toCharArray())==true)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static boolean check(char s[]) {

        // Get the length of the string
        int leng = s.length;

        // sort the given string
        Arrays.sort(s);

        for (int i = 1; i < leng; i++) {
            //If are not consecutive
            if(s[i]-s[i-1] != 1)
                return false;
        }
        return true;
    }

}
