package my.task.hw10;

public class Animal {

    private String name;

    private Integer price;

    private String information;

    public Animal(String name, Integer price, String information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", information='" + information + '\'' +
                '}';
    }
}
