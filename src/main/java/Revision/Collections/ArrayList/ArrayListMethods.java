package Revision.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));

        l1.removeAll(l2);
        System.out.println(l1);

        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

        long count = l3.stream().count();
        System.out.println(count);
        l3.retainAll(l4);
        System.out.println(l3);


    }
}
