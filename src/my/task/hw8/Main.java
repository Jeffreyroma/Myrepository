package my.task.hw8;

import javax.management.Query;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1\n");
        Cookable dranick = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Grate potatoes and onions, then season with salt and pepper. Spread in small portions " +
                        "in a frying pan and fry until golden brown on each side.");
            }
        };

        Food food = new Food();
        food.prepare(dranick,"Dranik");

        System.out.println("\nTask 2\n");

        User user = new User("coolpevec12","12332rewq");

        User user1 = new User("romadre12","4354662523");

        User.Query query1 = user1.new Query();

        User.Query query = user.new Query();

        query.printToLog();
        query1.printToLog();

        System.out.println("\nTask 3\n");

        Cap cap = new Cap("XL","black","cap");

        cap.searchColor();
        cap.searchSize();
        cap.buyProducts();
        System.out.println();

        Pants pants = new Pants("s","red","pants");

        pants.searchColor();
        pants.searchSize();
        pants.buyProducts();
        System.out.println();

        Slippers slippers = new Slippers("l","white","slippers");

        slippers.searchColor();
        slippers.searchSize();
        slippers.buyProducts();
        System.out.println();

        Shirt shirt = new Shirt("xxxl", "blue", "shirt");

        shirt.searchColor();
        shirt.searchSize();
        shirt.buyProducts();
        System.out.println();
    }
}
