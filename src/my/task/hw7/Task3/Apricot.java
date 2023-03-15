package my.task.hw7.Task3;

public class Apricot extends Fruit {

    final String position = "apricot";

    public Apricot(double cost, double weight) {
        super(cost, weight);
    }

    @Override
    public void printManufacturerInfo() {
        System.out.println("Made in Uzbekistan");
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
