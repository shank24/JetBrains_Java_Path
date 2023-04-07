package DSA_Bootcamp.Assignments.Ass_02;

import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));

    }

    private static String isPalindrome(String str) {

        boolean flag=true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                flag=false;
            }
        }
        if(flag)
            return "String Palindrome";
        else
            return "Not Palindrome";
    }
}
