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

        System.out.println("Object of person:");
        serializePerson(person1);
        Person deserializePerson1 = deserializePerson();
        System.out.println(deserializePerson1);

        serializePerson(person2);
        Person deserializePerson2 = deserializePerson();
        System.out.println(deserializePerson2);

        serializePerson(person3);
        Person deserializePerson3 = deserializePerson();
        System.out.println(deserializePerson3);

        serializePerson(person4);
        Person deserializePerson4 = deserializePerson();
        System.out.println(deserializePerson4);

        serializePerson(person5);
        Person deserializePerson5 = deserializePerson();
        System.out.println(deserializePerson5);

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(deserializePerson1);
        listOfPeople.add(deserializePerson2);
        listOfPeople.add(deserializePerson3);
        listOfPeople.add(deserializePerson4);
        listOfPeople.add(deserializePerson5);
        System.out.println("\nSorting by name: ");
        listOfPeople.sort(Comparator.comparing(Person::getName));
        System.out.println(listOfPeople);
        System.out.println("\nSorting by surname: ");
        listOfPeople.sort(Comparator.comparing(Person::getSurname));
        System.out.println(listOfPeople);
    }

    private static void serializePerson(Person person) {
        try (FileOutputStream outputStream =
                     new FileOutputStream("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task4\\Person.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    private static Person deserializePerson() {
        try (FileInputStream inputStream = new FileInputStream("C:\\Проекты\\Myrepository\\src\\my\\task\\hw12\\Task4\\Person.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);) {

            return (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
            return null;
        }
    }
}
