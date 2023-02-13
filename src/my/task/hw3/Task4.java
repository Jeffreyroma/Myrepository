package my.task.hw3;
public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 1;
        int x;
        if (a > b) {
            x = a; a = b; b = x;}
        if (b > c) {
            x = b; b = c; c = x;}
        if (a > b) {
            x = a; a = b; b = x;}

        System.out.println("Output of numbers in ascending order: " + a + "," + b + "," + c+";");
    }

}

