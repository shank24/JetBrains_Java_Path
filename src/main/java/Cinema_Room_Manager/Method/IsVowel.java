package Cinema_Room_Manager.Method;

import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }

    public static boolean isVowel(char ch) {
        // write your code here
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
}
