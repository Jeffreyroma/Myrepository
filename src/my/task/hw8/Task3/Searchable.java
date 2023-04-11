package my.task.hw8.Task3;

public interface Searchable {

    void searchColor(String color);

    void searchSizeOfClothes(String size);

    void searchSizeOfShoes(String size);

    boolean buyHeaddress(Headdress headdress);

    boolean buyOutwear(Outerwear outerwear);

    boolean buyShoes(Shoes shoes);

    void searchForASpecificHeaddress(Color color, SizeClothes size, String name);

    void searchForASpecificOutwear(Color color, SizeClothes size, String name);

    void searchForASpecificShoes(Color color, SizeShoes shoes, String name);
}
