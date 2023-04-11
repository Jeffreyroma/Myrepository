package my.task.hw13.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Input array elements");
        for (int i = 0; i<size;i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array:");
        for (int i = 0; i<size;i++) {
            System.out.print(array[i]+" ");
        }

        ThreadMax threadMax = new ThreadMax(array);
        ThreadMin threadMin = new ThreadMin(array);

        try {

            threadMax.getThr().join();
            threadMin.getThr().join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nResult:");
        System.out.println("max = " + threadMax.getMaxElement());
        System.out.println("min = " + threadMin.getMinElement());



    }
}
