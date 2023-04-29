package Revision.Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashapConversion {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        //map1.forEach((k,v) -> System.out.println(k + " = " + v));

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");


        //1. On the basis of equals method.
        System.out.println(map1.equals(map2));

        //2 Compare hashmap using same keys.
        System.out.println(map1.keySet().equals(map3.keySet()));
        //Because it is ignoring "D" key, so that's why returning true.
        //Once it finds Key=3, it stops there.

        HashMap<Integer, String> map4 = new HashMap<Integer, String>();

        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //combine the keys from both the maps: using HashSet:
        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        //Add the keyset from other map4
        combineKeys.addAll(map4.keySet());
        //Remove all the keys from map1, only uncommon of map4 is left.
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        //Compare maps by values
        HashMap<Integer, String> map5 = new HashMap<Integer, String>();

        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");


        HashMap<Integer, String> map6 = new HashMap<Integer, String>();

        map6.put(4,"A");
        map6.put(5,"B");
        map6.put(6,"C");

        HashMap<Integer, String> map7 = new HashMap<Integer, String>();

        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");

        //. 1 Duplicates are not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));

        //2. Duplicates are allowed
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));

    }

}
