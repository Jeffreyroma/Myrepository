package my.task.hw15.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("login");
        col.add("Hell");
        col.add("Hello, my friend");
        boolean flag = col.stream().anyMatch(word -> word.equalsIgnoreCase("login"));
        System.out.println("The word 'login' is contained in the collection? " + flag);
        System.out.println("\nMax length:");
        System.out.println(col.stream().max(Comparator.comparing(String::length)).orElse(null));
        System.out.println("\nMin length:");
        System.out.println(col.stream().min(Comparator.comparing(String::length)).orElse(null));
        System.out.println("\nWords without punctuation marks and spaces:");
        List<String> onlyWords = col.stream().filter(word->word.matches("[a-zA-Z1-9]*")).collect(Collectors.toList());
        System.out.println(onlyWords);
        System.out.println("\nAll words");
        List<String> allWords = col.stream().flatMap(word -> Arrays.stream(word.split(" ")))
                .map(word->word.replaceAll("[^a-zA-Z]", "")).collect(Collectors.toList());
        System.out.println(allWords);
    }
}
