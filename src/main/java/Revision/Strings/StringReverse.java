package Revision.Strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        getReverse(str);
        getReverseWithoutMethod(str);
        System.out.println(getReverseWithLambda(str));
    }

    private static String getReverseWithLambda(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(""));
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
        System.out.println(new StringBuffer(str).reverse());
    }
}
