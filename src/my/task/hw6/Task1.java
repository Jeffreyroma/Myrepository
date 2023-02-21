package my.task.hw6;

public class Task1 {

    public static void main(String[] args) {
        String text = "    Hello    have  a   good    day     to  you     ";
        String regex = "\\s+";
        System.out.println("Normalized string:");
        System.out.println(text.trim().replaceAll(regex,"\s"));
    }
}