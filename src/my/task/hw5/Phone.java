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

    public void sendMessage(String number1,String number2,String number3) {
        System.out.println("A message will be sent to these numbers: "+ number1+" "+number2+" "+number3);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call from "+ name+" "+ number);
    }
}
