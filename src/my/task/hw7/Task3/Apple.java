package my.task.hw7.Task3;

public class Apple extends Fruit {

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
    public String getNameOfPosition() {
        return "Apple";
    }
}
