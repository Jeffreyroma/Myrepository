package my.task.hw4;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number :");
        int num = in.nextInt();
        System.out.println("Result:");
        System.out.println("Summa= "+ sum(num));

        System.out.println("Multiplication= "+ mul(num));
    }

        private static int sum(int num) {

        int sum = 0;
        while (num!=0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

        private   static  int  mul(int num) {

        int mul = 1;
        while (num!=0){
            mul = mul * (num % 10);
            num = num / 10;
        }
        return mul;
    }
}
