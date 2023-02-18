package my.task.hw4;
import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        int[] array = new int[]{1,34,-6,5,-6,56,-6,-5,0};
        System.out.println("Main array :"+ Arrays.toString(array));

        int positiveNumber = 0;
        int negativeNumver = 0;

        for (int i =0;i<array.length;i++) {
            if(array[i] < 0){
                negativeNumver++;
            } else if (array[i] >= 0) {
                positiveNumber++;
            }
        }

        int[] posArray = new int[positiveNumber];
        int[] negArray = new int[negativeNumver];

        int countpos = 0;
        int countneg = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                posArray[countpos] = array[i];
                countpos++;
            } else if(array[i] < 0) {
                negArray[countneg] =array[i];
                countneg++;
            }
        }
        System.out.println("Array of positive number "+Arrays.toString(posArray));
        System.out.println("Array of negative number "+Arrays.toString(negArray));
    }
}
