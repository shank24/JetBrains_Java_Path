package Revision.Strings;

import java.util.Scanner;

public class GetSpecificIndex {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String value = scanner.nextLine();
        char toSearch ='e';

        System.out.println(findIndexOfChar(value,toSearch));
    }

    private static int findIndexOfChar(String value, char toSearch) {
        int index =0;

        if (value.length()<=0){
            return 0;
        }

        for (int i=0;i<=value.length()-1;i++){
            if(toSearch==value.charAt(i)){
                index = i;
                //break;
            }
        }

        return index;
    }
}
