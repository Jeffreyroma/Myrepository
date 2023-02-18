package my.task.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.print("Result = " + getSum());
    }
    public  static  int getSum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        return ((num1 + num2) + num1 * num2);
    }
}
