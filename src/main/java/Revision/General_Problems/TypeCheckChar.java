package Revision.General_Problems;

import java.util.Scanner;

public class TypeCheckChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        caseCheck(ch);
    }

    private static void caseCheck(char ch) {
        if(ch >65 && ch <=97){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Lowercase");
        }
    }
}
