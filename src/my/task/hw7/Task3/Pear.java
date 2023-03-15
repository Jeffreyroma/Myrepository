package my.task.hw7.Task3;

public class Pear extends Fruit {

    final String position = "pear";

    public Pear(double cost, double weight) {
        super(cost, weight);
    }

    @Override
    public void printManufacturerInfo() {

        System.out.println("Made in Russia");
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String getNameOfPosition() {
        return position;
    }
}
