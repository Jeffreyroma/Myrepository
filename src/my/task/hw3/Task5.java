package my.task.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        if (num <= 0 || num > 59) {
            System.out.println("The number is too large");
        } else if (num <= 14) {
            System.out.println("1 quarter");
        } else if (num <= 29) {
            System.out.println("2 quarter");
        } else if (num <= 44) {
            System.out.println("3 quarter");
        } else {
            System.out.println("4 quarter");
        }
    }
}




