package my.task.hw4;
import java.util.Random;
public class Task4 {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        Random rnd =new Random();
        System.out.println("Array:");
        for (int i=0;i<myArray.length;i++){
            myArray[i] = rnd.nextInt(11);
            System.out.print(myArray[i]+"  ");
        }
        System.out.println("\nIndex of Max element is: "+ findIndex(myArray, max(myArray)));

        System.out.println("Index of Min element is: "+ findIndex(myArray, min(myArray)));
    }

    private static int max(int[] myArray) {

        int maxelement = myArray[0];
        for (int i=0;i<myArray.length;i++) {
            if (maxelement < myArray[i]) {
                maxelement = myArray[i];
            }
        }return maxelement ;
    }

    private static int min(int[] myArray) {

        int minelement = myArray[0];
        for (int i=0;i<myArray.length;i++) {
            if (minelement > myArray[i]) {
                minelement = myArray[i];
            }
        }return  minelement;
    }

    private static int findIndex(int myArray[], int minandmaxindex){

        for (int i =0;i < myArray.length;i++) {
            if (myArray[i] == minandmaxindex) {
                return i;
            }
        }
        return -1;
    }
}

