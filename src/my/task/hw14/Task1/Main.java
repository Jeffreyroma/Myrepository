package my.task.hw14.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input time interval:");
        int sec = scanner.nextInt();
        TimeFlow timeFlow = new TimeFlow(sec);
        timeFlow.run();




    }
}
