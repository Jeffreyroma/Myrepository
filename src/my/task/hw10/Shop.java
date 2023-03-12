package my.task.hw10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Shop {

    final List<Animal> animals;

    public Shop() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void accountingJournal(Animal animal) {
        animals.add(animal);
    }

    public void sortedByName() {
        animals.sort(new Comparator<>() {
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortedByPrice() {
        animals.sort(new Comparator<>() {
            public int compare(Animal o1, Animal o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });

    }

    public void byeAnimal(Integer price) {
        for (Animal animal : animals) {
            if (animal.getPrice().equals(price)) {
                animals.remove(animal);
                return;
            }
        }
    }

    public ArrayList<Animal> searchAnimalByPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input range of price:");
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        ArrayList<Animal> range = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getPrice() >= n && animal.getPrice() <= m ) {
                range.add(animal);
            }
        }
        return range;
    }
}
