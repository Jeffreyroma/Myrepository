package my.task.hw13.Task3;

public class Value implements Runnable {

    private int num = 1;

    public int getNum() {
        return num;
    }

    @Override
    public synchronized void run() {
        System.out.println("The thread has started working");

        for (int i = 0; i < 100; i++) {
            System.out.println(getNum());
        }
        num++;
    }
}
