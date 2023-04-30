package Revision.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        sortStringViaSortMethod(str);
        sortStringViaStream(str);

    }

    private static void sortStringViaStream(String str) {
        nullStrCheck(str);
        StringBuilder sortedStr = str.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
        System.out.println(sortedStr);

    }

    private static void nullStrCheck(String str) {
        if(str.length()==0 || str.isEmpty()){
            return ;
        }
    }

    private static void sortStringViaSortMethod(String str) {
        nullStrCheck(str);
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}
