package my.task.hw9;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1\n");

        Calculator.sum(2, 3);
        Calculator.multiply(2, 3);
        Calculator.divide(2, 3);
        Calculator.subtraction(3, 3);

        System.out.println("\nTask2\n");

        Pair<Integer, String> pair = new Pair<>(1, "s");

        System.out.println("Meaning 1: " + pair.getMeaning1());
        System.out.println("Meaning 2: " + pair.getMeaning2());

        Pair<String,Integer> pair1 = pair.swap();
        System.out.println(pair1);

        pair.setMeaning1(4);
        pair.setMeaning2("dfdf");
        System.out.println(pair);
    }
}
