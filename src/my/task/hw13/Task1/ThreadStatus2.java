package my.task.hw13.Task1;

public class ThreadStatus2 implements Runnable {

    public static Object getMonitor() {
        return monitor;
    }

    private static final Object monitor = new Object();

    @Override
    public void run() {
        try {
            synchronized (monitor) {
                monitor.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
