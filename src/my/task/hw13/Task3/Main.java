package my.task.hw13.Task3;

public class Main {

    public static void main(String[] args) {

        Value value = new Value();

        Thread thread1 = new Thread(value);

        Thread thread2 = new Thread(value);

        Thread thread3 = new Thread(value);

        try {
            thread1.start();
            thread2.start();
            thread3.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
