package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.HashMap;
import java.util.Scanner;

public class CheckURLSol {
    public static void main(String[] args) {
        // put your code here
        String[] url = new Scanner(System.in).nextLine().split("\\?")[1].split("&");
        String password = "";
        String emptyString = "";

        for (String parameter : url) {
            String[] s = parameter.split("=");

            //Constructing string object, in case of "cookie", value empty.
            if (s.length == 1) {
                s = new String[] {s[0], "not found"};
            }

            System.out.println(s[0] + " : " + s[1]);

            if ("pass".equals(s[0])) {
                password = s[1];
            }
        }

        if (!emptyString.equals(password)) {
            System.out.println("password : " + password);
        }
    }
}
