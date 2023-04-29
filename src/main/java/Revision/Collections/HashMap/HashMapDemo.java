package Revision.Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("India","ND");
        map.put("USA","W_DC");
        map.put("China","SG");
        map.put("Japan","TK");
        map.put("Canada","OT");


        System.out.println("----1----");
        map.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));

        //Iterator over the set(pair): using entrySet()
        System.out.println("----11----");
        Iterator <Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

        System.out.println("----2----");
        //Other way around
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("----3----");
        //Iterator over the keys : using KeySet()
        Iterator<String> iterator1 = map.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator1.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
            }
        }


    }

