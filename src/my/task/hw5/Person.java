package my.task.hw5;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void move() {
        System.out.print(fullName+" move, ");
    }

    public void talk() {
        System.out.print(fullName +" talk\n");
    }
}
