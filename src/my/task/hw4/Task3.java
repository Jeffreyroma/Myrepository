package my.task.hw4;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        System.out.println("Result:");
        System.out.println(num+"!"+" = "+fact(num));
    }

    private static int fact(int num) {

        int res = 1;
        for (int i =1; i<=num; i++){
            res *=i;
        }
        return res;
    }
}
