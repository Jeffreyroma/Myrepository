package my.task.hw8;

public abstract class Products implements Searchable {

    private String size;

    private  String color;

    private String name;

    public Products(String size, String color, String name) {
        this.size = size;
        this.color = color;
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public void searchColor() {
        if (getColor().equalsIgnoreCase(Color.BLACK.toString())) {
            System.out.println("The "+ getName()+" product is black color in stock");
        } else if (getColor().equalsIgnoreCase(Color.WHITE.toString())) {
            System.out.println("The " +getName()+ " product is white color in stock");
        } else if (getColor().equalsIgnoreCase(Color.BLUE.toString())) {
            System.out.println("The " +getName()+ " product is blue color in stock");
        } else if (getColor().equalsIgnoreCase(Color.RED.toString())) {
            System.out.println("The " +getName()+ " product is red color in stock");
        } else {
            System.out.println("The " +getName()+ " product of this color is not available");
        }

    }

    @Override
    public void searchSize() {
        if (getSize().equalsIgnoreCase(Size.S.toString())) {
            System.out.println("The " +getName()+ " product is S size in stock");
        } else if (getSize().equalsIgnoreCase(Size.XS.toString())) {
            System.out.println("The " +getName()+ " product is XS size in stock");
        } else if (getSize().equalsIgnoreCase(Size.M.toString())) {
            System.out.println("The " +getName()+ " product is M size in stock");
        } else if (getSize().equalsIgnoreCase(Size.L.toString())) {
            System.out.println("The " +getName()+ " product is L size in stock");
        } else if (getSize().equalsIgnoreCase(Size.XL.toString())) {
            System.out.println("The " +getName()+ " product is XL size in stock");
        } else if (getSize().equalsIgnoreCase(Size.XXL.toString())) {
            System.out.println("The " +getName()+ " product is XXL size in stock");
        } else if (getSize().equalsIgnoreCase(Size.XXXL.toString())) {
            System.out.println("The " +getName()+ " product is XXXL size in stock");
        } else {
            System.out.println("The " +getName()+ " product of this size is not available");
        }
    }

    @Override
    public void buyProducts() {
        System.out.println("Product "+getName()+", size "+getSize()+", colors "+getColor()+" added to cart!");
    }
}
