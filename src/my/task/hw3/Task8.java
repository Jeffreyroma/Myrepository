package my.task.hw3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int testnum = in.nextInt();
        int res = 0;
        if (testnum < 0 || testnum > 28800) {
            System.out.println("The number is too large");
        } else {
            if (testnum >= 0 && testnum <= 3599) {
                res = 1;
                switch (res) {
                    case 1:
                        System.out.println("There are 8 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 3600 && testnum <= 7199) {
                res = 2;
                switch (res) {
                    case 2:
                        System.out.println("There are 7 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 7200 && testnum <= 10799) {
                res = 3;
                switch (res) {
                    case 3:
                        System.out.println("There are 6 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 10800 && testnum <= 14399) {
                res = 4;
                switch (res) {
                    case 4:
                        System.out.println("There are 5 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 14400 && testnum <= 17999) {
                res = 5;
                switch (res) {
                    case 5:
                        System.out.println("There are 4 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 18000 && testnum <= 21599) {
                res = 6;
                switch (res) {
                    case 6:
                        System.out.println("There are 3 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }


            }if (testnum >= 21600 && testnum <= 25199) {
                res = 7;
                switch (res) {
                    case 7:
                        System.out.println("There are 2 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum == 25200) {
                res = 8;
                switch (res) {
                    case 8:
                        System.out.println("There are 1 hours left for employees");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum >= 25201 && testnum <= 28799) {
                res = 9;
                switch (res) {
                    case 9:
                        System.out.println("There is less than an hour left for the workers");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }if (testnum == 28800) {
                res = 10;
                switch (res) {
                    case 10:
                        System.out.println("The working day is over");
                        System.out.println("For Petrov:" + (28800 - testnum));
                        break;
                }
            }
        }
    }
}
