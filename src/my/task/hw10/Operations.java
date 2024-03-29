package my.task.hw10;

import java.util.*;

public class Operations<T> {


    public static <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T element : list1) {
            if (list2.contains(element)) {
                list.add(element);
            }
        }
        return list;
    }
}
