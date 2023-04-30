package Revision.Strings;

import java.util.Arrays;

public class SortCharInString {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        sortChar(str);
    }

    private static void sortChar(String str) {
        StringUtilsMethod.nullStrCheck(str);
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
}
