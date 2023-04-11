package my.task.hw8.Task3;

public class Headdress {

    private String sizeHeaddress;

    private  String colorHeaddress;

    private  String nameHeaddress;

    public Headdress(String size, String color, String name) {
        this.sizeHeaddress = size;
        this.colorHeaddress = color;
        this.nameHeaddress = name;
    }

    public String getSizeHeaddress() {
        return sizeHeaddress;
    }

    public String getColorHeaddress() {
        return colorHeaddress;
    }

    public String getNameHeaddress() {
        return nameHeaddress;
    }

    @Override
    public String toString() {
        return "Headdress{" +
                "size='" + sizeHeaddress + '\'' +
                ", color='" + colorHeaddress + '\'' +
                ", name='" + nameHeaddress + '\'' +
                '}';
    }
}
