package my.task.hw3;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 4;
        int x;
        if (a > b) {
            x = a; a = b; b = x;}
        else a = a;
        if (b > c){
            x = b; b = c; c = x;}
        else b=b;
        if (a > b) {
            x = a; a = b; b = x;}
        else c= c;
        System.out.println("Output of numbers in ascending order: " + a + "," + b + "," + c+";");
    }

}

