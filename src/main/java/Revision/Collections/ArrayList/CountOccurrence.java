package Revision.Collections.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
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

        //Lambda Way
        charCountMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));

        //Iterator Way
        Iterator<Character> iterator = charCountMap.keySet().iterator();
        while (iterator.hasNext()){
            Character key = iterator.next();
            Integer value = charCountMap.get(key);
            System.out.println(key + " = " + value);
        }
        //Other way
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
