package Revision.Strings;

import java.util.Scanner;

public class SwappingChars {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        swappingChars(str);
    }

    private static void swappingChars(String str) {
        StringUtilsMethod.nullStrCheck(str);
        char ch[] = str.toCharArray();
        
        for (int i = 0; i < ch.length-1;i += 2){
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }

        System.out.println(new String(ch));
    }
}
