package Revision.Strings;

import java.util.Scanner;

public class GetSpecificChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = StringUtilsMethod.InputString();

        int index = input.nextInt();
        getSpecificIndex(str,index);
    }

    private static void getSpecificIndex(String str, int index) {
        StringUtilsMethod.nullStrCheck(str);
        char ch[] = str.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(i == index){
                System.out.println(ch[i]);
            }
        }

    }
}
