package my.task.hw15.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.println("List without '3' is : " + myList.stream().map(word -> word.replaceAll("3", "")).collect(Collectors.toList()));
        System.out.println("Sorted list  by number (ascending): " + myList.stream().sorted(Comparator.comparing(word->Integer.parseInt(word.substring(1))))
                .collect(Collectors.toList()));
        System.out.println("Sorted list by letter (descending): " + myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println("List without first and last item is : " + myList.stream().skip(1).limit(myList.size() - 1).collect(Collectors.toList()));
        System.out.println("Uppercase list is : " + myList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Count element is : " + myList.size());
    }
}
