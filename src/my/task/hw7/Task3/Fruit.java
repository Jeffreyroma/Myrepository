package my.task.hw7.Task3;

public abstract class Fruit implements Printable {

    private double cost;

    private double weight;

    public Fruit(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void printManufacturerInfo();

    public double getCost() {
        return weight * cost;
    }

    public String getNameOfPosition() {
        return ("Position of fruits");
    }
}
