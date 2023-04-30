package Revision.Strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        getReverseSentence(sentence);
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
