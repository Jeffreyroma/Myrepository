package my.task.hw7;

public class Apple extends Fruit {

    final String position = "apple";

    public Apple(double cost, double weight) {
        super(cost, weight);
    }

    @Override
    public void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String basket() {
        return (position);
    }
}
