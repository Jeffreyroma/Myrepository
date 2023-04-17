package my.task.hw14.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeFlow implements Runnable {

    private final int second;

    public TimeFlow(int second) {
        this.second = second;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(second);
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                System.out.println(simpleDateFormat.format(date));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
