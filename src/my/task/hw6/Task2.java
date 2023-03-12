package my.task.hw6;

public class Task2 {

    public static void main(String[] args) {
        String text = "1123Hello 23have a nice 4432134day";
        theLargestNumberOfDigits(text);
    }
    private static void theLargestNumberOfDigits(String text) {
        String regex = "[^0-9]";
        String[] words = text.split(regex);
        String dlina = "";
        for (String word : words) {
            if (word.length()>dlina.length()) {
                dlina = word;
            }
        }
        System.out.println("Result: "+dlina);
    }
}
