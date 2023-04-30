package Revision.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = StringUtilsMethod.InputString();
        String str2 = StringUtilsMethod.InputString();
        checkAnagram(str1,str2);
        
    }

    private static void checkAnagram(String str1, String str2) {
        if(sortStrings(str1).equals(sortStrings(str2))){
            System.out.println("Anagram String");
        }
        else{
            System.out.println("Not An Anagram String");
        }
    }

    private static String sortStrings(String str1) {
        StringUtilsMethod.nullStrCheck(str1);
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    private static StringBuilder sortStringsViaStream(String str1) {
        StringUtilsMethod.nullStrCheck(str1);
        StringBuilder collect = str1.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
        System.out.println(collect);
        return collect;

    }
}
