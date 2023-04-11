package my.task.hw8;

import my.task.hw8.Task1.Cookable;
import my.task.hw8.Task1.Food;
import my.task.hw8.Task2.User;
import my.task.hw8.Task3.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1\n");

        Cookable dranick = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Prepare: " + str);
            }
        };

        Food food = new Food();
        food.prepare(dranick, "Grate potatoes and onions, then season with salt and pepper. Spread in small portions " +
                "in a frying pan and fry until golden brown on each side.");

        System.out.println("\nTask 2\n");

        User user = new User("coolpevec12", "12332rewq");

        User user1 = new User("romadre12", "4354662523");

        User.Query query1 = user1.new Query();

        User.Query query = user.new Query();

        query.printToLog();
        query1.printToLog();

        System.out.println("\nTask 3\n");

        Shoes shoes = new Shoes("size_39", "white", "sneakers");

        Shoes shoes1 = new Shoes("size_40", "yellow", "sneakers");

        Outerwear outerwear = new Outerwear("xl", "blue", "jacket");

        Outerwear outerwear1 = new Outerwear("xxl", "red", "jacket");

        Headdress headdress = new Headdress("s", "black", "cap");

        Headdress headdress1 = new Headdress("s", "red", "cap");

        Warehouse warehouse = new Warehouse();
        warehouse.addProductHeaddress(headdress);
        warehouse.addProductOuterwear(outerwear);
        warehouse.addProductShoes(shoes);
        warehouse.addProductHeaddress(headdress1);
        warehouse.addProductShoes(shoes1);
        warehouse.addProductOuterwear(outerwear1);

        System.out.println("поиск по цвету");
        warehouse.searchColor("black");
        System.out.println("\nПоиск одежды по размеру");
        warehouse.searchSizeOfClothes("xl");
        System.out.println("\nПоиск обуви по размеру");
        warehouse.searchSizeOfShoes("size_39");

        System.out.println("\nПокупка головных уборово");
        boolean buyHeaddress = warehouse.buyHeaddress(headdress);
        if (buyHeaddress) {
            System.out.println("Вы успешно приобрели " + headdress);
        } else {
            System.out.println("Данного товара нет в наличии");
        }

        System.out.println("\nПокупка верхней одежды");
        boolean buyOutwear = warehouse.buyOutwear(outerwear);
        if (buyOutwear) {
            System.out.println("Вы успешно приобрели " + outerwear);
        } else {
            System.out.println("Данного товара нет в наличии");
        }

        System.out.println("\nПокупка обуви");
        boolean buyShoes = warehouse.buyShoes(shoes);
        if (buyShoes) {
            System.out.println("Вы успешно приобрели " + headdress);
        } else {
            System.out.println("Данного товара нет в наличии");
        }

        System.out.println("\nПоиск определенного Головного убора");
        warehouse.searchForASpecificHeaddress(Color.RED, SizeClothes.S, "cap");

        System.out.println("\nПоиск определенной верзней одежды");
        warehouse.searchForASpecificOutwear(Color.RED, SizeClothes.S, "jacket");

        System.out.println("\nПоиск определенной обуви");
        warehouse.searchForASpecificShoes(Color.WHITE, SizeShoes.SIZE_40, "slippers");
    }
}
