package my.task.hw1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("WELCOME");
    }

    public static class Task3 {
        public static void main(String[] args){
            final  int sec_min = 60;
            final int sec_hour = 3600;
            final int sec_day = 86400;
            final int sec_week = 604800;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of seconds: ");
            int num_sec = in.nextInt();
            int week = num_sec /sec_week;
            int day = (num_sec% sec_week)/sec_day;
            int hour = ((num_sec % sec_week)%sec_day)/sec_hour;
            int min = (((num_sec % sec_week)%sec_day)%sec_hour)/sec_min;
            int second = (((num_sec % sec_week)%sec_day)%sec_hour)%sec_min;
            System.out.println("Result: ");
            System.out.println("Week = "+week + " ,Day = "+day +" ,Hour = "+hour +" ,Minutes = " +min+" ,Seconds = "+second);


        }
    }
}