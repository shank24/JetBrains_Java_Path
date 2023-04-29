package Revision.Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        getReverse(str);
        getReverseWithoutMethod(str);
        getReverseWithLambda(str);
    }

    private static void getReverseWithLambda(String str) {
    }

    private static void getReverseWithoutMethod(String str) {
        char ch[] = str.toCharArray();
        String newStr ="";

        for (int i = str.length()-1; i >= 0; i--) {
            newStr = newStr + ch[i];
        }
        System.out.println(newStr);
    }

    private static void getReverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
