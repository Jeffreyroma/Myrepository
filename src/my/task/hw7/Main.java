package my.task.hw7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1\n");
        arrayOfStudentAndTeacher();

        System.out.println("\nTask2\n");
        transferTo();

        System.out.println("\nTask3\n");
        fruitsInBasket();

        System.out.println("\nTask4\n");
        flower();

    }

    private static void arrayOfStudentAndTeacher() {
        Student student1 = new Student("Roma", "Makarchikov", "OOP", 1, 4.88);

        Teacher teacher1 = new Teacher("Ivan", "Statkin", "GPG", 3, 5, "true");

        Student[] students = new Student[]{student1, teacher1};
        for (Student student : students) {
            System.out.println(student.result());
        }
    }

    private static void transferTo() {
        Celsius celsius = new Celsius(0);
        celsius.transferToKelvin();
        celsius.transferToFahrenheit();
    }

    private static void fruitsInBasket() {
        Apple apple = new Apple(4, 1.5);
        System.out.println("Apple");
        apple.printManufacturerInfo();

        Pear pear = new Pear(2, 0.5);
        System.out.println("\nPear");
        pear.printManufacturerInfo();

        Apricot apricot = new Apricot(1, 0.5);
        System.out.println("\nApricot");
        apricot.printManufacturerInfo();

        Fruit[] basket = new Fruit[]{apple, pear, apricot};
        System.out.println("\nBasket of fruits:");
        double sum = 0;
        for (Fruit fruits : basket) {
            System.out.println(fruits.basket() + ", cost: " + fruits.getCost());
            sum = sum + fruits.getCost();
        }
        System.out.println("\nSum of all fruits: " + sum);
    }

    private static void flower() {
        Flower tulpan = new Tulpan("Tulpan","white",60,3);

        Flower rose = new Rose("Rose","red",12,10);

        Flower peony = new Peony("Peony","yellow",5,20);

        Flower gypsophiles = new Gypsophiles("Gypsophiles","blue",40,5);

        String[] bouquet = new String[]{tulpan.getName(), rose.getName(), peony.getName(), gypsophiles.getName()};
        System.out.println("Our bouquet: ");
        for (String flower : bouquet) {
            System.out.print(flower+ " ");
        }

        System.out.println();
        String[] colorInBouquet = new String[]{tulpan.getColor(), rose.getColor(), peony.getColor(), gypsophiles.getColor()};
        System.out.println("\nСolors in the bouquet:");
        for (String color : colorInBouquet) {
            System.out.print(color+ " ");
        }

        System.out.println();
        int[] priceOfBouquet = new int[]{tulpan.getPrice(), rose.getPrice(), peony.getPrice(), gypsophiles.getPrice()};
        System.out.println("\nPrice of this bouquet:");
        int priceOfAllFlowers = 0;
        for (int price : priceOfBouquet) {
            priceOfAllFlowers = priceOfAllFlowers + price;
        }
        System.out.print(priceOfAllFlowers);

        System.out.println();
        int[] lifeTimeOfBouquet = new int[]{tulpan.getlifetimeInHours(),rose.getlifetimeInHours(),peony.getlifetimeInHours(),gypsophiles.getlifetimeInHours()};
        System.out.println("\nPrice of this bouquet:");
        int lifTimeOfAllFlowers = 0;
        for (int time : lifeTimeOfBouquet) {
            lifTimeOfAllFlowers = lifTimeOfAllFlowers + time;
        }
        System.out.print(lifTimeOfAllFlowers);
    }
}
