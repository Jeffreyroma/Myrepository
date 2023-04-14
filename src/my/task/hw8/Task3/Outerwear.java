package my.task.hw8.Task3;

public class Outerwear {

    private String sizeOuterwear;

    private  String colorOuterwear;

    private  String nameOuterwear;

    public Outerwear(String size, String color, String name) {
        this.sizeOuterwear = size;
        this.colorOuterwear = color;
        this.nameOuterwear = name;
    }

    public String getSizeOuterwear() {
        return sizeOuterwear;
    }

    public String getColorOuterwear() {
        return colorOuterwear;
    }

    public String getNameOuterwear() {
        return nameOuterwear;
    }

    @Override
    public String toString() {
        return "Outerwear{" +
                "size='" + sizeOuterwear + '\'' +
                ", color='" + colorOuterwear + '\'' +
                ", name='" + nameOuterwear + '\'' +
                '}';
    }
}
