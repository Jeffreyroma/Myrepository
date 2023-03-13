package my.task.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String text ="myemail456@gamil.com";
        String regex = "^\\w+[\\.-]*@\\w+[\\.-]*\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Email is: "+ matcher.find());
    }
}
