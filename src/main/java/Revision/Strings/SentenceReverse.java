package Revision.Strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        getReverseSentence(sentence);
        getReverseStream(sentence);
    }

    private static String getReverseStream(String sentence) {
        return Stream.of(sentence)
                .map(word -> new String(word).split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    private static void getReverseSentence(String sentence) {
        if(sentence.length()==0 || sentence.isEmpty()){
            return ;
        }

        String words[] = sentence.split(" ");
        String newStr = "";

        for (int i = words.length-1; i >=0 ; i--) {
            newStr = newStr + words[i] + " ";
        }
        System.out.println(newStr);
    }
}
