package Revision.Strings;

import java.util.Scanner;

public class StringUtilsMethod {
    static void nullStrCheck(String str) {
        if(str.length()==0 || str.isEmpty()){
            return ;
        }
    }

    static String InputString(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }
}
