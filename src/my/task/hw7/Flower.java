package my.task.hw7;

public abstract class Flower {

    private String name;

    private  String color;

    private  int lifetimeInHours;

    private int price;

    public Flower(String name, String color, int lifetimeInHours, int price) {
        this.name = name;
        this.color = color;
        this.lifetimeInHours = lifetimeInHours;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getlifetimeInHours() {
        return lifetimeInHours;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setlifetimeInHours(int lifetimeInHours) {
        this.lifetimeInHours = lifetimeInHours;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
