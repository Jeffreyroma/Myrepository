package my.task.hw4;
import java.util.Random;
public class Task4 {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        Random rnd =new Random();
        System.out.println("Array :");
        for (int i=0;i<myArray.length;i++){
            myArray[i] = rnd.nextInt(24);
            System.out.print(myArray[i]+"  ");
        }
        max(myArray);
    }

    private static void max(int[] myArray) {
        int minElement = myArray[0];
        int maxElement = myArray[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i=0;i<myArray.length;i++) {
            if (myArray[i] > maxElement ) {
                maxElement = myArray[i];
                indexMax = i;
            } else if (myArray[i] < minElement ) {
                minElement = myArray[i];
                indexMin = i;
            }
        }
        System.out.println("\nMax Index: "+ indexMax);
        System.out.println("Min Index: "+ indexMin);
    }
}

