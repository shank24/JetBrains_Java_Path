package Revision.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElem {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,1));
        //LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        System.out.println(linkedHashSet);

        ArrayList<Integer> numberListWithoutDup = new ArrayList<>(linkedHashSet);
        System.out.println(numberListWithoutDup);

        //Stream
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,1,1));
        List<Integer> collect = numbers1.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
