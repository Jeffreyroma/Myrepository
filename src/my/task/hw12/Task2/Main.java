package my.task.hw12.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task2\n");
        writeAndCountTheNumberOfPunctuationMarksAndWords();
        System.out.print("\nMy text: ");
        readTextFromFile();
    }

    private static void writeAndCountTheNumberOfPunctuationMarksAndWords() {
        int countOfPunctuationMarks = 0;
        try (FileWriter writer = new FileWriter("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task2\\SomeText.txt")) {
            String text = "Hello,,, my      name is Roma. I'm studying to be a programmer....";
            String regex1 = "\\p{Punct}";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(text);
            while (matcher1.find()) {
                countOfPunctuationMarks++;
            }
            String[] word = text.split("\\s+");
            System.out.println("Count of words in text is: " + word.length);
            System.out.println("Count of punctuation marks in text is: " + countOfPunctuationMarks);
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readTextFromFile() {
        try (FileReader reader = new FileReader("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task2\\SomeText.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
