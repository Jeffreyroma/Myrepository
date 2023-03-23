package my.task.hw12.Task1;

import java.io.*;
import java.util.*;

public class Main {

    private static final List<Integer> sortArray = new ArrayList<>();

    public static void main(String[] args)  {

       writeNumbersInFiles("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task1\\In1.txt");
       writeNumbersInFiles("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task1\\in2.txt");

       readNumbersInFiles("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task1\\In1.txt");
       readNumbersInFiles("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task1\\in2.txt");

       Collections.sort(sortArray);
       try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task1\\out.txt"))) {
           for (Integer num : sortArray) {
               writer.write(num+"\n");
           }
      } catch (IOException e) {
         System.out.println(e.getMessage());
       }
    }

    public static void writeNumbersInFiles(String name) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))){
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                writer.write(random.nextInt(1, 100000) + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readNumbersInFiles(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            while (reader.ready()) {
                sortArray.add(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



