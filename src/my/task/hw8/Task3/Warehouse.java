package my.task.hw8.Task3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Searchable {

    final List<Headdress> headdresses;

    final List<Outerwear> outerwears;

    final List<Shoes> shoes;


    public Warehouse() {
        headdresses = new ArrayList<>();
        outerwears = new ArrayList<>();
        shoes = new ArrayList<>();
    }

    public void addProductHeaddress(Headdress headdress) {
        headdresses.add(headdress);
    }

    public void addProductOuterwear(Outerwear outerwear) {
        outerwears.add(outerwear);
    }

    public void addProductShoes(Shoes shoes1) {
        shoes.add(shoes1);
    }


    @Override
    public void searchColor(String color) {
        for (Headdress headdress : headdresses) {
            if (headdress.getColorHeaddress().equalsIgnoreCase(color)) {
                System.out.println(headdress + "такого цвета есть в наличии");
            } else {
                System.out.println("Головного убора такого цвета нет в наличии");
            }
        }
        for (Outerwear outerwear : outerwears) {
            if (outerwear.getColorOuterwear().equalsIgnoreCase(color)) {
                System.out.println(outerwear + "такого цвета есть в наличии");
            } else {
                System.out.println("Верхней одежды такого цвета нет в наличии");
            }
        }
        for (Shoes shoes1 : shoes) {
            if (shoes1.getColorShoes().equalsIgnoreCase(color)) {
                System.out.println(shoes1 + "такого цвета есть в наличии");
            } else {
                System.out.println("Обуви такого цвета нет");
            }
        }
    }

    @Override
    public void searchSizeOfClothes(String size) {
        for (Headdress headdress : headdresses) {
            if (headdress.getSizeHeaddress().equalsIgnoreCase(size)) {
                System.out.println(headdress + "такого размера есть в наличии");
            } else {
                System.out.println("Головного убора такого размера нет в наличии");
            }
        }
        for (Outerwear outerwear : outerwears) {
            if (outerwear.getSizeOuterwear().equalsIgnoreCase(size)) {
                System.out.println(outerwear + "такого размера есть в наличии");
            } else {
                System.out.println("Верхней одежды такого размера нет в наличии");
            }
        }
    }

    @Override
    public void searchSizeOfShoes(String size) {
        for (Shoes shoes1 : shoes) {
            if (shoes1.getSizeShoes().equalsIgnoreCase(size)) {
                System.out.println(shoes1 + "такого размера есть в наличии");
            } else {
                System.out.println("Обуви такого размера нет");
            }
        }

    }

    @Override
    public boolean buyHeaddress(Headdress headdress) {
        return headdresses.remove(headdress);
    }

    @Override
    public boolean buyOutwear(Outerwear outerwear) {
        return outerwears.remove(outerwear);
    }

    @Override
    public boolean buyShoes(Shoes shoes) {
        return this.shoes.remove(shoes);
    }

    @Override
    public void searchForASpecificHeaddress(Color color, SizeClothes size, String name) {
        for (Headdress headdress : headdresses) {
            if (headdress.getColorHeaddress().equalsIgnoreCase(String.valueOf(color))
                    && headdress.getSizeHeaddress().equalsIgnoreCase(String.valueOf(size))
                    && headdress.getNameHeaddress().equalsIgnoreCase(name)) {
                System.out.println(headdress + "такой товар есть в наличии");
            } else {
                System.out.println("Такого головного убора нет в наличии");
            }
        }
    }

    @Override
    public void searchForASpecificOutwear(Color color, SizeClothes size, String name) {
        for (Outerwear outerwear : outerwears) {
            if (outerwear.getColorOuterwear().equalsIgnoreCase(String.valueOf(color))
                    && outerwear.getSizeOuterwear().equalsIgnoreCase(String.valueOf(size))
                    && outerwear.getNameOuterwear().equalsIgnoreCase(name)) {
                System.out.println(outerwear + "такой товар есть в наличии");
            } else {
                System.out.println("Такой верхней одежды нет в наличии");
            }
        }

    }

    @Override
    public void searchForASpecificShoes(Color color, SizeShoes size, String name) {
        for (Shoes shoes1 : shoes) {
            if (shoes1.getColorShoes().equalsIgnoreCase(String.valueOf(color))
                    && shoes1.getSizeShoes().equalsIgnoreCase(String.valueOf(size))
                    && shoes1.getNameShoes().equalsIgnoreCase(name)) {
                System.out.println(shoes1 + "такая обувь есть в наличии");
            } else {
                System.out.println("Такой обуви нет в наличии");
            }
        }
    }
}
