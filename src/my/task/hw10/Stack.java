package my.task.hw10;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T extends Comparable<T>> {

    public static void stack() {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(13);
        numbers.push(0);
        numbers.pop();

        Integer max = numbers.peek();
        for (Integer e : numbers) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("Maximum value in the queue " + max);
    }
}
