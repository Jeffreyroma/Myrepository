package my.task.hw4;
import java.util.Arrays;
import java.util.Random;
public class Task7 {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random rnd = new Random();
        System.out.println("Main array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        System.out.print(Arrays.toString(array));
        System.out.println("\nMain array after revers:");

        reversArray(array);

        System.out.println(Arrays.toString(array));
    }
    private static int reversArray(int array[]) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return -1;
    }
}
