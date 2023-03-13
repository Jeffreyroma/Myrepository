package my.task.hw6;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Text:");
        String text = "Hello,3333333333      bye;;;;; me a r sfsdfs 4444444444  g ";
        System.out.println(text);
        System.out.println("Result:");
        replaseMinAndMaxWord(text);
    }

    private static void replaseMinAndMaxWord(String text) {
        String regex = "\\W+";
        String[] words = text.split(regex);
        int maxLength = words[0].length();
        int minLength = words[0].length();
        String maxWord = words[0];
        String minWord = words[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxWord = words[i];
                maxIndex = i;
            } else if (words[i].length() <= minLength) {
                minLength = words[i].length();
                minIndex = i;
                minWord = words[i];
            }
        }
        words[maxIndex] = minWord;
        words[minIndex] = maxWord;
        System.out.println(Arrays.toString(words));
    }
}
