package Mytaskforitacademy;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        int result = num % 2;
        if (num % 2 == 0){
            System.out.println(0);
        }else
            System.out.println(result);
    }

}
