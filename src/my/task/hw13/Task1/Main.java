package my.task.hw13.Task1;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            Thread thread = new Thread(new ThreadStatus1());
            Thread thread1 = new Thread(new ThreadStatus2());
            System.out.println(thread.getState());
            thread.start();
            thread1.start();
            sleep(300);
            System.out.println(thread.getState());
            System.out.println(thread1.getState());
            Object monitor = ThreadStatus2.getMonitor();
            synchronized (monitor) {
                monitor.notify();
            }
            System.out.println(thread1.getState());
            sleep(2000);
            System.out.println(thread.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
