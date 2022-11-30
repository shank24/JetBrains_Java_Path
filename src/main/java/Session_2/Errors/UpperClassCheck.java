package Session_2.Errors;

import java.util.Locale;
import java.util.Scanner;

public class UpperClassCheck {

    /* Fix this method */
    public static String toUpperCase(String str) {
/*
        if(str == null){
            return "";
        }

        else{
            return str.toUpperCase(Locale.ENGLISH);
        }
*/
        return !str.equalsIgnoreCase(null)? str.toUpperCase(Locale.ENGLISH) : "";
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        line = "null".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
