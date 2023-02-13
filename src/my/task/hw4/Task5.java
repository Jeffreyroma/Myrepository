package my.task.hw4;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        Random rnd = new Random();
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(100);
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n\nArray of odd element:");
        for (int i = 1; i < myArray.length; i = i + 2){
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n\nMin element of odd array:"+minElement(myArray));
    }

    private static int minElement(int myArray[]) {

        int minelement = myArray[1];
        for (int i=1;i<myArray.length;i=i+2) {
            if (minelement > myArray[i]) {
                minelement = myArray[i];
            }
        }return  minelement;
    }
}

