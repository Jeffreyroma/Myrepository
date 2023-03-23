package my.task.hw12.Task3;

import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Our digits: ");
        writeFile();
        System.out.println("Read this file:");
        readFile();
    }

    private static void writeFile() {
        try (FileWriter writer = new FileWriter("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task3\\FileOfNumber")) {

            byte[] numbers = new byte[30];
            for (int i = 0; i < numbers.length; i++) {
                byte number = (byte) (Math.random() * 101);
                numbers[i] = number;
            }
            writer.write(Arrays.toString(numbers));
            writer.flush();
            double arithmeticMean = 0;
            double sumOfDigits = 0;
            for (int i = 0; i < numbers.length; i++) {
                sumOfDigits += numbers[i];
                arithmeticMean = sumOfDigits / numbers.length;
                System.out.println(numbers[i]);
            }
            System.out.println("Arithmetic mean is: "+arithmeticMean);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile() {
        try (FileReader reader = new FileReader("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task3\\FileOfNumber")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
