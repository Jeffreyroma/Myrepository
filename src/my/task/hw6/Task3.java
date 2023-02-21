package my.task.hw6;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        String text = "Hello,3333333333      bye;;;;; me a r sfsdfs 4444444444  g ";
        System.out.println(text);
        System.out.println("Result");
        replaseMinAndMaxWord(text);
    }

    private static void replaseMinAndMaxWord(String text) {
        String regex = "\\W+";
        String[] words = text.split(regex);
        String maxword = "";
        String minsword = words[0];
        String perem;
        for (String word : words) {
            if(word.length()>maxword.length()) {
                maxword = word;
            } else  if(word.length()<=minsword.length()) {
                minsword = word;
            }
        }
        perem = maxword;
        maxword = minsword;
        minsword = perem;
        System.out.println(maxword+" "+ minsword);
    }
}
