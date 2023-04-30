package Revision.Strings;

import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        getReverseSentence(str);
    }


    private static void getReverseSentence(String sentence) {
        StringUtilsMethod.nullStrCheck(sentence);

        String words[] = sentence.split(" ");
        String newStr = "";

        for (int i = words.length-1; i >=0 ; i--) {
            newStr = newStr + words[i] + " ";
        }
        System.out.println(newStr);
    }
}
