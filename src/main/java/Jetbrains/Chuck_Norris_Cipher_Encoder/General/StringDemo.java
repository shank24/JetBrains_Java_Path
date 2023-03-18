package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.General;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        char[] ch= {'A','B','C','D','E','F'};
        String stringFromChars = String.valueOf(ch);
        System.out.println(stringFromChars);

        char[] charsFromString = stringFromChars.toCharArray();

        String theSameString = new String(charsFromString);
        System.out.println(theSameString);

        String text = "Hello";
        String[] parts = text.split("");
        extracted(parts);

        //Removing Duplicate
        removingDuplicate(parts);

        //Split With Strings
        String sentence = "a long text";
        String[] words = sentence.split(" "); // {"a", "long", "text"}
        extracted(words);

        //Splitting Number
        String number = "+1-213-345-6789";
        String[] values = number.split("-");
        extracted(values);

        String text1 = "That's one small step for a man, one giant leap for mankind.";
        String[] parts1 = text1.split(",");
        extracted(parts1);

        String text2 = "I'm gonna be a programmer";
        String[] parts2 = text2.split(" gonna be ");
        extracted(parts2);
    }

    private static void removingDuplicate(String[] parts) {
        List<String> collect = Arrays.stream(parts).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void extracted(String[] words) {
        for(String c : words){
            System.out.println(c);
        }
    }
}
