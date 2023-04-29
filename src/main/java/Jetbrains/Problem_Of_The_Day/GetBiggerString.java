package Jetbrains.Problem_Of_The_Day;

import java.util.Scanner;

public class GetBiggerString {
    public static void main(String[] args) {
        String[] sentence = new Scanner(System.in).nextLine().split(" ");
        getBiggerString(sentence);
    }

    private static void getBiggerString(String[] sentence) {
        int len=0;
        int max=0, pos=0;
        String value="";
        for (int i = 0; i < sentence.length; i++){
            len = sentence[i].length();
            if(max<len){
                max=len;
                pos++;
                value = sentence[i];
            }
        }
        System.out.println(len + " = " + pos  + " = " + value);
    }
}
