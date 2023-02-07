package my.task.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        int composition =num1 * num2;
        System.out.println("What is the result of multiplying the first number by the second?");
        int useranswer = in.nextInt();
        if (composition==useranswer){
            System.out.println("Well done,the answer is correct)");
        }else{
            System.out.println("Bad luck,try again)");
            System.out.println("The right answer is: "+ composition);
        }

    }
}
