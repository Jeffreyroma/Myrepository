package my.task.hw7;

public class Fruit {

     private double cost;

     private double weight;

   public Fruit(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
   }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}


    public void printManufacturerInfo() {
        System.out.print("manufacturerInfo");
    }

    public double getCost() {
        return weight * cost;
    }

    public String basket() {
       return ("Position of fruits");

    }
}
