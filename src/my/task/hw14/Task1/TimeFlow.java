package my.task.hw14.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeFlow implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (true) {
            try {
                Thread.sleep(n);
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                System.out.println(simpleDateFormat.format(date));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
