package Revision.Collections;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrence {
    public static void main(String[] args) {
        String input = "Shanky";
        charCount(input);

    }

    private static void charCount(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char [] strArray = input.toCharArray();

        for (char c : strArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
