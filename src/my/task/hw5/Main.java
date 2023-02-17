package my.task.hw5;

public class Main {

    public static void main(String[] args) {
        objectPerson();
        System.out.println();
        objectPhone();
    }

    private static void objectPerson() {
        Person person = new Person("Roman Aleksandrovich",32);

        Person person1 = new Person();
        person1.age = 18;
        person1.fullName = "Georgiy Vladzimirovich";

        person.move();
        person.talk();
        person1.move();
        person1.talk();
    }

    private static void objectPhone() {
        Phone phone1 = new Phone("+2551992","Apple",12.3);

        Phone phone2 = new Phone("+12345678","Samsung");

        Phone phone3 = new Phone();
        phone3.number = "+546637236";
        phone3.model = "Xiomi";
        phone3.weight = 55.7;

        phone1.receiveCall("Anton");
        System.out.println(phone1.getNumber());
        phone1.sendMessage("+12312313","+243552423","+2347346345");
        phone1.receiveCall("Anton","+999999\n");

        phone2.receiveCall("Artem");
        System.out.println(phone2.getNumber());
        phone2.sendMessage("+123123112313","+243512352423","+2341237346345");
        phone1.receiveCall("Artem","+999999\n");

        phone3.receiveCall("Roma");
        System.out.println(phone3.getNumber());
        phone3.sendMessage("+123122342313","+24355342423","+2347423346345");
        phone1.receiveCall("Roma","+999999");



    }
}
