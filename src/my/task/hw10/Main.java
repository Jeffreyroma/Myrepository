package my.task.hw10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1\n");

        List<String> list1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        List<String> list2 = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6"));

        System.out.println("intersection " + Operations.intersection(list1, list2));
        System.out.println("union " + Operations.union(list1, list2));

        System.out.println("\nTask2\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String text = scanner.nextLine();

        Map<String, Integer> text1 = new HashMap<>();
        for (String word : text.split("\\s+")) {
           word= word.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я]", "");
            text1.put(word, text1.getOrDefault(word, 0) + 1);
        }
        System.out.println(text1);

        System.out.println("\nTask3\n");
        Stack.stack();

        System.out.println("\nTask4\n");

        Animal cat = new Animal("Barsik", 100, "A black Siamese cat");
        Animal dog = new Animal("Bobik", 250, "Tricolor husky dog");
        Animal parrot = new Animal("Aesha", 500, "Yellow Budgie");

        Shop shop = new Shop();
        shop.accountingJournal(cat);
        shop.accountingJournal(dog);
        shop.accountingJournal(parrot);

        System.out.println("The original store "+shop.getAnimals());

        shop.sortedByName();
        System.out.println("Shop after sorted by name "+shop.getAnimals());

        shop.sortedByPrice();
        System.out.println("Shop after sorted by price"+shop.getAnimals());

        shop.byeAnimal(100);
        System.out.println("Shop after buying an animal at a certain price "+shop.getAnimals());

        System.out.println("All animals in a given range");
        System.out.println(shop.searchAnimalByPrice());
    }
}
