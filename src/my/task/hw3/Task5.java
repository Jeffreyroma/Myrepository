package my.task.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        int res = 0;
        if (num < 0 || num > 59) {
            System.out.println("The number is too large");
        } else {
            if (num >= 0 && num <= 14) {
                res = 1;
                switch (res) {
                    case 1:
                        System.out.println("1 quarter");
                        break;
                }
            } if (num >= 15 && num <= 29) {
                res = 2;
                switch (res) {
                    case 2:
                        System.out.println("2 quarter");
                        break;
                }
            }if (num >= 30 && num <= 44) {
                res = 3;
                switch (res) {
                    case 3:
                        System.out.println("3 quarter");
                        break;
                }
            }if (num >= 45 && num <= 59) {
                res = 4;
                switch (res) {
                    case 4:
                        System.out.println("4 quarter");
                        break;
                }
            }
        }
    }
}

