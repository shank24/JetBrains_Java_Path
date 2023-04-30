package Revision.Strings;

import org.apache.maven.surefire.shared.lang3.StringUtils;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = StringUtilsMethod.InputString();
        char ch = input.next().charAt(0);
        getCountOfChars(str,ch);
        getCountOfCharsViaStream(str,ch);
    }

    private static void getCountOfCharsViaStream(String str, char ch) {
        StringUtilsMethod.nullStrCheck(str);
        System.out.println(str.chars().filter(alphabet -> alphabet==ch).count());
    }

    private static void getCountOfChars(String str, char ch) {
        StringUtilsMethod.nullStrCheck(str);
        System.out.println(StringUtils.countMatches(str,ch));
    }


    private static void nullStrCheck(String str) {
        if(str.length()==0 || str.isEmpty()){
            return ;
        }
    }

}
