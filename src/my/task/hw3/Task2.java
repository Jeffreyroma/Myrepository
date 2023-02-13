package my.task.hw3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = in.nextInt();
        if (num1 % 2 != 0 && num1 > 0) {
            System.out.println("Odd positive");
        }else if (num1 % 2 == 0 && num1 <0) {
            System.out.println("Even negative");
        }
    }
}
