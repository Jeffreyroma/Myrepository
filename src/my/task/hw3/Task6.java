package my.task.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first side: ");
        int side1 =in.nextInt();
        System.out.println("Input second side: ");
        int side2 =in.nextInt();
        System.out.println("Input third side: ");
        int side3 =in.nextInt();
        int sumside1 =side2+side3;
        int sumside2 =side1+side2;
        int sumside3 =side1+side3;
        if (sumside1 >= side1 && sumside2 >= side1 && sumside3 >= side1){
            if (sumside1 >= side2 && sumside2 >= side2 && sumside3 >= side2){
                if (sumside1 >= side2 && sumside2 >= side2 && sumside3 >= side2){
                    System.out.println("A triangle can exist(True)");
                }
            }
        }else System.out.println("The triangle cannot exist(False)");

    }
}
