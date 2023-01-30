package Revision.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("Iterator");
        //Iterator
        Iterator<Integer> e = arr.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

        System.out.println("Lambda");
        arr.stream().forEach(element -> System.out.println(element));

        System.out.println("Filter");
        arr.stream().filter(x-> x%2==0).forEach(element -> System.out.println(element));
    }
}
