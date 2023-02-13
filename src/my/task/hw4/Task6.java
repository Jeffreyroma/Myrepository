package my.task.hw4;
import java.util.Arrays;
import java.util.Random;
public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random rnd = new Random();
        System.out.println("Main array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10,10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nArray of positive numbers:");
        for (int i =0;i<array.length;i++) {
            if(array[i]>=0) {
                int array2[] =Arrays.copyOf(array,array.length);
                System.out.print(array2[i]+" ");
            }
        }

        System.out.println("\nArray of negative  numbers:");
        for (int i =0;i<array.length;i++) {
            if(array[i]<0) {
                int array3[] =Arrays.copyOf(array,array.length);
                System.out.print(array3[i]+" ");
            }
        }
    }
}
