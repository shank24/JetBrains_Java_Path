package Session_1;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println(word.replace("a","b"));
        System.out.println(word.substring(0,word.length()));

        System.out.println(word.charAt(0));
    }
}
