package my.task.hw5;

public class Phone {

    String number;

    String model;

    double weight;

    public Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public  Phone(){

    }

    public void receiveCall(String name) {
        System.out.println("Call "+ name);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.print(number+ " ");
        }
    }

    public void receiveCall(String name, String number) {
        System.out.println("\nCall from "+ name+" "+ number);
    }
}
