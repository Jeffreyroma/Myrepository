package my.task.hw12.Task4;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Galina", "Fedotivna", 45);
        Person person2 = new Person("Vladimir", "Feadosivich", 38);
        Person person3 = new Person("Roman", "Ainokyrov", 12);
        Person person4 = new Person("Maxim", "Kozlov", 23);
        Person person5 = new Person("Artem", "Mikevich", 78);

        ArrayList<Person> listOfPeople1 = new ArrayList<>();
        listOfPeople1.add(person1);
        listOfPeople1.add(person2);
        listOfPeople1.add(person3);
        listOfPeople1.add(person4);
        listOfPeople1.add(person5);

        serializePerson(listOfPeople1);

        deserializePerson(listOfPeople1);

        System.out.println("Object of person:");
        for (Person person : listOfPeople1) {
            System.out.print(person + "\n");
        }
        System.out.println("\nSorting by name and surname: ");
        listOfPeople1.sort(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        for (Person person : listOfPeople1) {
            System.out.print(person + "\n");
        }
    }

    private static void serializePerson(ArrayList<Person> listOfPeople1) {
        try (FileOutputStream outputStream =
                     new FileOutputStream("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task4\\Person.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

            objectOutputStream.writeObject(listOfPeople1);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    private static void deserializePerson(ArrayList<Person>listOfPeople2) {

        try (FileInputStream inputStream = new FileInputStream("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task4\\Person.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);) {

            objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
    }
}
