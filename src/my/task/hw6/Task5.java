package my.task.hw6;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        String text = "Object-oriented programming is a programming language model organized around objects rather than" +
                " \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        replacingOop(text);
    }

    private static void replacingOop(String text) {
        String regex = "Object-oriented programming";

        String[] words = text.split(regex);
        for(int i = 1; i< words.length;i++) {
            words[i] = regex + words[i];
            if(i % 2 ==0) {
                words[i] = words[i].replaceAll(regex,"OOP");
            }
        }
       System.out.println(Arrays.toString(words));
    }
}
