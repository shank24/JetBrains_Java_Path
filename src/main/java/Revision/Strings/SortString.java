package Revision.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        sortStringViaSortMethod(str);
        sortStringViaStream(str);

    }

    private static void sortStringViaStream(String str) {
        StringUtilsMethod.nullStrCheck(str);
        StringBuilder sortedStr = str.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
        System.out.println(sortedStr);

    }

    private static void sortStringViaSortMethod(String str) {
        StringUtilsMethod.nullStrCheck(str);
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}
