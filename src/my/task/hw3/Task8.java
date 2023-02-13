package my.task.hw3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int testnum = in.nextInt();
        if (testnum < 0 || testnum > 28800) {
            System.out.println("The number is too large");
        } else { if (testnum >= 0 && testnum <= 3599) {
            System.out.println("There are 8 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 3600 && testnum <= 7199) {
            System.out.println("There are 7 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 7200 && testnum <= 10799) {
            System.out.println("There are 6 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 10800 && testnum <= 14399) {
            System.out.println("There are 5 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 14400 && testnum <= 17999) {
            System.out.println("There are 4 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 18000 && testnum <= 21599) {
            System.out.println("There are 3 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 21600 && testnum <= 25199) {
            System.out.println("There are 2 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum == 25200) {
            System.out.println("There are 1 hours left for employees");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum >= 25201 && testnum <= 28799) {
            System.out.println("There is less than an hour left for the workers");
            System.out.println("For Petrov:" + (28800 - testnum));

                } if (testnum == 28800) {
            System.out.println("The working day is over");
            System.out.println("For Petrov:" + (28800 - testnum));
        }
        }
    }
}

