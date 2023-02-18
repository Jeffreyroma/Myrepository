package my.task.hw3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("The number is too large");
        } else {
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday ");
                    break;
                case 4:
                    System.out.println("Thursday ");
                    break;
                case 5:
                    System.out.println("Friday ");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
            }
        }
    }
}
