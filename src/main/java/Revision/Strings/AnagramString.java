package Revision.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
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
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
