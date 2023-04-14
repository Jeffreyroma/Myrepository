package my.task.hw15.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(12);
        col.add(23);
        col.add(1);
        col.add(0);
        System.out.println("Max number is: " + col.stream().max(Comparator.naturalOrder()).orElse(0));
        System.out.println("Min number is: " + col.stream().min(Comparator.naturalOrder()).orElse(0));
        System.out.println("Arithmetic mean of numbers is : " + col.stream().mapToDouble(Integer::doubleValue).average().orElse(0));
        System.out.println("The product of all numbers is : " + col.stream().reduce(1,(num1, num2) -> num1 * num2));
        System.out.println("The sum of all the numbers is : " + col.stream().reduce(0,Integer::sum));
        System.out.println("The sum of all digits is : " + col.stream().map(digit->Integer.toString(digit)).flatMapToInt(CharSequence::chars)
                .map(Character::getNumericValue).sum());
    }
}
