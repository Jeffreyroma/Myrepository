package my.task.hw6;

public class Task4 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        String regex ="=";
        StringBuilder text = new StringBuilder();
        text.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n");
        text.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
        text.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        String result = text.toString();
        System.out.println(result.replaceAll(regex,"равно"));


    }
}
