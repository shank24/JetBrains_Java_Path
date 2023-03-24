package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems;

import java.util.Scanner;

public class Middle_Of_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        System.out.println(cutMiddleString(str));
    }

    private static String cutMiddleString(String str) {
        if(str==null | str.isEmpty()){
            return str;
        }

        int length = str.length();
        int index = length/2;

        return length%2 == 0 ?
                str.substring(0, index - 1) + str.substring(index + 1):
                str.substring(0,index) + str.substring(index + 1);
    }
}
