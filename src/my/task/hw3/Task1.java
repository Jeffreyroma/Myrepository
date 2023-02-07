package my.task.hw3;

public class Task1 {
    public static void main(String[] args) {
        int num1 =10;
        Integer num2 =122;
        autoPacking(num1);
        autoUnpacking(num2);
    }
    public static void autoPacking(Integer num1){
        System.out.println("Autopacking: "+num1);
    }
    public static void autoUnpacking(int num2){
        System.out.println("Autounpacking: "+num2);
    }
}
