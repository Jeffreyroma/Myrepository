package my.task.hw7.Task3;

import java.util.ArrayList;
import java.util.List;

public class Basket {

   private final List<Fruit> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public void addFruitsInBasket(Fruit fruit) {
        fruits.add(fruit);
    }

    public void calculatingTheCostOfFruits() {
        double sum = 0;
        for (Fruit fruits : fruits) {
            System.out.println(fruits.getNameOfPosition() + ", cost: " + fruits.getCost());
            sum += fruits.getCost();
        }
        System.out.println("\nSum of all fruits: " + sum);
    }
}
