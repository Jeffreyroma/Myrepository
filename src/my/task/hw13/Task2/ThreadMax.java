package my.task.hw13.Task2;

public class ThreadMax implements Runnable {

    private final Thread thr;

    private final int[] array;

    private int maxElement;

    public ThreadMax(int[] array1) {
        array = array1;
        thr = new Thread(this, "Thread1.");
        thr.start();
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i=1; i<array.length; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }
        maxElement = max;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public Thread getThr() {
        return thr;
    }
}
