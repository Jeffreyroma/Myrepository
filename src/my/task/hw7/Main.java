package my.task.hw7;

import my.task.hw7.Task1.GraduateStudent;
import my.task.hw7.Task1.Student;
import my.task.hw7.Task2.Celsius;
import my.task.hw7.Task3.*;
import my.task.hw7.Task4.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1\n");
        createAndWriteArrayOfStudentAndTeacher();

        System.out.println("\nTask2\n");
        transferTo();

        System.out.println("\nTask3\n");
        createFruitsInBasket();

        System.out.println("\nTask4\n");
        createFlowerAndBouquet();

    }

    private static void createAndWriteArrayOfStudentAndTeacher() {
        Student student1 = new Student("Roma", "Makarchikov", "OOP", 1, 4.88);

        GraduateStudent graduateStudent1 = new GraduateStudent("Ivan", "Statkin", "GPG", 3, 5, "true");

        Student[] students = new Student[]{student1, graduateStudent1};
        for (Student student : students) {
            System.out.println(student.result());
        }
    }

    private static void transferTo() {
        Celsius celsius = new Celsius(0);
        celsius.transferToKelvin();
        celsius.transferToFahrenheit();
    }

    private static void createFruitsInBasket() {
        Apple apple = new Apple(4, 1.5);
        System.out.println("Apple");
        apple.printManufacturerInfo();

        Pear pear = new Pear(2, 0.5);
        System.out.println("\nPear");
        pear.printManufacturerInfo();

        Apricot apricot = new Apricot(1, 0.5);
        System.out.println("\nApricot");
        apricot.printManufacturerInfo();

        Basket basket = new Basket();
        basket.addFruitsInBasket(apple);
        basket.addFruitsInBasket(pear);
        basket.addFruitsInBasket(apricot);

        System.out.println("\nBasket of fruits:");
        basket.calculatingTheCostOfFruits();
    }

    private static void createFlowerAndBouquet() {
        Flower tulpan = new Flower("Tulpan", "white", 60, 3);

        Flower rose = new Flower("Rose", "red", 12, 10);

        Flower peony = new Flower("Peony", "yellow", 5, 20);

        Flower gypsophiles = new Flower("Gypsophiles", "blue", 40, 5);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlowersInBouquet(tulpan);
        bouquet.addFlowersInBouquet(rose);
        bouquet.addFlowersInBouquet(peony);
        bouquet.addFlowersInBouquet(gypsophiles);

        System.out.println("Our bouquet: ");
        bouquet.printNameOfFlowers();
        System.out.println();

        System.out.println("\nСolors in the bouquet:");
        bouquet.printColorOfFlowers();
        System.out.println();

        System.out.println("\nPrice of this bouquet:");
        bouquet.printPriceOfBouquet();
        System.out.println();

        System.out.println("\nLife time of this bouquet:");
        bouquet.printLifeTimeOfBouquet();
    }
}
