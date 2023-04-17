package my.task.hw14.Task2;

public class Philosopher implements Runnable {

    private final Object leftFork;

    private final Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doBehaviourOfThePhilosopher(String behaviour) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + behaviour);
        Thread.sleep(1000);
    }

    @Override
    public void run() {
            try {
                while (true) {
                    doBehaviourOfThePhilosopher("Thinking");
                    synchronized (leftFork) {
                        doBehaviourOfThePhilosopher("Took the left fork");
                        synchronized (rightFork) {
                            doBehaviourOfThePhilosopher("Took the right fork - eating");
                            doBehaviourOfThePhilosopher("Put the right fork down");
                        }
                        doBehaviourOfThePhilosopher("Put the left fork down");
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    }
}


