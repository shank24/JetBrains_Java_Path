package Revision.Collections;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class AddArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(11);
        arr1.add(22);

        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}
