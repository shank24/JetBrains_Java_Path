package Revision.Strings;

import java.util.Scanner;

public class GetSpecificIndex {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        char toSearch ='e';

        System.out.println(findIndexOfChar(str,toSearch));
    }

    private static int findIndexOfChar(String value, char toSearch) {
        StringUtilsMethod.nullStrCheck(value);

        int index =0;

        for (int i=0;i<=value.length()-1;i++){
            if(toSearch==value.charAt(i)){
                index = i;
                //break;
            }
        }

        return index;
    }
}
