package my.task.hw13.Task2;

public class ThreadMin implements Runnable {

    private final Thread thr;

    private final int[] array;

    private int minElement;

    public ThreadMin(int[] array1) {
        array = array1;
        thr = new Thread(this, "Thread1.");
        thr.start();
    }

    @Override
    public void run() {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (min>array[i]) {
                min = array[i];
            }
        }
        minElement = min;
    }

    public int getMinElement() {
        return minElement;
    }

    public Thread getThr() {
        return thr;
    }
}
