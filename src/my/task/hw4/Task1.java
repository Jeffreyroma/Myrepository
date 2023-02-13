package my.task.hw4;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Multiplication table:");
        for (int i =1;i <= 10;i++){
            System.out.println();
            for (int j =1;j <= 10;j++){
                int res =j*i;
                System.out.println(i+" * "+j+" = " +res);
            }
        }
    }
}

