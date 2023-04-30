package Revision.Strings;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();

        getReverseViaStringBuffer(str);
        getReverseViaLoop(str);
        getReverseViaStream(str);
        getReverseViaStack(str);
    }

    private static void getReverseViaStack(String str) {
        StringUtilsMethod.nullStrCheck(str);
        // Declare a stack of type Character
        Stack<Character> stack = new Stack<>();

        char reverseString[] = new char[str.length()];

        // Traverse the String and push the character one by
        // one into the Stack [LIFO Order]

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Now Pop the Characters from the stack until it
        // becomes empty
        int i=0;
        while (!stack.isEmpty()){
            reverseString[i++] = stack.pop();
        }
        // return string object
        System.out.println(new String(reverseString));

    }


    private static void getReverseViaStream(String str) {
        StringUtilsMethod.nullStrCheck(str);
        String reverseString = Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseString);
    }

    private static void getReverseViaLoop(String str) {
        StringUtilsMethod.nullStrCheck(str);
        char ch[] = str.toCharArray();
        String newStr ="";

        for (int i = str.length()-1; i >= 0; i--) {
            newStr = newStr + ch[i];
        }
        System.out.println(newStr);
    }

    private static void getReverseViaStringBuffer(String str) {
        StringUtilsMethod.nullStrCheck(str);
        System.out.println(new StringBuffer(str).reverse());
    }
}
