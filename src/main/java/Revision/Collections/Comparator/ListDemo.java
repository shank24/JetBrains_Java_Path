package Revision.Collections.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Kavi");
        list.add("Tavi");
        list.add("Eavi");
        list.add("Wavi");
        list.add("Qavi");
        list.add("Ravi");

        List<String> stringList = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
