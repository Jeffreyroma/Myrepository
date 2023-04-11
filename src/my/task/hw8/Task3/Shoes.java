package my.task.hw8.Task3;

public class Shoes {

    private String sizeShoes;

    private  String colorShoes;

    private  String nameShoes;

    public Shoes(String size, String color, String name) {
        this.sizeShoes = size;
        this.colorShoes = color;
        this.nameShoes = name;
    }

    public String getSizeShoes() {
        return sizeShoes;
    }

    public String getColorShoes() {
        return colorShoes;
    }

    public String getNameShoes() {
        return nameShoes;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size='" + sizeShoes + '\'' +
                ", color='" + colorShoes + '\'' +
                ", name='" + nameShoes + '\'' +
                '}';
    }
}
